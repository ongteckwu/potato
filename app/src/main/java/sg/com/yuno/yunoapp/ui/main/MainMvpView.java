package sg.com.yuno.yunoapp.ui.main;

import java.util.List;

import sg.com.yuno.yunoapp.data.model.Ribot;
import sg.com.yuno.yunoapp.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
