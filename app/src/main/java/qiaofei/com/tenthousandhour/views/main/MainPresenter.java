package qiaofei.com.tenthousandhour.views.main;

import android.content.Context;
import android.support.annotation.NonNull;
import javax.inject.Inject;
import qiaofei.com.tenthousandhour.base.IView;
import qiaofei.com.tenthousandhour.base.MyApp;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;
import qiaofei.com.tenthousandhour.utils.network.NetworkApi;

/**
 * Created by QiaoFei on 2016/6/6.
 */

public class MainPresenter implements MainContract.MvpPresenter {

    private Context mContext;
    private MainContract.MvpView mView;
    @Inject NetworkApi networkApi;

    @Inject
    public MainPresenter(@ContextLife("Activity") Context context) {
        mContext = context;
    }

    @Override
    public void attachView(@NonNull IView iView) {
        mView = (MainContract.MvpView) iView;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void initPresenter() {
        MyApp.mAppComponent.inject(this);
    }

}
