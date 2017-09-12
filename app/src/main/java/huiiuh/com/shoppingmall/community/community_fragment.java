package huiiuh.com.shoppingmall.community;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import huiiuh.com.shoppingmall.base.BaseFragment;

/**
 * Created by hp on 2017/8/15.
 */

public class community_fragment extends BaseFragment {

    private TextView mTv;

    @Override
    public View initView() {
        mTv = new TextView(mContext);
        mTv.setGravity(Gravity.CENTER);
        return mTv;
    }

    @Override
    public void initData() {
        mTv.setText("发现");
        super.initData();
    }
}
