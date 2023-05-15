public class MainComControle {
    public static void main(String[] args) {
        ImpressoraComControle impressora = new ImpressoraComControle();

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(() -> {
                String documento = "Documento-" + Thread.currentThread().getName();
                impressora.imprimir(documento);
            });
            thread.start();
        }
    }
}