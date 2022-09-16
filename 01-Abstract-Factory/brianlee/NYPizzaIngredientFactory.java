package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.brian;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.brian.ingredients.*;

public class NYPizzaIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new RiceDough();
    }

    @Override
    public Source createSource() {
        return new WhiteSource();
    }

    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }
}
