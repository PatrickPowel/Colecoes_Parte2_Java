import java.util.*;

public class ColecoesParte2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // agora uso Set para evitar nomes duplicados
        Set<String> masculino = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Set<String> feminino = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Digite nomes no formato 'Nome - M' ou 'Nome - F'");
        System.out.println("Digite 'sair' para encerrar.\n");

        while (true) {
            String linha = entrada.nextLine().trim();

            if (linha.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = linha.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();

                if (genero.equalsIgnoreCase("M")) {
                    masculino.add(nome);
                } else if (genero.equalsIgnoreCase("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Gênero inválido, use M ou F.");
                }
            } else {
                System.out.println("Formato inválido! Use: Nome - M ou Nome - F");
            }
        }

        System.out.println("\n--- Grupo Masculino ---");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        entrada.close();
    }
}
