package exer2;

public class App {

    public static void main(String[]  args){

        //Criar um objeto de produto 
        // Criar um objeto de ItemPedido

        //Imprimir dados do Produto
        // esta em ItemPedido
        Produto prod1 = new Produto( 111, 1200.00, "PC da Positivo");
        Produto prod2 = new Produto(111, 1200.00, "PC da Positivo");
        //Criar um objeto item pedido
        ItemPedido itemProd1 = new ItemPedido(5, prod1);
        ItemPedido itemProd2 = new ItemPedido(5, prod2);

        //Imprimir dados do produto que ItemPedido esta pedindo
        System.out.println( "Descrição: " + itemProd1.getProduto().getDescricao());
        System.out.println( "Descrição: " + itemProd2.getProduto().getDescricao());
        System.out.println("Valor Total: " + (itemProd1.getProduto().getValor() * itemProd1.getQuantidade()));
        System.out.println("Valor Total: " + (itemProd2.getProduto().getValor() * itemProd2.getQuantidade()));


        //criar um obj do tipo Pedido
        Pedido pedido = new Pedido();
        //adicionar um itemPedido ao Pedido
        pedido.adicionarItem(itemProd1);
        pedido.adicionarItem(itemProd2);
        // Imprimir o valor total
        System.out.println("Valor total: " + pedido.obterTotal());


    }
    
}
