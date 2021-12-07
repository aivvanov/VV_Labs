import java.net.*;

import java.io.*;
import java.util.Scanner;

class URL_1 {

    public static void main(String [] args) {

        String req = "";
        Scanner sc = new Scanner(System.in);
        String urlString = sc.next();
        if (!urlString.startsWith("http")) urlString = "https://" + urlString;
        try {
            URL url = new URL(urlString);
            URLConnection uc = url.openConnection();
            uc.setDoOutput(true);
            uc.setDoInput(true);
            uc.setUseCaches(false);
            uc.setRequestProperty("content-type", "application/octet-stream");
            uc.connect();
            DataOutputStream dos = new DataOutputStream(uc.getOutputStream());
            dos.writeBytes(req);
            dos.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String res = null;
            while ((res = br.readLine()) != null) {
                System.out.println(res);
            }
        } catch (MalformedURLException me) {
            System.err.println(me);
        } catch (UnknownHostException he) {
            System.err.println(he);
        } catch (UnknownServiceException se) {
            System.err.println(se);
        } catch (IOException ioe) {
            System.err.println(ioe);
        }

    }

}