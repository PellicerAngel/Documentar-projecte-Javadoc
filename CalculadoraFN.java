import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Classe CalculadoraFN que estén JFrame.
 * Representa una calculadora funcional amb funcions matemàtiques addicionals.
 * Esta calculadora permet realitzar operacions bàsiques, operacions de potència, funcions trigonomètriques,
 * càlculs d'arrel quadrada, càlcul del factorial i mostra el valor de Pi.
 * 
 * La classe inclou un camp de text i botons per a números, operadors i funcions matemàtiques.
 * Utilitza una classe interna per a manejar els esdeveniments dels botons.
 * 
 * @author angel
 */

public class CalculadoraFN extends JFrame {

    /**
    * Camp de text utilitzat per a mostrar i rebre l'entrada de la calculadora.
    */
    private JTextField campoTxt = new JTextField(20);

    private JButton bt_somar = new JButton(" +");
    private JButton bt_subtrair = new JButton("-");
    private JButton bt_multiplicar = new JButton("x");
    private JButton bt_dividir = new JButton(" /");
    private JButton bt_cls = new JButton("c");
    private JButton bt_igual = new JButton("=");
    private JButton bt_9 = new JButton("9");
    private JButton bt_8 = new JButton("8");
    private JButton bt_7 = new JButton("7");
    private JButton bt_6 = new JButton("6");
    private JButton bt_5 = new JButton("5");
    private JButton bt_4 = new JButton("4");
    private JButton bt_3 = new JButton("3");
    private JButton bt_2 = new JButton("2");
    private JButton bt_1 = new JButton("1");
    private JButton bt_0 = new JButton(" 0 ");

    private JButton bt_raiz = new JButton("Sqrt");
    private JButton bt_potencia = new JButton("Exp");
    private JButton bt_seno = new JButton("Sin");
    private JButton bt_cosseno = new JButton("Cos");
    private JButton bt_tangente = new JButton("Tan");
    private JButton bt_factorial = new JButton("n! ");
    private JButton bt_pi = new JButton(" Pi ");

    /**
     * Constructor de la classe *CalculadoraFN.
     * Configura la interfície gràfica de la calculadora i assigna els esdeveniments als botons.
     */
    public CalculadoraFN() {	
        super("FN 2013"); 
        this.setBounds(160, 160, 240, 230); 
        this.setLayout(new FlowLayout()); 
        this.setResizable(false);

        this.add(campoTxt);
        this.add(bt_7);
        this.add(bt_8);          
        this.add(bt_9);
        this.add(bt_dividir);
        this.add(bt_multiplicar);
        this.add(bt_4);
        this.add(bt_5);         
        this.add(bt_6);
        this.add(bt_somar);
        this.add(bt_subtrair);
        this.add(bt_1);
        this.add(bt_2);
        this.add(bt_3);
        this.add(bt_cls);
        this.add(bt_igual);
        this.add(bt_0);
        this.add(bt_seno);
        this.add(bt_cosseno);
        this.add(bt_tangente);
        this.add(bt_potencia);
        this.add(bt_raiz);
        this.add(bt_factorial);
        this.add(bt_pi);

        Eventos calculos = new Eventos();

        bt_0.addActionListener(calculos);  
        bt_1.addActionListener(calculos);  
        bt_2.addActionListener(calculos);  
        bt_3.addActionListener(calculos);  
        bt_4.addActionListener(calculos);  
        bt_5.addActionListener(calculos);  
        bt_6.addActionListener(calculos);  
        bt_7.addActionListener(calculos);  
        bt_8.addActionListener(calculos);  
        bt_9.addActionListener(calculos);  
        bt_cls.addActionListener(calculos);  
        bt_somar.addActionListener(calculos);  
        bt_subtrair.addActionListener(calculos);  
        bt_multiplicar.addActionListener(calculos);  
        bt_dividir.addActionListener(calculos);  
        bt_igual.addActionListener(calculos);

        bt_seno.addActionListener(calculos);
        bt_cosseno.addActionListener(calculos);
        bt_tangente.addActionListener(calculos);
        bt_potencia.addActionListener(calculos);
        bt_raiz.addActionListener(calculos);
        bt_factorial.addActionListener(calculos);
        bt_pi.addActionListener(calculos);
    }

    /**
     * Classe interna que implementa *ActionListener per a manejar esdeveniments de botons.
     */
    private class Eventos implements ActionListener {  
        double rs, numero1 , numero2;  
        char operador; 

        /**
         * Mètode que detecta els esdeveniments de clic en els botons.
         *
         * @param e Objecte *ActionEvent que representa l'esdeveniment de botó.
         */
        public void actionPerformed(ActionEvent e) {         
            if (e.getSource() == bt_0) {                          
                campoTxt.setText(campoTxt.getText() + bt_0.getText());              
            }  

            if (e.getSource() == bt_1) {  
                campoTxt.setText(campoTxt.getText() + bt_1.getText());  
            }


            if (e.getSource() == bt_igual) {
                numero2 = Double.parseDouble(campoTxt.getText());             

                switch(operador) {  
                    case '+': rs = (numero1 + numero2); break;  
                    case '-': rs = (numero1 - numero2); break;
                    case '*': rs = (numero1 * numero2); break;
                    case '/': rs = (numero1 / numero2); break;
                    case 'e': rs = Math.pow(numero1, numero2); break;
                }  
                campoTxt.setText("" + rs);   
            }               
        }     
    }

    /**
     * Mètode principal que crea una instància de la calculadora i la fa visible.
     * 
     * @param args Arguments de la línia de comandos (no s'utilitzen en este cas).
     */
    public static void main(String[] args) {
        CalculadoraFN calculadora = new CalculadoraFN();                   
        calculadora.setVisible(true);   
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }        
}
