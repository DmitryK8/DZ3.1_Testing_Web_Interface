package ru.netology.testweb;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CallbackTest {
    @Test
    void shouldTest() {
        open("http://localhost:9999");
        SelenideElement form = $("body");
        form.$("[data-test-id=name] input").setValue("Иванов Василий");
        form.$("[data-test-id=phone] input").setValue("+79270000000");
        form.$("[data-test-id=agreement]").click();
        form.$("[data-test-id=submit]").click();
        $(".alert-success").shouldHave(text("Ваша заявка успешно отправлена!"));
    }
}
