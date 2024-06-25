public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Livro(1, "Dom Casmurro");
        Pedido pedido2 = new Milkshake(2, "Grande", "Chocolate");


        Funcionario junior = new Junior("João");
        Funcionario pleno = new Pleno("Maria");
        Funcionario senior = new Senior("Pedro");


        junior.atenderPedido(pedido1);
        junior.atenderPedido(pedido2);

        pleno.atenderPedido(pedido1);
        pleno.atenderPedido(pedido2);

        senior.atenderPedido(pedido1);
        senior.atenderPedido(pedido2);
    }
}
