package ru.indproject.bikinibottom.events;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ru.indproject.bikinibottom.BikiniBottom;
import ru.indproject.bikinibottom.items.Canned;

@Mod.EventBusSubscriber(modid = BikiniBottom.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class PicklingEvent {

    @SubscribeEvent
    public static void Pickling(LivingAttackEvent event) {
        LivingEntity player =  event.getEntityLiving();
        Item item = player.getHeldItemMainhand().getItem();
        LivingEntity target = player.getRevengeTarget();
    }

//    private Block get_jar(LivingEntity target) {
//        BlockState state = target.getBlockState();
//
//    }

}
