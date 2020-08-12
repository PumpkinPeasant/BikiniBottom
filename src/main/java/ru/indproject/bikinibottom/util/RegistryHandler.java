package ru.indproject.bikinibottom.util;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.indproject.bikinibottom.BikiniBottom;
import ru.indproject.bikinibottom.items.ItemBase;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BikiniBottom.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SPATULA = ITEMS.register("spatula", ItemBase::new);

    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle", ItemBase::new);
}
