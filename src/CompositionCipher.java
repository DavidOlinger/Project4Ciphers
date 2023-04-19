import java.util.ArrayList;

public class CompositionCipher extends Cipher {

    public ArrayList<Cipher> ciphers;

    public CompositionCipher(){
        ciphers = new ArrayList<>();
    }

    public CompositionCipher(CompositionCipher other){
        this.ciphers = new ArrayList<>();
        for (int i = 0; i < other.ciphers.size(); i++) {
            this.add(other.ciphers.get(i).newCopy());
        }
    }
@Override
    public char encrypt(char c){

        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(i).encrypt(c);
        }
        return c;

    }
@Override
    public char decrypt(char c){
    if(Character.isAlphabetic(c)){
        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(i).decrypt(c);
        }
        return c;
    }
    else return c;

}

    /**
     * Creates a duplicate of the current Cypher by calling the copy constructor on itself.
     * @return
     */
    @Override
    public Cipher newCopy() {
        return new CompositionCipher(this);
    }

    public void add(Cipher theCipher){
        ciphers.add(theCipher);
    }




}
