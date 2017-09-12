package huiiuh.com.shoppingmall.user;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import huiiuh.com.shoppingmall.base.BaseFragment;

/**
 * Created by hp on 2017/8/15.
 */

public class user_fragment extends BaseFragment {
    private TextView mTv;

    @Override
    public View initView() {
        mTv = new TextView(mContext);
        mTv.setGravity(Gravity.CENTER);
        return mTv;
    }

    @Override
    public void initData() {
        mTv.setText("用户中心");
        super.initData();
    }
}
