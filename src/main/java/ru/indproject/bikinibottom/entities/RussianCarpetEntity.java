package ru.indproject.bikinibottom.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.item.PaintingEntity;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RussianCarpetEntity extends PaintingEntity {

    public RussianCarpetEntity(EntityType<? extends PaintingEntity> type, World worldIn) {
        super(type, worldIn);
    }
//    public static AttributeModifierMap.MutableAttribute setCustomAttribute() {
//        return PaintingEntity.collideBoundingBox()
//    }

}
