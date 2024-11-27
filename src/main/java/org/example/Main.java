import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            // Configurar opciones
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setDeviceName("emulator-5554");
            options.setApp("D:\\Software Environtment\\Docker\\AppiumLogin\\src\\main\\app\\app-debug.apk");
            options.setAutomationName("UiAutomator2");

            // Conectar al servidor Appium
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);

            // Configuración adicional
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Acciones de prueba
            // Localizar el campo de usuario y contraseñas usando AppiumBy
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/btn_autos")).click();
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/btn_registrar_auto")).click();
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_identificador")).sendKeys("90823kw");
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_marca")).sendKeys("BMW");
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_anio")).sendKeys("2020");
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_precio")).sendKeys("2000");
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/sw_electrico")).click();
            driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/btn_confirmar")).click();

            System.out.println("Prueba ejecutada correctamente");

            // Cerrar el driver
            // Esperar un tiempo (en milisegundos) antes de cerrar el driver
            Thread.sleep(3000); // Espera 5 segundos

            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
