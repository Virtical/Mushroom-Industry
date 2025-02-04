package virtical.mushroomindustry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import virtical.mushroomindustry.MushroomIndustry;

public class ModItems {
    public static final Item GOLD_MUSHROOM = registerItem("gold_mushroom", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MushroomIndustry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MushroomIndustry.LOGGER.info("Registering Mod Items for " + MushroomIndustry.MOD_ID);
    }
}
