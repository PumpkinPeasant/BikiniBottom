package ru.indproject.bikinibottom.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import ru.indproject.bikinibottom.BikiniBottom;

@Mod.EventBusSubscriber(modid = BikiniBottom.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ModServerEvents {
}
