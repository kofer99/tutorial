package debukkit.minecraft.basis;
			
		import cpw.mods.fml.common.Mod;
		import cpw.mods.fml.common.Mod.Init;
		import cpw.mods.fml.common.Mod.Instance;
		import cpw.mods.fml.common.Mod.PostInit;
		import cpw.mods.fml.common.Mod.PreInit;
		import cpw.mods.fml.common.SidedProxy;
		import cpw.mods.fml.common.event.FMLInitializationEvent;
		import cpw.mods.fml.common.event.FMLPostInitializationEvent;
		import cpw.mods.fml.common.event.FMLPreInitializationEvent;
		import cpw.mods.fml.common.network.NetworkMod;

		@Mod(modid="Basis", name="Basis", version="0.0.0")
		@NetworkMod(clientSideRequired=true, serverSideRequired=false)
		public class Basis {
		
			@Instance("Basis")
			public static Basis instance;
			
			@SidedProxy(clientSide="debukkit.minecraft.basis.client.ClientProxy", serverSide="debukkit.minecraft.basis.CommonProxy")
			public static CommonProxy proxy;
			
			@PreInit
			public void preInit(FMLPreInitializationEvent event) {
				
			}
			
			@Init
			public void load(FMLInitializationEvent event) {
				proxy.registerRenderers();
			}
			
			@PostInit
			public void postInit(FMLPostInitializationEvent event) {
				
			}
}