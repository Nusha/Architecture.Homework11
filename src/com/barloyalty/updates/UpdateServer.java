package com.barloyalty.updates;

public class UpdateServer implements IUpdateServer {
    private final IVersionDatabase versionDatabase;
    private Version currentVersion;

    public UpdateServer(IVersionDatabase versionDatabase) {
        this.versionDatabase = versionDatabase;
    }

    @Override
    public boolean hasUpdate() {
        Version latestVersion = this.versionDatabase.getLatestVersion();
        return latestVersion.compareTo(currentVersion) > 0;
    }

    @Override
    public void downloadUpdate() {
        // Implement logic to download update
    }

    @Override
    public void applyUpdate() {
        // Implement logic to apply update
    }
}
