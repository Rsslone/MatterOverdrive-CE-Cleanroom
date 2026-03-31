package matteroverdrive.container;

import matteroverdrive.tile.TileEntityMachineGravitationalStabilizer;
import matteroverdrive.util.MOContainerHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

public class ContainerGravitationalStabilizer
		extends ContainerMachine<TileEntityMachineGravitationalStabilizer> {

	public ContainerGravitationalStabilizer(InventoryPlayer inventory,
			TileEntityMachineGravitationalStabilizer machine) {
		super(inventory, machine);
	}

	@Override
	public void init(InventoryPlayer inventory) {
		addAllSlotsFromInventory(machine.getInventoryContainer());
		MOContainerHelper.AddPlayerSlots(inventory, this, 45, 89, false, true);
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
}
