package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Rahul on 8/1/17.
 */

public class CurrModel {

    String mAsk;

    public static CurrModel fromJson(JSONObject jsonObject)
    {
    try
    {
        CurrModel currModel = new CurrModel();
        currModel.mAsk = jsonObject.getString("ask");
        return currModel;
    }
    catch (JSONException e)
    {
        e.printStackTrace();
        return null;
    }
    }
}

