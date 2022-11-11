package com.example.jenkinsdemo.demo6;
import javax.swing.JOptionPane;
/**
 * @author yaozeyu
 */
public class LearnJavaFormat {
  public static void main(String[] args) {
    double salary = 1000;
    String stringOutput;
   stringOutput = String.format("$%,.2f",salary);
   JOptionPane.showMessageDialog(null,stringOutput);
   System.exit(0);
  }
}
