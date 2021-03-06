package caixaDeTexto;

/**
 *
 * @author Italo
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Italo
 */

public class limiteNumero extends PlainDocument {
    private int quantidadeMax;
    public limiteNumero(int maxLen){
        super();
        if(maxLen<=0)
            throw new IllegalArgumentException("Especifique a quantidade");
        quantidadeMax = maxLen;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
    int tamanho = (this.getLength() + str.length());
    if(tamanho <= 11){
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
        }else
    {
        super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
    }
   }
}