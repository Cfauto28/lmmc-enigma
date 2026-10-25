package org.quiltmc.enigma.gui.lmmc;

public class LegacyModdingExtensions {
	private static final boolean ENABLED = Boolean.parseBoolean(System.getProperty("enigma.legacymodding", "false"));

	public static boolean isEnabled() {
		return ENABLED;
	}
}
