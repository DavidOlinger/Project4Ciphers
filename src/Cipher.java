import java.util.Scanner;

public abstract class Cipher {

    public abstract char encrypt(char c);

    public abstract char decrypt(char c);

    public String encrypt(String s){
        Scanner scnr = new Scanner(s);
        scnr.useDelimiter("");
        String newMessage = "";
        while (scnr.hasNext()){
            newMessage += encrypt(scnr.next().charAt(0));
        }
        return newMessage;
    }

    public String decrypt(String s){
        Scanner scnr = new Scanner(s);
        scnr.useDelimiter("");
        String newMessage = "";
        while (scnr.hasNext()){
            newMessage += decrypt(scnr.next().charAt(0));
        }
        return newMessage;
    }

    public Cipher newCopy(){
        return null; // stub
    }

}
