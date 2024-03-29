package deanteegarden.emergentcities.fastfurnace;

import deanteegarden.emergentcities.EmergentCities;
import net.minecraft.block.Block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFastFurnace extends Block {

    public static final ResourceLocation FAST_FURNACE = new ResourceLocation(EmergentCities.MODID, "fast_furnace");
    public BlockFastFurnace(){
        super(Material.IRON);

        setRegistryName(FAST_FURNACE);
        setUnlocalizedName(EmergentCities.MODID + ".fast_furnace");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(EmergentCities.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation((getRegistryName()), "inventory"));
    }
}
