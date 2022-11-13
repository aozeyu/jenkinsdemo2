package com.example.jenkinsdemo.demo7;

import com.sun.javafx.scene.traversal.Algorithm;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author yaozeyu
 */
public class MD5Util {
  public static final String KEY_MD5 = "MD5";
  private static String KEY_STR="myKey";
  private static String CHARSETNAME="UTF-8";
  private static String ALGORITHM="DES";
  /***
   * MD5加密（生成唯一的MD5值）
   */
  public static byte[] encryMD5(byte[] data) throws Exception {
    MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
    md5.update(data);
    return md5.digest();
  }
  /***
   * 获取解密之后的信息
   */
  public static String getDecryptString(String str) {
    BASE64Decoder decoder = new BASE64Decoder();
    try {
      //将字符串decode成byte[]
      byte[] bytes = decoder.decodeBuffer(str);
      //获取解密对象
      Cipher cipher = Cipher.getInstance(ALGORITHM);
    } catch (IOException | NoSuchPaddingException | NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
    return str;
  }
}
