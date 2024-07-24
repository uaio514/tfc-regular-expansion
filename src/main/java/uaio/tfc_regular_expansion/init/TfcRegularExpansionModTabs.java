
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uaio.tfc_regular_expansion.init;

import uaio.tfc_regular_expansion.TfcRegularExpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TfcRegularExpansionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TfcRegularExpansionMod.MODID);
	public static final RegistryObject<CreativeModeTab> EXPANSION = REGISTRY.register("expansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tfc_regular_expansion.expansion")).icon(() -> new ItemStack(TfcRegularExpansionModBlocks.CAPACITOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TfcRegularExpansionModBlocks.CAPACITOR.get().asItem());
				tabData.accept(TfcRegularExpansionModBlocks.MINING_EXPLOSIVES.get().asItem());
			}).withSearchBar().build());
}
