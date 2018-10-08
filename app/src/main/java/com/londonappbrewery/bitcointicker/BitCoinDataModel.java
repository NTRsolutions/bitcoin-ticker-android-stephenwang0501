package com.londonappbrewery.bitcointicker;

import org.json.JSONObject;

public class BitCoinDataModel {
    private String mAverageByDay;

    public static BitCoinDataModel fromJson(final JSONObject jsonObject) {
        if (jsonObject == null) return null;
        try {
            final JSONObject object = jsonObject.getJSONObject("averages");
            if (object == null) return null;
            final double averageByDay = object.getDouble("day");
            BitCoinDataModel bitCoinDataModel = new BitCoinDataModel();
            bitCoinDataModel.mAverageByDay = String.valueOf(averageByDay);
            return bitCoinDataModel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getmAverageByDay() {
        return mAverageByDay;
    }
}
