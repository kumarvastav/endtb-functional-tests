package org.bahmni.gauge.data;

import com.thoughtworks.gauge.datastore.DataStoreFactory;

/**
 * Created by atmaramn on 13/10/2016.
 */
public class StoreHelper {
    public static <T extends Object> void storeEntityInSpectStore(T entity) {
        DataStoreFactory.getSpecDataStore().put(entity.getClass(),entity);

    }
    public static <T extends Object> T getEntityInSpectStore(Class<T> type) {
        return (T)DataStoreFactory.getSpecDataStore().get(type);

    }
}
