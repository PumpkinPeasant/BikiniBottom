package ru.indproject.bikinibottom.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import ru.indproject.bikinibottom.BikiniBottom;

public class Pickle extends Item {
    public Pickle() {
        super(new Item.Properties()
                    .group(BikiniBottom.TAB)
                    .food(new Food.Builder()
                            .hunger(1)
                            .build())
        );
    }
}
