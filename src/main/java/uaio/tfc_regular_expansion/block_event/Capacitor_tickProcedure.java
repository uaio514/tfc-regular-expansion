package uaio.tfc_regular_expansion.block_event;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
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

public class Capacitor_tickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
			int _amount = 10;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
			int _amount = 10;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(z - 1, y, z));
			int _amount = 10;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(z + 1, y, z));
			int _amount = 10;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
	}
}
