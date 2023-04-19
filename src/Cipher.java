import java.util.Scanner;

/**
 * @Author Ben Smith, David Olinger
 */
public abstract class Cipher {
    /**
     *
     * @param c = the character that will be encrypted using the given ciphers encryption method
     * @return the new changed character
     */
    public abstract char encrypt(char c);
    /**
     *
     * @param c = the character that has been encrypted and will be returned to its original state
     * @return the new changed character
     */
    public abstract char decrypt(char c);

    /**
     *
     * @param s = the string being sent in to be encrypted
     * @return the new string with each character being changed acoording to which encryption methods were called
     */
    public String encrypt(String s){
        Scanner scnr = new Scanner(s);
        scnr.useDelimiter("");
        String newMessage = "";
        while (scnr.hasNext()){
            newMessage += encrypt(scnr.next().charAt(0));
        }
        return newMessage;
    }
    /**
     *
     * @param s = the string being sent in to be decrypted
     * @return the original string, reverted from the encryption done by called methods
     */
    public String decrypt(String s){
        Scanner scnr = new Scanner(s);
        scnr.useDelimiter("");
        String newMessage = "";
        while (scnr.hasNext()){
            newMessage += decrypt(scnr.next().charAt(0));
        }
        return newMessage;
    }

    /**
     * calls the deep-copy constructor method according to each sub-class implementaion of it
     * @return a new deep copy of the sent in cipher
     */
    public abstract Cipher newCopy();

}
