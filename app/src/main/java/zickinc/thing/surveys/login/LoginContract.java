package zickinc.thing.surveys.login;

import zickinc.thing.surveys.BasePresenter;
import zickinc.thing.surveys.BaseView;

/**
 * Interacción MVP en Login
 */
public interface LoginContract {

    interface View extends BaseView<Presenter>{
        void showProgress(boolean show);

        void setEmailError(String error);

        void setPasswordError(String error);

        void showLoginError(String msg);

        void showPushNotifications();

        void showGooglePlayServicesDialog(int errorCode);

        void showGooglePlayServicesError();

        void showNetworkError();
    }

    interface Presenter extends BasePresenter{
        void attemptLogin(String email, String password);
    }
}
