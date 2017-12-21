/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gbojan
 */
public class Server {
    
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("Server started");
            while(true){
                Socket sock = ss.accept();
                ServerThread st = new ServerThread(sock);
                st.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
}
