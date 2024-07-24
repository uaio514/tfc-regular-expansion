
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uaio.tfc_regular_expansion.init;

import uaio.tfc_regular_expansion.TfcRegularExpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class TfcRegularExpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TfcRegularExpansionMod.MODID);
	public static final RegistryObject<Item> CAPACITOR = block(TfcRegularExpansionModBlocks.CAPACITOR);
	public static final RegistryObject<Item> MINING_EXPLOSIVES = block(TfcRegularExpansionModBlocks.MINING_EXPLOSIVES);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
