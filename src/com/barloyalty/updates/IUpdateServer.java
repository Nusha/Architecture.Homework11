package com.barloyalty.updates;

public interface IUpdateServer {
    boolean hasUpdate();
    void downloadUpdate();
    void applyUpdate();
}
