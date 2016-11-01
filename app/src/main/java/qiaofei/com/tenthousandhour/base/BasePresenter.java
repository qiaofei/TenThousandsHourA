package qiaofei.com.tenthousandhour.base;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import butterknife.ButterKnife;
import java.util.LinkedList;
import qiaofei.com.tenthousandhour.injector.component.ActivityComponent;
import qiaofei.com.tenthousandhour.injector.component.AppComponent;
import qiaofei.com.tenthousandhour.injector.component.DaggerActivityComponent;
import qiaofei.com.tenthousandhour.injector.component.DaggerAppComponent;
import qiaofei.com.tenthousandhour.injector.moudle.ActivityModule;

/**
 * Created by Administrator on 2015/9/19.
 */
public abstract class BasePresenter {

  public BasePresenter() {

  }

  /**
   * 注入View，使之能够与View相互响应
   */
  public abstract void attachView(@NonNull IView iView);

  /**
   * 释放资源
   */
  public abstract void detachView();

  /**
   * init
   */
  public abstract void initPresenter();
}
