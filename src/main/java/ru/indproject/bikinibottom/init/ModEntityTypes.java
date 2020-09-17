package ru.indproject.bikinibottom.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.indproject.bikinibottom.BikiniBottom;
import ru.indproject.bikinibottom.entities.RussianCarpetEntity;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, BikiniBottom.MOD_ID);

    public static final RegistryObject<EntityType<RussianCarpetEntity>> RUSSIANCARPET = ENTITY_TYPES.register("russian_carpet",()->
            EntityType.Builder.create(RussianCarpetEntity::new, EntityClassification.MISC)
                    .size(3.0f,6.0f)
                    .build(new ResourceLocation(BikiniBottom.MOD_ID,"russian_carpet").toString()));
}
