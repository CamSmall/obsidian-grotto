package com.github.camsmall.obsidian.grotto;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ObsidianGrotto implements ModInitializer{

    // Item Groups
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("obsidiangrotto", "general")).icon(() -> new ItemStack(ObsidianGrotto.RAINBOW_ROCK)).build();

    // Items
    public static final RainbowRockItem RAINBOW_ROCK = new RainbowRockItem(new FabricItemSettings().group(ObsidianGrotto.ITEM_GROUP).maxCount(16));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("obsidiangrotto", "rainbow_rock"), RAINBOW_ROCK);
    }
}
