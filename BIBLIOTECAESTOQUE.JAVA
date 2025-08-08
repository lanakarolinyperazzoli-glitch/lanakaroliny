public class BibliotecaEstoque {
    public static void main(String[] args) {
        // Declaração de variáveis para livros e quantidades

        String livro1 = "Dom Quixote";
        int qtd1 = 3;

        String livro2 = "O Pequeno Príncipe";
        int qtd2 = 3;

        String livro3 = "Harry Potter";
        int qtd3 = 6;
        // Soma das quantidades

        int total = qtd1 + qtd2 + qtd3;
         // Impressão da lista de livros e total

        System.out.println("Estoque de Livros da Biblioteca:");
        System.out.println(livro1 + "  Quantidade: " + qtd1);
        System.out.println(livro2 + " Quantidade: " + qtd2);
        System.out.println(livro3 + " Quantidade: " + qtd3);
        System.out.println("-----------------------------");
        System.out.println("Total de livros disponíveis: " + total);
    }
