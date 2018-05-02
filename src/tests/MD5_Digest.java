package tests;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class MD5_Digest {

    public static void main(String[] args) throws Exception {
        String password = "mypass";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter
                .printHexBinary(digest).toUpperCase();
        System.out.println(myHash);
    }

}
