package com.gyf.immersionbar.simple.fragment.two;

import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.simple.R;
import com.gyf.immersionbar.simple.fragment.BaseFragment;

/**
 * @author geyifeng
 * @date 2017/7/20
 */

public class MineTwoFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_two_mine;
    }

    @Override
    public void initImmersionBar() {
        super.initImmersionBar();
        ImmersionBar.with(this)
                .navigationBarColor(R.color.btn7)
                .init();
    }
}