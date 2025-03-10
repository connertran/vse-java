package com.example.catalog;

public interface Searchable {
    String getDisplayName(); //abstract method, this is like a "blueprint" for java classes
    String prepareSearchableString();
}
