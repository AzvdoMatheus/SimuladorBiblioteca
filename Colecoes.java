import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Colecoes{
    public void rodar(){
    
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Obras_lit> obras = new ArrayList<Obras_lit>();

        Obras_lit obra1 = new Obras_lit("Branca de neve", "1980", "Matheus");
        Obras_lit obra2 = new Obras_lit("Zoro", "1500", "Carlos");

        Obras_lit rev1 = new Revistas("Amanha", "2010", "Veja", "Diaria");
        Obras_lit rev2 = new Revistas("Ontem", "1950", "Globo", "Semanal");

        Obras_lit mat1 = new Materiais_esp("ABC", "1450", "Desconhecido", "Casa");
        Obras_lit mat2 = new Materiais_esp("Nada", "1300", "Cleopatra", "Egito");

        Obras_lit liv1 = new Livros("Romeu e Julieta", "1670", "Nao sei", 2000, "Romance/Drama");
        Obras_lit liv2 = new Livros("Seculo 21", "2020", "Nao lembro", 0, "Conhecimento");

        obras.add(obra1);
        obras.add(obra2);
        obras.add(rev1);
        obras.add(rev2);
        obras.add(mat1);
        obras.add(mat2);
        obras.add(liv1);
        obras.add(liv2);

        int solicitacao = 0;

        Collections.sort(obras);
            
            while(solicitacao != 3) {
                String busca = "";

                System.out.println("Insira o numero da acao desejada: ");

                System.out.println("\n\n=======MENU=======\n\n 1 - Mostrar OBRAS\n 2 - Procurar LIVRO\n 3 - SAIR\n\n");
                solicitacao = scanner.nextInt();

                switch(solicitacao) {
                                        
                    case 1: 

                        for (Obras_lit obra : obras) {
                            System.out.println(obra.toString());
                        }
                        break;

                    case 2:
                       
                        System.out.println("Insira o nome do autor ou parte do nome: ");
                        busca = scanner.nextLine();

                        List<Obras_lit> resultadoBusca = buscarAutor(busca, obras);

        
                        if (!resultadoBusca.isEmpty()) {
                            System.out.println("Autores encontrados:\n");
                            for (Obras_lit obra : resultadoBusca) {
                                System.out.println(obra.toString());
                            }
                        } else {
                            System.out.println("Nenhum autor encontrado para: " + busca);
                        }


                    case 3:    
                        break;

                    default:
                        System.out.println("Nenhuma acao realizada");
                }
            }
            scanner.close();
    }
            
    public List<Obras_lit> buscarAutor(String busca, List<Obras_lit> obras) {

        List<Obras_lit> obrasEncontradas = new ArrayList<>();

        for (Obras_lit obra : obras) {
            if (obra.getAutor().toLowerCase().contains(busca.toLowerCase())) {
                obrasEncontradas.add(obra);
            }
        }
        return obrasEncontradas;
    }

}

