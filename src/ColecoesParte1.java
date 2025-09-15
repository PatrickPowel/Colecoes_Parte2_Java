import java.util.*;

public class ColecoesParte1 {
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite nomes separados por vírgula: ");
        String linha = entrada.nextLine();

        // Divide os nomes em um array, remove espaços extras
        String[] nomesArray = linha.split(",");
        List<String> nomes = new ArrayList<>();

        for (String nome : nomesArray){
            nomes.add(nome.trim()); // trim() tira espaços
        }

        // Ordena em ordem alfabética
        Collections.sort(nomes);
        System.out.println("\\n--- Nomes em ordem alfabética ---");
        for(String nome: nomes){
            System.out.println(nome);
        }
        entrada.close();
    }
}