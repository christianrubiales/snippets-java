package caching;

import java.util.HashMap;
import java.util.Map;

public class LimitedCapacityHashMap<K, V> extends HashMap<K, V>{

	private final int maximumCapacity;
	
	public LimitedCapacityHashMap(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}
	
	@Override
	public V put(K key, V value) {
		if (size() == maximumCapacity) {
			throw new IllegalStateException("Can no longer add to map, will exceed maximum capacity of: " + maximumCapacity);
		}
		
		return super.put(key, value);
	}
	
	public int getMaximumCapacity() {
		return maximumCapacity;
	}
	
	public static void main(String[] args) {
		Map<String, String> map = new LimitedCapacityHashMap<>(3);
		
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		System.out.println(map);
		
		map.put("4", "4"); // exception
	}
}
