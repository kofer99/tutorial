package debukkit.minecraft.basis.client;

import net.minecraftforge.client.MinecraftForgeClient;
import debukkit.minecraft.basis.CommonProxy;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers(){
		MinecraftForgeClient.preloadTexture(ITEM_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}

}
