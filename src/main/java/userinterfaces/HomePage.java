package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static  final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se realiza la busqueda").
            located(By.id("search-key"));
    public static  final Target SELECT_TIPO_CATEGORIA = Target.the("Select tipo de categoria").
            located(By.id("search-dropdown-box"));
    public static  final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton buscar articulo").
            located(By.className("search-button"));
    public static  final Target BUTTON_CERRAR_VENTANA = Target.the("Boton cerrar ventana emergente").
            locatedBy("//*[@src='https://img.alicdn.com/tfs/TB1a.Oge_M11u4jSZPxXXahcXXa-48-48.png']");
    public static  final Target LINK_ARTICULO_ENCONTRADO = Target.the("Link articulo encontrado").
            locatedBy("//a[starts-with(@title,'{0}')]");
}
