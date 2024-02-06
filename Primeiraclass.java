    public class Primeiraclass {

        public static void main(String args[]) {
            System.out.println("Bem Vindo Ao Nosso Restaurante");

            NumeroPedido numeroPedido = new NumeroPedido();
            Cliente cliente = new Cliente();
            Mesa mesa =new Mesa();
            Prato prato = new Prato();
            Valor valor =new Valor();

            numeroPedido.setPedido(25);
            cliente.setNome("Daniel");
            cliente.setEndereco("Rua 2");
            cliente.setCidade("Caruaru PE");
            mesa.setMesa(10);
            prato.setPrato("Macarronada");
            valor.setValor(50);
            //numeroPedido.cadastrarPedido(); //Pro outro lado o codigo aqui fica bem mais limpo.

            System.out.println(numeroPedido.getPedido());
            System.out.println(cliente.getNome());
            System.out.println(cliente.getEndereco());
            System.out.println(cliente.getCidade());
            System.out.println(mesa.getMesa());
            System.out.println(prato.getPrato());
            System.out.println(valor.getValor());


            System.out.println("Obrigado! Volte Sempre");
        }
    }
