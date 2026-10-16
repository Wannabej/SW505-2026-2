public class EmisorNotaCredito {
    @Override
    public Comprobante crearComprobante() {
        return new NotaCredito();
    }
    
}
