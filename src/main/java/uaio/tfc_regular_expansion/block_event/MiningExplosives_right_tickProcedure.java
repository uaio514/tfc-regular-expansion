package uaio.tfc_regular_expansion.block_event;

import uaio.tfc_regular_expansion.TfcRegularExpansionMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

/*
 * A regular TFC Expansion  , some blocks and items for TFC
    Copyright (C) 2024 uaio

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see https://www.gnu.org/licenses/>
 */

public class MiningExplosives_right_tickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		TfcRegularExpansionMod.queueServerWork(40, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.TNT);
		});
	}
}
