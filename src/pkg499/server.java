/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg499;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class server {
    
    public static void main(String[] args) throws IOException {
        String message = "";
        ServerSocket s1 = new ServerSocket(1689);
        //InetAddress ip = InetAddress.getLocalHost();
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());
            message = sc.nextLine();
            System.out.println(message);
            
        
        s1.close();
    }
    
    
}
