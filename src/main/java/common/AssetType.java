package common;

import java.io.Serializable;

/**
 * This class initialises an Asset Type
 *
 * @author Laku Jackson
 */


public class AssetType implements Serializable {
    private static final long serialVersionUID = 30L;
    private String assetType;

    public AssetType() {

    }

    public AssetType(String assetType){

        this.assetType = assetType;
    }

    /**
     * Get the asset name of the asset type object.
     *
     * @return the asset name
     */
    public String getAsset(){ return assetType; }

    /**
     * Set the asset name of the asset type object.
     *
     * @param assetType the asset name to set
     */
    public void setAsset(String assetType){ this.assetType = assetType; }
}