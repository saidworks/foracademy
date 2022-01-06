package com.forc.foracadem.backend.utils;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Utils {
    public static java.sql.Date getSqlDate(java.util.Date utilDate){
        return new java.sql.Date(utilDate.getTime());
    }

    public static Timestamp getSqlDateTime(java.time.LocalDateTime utilDateTime){
        Timestamp timestamp = Timestamp.valueOf(utilDateTime);
        return timestamp;
    }

    public static LocalDateTime getJavaLocalDateTime(Timestamp timestamp){
        return timestamp.toLocalDateTime();
    }

}
