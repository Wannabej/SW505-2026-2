public abstract class EmisorComprobante {
    // Factory Method
    protected abstract Comprobante crearComprobante();

    public void procesar(String ruc, double monto) {
        Comprobante comprobante = crearComprobante();
        //comprobante.enviar(mensaje);
    }
}
