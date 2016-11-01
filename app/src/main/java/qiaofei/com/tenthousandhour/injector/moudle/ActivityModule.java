package qiaofei.com.tenthousandhour.injector.moudle;

import android.app.Activity;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;

/**
 * Created by QiaoFei on 2016/6/8.
 */
@Module public class ActivityModule {

  private Activity mActivity;

  public ActivityModule(Activity activity) {
    this.mActivity = activity;
  }

  @Provides @ContextLife("Activity") public Context provideContext() {
    return mActivity.getApplicationContext();
  }

  @Provides public Activity provideActivity() {
    return mActivity;
  }
}
