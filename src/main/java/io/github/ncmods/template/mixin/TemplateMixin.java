/**
 * @license MIT
 */

package io.github.ncmods.template.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.TitleScreen;

@Mixin(TitleScreen.class)
public final class TemplateMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void beforeInit(CallbackInfo info) {
		System.out.println("TemplateMixin: hello, world!");
	}
}
