package com.example.jenkinsdemo.demo7;

import java.security.MessageDigest;

/**
 * @author yaozeyu
 */
public class MD5Util {
  public static final String KEY_MD5 = "MD5";
  /***
   * MD5加密（生成唯一的MD5值）
   */
  public static byte[] encryMD5(byte[] data) throws Exception {
    MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
    md5.update(data);
    return md5.digest();
  }
}
