package de.codesourcery.nbody;

public final class BHTree
{
    private final BoundingBox quad;     // квадратная область, которую представляет дерево

    private int body=-1;     // тело или совокупное тело, хранящееся в этом узле
    private BHTree NW=null;     // дерево, представляющее северо-западный квадрант
    private BHTree NE=null;     // дерево, представляющее северо-восточный квадрант
    private BHTree SW=null;     // дерево, представляющее юго-западный квадрант
    private BHTree SE=null;     // дерево, представляющее юго-восточный квадрант

    //Создаем и инициализируем новое дерево bhtree. Изначально все узлы равны нулю и будут заполнены рекурсией.
    //Каждый BHTree представляет собой квадрант и тело, которое представляет все тела внутри квадранта.
    public BHTree(BoundingBox q) {
        this.quad=q;
    }

    public BHTree() {
        this.quad = null;
    }

    public void clear() {
        this.body=-1;
        this.NW=null;
        this.NE=null;
        this.SW=null;
        this.SE=null;
    }

    //Если все узлы BHTree равны нулю, то квадрант представляет собой одно тело и является «внешним».
    public boolean isExternalNode()
    {
        return this.NW==null && this.NE==null && this.SW ==null && this.SE==null;
    }

    //Мы должны заполнить дерево телами. Мы начинаем с текущего дерева и рекурсивно путешествуем по ветвям.
    public void insert(int b,Bodies bodies)
    {
        //Если там еще нет тела, положить его туда.
        if (this.body==-1) {
            this.body=b;
            return;
        }
        //Если там уже есть тело, но это не внешний узел, объединим два тела и выясним,
        // в каком квадранте дерева оно должно быть расположено. Затем рекурсивно обновим узлы под ним.
        if ( ! isExternalNode() )
        {
            this.body=bodies.sumBodies(this.body,b);
            if ( bodies.nwContains( b , this.quad ) ) {
                if (this.NW==null) {
                    this.NW= new BHTree(this.quad.NW());
                }
                this.NW.insert(b,bodies);
            }
            else
            {
                if ( bodies.neContains( b , this.quad ) )
                {
                    if (this.NE==null) {
                        this.NE= new BHTree(this.quad.NE());
                    }
                    this.NE.insert(b,bodies);
                }
                else
                {
                    if ( bodies.seContains( b , this.quad ) ) {
                        if (this.SE==null) {
                            this.SE= new BHTree(this.quad.SE());
                        }
                        this.SE.insert(b,bodies);
                    }
                    else
                    {
                        if(this.SW==null) {
                            this.SW= new BHTree(this.quad.SW());
                        }
                        this.SW.insert(b,bodies);
                    }
                }
            }
            return;
        }
        
        //Если узел внешний и содержит другое тело,
        // создать BHTrees там, где должны идти тела, обновить узел и завершить работу
        final int c = this.body;
        if ( bodies.nwContains(c , this.quad ) )
        {
            if (this.NW==null) {
                this.NW= new BHTree(this.quad.NW());
            }
            this.NW.insert(c,bodies);
        }
        else
        {
            if ( bodies.neContains( c , this.quad ) )
            {
                if (this.NE==null) {
                    this.NE= new BHTree(this.quad.NE());
                }
                this.NE.insert(c,bodies);
            }
            else
            {
                if ( bodies.seContains( c , this.quad ) )
                {
                    if (this.SE==null) {
                        this.SE= new BHTree(this.quad.SE());
                    }
                    this.SE.insert(c,bodies);
                }
                else {
                    if(this.SW==null) {
                        this.SW= new BHTree(this.quad.SW());
                    }
                    this.SW.insert(c,bodies);
                }
            }
        }
        this.insert(b,bodies);
    }
    
    //Начнаем с главного узла дерева. Затем рекурсивно переходим к каждой ветке
    //До тех пор, пока мы не достигнем внешнего узла или не достигнем узла,
    // который находится достаточно далеко, чтобы внешние узлы не имели большого значения.
    public void updateForce(int b,Bodies bodies)
    {
        if ( isExternalNode() )
        {
            if (this.body!=b) {
                bodies.addForce( b , this.body );
            }
            return;
        }
        if ( this.quad.sizeSqrd() / ( bodies.distanceToSqrd( b ,  this.body ) ) < 2*2)
        {
            bodies.addForce( b , this.body );
            return;
        }
        
        if ( this.NW != null ) {
            this.NW.updateForce(b,bodies);
        }

        if ( this.SW != null ) {
            this.SW.updateForce(b,bodies);
        }

        if ( this.SE != null ) {
            this.SE.updateForce(b,bodies);
        }

        if ( this.NE != null ) {
            this.NE.updateForce(b,bodies);
        }    
    }    
}