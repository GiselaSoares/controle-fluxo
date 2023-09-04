import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
public class Contador {22
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro Parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo Parâmetro");
        int parametroDois = terminal.nextInt();

        try {
          contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }finally {
            terminal.close();
        }
}
static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    
    if(parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O segundo Parâmetro deve ser maior do que o primeiro Parâmetro");
    }

    int contagem = parametroDois - parametroUm +1;
    
    for(int i=1; i <= contagem; i++) {
        System.out.println("Imprimindo o número" + i);
    }
}
    }

