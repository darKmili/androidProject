/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-4-17 下午8:29
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.eci.eci6005a.R;

import java.util.ArrayList;


public class recyvDbAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public recyvDbAdapter(int item_recycler, ArrayList<String> strings) {
        super(item_recycler, strings);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_recyvdb_name, item);
    }
}
