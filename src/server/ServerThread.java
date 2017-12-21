/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.X509Certificate;
import javax.crypto.SecretKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 *
 * @author gbojan
 */
class ServerThread extends Thread{
    private Socket sock;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private X509Certificate caCert;
    private PrivateKey privateKey;
    private PublicKey caPublicKey;
    private SecretKey secretKey;
    private X509Certificate clientCert;
    private KeyPair clientKey;
    private String username;
    private File datoteke;
    private SecretKey newSecretKey ;
    private PublicKey clientPublicKey;

    public ServerThread(Socket s){
    sock = s;
    try{
        Security.addProvider(new BouncyCastleProvider());
        ois = new ObjectInputStream(sock.getInputStream());
        oos = new ObjectOutputStream(sock.getOutputStream());
//        generisiCaCert();
//        generisiPrivateKey();
//        caPublicKey = caCert.getPublicKey();
//        potpisiCRListu();
        //System.out.println(caCert);
       // System.out.println("Private key: "+privateKey);
        
    }catch(IOException e){
        e.printStackTrace();
    }
}
}
