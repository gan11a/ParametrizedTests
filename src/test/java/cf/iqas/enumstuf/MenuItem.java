package cf.iqas.enumstuf;

public enum MenuItem{
    Keyboards("Клавиатуры и аксессуары"),
    Services("Услуги"),
    PreOrder("Предзаказ"),
    Used("Барахолка"),
    TradeIn("Trade-in"),
    Customize("Кастомизация")
    ;
    private String enumName;
    MenuItem(String name) {
        this.enumName = name;
    }
    public String getName(){
        return enumName;
    }
}

