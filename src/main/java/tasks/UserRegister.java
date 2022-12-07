package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.WebDriver;
import userinterfaces.*;
import org.openqa.selenium.interactions.Actions;
import utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class UserRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("Jason").into(Personal.FIRSTNAME),
                SendKeys.of("Guzman").into(Personal.LASTNAME),
                SendKeys.of("jsontest02@xd.com").into(Personal.EMAIL),
                SendKeys.of("July").into(Personal.MONTH),
                SendKeys.of("22").into(Personal.DAY),
                SendKeys.of("1999").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                //Click.on(Location.COUNTRY),
                //SendKeys.of("Bogota").into(Location.CITY),
                //Click.on(Location.CITYSELECTOR),
                //SendKeys.of("123").into(Location.CODPOSTAL),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTONLASTFINAL),
                SendKeys.of("QAautomation.123").into(Complete.PASSWORD),
                SendKeys.of("QAautomation.123").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.BUTTONCOMPLETE)
        );
    }
    public static UserRegister makeinformation(){
        return instrumented(UserRegister.class);
    }

}
