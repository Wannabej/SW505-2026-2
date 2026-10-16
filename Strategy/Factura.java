public class Factura {
    private EstrategiaCalculoTributario strategy;

    public Factura(EstrategiaCalculoTributario strategy) {
        this.strategy = strategy;
    }

    public void calcular(double monto) {
        strategy.calcular(monto);
    }

}
