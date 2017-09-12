package huiiuh.com.shoppingmall.type;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import huiiuh.com.shoppingmall.base.BaseFragment;

/**
 * Created by hp on 2017/8/15.
 */

public class type_fragment extends BaseFragment {
    private TextView mTv;

    @Override
    public View initView() {
        mTv = new TextView(mContext);
        mTv.setGravity(Gravity.CENTER);
        return mTv;
    }

    @Override
    public void initData() {
        mTv.setText("分类");
        super.initData();
    }
}
