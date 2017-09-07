/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg499;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class client {
    private static String ip_address;
    private static int port_number;
    
    public static void main(String user, String password) throws IOException {
        String default_ip = "127.0.0.1";
        int default_port = 1689;
        String message = user+"/"+password;
        InetAddress ip = InetAddress.getLocalHost();
        Scanner sc = new Scanner(System.in);
        if(ip_address == null)
        {
            ip_address = default_ip;
        }
        if(ip_address == null)
        {
            ip_address = default_ip;
        }
        Socket s = new Socket(ip_address, port_number);//1689
        PrintStream p = new PrintStream(s.getOutputStream());
        Scanner sc1 = new Scanner(s.getInputStream());
        p.println(message);
        s.close();
    }
    public static void change_ip(String new_ip, int new_port)
    {
        ip_address = new_ip;
        port_number = new_port;
        
    }
    public static String get_ip()
    {
        return ip_address;
    }
    public static int get_port()
    {
        return port_number;
    }
    
    public static void initialize()
    {
        ip_address = "127.0.0.1";
        port_number = 1689;
    }
}
