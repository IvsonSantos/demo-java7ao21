package com.example.demojava7ao21.java8.concurrency;

import java.util.ArrayList;
import java.util.List;

// the following data structure will ensure that only one thread can access the inner block of the add() and next() methods.
public class SyncTest {

    private List<String> crawledSites = new ArrayList<String>();
    private List<String> linkedSites = new ArrayList<>();

    public void add(String site) {
        synchronized (this) {
            if (!crawledSites.contains(site)) {
                linkedSites.add(site);
            }
        }
    }

    /**
     * Get next site to crawl. Can return null (if nothing to crawl)
     */
    public String next() {
        if (linkedSites.size() == 0) {
            return null;
        }
        synchronized (this) {
            // Need to check again if size has changed
            if (linkedSites.size() > 0) {
                String s = linkedSites.get(0);
                linkedSites.remove(0);
                crawledSites.add(s);
                return s;
            }
            return null;
        }
    }

}
