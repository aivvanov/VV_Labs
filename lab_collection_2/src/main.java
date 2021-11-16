public class main {
    public static void main(String[] args) {
        Collection<String> collection = new Collection<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        System.out.println("Размер коллекции: " + collection.getSize() + ", Второй элемент: " + collection.get(1));
        collection.remove(1);
        System.out.println("Коллекция после удаления: " + collection.getSize() + ", Новый второй элемент: " + collection.get(1));
        collection.remove("three");
        System.out.println("Коллекция после удаления: " + collection.getSize() + ", Новый второй элемент: " + collection.get(1));
        collection.clear();
        System.out.println("Коллекция после отчистки = " + collection.getSize());
    }
}
