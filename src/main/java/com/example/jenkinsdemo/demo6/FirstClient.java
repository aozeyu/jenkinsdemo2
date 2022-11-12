package com.example.jenkinsdemo.demo6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author yaozeyu
 */
public class FirstClient {
  public static void main(String[] args) {
    try {
      Socket clientSocket = new Socket("localhost", 6868);
      DataOutputStream dataStreamOut = new DataOutputStream(clientSocket.getOutputStream());
      dataStreamOut.writeUTF("Happy Coding! APIs");
      dataStreamOut.flush();
      dataStreamOut.close();
      clientSocket.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
