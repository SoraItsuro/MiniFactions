package com.hiddengrotto.minifactions.com.hiddengrotto.minifactions;


import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(id = "minifactions", name = "Mini Factions", version = "0.1.0-SNAPSHOT",
        url = "https://hiddengrotto.com", description = "A small PaperMC plugin designed with faction creation, territory management, and grief protection in\n" +
        "        mind.", authors = {"Sora Itsuro"})
public class MiniFactions {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public VelocityTest(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;

        logger.info("Hello there! I made my first plugin with Velocity.");
    }
}

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        // Do some operation demanding access to the Velocity API here.
        // For instance, we could register an event:
        server.getEventManager().register(this, new PluginListener());
    }