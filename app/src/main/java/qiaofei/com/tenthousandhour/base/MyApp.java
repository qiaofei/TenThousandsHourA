package qiaofei.com.tenthousandhour.base;

import android.app.Application;
import java.io.IOException;
import qiaofei.com.tenthousandhour.injector.component.AppComponent;
import qiaofei.com.tenthousandhour.injector.component.DaggerAppComponent;
import qiaofei.com.tenthousandhour.injector.moudle.AppModule;
import qiaofei.com.tenthousandhour.injector.moudle.NetworkModule;
import qiaofei.com.tenthousandhour.utils.cacheutils.ACache;
import qiaofei.com.tenthousandhour.utils.cacheutils.DiskLruCacheHelper;

/**
 * Created by QiaoFei on 2016/6/6.
 */
//DaemonApplication
public class MyApp extends Application {
  public static ACache mCache;
  public static DiskLruCacheHelper diskLruCacheHelper;
  public static AppComponent mAppComponent;

  @Override public void onCreate() {
    super.onCreate();
    mCache = ACache.get(this);
    initializeInjector();
    try {
      diskLruCacheHelper = new DiskLruCacheHelper(getApplicationContext());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initializeInjector() {
    mAppComponent =
        DaggerAppComponent.builder().appModule(new AppModule(this)).networkModule(new NetworkModule()).build();
  }
}

