package affiche;
import ope.*;
import socket.EcouteClient;
import java.net.InetAddress;

public class Main {
    public static void main (String[] args) throws Exception
    {

        System.out.println(InetAddress.getLocalHost().getHostName());
        System.out.println(9876);
       EcouteClient ecoute=new EcouteClient();
       ecoute.start();
      
    }
}
