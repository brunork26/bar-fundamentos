import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by brunork on 27/03/18.
 */
public class Bar {
    private ArrayList<Cliente> lstCliente;

    public Bar(){}

    public void abrirBar(){
        lstCliente = new ArrayList<Cliente>();
        int chegando = 0;
        while(chegando < 10) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Olá, digite o seu nome: ");
            String nome = scanner.nextLine();

            int idade = new Random().nextInt(80);

            while(idade < 18) {
                idade = new Random().nextInt(80);
            }
            String cpf = "0000000000" + chegando;
            char genero;
            if(chegando%2 == 0) {
                genero = 'F';
            } else {
                genero = 'M';
            }
            int random = new Random().nextInt(1);
            boolean socio;
            int numSocio;
            boolean pMilhagens;
            switch(random) {
                case 0: {
                    socio = true;
                    numSocio = 123450 + chegando;
                    pMilhagens = true;
                    lstCliente.add(new Cliente(nome, cpf, idade, genero, socio, numSocio, pMilhagens));
                } break;
                case 1: {
                    lstCliente.add(new Cliente(nome, cpf, idade, genero, false));
                } break;
                default: break;
            }
            chegando ++;
        }
        this.mostraClientes();
    }

    public void mostraClientes() {
        for (Cliente cl:
             this.lstCliente) {
            System.out.println(cl.getNome() + "\n");
        }
    }
}
