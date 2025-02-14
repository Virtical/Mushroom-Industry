package virtical.mushroomindustry;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import virtical.mushroomindustry.item.ModItems;
import virtical.mushroomindustry.itemGroup.ModItemGroups;

public class MushroomIndustry implements ModInitializer {
	public static final String MOD_ID = "mushroom-industry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}