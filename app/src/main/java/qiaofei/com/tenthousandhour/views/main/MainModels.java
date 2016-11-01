package qiaofei.com.tenthousandhour.views.main;

import javax.inject.Inject;
import qiaofei.com.tenthousandhour.base.BaseModels;
import qiaofei.com.tenthousandhour.utils.network.NetworkApi;

/**
 * Created by QiaoFei on 2016/6/6.
 */

public class MainModels extends BaseModels implements MainContract.MvpModels {
  @Inject NetworkApi networkApi;
}
