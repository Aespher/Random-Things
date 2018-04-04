package lumien.randomthings.block;

import lumien.randomthings.tileentity.TileEntityAncientFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAncientFurnace extends BlockContainerBase
{

	protected BlockAncientFurnace()
	{
		super("ancientFurnace", Material.ROCK);
		
		this.setBlockUnbreakable().setResistance(6000000.0F);
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityAncientFurnace();
	}

}
