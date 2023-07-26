/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author melan
 */
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.util.Base64;

public abstract class EncriptacionPBKDF2 implements StrategyCifrado{ 

    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;
    private static final String SALT = "YourSalt"; 

    @Override
    public String encrypt(String input) throws Exception {
        char[] passwordChars = input.toCharArray();
        byte[] salt = SALT.getBytes();

        PBEKeySpec spec = new PBEKeySpec(passwordChars, salt, ITERATIONS, KEY_LENGTH);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        SecretKey key = keyFactory.generateSecret(spec);

        byte[] hashedPassword = key.getEncoded();
        return Base64.getEncoder().encodeToString(hashedPassword);
    }   

}
