public class EmisorFactura extends EmisorComprobante {
    @Override
    public Comprobante crearComprobante() {
        return new Factura();
    }
}
