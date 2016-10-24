package org.bahmni.gauge.data;

import com.thoughtworks.gauge.datastore.DataStoreFactory;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StoreHelper {
    public static <T> boolean store(Class<T> tClass, T entity) {
        List<T> entities = (List<T>) DataStoreFactory.getSpecDataStore().get(tClass);
        if (null == entities) {
            entities = new LinkedList<>();
            DataStoreFactory.getSpecDataStore().put(tClass, entities);
        }
        return entities.add(entity);
    }

    public static <T> T getLatest(Class<T> tClass) {
        List<T> entities = (List<T>) DataStoreFactory.getSpecDataStore().get(tClass);
        if (CollectionUtils.isEmpty(entities)) {
            return null;
        }
        return entities.get(entities.size() - 1);
    }

    public static <T> List<T> getAll(Class<T> tClass) {
        List<T> entities = (List<T>) DataStoreFactory.getSpecDataStore().get(tClass);
        if (null == entities) {
            return Collections.EMPTY_LIST;
        }
        return entities;
    }
}
