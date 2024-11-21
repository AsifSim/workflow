package com.spriced.workflow;

import flink.generic.db.Model.Condition;
//import flink.generic.db.Service.GenericQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import flink.generic.db.Service.*;
import flink.generic.db.*;

import java.util.List;
import java.util.Map;

@Service
public class DataReading {
    @Autowired
    GenericQueryService genServ;
    public List<Map<String,Object>> read(String tableName, List<String> columns, List<Condition> conditions, String dbName) {
        return genServ.queryTable(tableName,columns, conditions, dbName);
    }
}
