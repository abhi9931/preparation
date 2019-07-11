package com.abhi.prep;

public class StantonMeasure {
	
	public static int  stantonMeasure(int[] a) {
		int count=0;
		int stantonMeasure=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==count) {
				stantonMeasure++;
			}
		}
		
/*		Map<Integer, Integer> map=new TreeMap();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
		Set<Entry<Integer, Integer>> set=map.entrySet();
		Iterator<Entry<Integer, Integer>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Integer> entry=itr.next();
			if(entry.getKey()==entry.getValue()) {
				return entry.getKey();
			}
		}*/
		return stantonMeasure;
	}

}
