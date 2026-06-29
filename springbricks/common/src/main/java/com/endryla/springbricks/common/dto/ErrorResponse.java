package com.endryla.springbricks.common.dto;

import java.sql.Timestamp;
import java.util.Map;

public record ErrorResponse (
        String message,
        int status,
        Timestamp timestamp,
        String[] errors,
        Map<String,String[]> validationErrors,
        String path
){}
