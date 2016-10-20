package org.bahmni.gauge.data;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atmaramn on 20/10/2016.
 */
public class BahmniTable extends Table {
    public BahmniTable(List<String> headers) {
        super(headers);
    }
    public boolean doesColumnOfEachRowContainsValue(String value,String column){

        for (TableRow row: this.getTableRows()
                ) {
            if(!row.getCell(column).toLowerCase().contains(value.toLowerCase()))
                return false;
        }
        return true;
    }
}
