package Test;

import Server.Server;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ServerMain_2 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileInputStream propertiesInputStream = new FileInputStream("config.properties") ;
            properties.load(propertiesInputStream);
        } catch (IOException e) {
            System.err.println(e);
        }
        Server myServer = new Server(properties.getProperty("hostname2") , 2);
        myServer.start();
    }
}
