package org.bahmni.gauge.util;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.apache.commons.beanutils.BeanUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableTransformer<T> {
    private Class<T> tClass;

    public TableTransformer(Class<T> tClass){
        this.tClass = tClass;
    }

    public T transformToTable(Table table){
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        if(rows.size() == 0)
            throw new IllegalArgumentException("The table either contains 0 rows or multiple rows!!");

        Map<String, String> rowMap = new HashMap<>();

        for(String column : columnNames){
            rowMap.put(column, rows.get(0).getCell(column));
        }

        try {
            T obj = tClass.newInstance();
            BeanUtils.populate(obj,rowMap);

            return obj;
        } catch (Exception e) {
               throw new IllegalArgumentException("Unable to instantiate the object of the provided class");
        }
    }
}
