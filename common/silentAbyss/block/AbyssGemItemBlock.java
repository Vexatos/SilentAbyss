package silentAbyss.block;

import silentAbyss.item.AbyssGem;
import silentAbyss.lib.Reference;
import silentAbyss.lib.Strings;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class AbyssGemItemBlock extends ItemBlock {

	public AbyssGemItemBlock(int par1) {
		
		super(par1);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int damageValue) {
		
		return damageValue;
	}
	
	@Override
	public Icon getIconFromDamage(int par1) {
		
		return AbyssGemBlock.icons[par1];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		int d = stack.getItemDamage();
		
	    StringBuilder s = new StringBuilder();
	    s.append("tile.");
	    s.append(Strings.RESOURCE_PREFIX);
	    
	    if (d == Reference.INDEX_ABYSSITE) {
	    	s.append("blockAbyssite");
	    	return s.toString();
	    }
	    else if (d == Reference.INDEX_PURITE) {
	    	s.append("blockPurite");
	    	return s.toString();
	    }
	    
	    s.append("blockAbyss");
	    s.append(AbyssGem.names[d]);
		return s.toString();
	}
}
