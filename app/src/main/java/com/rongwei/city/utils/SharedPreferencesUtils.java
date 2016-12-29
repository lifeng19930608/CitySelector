package com.rongwei.city.utils;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * 用于暂时存储一些变量
 */

public class SharedPreferencesUtils {

	/**
	 * 保存用户选择的城市
	 */
	public static void saveCityName(Context context, String cityName) {
		PreferenceManager.getDefaultSharedPreferences(context).edit().putString("cityName", cityName).commit();
	}

	public static String getCityName(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context).getString("cityName", "北京");
	}

}
