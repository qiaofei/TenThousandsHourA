package qiaofei.com.tenthousandhour.injector.component;

import android.app.Activity;
import android.content.Context;
import dagger.Component;
import qiaofei.com.tenthousandhour.injector.moudle.ActivityModule;
import qiaofei.com.tenthousandhour.utils.network.NetworkApi;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;
import qiaofei.com.tenthousandhour.injector.scopes.PerActivity;
import qiaofei.com.tenthousandhour.views.main.MainActivity;

/**
 * Created by QiaoFei on 2016/6/8.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
  //void inject(LoginActivity loginActivity);

  NetworkApi getNetworkApi();

  @ContextLife("Activity") Context getActivityContext();

  @ContextLife("Application") Context getApplicationContext();

  Activity getActivity();

  void inject(MainActivity mainActivity);
}
