package sql;

import common.AssetTypes;

import java.util.Set;

/**
 *
 *
 * @author Adam Buchsbaum
 */

public interface AssetTypeDataSource {

    /**
     * Adds an Asset Type to the asset list, if it is not already in the list
     *
     * @param Asset Asset to add
     */
    void addAssetType(AssetTypes Asset);

    /**
     * Extracts all the details of a Person from the address book based on the
     * name passed in.
     *
     * @param assetType The name as a String to search for.
     * @return all details in a Person object for the name
     */
    AssetTypes getAsset(String assetType);

    /**
     * Gets the number of addresses in the address book.
     *
     * @return size of address book.
     */
    int getSize();

    /**
     * Deletes a Person from the address book.
     *
     * @param AssetType The name to delete from the address book.
     */
    void deleteAssetType(String AssetType);

    /**
     * Finalizes any resources used by the data source and ensures data is
     * persisited.
     */
    void close();

    /**
     * Retrieves a set of names from the data source that are used in
     * the name list.
     *
     * @return set of names.
     */
    Set<String> nameSet();
}
