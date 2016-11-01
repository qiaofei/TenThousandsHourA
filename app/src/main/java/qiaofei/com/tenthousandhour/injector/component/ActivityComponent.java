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
@Component(modules = ActivityModule.class) public interface ActivityComponent {

  @ContextLife("Activity") Context getActivityContext();

  Activity getActivity();

  void inject(MainActivity mainActivity);
}
