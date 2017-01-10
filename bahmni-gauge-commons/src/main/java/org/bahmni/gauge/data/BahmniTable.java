package org.bahmni.gauge.data;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.List;

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
