package Controlador;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Jony
 */
public class validar {

    public void val_caracteres(JTextField t, String x) {
         /// x tipo de validacion L= letras N= numeros
        ////t textbox a validar
      t.addKeyListener(new KeyAdapter() {
        /*llamamos al metodo addKeyListener y usamomos como parametro una instancia de la clase abstracta
        KeyAdapater q nos permite recibir los eventos del teclado
          */
        @Override
        public void keyTyped(KeyEvent e){///implementamos el metodo
            char c=e.getKeyChar();////se le asigna a la variable el valor de la tecla presionada
            if(x.equalsIgnoreCase("L")){//si el parametro recibido es "L"
                if(Character.isDigit(c)){
                    //si el caracter recibido en c es un digito
                    e.consume();// se elimina
                    Toolkit.getDefaultToolkit().beep();
                }
            }else{
                if(Character.isLetter(c)){
                    ///si el caracter recibido en c es una letra
                    e.consume();// se elimina
                    Toolkit.getDefaultToolkit().beep();
                }
                
            }
        }  
      });

    }
}
