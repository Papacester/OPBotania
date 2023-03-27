package com.papacester.op_botania;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("op_botania")
public class OPBotania {
	public OPBotania() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}