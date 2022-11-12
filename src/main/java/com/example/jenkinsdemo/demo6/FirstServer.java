package com.example.jenkinsdemo.demo6;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yaozeyu
 */
public class FirstServer {
  public static void main(String[] args) {
    try {
      ServerSocket firstServerSocket = new ServerSocket(6868);
      Socket socketConnection = firstServerSocket.accept();
      DataInputStream dataInputStream = new DataInputStream(socketConnection.getInputStream());
      String readingString = (String) dataInputStream.readUTF();
      firstServerSocket.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
