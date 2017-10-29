package Lexer;

/**
 * Created by Vitor on 24/10/2017.
 */
public class Real extends Token {
    public final float value;

    public Real(float v) {
        super(Tag.REAL);
        value = v;
    }

    public String toString() {
        return "" + value;
    }

}
