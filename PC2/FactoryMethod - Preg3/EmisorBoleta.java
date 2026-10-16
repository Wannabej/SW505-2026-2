public class EmisorBoleta extends EmisorComprobante {
    @Override
    public Comprobante crearComprobante() {
        return new Boleta();
    }
}
