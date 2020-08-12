package ru.indproject.bikinibottom.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PineappleBlock extends Block {

    public PineappleBlock() {
        super(AbstractBlock.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f,4.5f)
                .sound(SoundType.WET_GRASS)
                .harvestTool(ToolType.AXE)
        );
    }
}
