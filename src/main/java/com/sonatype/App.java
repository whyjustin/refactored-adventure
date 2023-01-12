package com.sonatype.nexus;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class App 
{
    public static void main( String[] args )
    {
        new OldCode().debt();
    }
    
    public static void badCrypto() {
        try 
        {
            String algo = "MD5";
        
            MessageDigest md5Digest = MessageDigest.getInstance(algo);

            md5Digest.update(algo.getBytes(Charset.defaultCharset()));

            boolean test = md5Digest.digest() == algo.getBytes();
        } 
        catch (NoSuchAlgorithmException ex) 
        {
        }

    }

}
