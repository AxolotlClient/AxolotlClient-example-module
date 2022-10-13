package io.github.axolotlclient.example;

import io.github.axolotlclient.AxolotlClient;
import io.github.axolotlclient.AxolotlclientConfig.options.BooleanOption;
import io.github.axolotlclient.modules.AbstractModule;

/**
 * Example Module for AxolotlClient
 */

public class ExampleModule extends AbstractModule {

	/**
	 * Add your own options in this method.
	 * <p>
	 * Options added here are automatically put into and read out of the config file.
	 **/
	@Override
	public void init() {
		System.out.println("This line is printed by an example module!");

		AxolotlClient.CONFIG.general.add(new BooleanOption("exampleModuleOption", false));
	}

	/**
	 * If you need to load any other stuff **AFTER** the config is loaded, use this method.
	 * However, it is rarely needed to do so.
	 **/
	@Override
	public void lateInit() {

	}

	/**
	 * This method is simply called on every tick of the Minecraft Client.
	 */
	@Override
	public void tick() {

	}
}
