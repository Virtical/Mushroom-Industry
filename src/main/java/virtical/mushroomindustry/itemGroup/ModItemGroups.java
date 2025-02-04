package virtical.mushroomindustry.itemGroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import virtical.mushroomindustry.MushroomIndustry;
import virtical.mushroomindustry.item.ModItems;

public class ModItemGroups {
    public static final ItemGroup MUSHROOMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MushroomIndustry.MOD_ID, "mushrooms"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.mushroom-industry.mushrooms"))
                    .icon(() -> new ItemStack(ModItems.GOLD_MUSHROOM))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_MUSHROOM);
                    })).build());

    public static void registerItemGroups() {
        MushroomIndustry.LOGGER.info("Registering Item Groups for " + MushroomIndustry.MOD_ID);
    }
}
