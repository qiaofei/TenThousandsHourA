package qiaofei.com.tenthousandhour.injector.component;

import dagger.Component;
import javax.inject.Singleton;
import qiaofei.com.tenthousandhour.injector.moudle.NetworkModule;
import qiaofei.com.tenthousandhour.utils.network.NetworkApi;
import qiaofei.com.tenthousandhour.views.main.MainModels;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Singleton @Component(modules = NetworkModule.class) public interface NetworkComponent {

  NetworkApi getNetworkApi();

  void inject(MainModels mainModels);
}
