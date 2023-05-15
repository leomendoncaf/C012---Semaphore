public class ImpressoraSemControle {
    public void imprimir(String documento) {
        // Simulando o processo de impressão
        System.out.println("Imprimindo documento: " + documento);
        try {
            Thread.sleep(1000); // Simulando tempo de impressão
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Documento impresso: " + documento);
    }
}

