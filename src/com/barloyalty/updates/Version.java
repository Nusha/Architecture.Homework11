package com.barloyalty.updates;



public class Version implements Comparable<Version> {
    private String versionNumber;
    private String releaseDate;

    public Version(String versionNumber, String releaseDate) {
        this.versionNumber = versionNumber;
        this.releaseDate = releaseDate;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int compareTo(Version other) {
           return this.versionNumber.compareTo(other.versionNumber);
    }

    @Override
    public String toString() {
        return "Version: " + versionNumber + ", Release Date: " + releaseDate;
    }
}
