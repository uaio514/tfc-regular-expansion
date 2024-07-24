
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uaio.tfc_regular_expansion.init;

import uaio.tfc_regular_expansion.block.MiningExplosivesBlock;
import uaio.tfc_regular_expansion.block.CapacitorBlock;
import uaio.tfc_regular_expansion.TfcRegularExpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TfcRegularExpansionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TfcRegularExpansionMod.MODID);
	public static final RegistryObject<Block> CAPACITOR = REGISTRY.register("capacitor", () -> new CapacitorBlock());
	public static final RegistryObject<Block> MINING_EXPLOSIVES = REGISTRY.register("mining_explosives", () -> new MiningExplosivesBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
