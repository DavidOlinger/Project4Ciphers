import java.util.ArrayList;

/**
 * @author Ben Smith, David Olinger
 */
public class CompositionCipher extends Cipher {

    public ArrayList<Cipher> ciphers; //holds the various ciphers to be used

    /**
     * Default Constructor
     */
    public CompositionCipher(){
        ciphers = new ArrayList<>();
    }

    /**
     * Deep Copy constructor
     * @param other = the composition cipher that will be copied
     */
    public CompositionCipher(CompositionCipher other){
        this.ciphers = new ArrayList<>();
        for (int i = 0; i < other.ciphers.size(); i++) {
            this.add(other.ciphers.get(i).newCopy());
        }
    }

    /**
     *
     * @param c = the character that will be encrypted using the given ciphers encryption method
     * @return the encrypted character
     */
    @Override
    public char encrypt(char c){

        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(i).encrypt(c);
        }
        return c;

    }

    /**
     *
     * @param c = the character that has been encrypted and will be returned to its original state
     * @return the decrypted original character
     */
    @Override
    public char decrypt(char c){
        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(ciphers.size()-(i+1)).decrypt(c);
        }
        return c;
}

    /**
     * Creates a duplicate of the current Cypher by calling the copy constructor on itself.
     * @return the new CompositionCipher
     */
    @Override
    public Cipher newCopy() {
        return new CompositionCipher(this);
    }

    /**
     * adds a cipher to the list of ciphers
     * @param theCipher = the cipher to be added to the list
     */
    public void add(Cipher theCipher){
        ciphers.add(theCipher.newCopy());
    }




}
