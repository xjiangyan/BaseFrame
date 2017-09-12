package huiiuh.com.shoppingmall.home;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import huiiuh.com.shoppingmall.base.BaseFragment;

/**
 * Created by hp on 2017/8/15.
 */

public class home_fragment extends BaseFragment {
    public TextView mTv;

    @Override
    public View initView() {
        mTv = new TextView(mContext);
        mTv.setGravity(Gravity.CENTER);
        mTv.setTextSize(30);
        Log.d("home_fragment", "主页面创建了");
        return mTv;
    }

    @Override
    public void initData() {
        super.initData();
        Log.d("home_fragment", "主页面被初始化");
        mTv.setText("主页");
    }
}
