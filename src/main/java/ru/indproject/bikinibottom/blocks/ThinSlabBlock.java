package ru.indproject.bikinibottom.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ThinSlabBlock extends Block {


    public ThinSlabBlock(Properties properties) {
        super(properties);
    }

    public static class ConcreteSlab extends ThinSlabBlock{
        public ConcreteSlab() {
            super(Properties.create(Material.ROCK)
                    .hardnessAndResistance(2.0f,4.5f)
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)

            );
        }
    }
}
