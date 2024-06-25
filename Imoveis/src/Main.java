public class Main {
    public static void main(String[] args) {

        ImovelDeAluguel imovelAluguel = new ImovelDeAluguel("Rua A, 123", 100.0, 3, 1, 1500.0);
        ImovelDeVenda imovelVenda = new ImovelDeVenda("Avenida B, 456", 200.0, 4, 2, 300000.0);
        ImovelDeTemporada imovelTemporada = new ImovelDeTemporada("Praia C, 789", 150.0, 2, 3, 200.0);


        System.out.println("Informações dos Imóveis:");
        System.out.println("------------------------");
        exibirInformacoesImovel(imovelAluguel);
        exibirInformacoesImovel(imovelVenda);
        exibirInformacoesImovel(imovelTemporada);
        System.out.println();


        testarOperacoesImovelAluguel(imovelAluguel);
        testarOperacoesImovelVenda(imovelVenda);
        testarOperacoesImovelTemporada(imovelTemporada);
    }


    private static void exibirInformacoesImovel(Imovel imovel) {
        System.out.println("Endereço: " + imovel.getEndereco());
        System.out.println("Área: " + imovel.getArea() + " m²");
        System.out.println("Número de Quartos: " + imovel.getNumeroQuartos());
        System.out.println("ID: " + imovel.getId());
        System.out.println("------------------------------");
    }


    private static void testarOperacoesImovelAluguel(ImovelDeAluguel imovel) {
        System.out.println("Testando Imóvel de Aluguel:");
        System.out.println("Disponibilidade inicial: " + (imovel.isDisponivel() ? "Disponível" : "Alugado"));
        imovel.alugar();
        System.out.println("Disponibilidade após alugar: " + (imovel.isDisponivel() ? "Disponível" : "Alugado"));
        imovel.devolver();
        System.out.println("Disponibilidade após devolver: " + (imovel.isDisponivel() ? "Disponível" : "Alugado"));
        System.out.println();
    }


    private static void testarOperacoesImovelVenda(ImovelDeVenda imovel) {
        System.out.println("Testando Imóvel de Venda:");
        System.out.println("Preço: R$" + imovel.getPreco());
        System.out.println();
    }


    private static void testarOperacoesImovelTemporada(ImovelDeTemporada imovel) {
        System.out.println("Testando Imóvel de Temporada:");
        System.out.println("Valor da Diária: R$" + imovel.getValorDiaria());
        System.out.println();
    }
}
