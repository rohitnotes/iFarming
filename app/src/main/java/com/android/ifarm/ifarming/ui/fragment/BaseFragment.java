package com.android.ifarm.ifarming.ui.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;

public class BaseFragment extends Fragment {
    public void bindView(Fragment fragment, View view) {
        ButterKnife.bind(fragment,view);
    }
    public void registerEventBus() {
        EventBus.getDefault().register(this);
    }

    public void unRegisterEventBus() {
        EventBus.getDefault().unregister(this);
    }

    public void postEvent(Object event) {
        EventBus.getDefault().post(event);
    }

    public void onEvent(Object event) {
    }
}
