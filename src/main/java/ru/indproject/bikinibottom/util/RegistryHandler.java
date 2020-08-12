package ru.indproject.bikinibottom.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.indproject.bikinibottom.BikiniBottom;
import ru.indproject.bikinibottom.blocks.BlockItemBase;
import ru.indproject.bikinibottom.blocks.PineappleBlock;
import ru.indproject.bikinibottom.items.ItemBase;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BikiniBottom.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BikiniBottom.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> SPATULA = ITEMS.register("spatula", ItemBase::new);
    public static final RegistryObject<Item> PINEAPPLE_SLICE = ITEMS.register("pineapple_slice", ItemBase::new);
    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> PINEAPPLE_BLOCK = BLOCKS.register("pineapple_block", PineappleBlock::new);
    // Block Items
    public static final RegistryObject<Item> PINEAPPLE_BLOCK_ITEM = ITEMS.register("pineapple_block_item", () -> new BlockItemBase(PINEAPPLE_BLOCK.get()));
}
