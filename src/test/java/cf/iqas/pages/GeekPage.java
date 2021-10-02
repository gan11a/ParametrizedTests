package cf.iqas.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GeekPage {

    public static void openHome(){
        open("https://geekboards.ru");
    }
    public static void chooseTab(String TabName){
        $(byText(TabName)).click();
    }
    public static void checkTab(String TabName){
        $(".site-nav__items").shouldHave(Condition.text(TabName));
    }
    public static void numberTabInput(int number){
        $(".site-nav__link",number).click();
    }
}
