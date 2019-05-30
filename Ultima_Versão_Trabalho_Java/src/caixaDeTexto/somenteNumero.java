/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class somenteNumero extends PlainDocument {
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
    int tamanho = (this.getLength() + str.length());
    if(tamanho <= 40){
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
        }else
    {
        super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
    }
   }
}