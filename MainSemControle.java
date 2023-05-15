public class MainSemControle {
    public static void main(String[] args) {
        ImpressoraSemControle impressora = new ImpressoraSemControle();

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(() -> {
                String documento = "Documento-" + Thread.currentThread().getName();
                impressora.imprimir(documento);
            });
            thread.start();
        }
    }
}