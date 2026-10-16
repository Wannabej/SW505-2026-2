public class Strategy {
    public static void main(String[] args) {
        EstrategiaCalculoTributario cg = new CalculoGeneral(), crer = new CalculoRer(), crus = new CalculoRus();
        Factura fac1 = new Factura(cg), fac2 = new Factura(crer), fac3 = new Factura(crus);
        fac1.calcular(1000);
        fac2.calcular(400);
        fac3.calcular(5500);
    }
}
