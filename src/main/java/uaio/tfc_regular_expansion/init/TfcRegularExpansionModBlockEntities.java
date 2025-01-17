
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uaio.tfc_regular_expansion.init;

import uaio.tfc_regular_expansion.block.entity.CapacitorBlockEntity;
import uaio.tfc_regular_expansion.TfcRegularExpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class TfcRegularExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TfcRegularExpansionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAPACITOR = register("capacitor", TfcRegularExpansionModBlocks.CAPACITOR, CapacitorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
