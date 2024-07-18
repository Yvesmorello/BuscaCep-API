import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        try {
            System.out.print("Digite um CEP: ");
            String cep = scanner.nextLine();
            Endereco endereco = consulta.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.gerarArquivoJson(endereco);
        }catch (JsonSyntaxException e) {
            new RuntimeException("Cep inválido!");
        }


    }
}