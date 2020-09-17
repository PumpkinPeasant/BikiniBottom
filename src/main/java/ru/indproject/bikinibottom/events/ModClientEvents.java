package ru.indproject.bikinibottom.events;

import com.ibm.icu.util.BytesTrie;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.WorldPersistenceHooks;
import net.minecraftforge.fml.common.Mod;
import ru.indproject.bikinibottom.BikiniBottom;
import ru.indproject.bikinibottom.util.RegistryHandler;

@Mod.EventBusSubscriber(modid = BikiniBottom.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void onStoveClick(PlayerInteractEvent.RightClickBlock event){
        LivingEntity player = event.getEntityLiving();
        BlockState blockstate = event.getWorld().getBlockState(event.getPos());
        Block block = blockstate.getBlock();
        if (player.getHeldItemMainhand().getItem() == RegistryHandler.SPATULA.get()
                && block == Blocks.CLAY){
            BikiniBottom.LOGGER.info("Player used spatula on stove");

        }

    }
}
