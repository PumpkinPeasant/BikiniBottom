package ru.indproject.bikinibottom.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import ru.indproject.bikinibottom.BikiniBottom;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(BikiniBottom.TAB));
    }
}
