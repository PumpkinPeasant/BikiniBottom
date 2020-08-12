package ru.indproject.bikinibottom.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import ru.indproject.bikinibottom.BikiniBottom;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(BikiniBottom.TAB));
    }
}
