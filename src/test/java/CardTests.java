import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class CardTests {
    @Test
    void shouldTestCardDelivery()  {
        open("http://localhost:9999");
       // $$(".form")
       // SelenideElement form = $("[action=/]");
       // form.$("[placeholder=Город] input").setValue("Казань");
        $("[placeholder=Город]").setValue("Казань");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue("12.08.2023");
        $("[name=name]").setValue("Кирилл Костиев");
        $("[name=phone]").setValue("+77987897897");
        $("[class=checkbox__box]").click();
        $("[class=button__content]").click();
        $(withText("Успешно")).shouldBe(visible, Duration.ofSeconds(15));
        $(".notification__content")
                .shouldHave(Condition.text("Встреча успешно забронирована на " + "12.08.2023"), Duration.ofSeconds(15))
                .shouldBe(Condition.visible);








        //Thread.sleep(10000);

    }



}
