package com.barloyalty.updates;

public class ClientApplication implements IClientApplication {
    private IUpdateServer updateServer;

    public ClientApplication(IUpdateServer updateServer) {
        this.updateServer = updateServer;
    }

    @Override
    public void checkForUpdates() {
        if (this.updateServer.hasUpdate()) {
            this.updateServer.downloadUpdate();
            this.updateServer.applyUpdate();
        }
    }
}

