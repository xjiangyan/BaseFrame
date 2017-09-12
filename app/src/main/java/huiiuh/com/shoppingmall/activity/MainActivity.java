package huiiuh.com.shoppingmall.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import huiiuh.com.shoppingmall.R;
import huiiuh.com.shoppingmall.base.BaseFragment;
import huiiuh.com.shoppingmall.cart.cart_fragment;
import huiiuh.com.shoppingmall.community.community_fragment;
import huiiuh.com.shoppingmall.home.home_fragment;
import huiiuh.com.shoppingmall.type.type_fragment;
import huiiuh.com.shoppingmall.user.user_fragment;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.frameLayout)
    FrameLayout mFrameLayout;
    @Bind(R.id.rg_main)
    RadioGroup mRgMain;
    private ArrayList<BaseFragment> mFragmentlist;
    private int position = 0;
    private FragmentTransaction mFt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        mFragmentlist = new ArrayList<>();
        mFragmentlist.add(new home_fragment());
        mFragmentlist.add(new type_fragment());
        mFragmentlist.add(new community_fragment());
        mFragmentlist.add(new cart_fragment());
        mFragmentlist.add(new user_fragment());

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction mFt2 = fm.beginTransaction();

        mRgMain.check(R.id.rb_home);
        mFt2.add(R.id.frameLayout, mFragmentlist.get(0)).commit();
        mRgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                FragmentManager fm2 = getSupportFragmentManager();
                mFt = fm2.beginTransaction();
                hideFragments();
                switch (checkedId) {
                    case R.id.rb_home:
                        position = 0;
                        break;
                    case R.id.rb_type:
                        position = 1;
                        break;
                    case R.id.rb_community:
                        position = 2;
                        break;
                    case R.id.rb_cart:
                        position = 3;
                        break;
                    case R.id.rb_user:
                        position = 4;
                        break;
                    default:
                        position = 0;
                        break;
                }
                switchfragment(position);

                Log.d("MainActivity", "position:" + position);
            }
        });


    }

    private void switchfragment(int position) {

        if (!mFragmentlist.get(position).isAdded()) {
            mFt.add(R.id.frameLayout, mFragmentlist.get(position));
            Log.d("MainActivity", "添加了");
        }
        mFt.show(mFragmentlist.get(position));
        mFt.commit();
    }

    private void hideFragments() {
        for (int i = 0; i < mFragmentlist.size(); i++) {
            mFt.hide(mFragmentlist.get(i));
            Log.d("MainActivity", "隐藏了");
        }
    }

}
