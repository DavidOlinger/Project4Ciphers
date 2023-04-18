import java.util.ArrayList;

public class CompositionCipher extends Cipher {

    public ArrayList<Cipher> ciphers;

    public CompositionCipher(){
        ciphers = new ArrayList<>();
    }

    public CompositionCipher(CompositionCipher other){

    }
@Override
    public char encrypt(char c){

    if(Character.isAlphabetic(c)){
        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(i).encrypt(c);
        }
        return c;
    }
    else return c;

    }
@Override
    public char decrypt(char c){
    if(Character.isAlphabetic(c)){
        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(i).encrypt(c);
        }
        return c;
    }
    else return c;

}
@Override
    public Cipher newCopy(){
        return null; // stub
    }

    public void add(Cipher theCipher){
        ciphers.add(theCipher);
    }




}
