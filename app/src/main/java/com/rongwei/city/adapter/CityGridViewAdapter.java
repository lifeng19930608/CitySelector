package com.rongwei.city.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.rongwei.city.R;
import com.rongwei.city.bean.RegionInfo;

import java.util.List;

/**
 * 头部热门城市的适配器
 */

public class CityGridViewAdapter extends CityBaseAdapter<RegionInfo, GridView> {

    private LayoutInflater inflater;
    private List<RegionInfo> list;

    public CityGridViewAdapter(Context ct, List<RegionInfo> list) {
        super(ct, list);
        inflater = LayoutInflater.from(ct);
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_hot_city, null);
            holder.cityName = convertView.findViewById(R.id.cityName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        RegionInfo info = list.get(position);
        holder.cityName.setText(info.getName());
        return convertView;
    }

    class ViewHolder {
        TextView cityName;
    }
}