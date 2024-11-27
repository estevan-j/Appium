package tests;

public class MainTest extends BaseTest {
    public static void main(String[] args) {
        MainTest test = new MainTest();
        test.runTest();
    }

    public void runTest() {
        try {
            // Configurar el entorno
            setUp();

            // Crear instancia de la página
            AutosPage autosPage = new AutosPage(driver);

            // Ejecutar flujo de prueba
            autosPage.abrirRegistrarAuto();
            autosPage.completarFormulario("90823kw", "BMW", "2020", "2000");
            autosPage.activarSwitchElectrico();
            autosPage.confirmarRegistro();

            System.out.println("Prueba ejecutada correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Finalizar el entorno
            tearDown();
        }
    }
}
