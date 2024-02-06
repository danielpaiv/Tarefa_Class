public class NumeroPedido {


    private int pedido;   //Propiedade da class.

    /***
     * Para cada propiedade são dios métodos GET e SET que pode ser criado automaticamente assim dará
     * acesso as outras classes .
     * @detalhes da função dos métodos
     */

    public int getPedido() {  //Método da propiedade pedido GET
        return pedido;
    }

    public void setPedido(int pedido) {  //Método da propiedade pedido SET
        this.pedido = pedido;
    }


    /***
     * esse método fucina bem mais perderia mais tempo editando.
     */
//    public void cadastrarPedido() {
//        this.pedido= (25);
//   }

}
