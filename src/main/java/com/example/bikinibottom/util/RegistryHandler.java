package com.example.bikinibottom.util;

import com.example.bikinibottom.BikiniBottom;
import com.example.bikinibottom.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, BikiniBottom.MOD_ID);

    public static void init() {
        Items.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> pickle = Items.register("pickle", ItemBase::new);

}

