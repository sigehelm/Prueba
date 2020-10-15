
/**
 * Ejemplo POO
 *
 * @author David Gonzalez
 * @version 1.0
 */

import javax.swing.JOptionPane;

public class Calculadora
{
    // instance variables - replace the example below with your own
    private int numero;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        this.numero = 0;
    }
    
    public int getNumero()
    {
        return this.numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    private int calcularFactorial()
    {
        int numeroActual = getNumero();
        int result = 1;
        
        for(int index = 1; index <= numeroActual; index++)
        {
            result *= index;
        }
        
        return result;
    }
    
    private boolean calcularPrimalidad()
    {
        return false;
    }
    
    public void showMenu()
    {
        int opcion = 0;
        String entrada = "";
        
        do
        {
            entrada = JOptionPane.showInputDialog("1. Cambiar numero \n2. Ver Factorial \n3. Ver Primalidad \n4.Ver Numero \n5.Salir \nDigite una opcion:");
            opcion = Integer.parseInt(entrada);
            
            switch(opcion)
            {
                case 1:
                    entrada = JOptionPane.showInputDialog("Digite el nuevo numero:");
                    setNumero(Integer.parseInt(entrada));
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, calcularFactorial());
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, calcularPrimalidad());
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, getNumero());
                    break;
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    break;
  
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            
            }
            
        }while(opcion != 5);
    }
}
