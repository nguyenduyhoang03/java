import com.mysql.cj.util.Base64Decoder;

import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class PasswordBaseExample {
    final static String ALGO = "OKOKOKOK";

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        long curt = System.currentTimeMillis();
        /*
        * 1.Base for password
        * 2.Create based on keyspec by password
        * */
        String password = "Khong co password";
        SecretKeyFactory skf = SecretKeyFactory.getInstance(ALGO);
        PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
        SecretKey secretKey = skf.generateSecret(keySpec);
        SecureRandom random = SecureRandom.getInstance("SHAIPRNG");
        byte[] salte = random.generateSeed(0);
        PBEParameterSpec param = new PBEParameterSpec(salte,0);
        Cipher cipher = Cipher.getInstance(ALGO);

        //Encrypt
        cipher.init(cipher.ENCRYPT_MODE,secretKey,param);
        String clear = "ENCRYPT for java";
        byte[] encrypted = cipher.doFinal(clear.getBytes());

    }
}
