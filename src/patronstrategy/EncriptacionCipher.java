/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author melan
 */
public abstract class EncriptacionCipher implements StrategyCifrado{
     //private static final String ALGORITHM = "AES";
      private static final String SECRET_KEY = "12345678901234561234567890123456";
      
    /**
     *
     * @param input
     * @return
     * @throws Exception
     */
    @Override
    public String encrypt(String input) throws Exception  {
    
        SecretKey key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");       
        Cipher cipher = Cipher.getInstance("AES");      
        cipher.init(Cipher.ENCRYPT_MODE, key);       
  
        byte[] encryptedBytes = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    
}
