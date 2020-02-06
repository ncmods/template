/**
 * @license MIT
 */

package io.github.ncmods.template;

import net.fabricmc.api.ModInitializer;

public final class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "ncmods/template";

	@Override
	public void onInitialize() {
		System.out.println("TemplateMod: hello, world!");
	}
}
