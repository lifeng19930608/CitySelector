package com.rongwei.city.utils;

import com.rongwei.city.bean.CityModel;
import java.util.Comparator;

public class PinyinComparator implements Comparator<CityModel> {

	public int compare(CityModel o1, CityModel o2) {
		if (o1.getFirstName().equals("@") || o2.getFirstName().equals("#")) {
			return -1;
		} else if (o1.getFirstName().equals("#") || o2.getFirstName().equals("@")) {
			return 1;
		} else {
			return (o1.getFirstName()).compareTo(o2.getFirstName());
		}
	}

}
