package com.forc.foracadem.backend.utils;

@SuppressWarnings("serial")
public class DBException extends Exception {
    DBException() {}

    DBException(Exception e) {
        super(e);
    }
}