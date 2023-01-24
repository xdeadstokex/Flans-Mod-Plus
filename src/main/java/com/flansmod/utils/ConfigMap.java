package com.flansmod.utils;

import java.util.*;

public final class ConfigMap extends HashMap<String, String> {
    private final HashMap<String, String> defaultMap = new HashMap<>();
    public ArrayList<String> ammos = new ArrayList<>();
    public ArrayList<String> items = new ArrayList<>();
    public boolean containsKey(String key) {
        return defaultMap.containsKey(key.toLowerCase());
    }

    public String get(String key) {
        return defaultMap.get(key.toLowerCase());
    }

    public String put(String key, String value) {
        return defaultMap.put(key.toLowerCase(), value);
    }

    public int size() {
        return defaultMap.size();
    }

    public Set<Map.Entry<String,String>> entrySet() {
        return defaultMap.entrySet();
    }

    public Collection<String> values() {
        return defaultMap.values();
    }

    public int hashCode() {
        return defaultMap.hashCode();
    }

    public boolean isEmpty() {
        return defaultMap.isEmpty();
    }

    public boolean equals(Object o) {
        return defaultMap.equals(o);
    }
}

