package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {


    /*public static final Target COUNTRY = Target.the("country").
            locatedBy("(//div[@ng-bind-html=\"country.name | highlight: $select.search\"])[50]");*/

    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");

    /*public static final Target CITYSELECTOR = Target.the("city selector").
            locatedBy("*"); */

    public static final Target CODPOSTAL = Target.the("cod postal").
            locatedBy("//input[@id=\"zip\"]");

    public static final Target BUTTONLOCATION = Target.the("BUTTON LOCATION").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");


}


