package com.example.jenkinsdemo.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yaozeyu
 */
public class FileReadWriteDemo {
  public static void main(String[] args) throws IOException {
    FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
    fileReadWriteDemo.readAndWriteFile();
  }

  private void readAndWriteFile() throws IOException {
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;
    try {
      String inputFileName = "myinputfile.txt";
      fileInputStream = new FileInputStream(inputFileName);
      String outFileName = "myoutputfile.txt";
      fileOutputStream = new FileOutputStream(outFileName);
      int i;
      while ((i = fileInputStream.read()) != -1) {
        //说明读到了文件内的东西然后写入
        fileOutputStream.write(i);
      }
      System.out.println("Successfully read and " + "writen to the \'" + outFileName + "\'file.");
    } finally {
      if (fileInputStream != null) {
        fileInputStream.close();
      }
      if (fileOutputStream != null ) {
        fileOutputStream.close();
      }

    }
  }
}
