
/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * n�mero impar.
 *
 * @author Luis Jos� S�nchez
 */
public class TerminaCuandoEsImpar {
  public static void main(String[] args) {
    int numero;
      
    do {
      System.out.print("Dime un n�mero: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {// comprueba si el n�mero introducido es par
        
        System.out.println("No me gustan los n�meros impares, adi�s.");
      }
    } while (numero % 2 == 0);
  }
}
