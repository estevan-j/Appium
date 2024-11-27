package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AutosPage {
    private AndroidDriver driver;

    public AutosPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void abrirRegistrarAuto() {
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/btn_autos")).click();
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/btn_registrar_auto")).click();
    }

    public void completarFormulario(String identificador, String marca, String anio, String precio) {
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_identificador")).sendKeys(identificador);
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_marca")).sendKeys(marca);
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_anio")).sendKeys(anio);
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/et_precio")).sendKeys(precio);
    }

    public void activarSwitchElectrico() {
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/sw_electrico")).click();
    }

    public void confirmarRegistro() {
        driver.findElement(AppiumBy.id("com.example.a05_finalproject:id/btn_confirmar")).click();
    }
}

