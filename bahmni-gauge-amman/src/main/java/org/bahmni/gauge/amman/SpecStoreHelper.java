package org.bahmni.gauge.amman;

import com.thoughtworks.gauge.datastore.DataStoreFactory;
import org.apache.commons.collections.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by swarup on 12/26/16.
 */
public class SpecStoreHelper {
    public static <T> boolean store(Class<T> tClass, T entity) {
        List<T> entities = (List<T>) DataStoreFactory.getSpecDataStore().get(tClass.getSimpleName());
        if (null == entities) {
            entities = new LinkedList<  >();
            DataStoreFactory.getSpecDataStore().put(tClass.getSimpleName(), entities);
        }
        return entities.add(entity);
    }

    public static <T> T getLatest(Class<T> tClass) {
        List<T> entities = (List<T>) DataStoreFactory.getSpecDataStore().get(tClass.getSimpleName());
        if (CollectionUtils.isEmpty(entities)) {
            return null;
        }
        return entities.get(entities.size() - 1);
    }
}
