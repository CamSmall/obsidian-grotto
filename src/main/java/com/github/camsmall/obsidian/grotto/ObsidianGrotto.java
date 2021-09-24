package com.github.camsmall.obsidian.grotto;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ObsidianGrotto implements ModInitializer{

    // Item Groups
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("obsidiangrotto", "general")).icon(() -> new ItemStack(ObsidianGrotto.RAINBOW_ROCK)).build();

    // Items
    public static final RainbowRockItem RAINBOW_ROCK = new RainbowRockItem(new FabricItemSettings().group(ObsidianGrotto.ITEM_GROUP).maxCount(1));

    // Blocks
    public static final ConfettiStoneBlock CONFETTI_STONE = new ConfettiStoneBlock(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(3));

    @Override
    public void onInitialize() {
        // Register Blocks
        Registry.register(Registry.BLOCK, new Identifier("obsidiangrotto", "confetti_stone"), CONFETTI_STONE);

        // Register Items
        Registry.register(Registry.ITEM, new Identifier("obsidiangrotto", "rainbow_rock"), RAINBOW_ROCK);
        Registry.register(Registry.ITEM, new Identifier("obsidiangrotto", "confetti_stone"), new BlockItem(CONFETTI_STONE, new FabricItemSettings().group(ObsidianGrotto.ITEM_GROUP)));
    }
}
