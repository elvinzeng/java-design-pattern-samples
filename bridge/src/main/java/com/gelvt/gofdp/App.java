package com.gelvt.gofdp;

import com.gelvt.gofdp.bridge.*;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public class App {

    public static final String SECRET_KEY = "575022f3350b40448e02f079c93ba09c";

    public static void main(String[] args){
        Hasher sha1Hasher = new Sha1Hasher();
        Hasher sha256Hasher = new Sha256Hasher();

        String message = "Hi! My name is Elvin Zeng.";

        SignTool signTool = new RSASignTool(SECRET_KEY, sha1Hasher);
        displayAsString(signTool.sign(message.getBytes()));

        signTool = new RSASignTool(SECRET_KEY, sha256Hasher);
        displayAsString(signTool.sign(message.getBytes()));

        signTool = new EccSignTool(SECRET_KEY, sha1Hasher);
        displayAsString(signTool.sign(message.getBytes()));

        signTool = new EccSignTool(SECRET_KEY, sha256Hasher);
        displayAsString(signTool.sign(message.getBytes()));
    }

    private static void displayAsString(byte[] message){
        System.out.println(new String(message));
    }
}
