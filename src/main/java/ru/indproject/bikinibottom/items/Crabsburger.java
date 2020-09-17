package ru.indproject.bikinibottom.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import ru.indproject.bikinibottom.BikiniBottom;

public class Crabsburger extends Item {
    public Crabsburger() {
        super(new Item.Properties()
                .group(BikiniBottom.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(5.0f)
                        .effect(new EffectInstance(Effects.REGENERATION,10*20,1),0.9f)
                        .build())
        );
    }

}
