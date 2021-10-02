package cf.iqas;
import cf.iqas.enumstuf.MenuItem;
import cf.iqas.pages.GeekPage;
import javafx.scene.control.Tab;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedTests {
    @CsvSource({
            "Клавиатуры и аксессуары",
            "Услуги",
            "Предзаказ",
            "Барахолка",
            "Trade-in",
            "Кастомизация"
    })
    @ParameterizedTest
    @DisplayName("CSV test")
    void csvSourceTest(String TabName){
        GeekPage.openHome();
        GeekPage.chooseTab(TabName);
        GeekPage.checkTab(TabName);
    }
    @EnumSource(value = MenuItem.class)
    @ParameterizedTest()
    @DisplayName("Enum Test")
    void enumSourceTest(MenuItem menuItem){
        GeekPage.openHome();
        GeekPage.chooseTab(menuItem.getName());
        GeekPage.checkTab(menuItem.getName());
    }
    //Method source
    static Stream<Arguments> methodSource(){
        return Stream.of(
                Arguments.of(
                        0, "Клавиатуры и аксессуары"
                ),
                Arguments.of(
                        1, "Услуги"
                ),
                Arguments.of(
                        2, "Предзаказ"
                ),
                Arguments.of(
                        3, "Барахолка"
                ),
                Arguments.of(
                        4, "Trade-in"
                ),
                Arguments.of(
                        5, "Кастомизация"
                )
        );
    }
    @MethodSource("methodSource")
    @ParameterizedTest()
    @DisplayName("Method Test")
    void methodSourceTest(int number, String title){
        GeekPage.openHome();
        GeekPage.numberTabInput(number);
        GeekPage.checkTab(title);
    }
}
