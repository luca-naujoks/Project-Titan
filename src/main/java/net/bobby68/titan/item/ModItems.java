package net.bobby68.titan.item;

import net.bobby68.titan.TutorialMod;
import net.bobby68.titan.block.ModBlocks;
import net.bobby68.titan.entity.ModEntities;
import net.bobby68.titan.item.custom.AmethystArmorItem;
import net.bobby68.titan.item.custom.AnimatedBlockItem;
import net.bobby68.titan.item.custom.AnimatedItem;
import net.bobby68.titan.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));

    public static final Item TIGER_SPAWN_EGG = registerItem("tiger_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER, 0xD57E36, 0x1D0D00,
                    new FabricItemSettings()));

    public static final Item ANIMATED_ITEM = registerItem("animated_item",
            new AnimatedItem(new FabricItemSettings()));


    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item MUSIC_BOX_MUSIC_DISC = registerItem("music_box_music_disc",
            new MusicDiscItem(6, ModSounds.MUSIC_BOX, new FabricItemSettings().maxCount(1), 16));




    public static final Item GASTANK = registerItem("gastank",
            new Item(new FabricItemSettings()));
    public static final Item VME_BLADE = registerItem("vme_blade",
            new Item(new FabricItemSettings()));

    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));

    public static final Item CRUDE_IRON = registerItem("crude_iron",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
