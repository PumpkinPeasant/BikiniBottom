package ru.indproject.bikinibottom;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.indproject.bikinibottom.entities.RussianCarpetEntity;
import ru.indproject.bikinibottom.init.ModEntityTypes;
import ru.indproject.bikinibottom.util.RegistryHandler;

@Mod("bikinibottom")
public class BikiniBottom
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bikinibottom";
    public BikiniBottom() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
//        DeferredWorkQueue.runLater(()->{
//            GlobalEntityTypeAttributes.put(ModEntityTypes.RUSSIANCARPET.get(),)
//        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
    public static final ItemGroup TAB = new ItemGroup("bikinibottom") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.SPATULA.get());
        }
    };
}
