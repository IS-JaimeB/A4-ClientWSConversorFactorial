import org.conversor.NewJerseyClient;

/**
 *
 * @author Jaime
 */
public class main {
    public static void main(String[] args){
        NewJerseyClient client = new NewJerseyClient();
        String resultado = client.decimal(String.class,String.valueOf(5));
        String resultado1 = client.decimal(String.class,String.valueOf(64));
        System.out.println("5 en binario: " + resultado);
        System.out.println("64 en binario: " + resultado1);
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Factorial de 64: " + factorial(64));
    }

    private static double factorial(double n1) {
        wsfactorial.WSFactorial_Service service = new wsfactorial.WSFactorial_Service();
        wsfactorial.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(n1);
    }
    
}
