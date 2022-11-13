package com.example.jenkinsdemo.demo7;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author yaozeyu
 */
public class Base64Util {
  /***
   * BASE64解密
   */
  public static byte[] decryBASE64(String key) throws Exception {
    return (new BASE64Decoder()).decodeBuffer(key);
  }

  /***
   * BASE64加密
   */
  public static String encryptBASE64(byte[] key) throws Exception {
    return (new BASE64Encoder()).encode(key);
  }
}
