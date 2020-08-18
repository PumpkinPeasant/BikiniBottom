package ru.indproject.bikinibottom.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.indproject.bikinibottom.items.Canned;

import java.util.ArrayList;

public class Jar<T extends Canned> extends Block  {

    private final int capacity = 5;
    private final ArrayList<T> contents = new ArrayList();

    private boolean is_not_fuel() {
        return contents.size() < capacity;
    }

    public void add(T item) {
        if (is_not_fuel()) {
            contents.add(item);
        }
    }

    public Jar() {
        super(AbstractBlock.Properties.create(Material.GLASS));
    }

}
