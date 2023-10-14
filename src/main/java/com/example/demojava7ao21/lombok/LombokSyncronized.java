package com.example.demojava7ao21.lombok;

import lombok.Synchronized;

public class LombokSyncronized {

    @Synchronized
    /* better than: synchronized */
    public void putValueInCache(String key, Object value) {
        // whatever here will be thread-safe code
    }
}
