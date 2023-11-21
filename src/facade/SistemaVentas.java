package facade;

class SistemaVentas {

    private Cocina inventario;
    private Pago pago;
    private EntregaComida entrega;

    public SistemaVentas() {
        this.inventario = new Cocina();
        this.pago = new Pago();
        this.entrega = new EntregaComida();
    }

    public void venderProducto() {
        inventario.buscarProducto();
        inventario.reservarProducto();
        pago.cobrar();
        entrega.entrega();
    }
}