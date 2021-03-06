package mao.com.mao_wanandroid_client.presenter.drawer;
import java.util.List;

import mao.com.mao_wanandroid_client.base.BaseView;
import mao.com.mao_wanandroid_client.base.presenter.AbstractBasePresenter;
import mao.com.mao_wanandroid_client.model.modelbean.home.HomeArticleData;

/**
 * @author maoqitian
 * @Description: 积分
 * @date 2019/7/26 0026 16:04
 */
public interface SquareContract {

    interface SquareView extends BaseView{

        void showSquareArticleData(boolean isLoadData, List<HomeArticleData> datas);

    }


    interface SquareFragmentPresenter extends AbstractBasePresenter<SquareView>{


          void getSquareArticleList();

          void getLoadSquareArticleListData();
    }

}

