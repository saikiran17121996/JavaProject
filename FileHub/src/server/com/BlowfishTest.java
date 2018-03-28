package server.com;


 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
 
public class BlowfishTest {
 
    public static void main(String[] args) throws Exception {
        encrypt("password");
        decrypt("6VsVtA/nhHKUZuWWmod/BQ==");
    }
 
    public static String encrypt(String password) throws Exception {
        byte[] keyData = (password).getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] hasil = cipher.doFinal(password.getBytes());
        System.out.println(new BASE64Encoder().encode(hasil));
        String encryptedValue =new BASE64Encoder().encode(hasil);
    return encryptedValue;
    }
     
    public static String decrypt(String string) throws Exception {
        byte[] keyData = ("edwin"+"password").getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] hasil = cipher.doFinal(new BASE64Decoder().decodeBuffer(string));
        System.out.println(new String(hasil));
        String encryptedValue=new String(hasil);
        return encryptedValue;
    }
}