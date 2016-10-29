package qiaofei.com.tenthousandhour.views.main;

import javax.inject.Inject;
import qiaofei.com.tenthousandhour.R;
import qiaofei.com.tenthousandhour.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.MvpView {

  @Inject MainPresenter mainPresenter;

  @Override public void initInjector() {
    mActivityComponent.inject(this);
    mainPresenter.attachView(this);
  }

  public void initData() {
  }

  protected int getLayoutId() {
    return R.layout.activity_main;
  }
}
