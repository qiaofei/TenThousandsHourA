package qiaofei.com.tenthousandhour.injector.moudle;

import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import javax.inject.Singleton;
import qiaofei.com.tenthousandhour.base.MyApp;
import qiaofei.com.tenthousandhour.utils.cacheutils.ACache;
import qiaofei.com.tenthousandhour.utils.cacheutils.DiskLruCacheHelper;
import qiaofei.com.tenthousandhour.utils.cacheutils.MyCacheUtil;

/**
 * Created by QiaoFei on 2016/6/7.
 */

@Module public class AppModule {
  private MyApp myApp;

  public AppModule(MyApp myApp) {
    this.myApp = myApp;
  }

  @Provides @Singleton @NonNull public Context provideContext() {
    return myApp.getApplicationContext();
  }

  @Provides @Singleton public MyCacheUtil getMyCacheUtil() {
    return new MyCacheUtil();
  }
}
