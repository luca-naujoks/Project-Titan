package net.bobby68.titan.item;

import net.bobby68.titan.TutorialMod;
import net.bobby68.titan.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE = Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "citrine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.citrine"))
                    .icon(() -> new ItemStack(ModItems.CITRINE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_CITRINE);
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.ANIMATED_ITEM);

                        entries.add(ModItems.MUSIC_BOX_MUSIC_DISC);
                        entries.add(ModItems.TIGER_SPAWN_EGG);

                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);

                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);

                        entries.add(ModBlocks.RED_MAPLE_LOG);
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);
                        entries.add(ModBlocks.RED_MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_RED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
                        entries.add(ModBlocks.RED_MAPLE_PLANKS);
                        entries.add(ModBlocks.RED_MAPLE_SAPLING);

                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.CITRINE);
            entries.add(ModItems.RAW_CITRINE);
        });
    }
    public static ItemGroup TITAN = Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "titan"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.titan"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_STEEL);
                        entries.add(ModItems.CRUDE_IRON);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);

                        entries.add(ModItems.GASTANK);
                        entries.add(ModItems.VME_BLADE);

                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_STEEL_ORE);
                        entries.add(ModBlocks.NETHERRACK_STEEL_ORE);
                        entries.add(ModBlocks.ENDSTONE_STEEL_ORE);

                        entries.add(ModBlocks.REFUEL_STATION);
                        entries.add(ModBlocks.GEAR_STATION);

                    }).build());
}
