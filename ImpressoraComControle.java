import java.util.concurrent.Semaphore;

public class ImpressoraComControle {
    private Semaphore semaforo;

    public ImpressoraComControle() {
        this.semaforo = new Semaphore(1); // Apenas uma thread pode adquirir o semáforo ao mesmo tempo
    }

    public void imprimir(String documento) {
        try {
            semaforo.acquire(); // Adquire o semáforo, bloqueando outras threads
            // Simulando o processo de impressão
            System.out.println("Imprimindo documento: " + documento);
            Thread.sleep(1000); // Simulando tempo de impressão
            System.out.println("Documento impresso: " + documento);
            semaforo.release(); // Libera o semáforo para outras threads
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
