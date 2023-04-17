import java.util.ArrayList;

public class CompositionCipher extends Cipher {

    public ArrayList<Cipher> ciphers;

    public CompositionCipher(){

    }

    public CompositionCipher(CompositionCipher other){

    }
@Override
    public char encrypt(char c){
        return c; //stub
    }
@Override
    public char decrypt(char c){
        return c; //stub
    }
@Override
    public Cipher newCopy(){
        return null; // stub
    }

    public void add(Cipher theCipher){

    }




}
