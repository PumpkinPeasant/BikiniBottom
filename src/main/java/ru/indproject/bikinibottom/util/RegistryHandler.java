package ru.indproject.bikinibottom.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.indproject.bikinibottom.BikiniBottom;
import ru.indproject.bikinibottom.blocks.BlockItemBase;
import ru.indproject.bikinibottom.blocks.Jar;
import ru.indproject.bikinibottom.blocks.PineappleBlock;
import ru.indproject.bikinibottom.items.ItemBase;
import ru.indproject.bikinibottom.items.Pickle;

public class RegistryHandler {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BikiniBottom.MOD_ID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BikiniBottom.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> SPATULA = ITEMS.register("spatula", ItemBase::new);

    private static final RegistryObject<Item> PICKLE = ITEMS.register("pickle", Pickle::new);

    // Blocks
    private static final RegistryObject<Block> PINEAPPLE_BLOCK = BLOCKS.register("pineapple_block", PineappleBlock::new);
    private static final RegistryObject<Block> JAR_BLOCK = BLOCKS.register("jar_block", Jar::new);
    // Block Items
    private static final RegistryObject<Item> PINEAPPLE_BLOCK_ITEM = ITEMS.register("pineapple_block_item", () -> new BlockItemBase(PINEAPPLE_BLOCK.get()));
    private static final RegistryObject<Item> JAR_BLOCK_ITEM = ITEMS.register("jar_block_item", () -> new BlockItemBase(JAR_BLOCK.get()));
}
