package caching;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @see http://blog.meschberger.ch/2008/10/linkedhashmaps-hidden-features.html
 * @see http://chriswu.me/blog/a-lru-cache-in-10-lines-of-java/
 * @see http://www.ashishsharma.me/2011/09/custom-lru-cache-java.html
 * @see https://github.com/techpanja/interviewproblems/blob/master/src/maps/lrucache/LRUCache.java
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private final int MAX;
	
	public LRUCache(int max) {
    	// INITIAL capacity, DEFAULT load factor, true - access order (false - insertion order)
		super(max, 0.75f, true);
		MAX = max;
	}
	
	protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
		return size() > MAX;
	}
	
	
	
	///////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		LRUCache<String, String> cache = new LRUCache<String, String>(2);
		cache.get("0");
		
		cache.put("1", "a");
		cache.put("2", "b");
		
		cache.get("1");
		System.out.println(cache);// 2=b, 1=a
		
		cache.put("3", "c");
		
		System.out.println(cache);// 1=a, 3=c
		
		cache.put("2", "b");
		
		cache.put("4", "d");
		
		System.out.println(cache);// 2=b, 4=d
	}
}
