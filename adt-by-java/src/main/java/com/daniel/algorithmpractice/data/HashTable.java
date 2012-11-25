package com.daniel.algorithmpractice.data;

public class HashTable {

    public static int hash(String key, int tableSize) {
	int hashValue = 0;

	for (int i = 0; i < key.length(); i++) {
	    hashValue = 37 * hashValue + key.charAt(i);
	}

	hashValue %= tableSize;

	if (hashValue < 0) {
	    hashValue += tableSize;
	}
	return hashValue;
    }
}
