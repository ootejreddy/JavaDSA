import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class AesEncryption {

    private static String algorithm = "AES";
    private static Key key;
    private static KeyGenerator keyGenerator;
    private static Cipher cipher;

    public static String encrypt(String jwt) throws Exception {
        if (key == null || cipher == null) {
            setUp();
        }
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return Base64.getEncoder().encodeToString(cipher.doFinal(jwt.getBytes("UTF-8")));
    }

    private static void setUp() {
        try {
            cipher = Cipher.getInstance(algorithm);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        if (keyGenerator != null) {
            key = keyGenerator.generateKey();
            return;
        }
        try {
            keyGenerator = KeyGenerator.getInstance(algorithm);
            key = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String decrypt(String encryptedJWT) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedJWT)));
    }
}