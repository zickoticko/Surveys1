package zickinc.thing.surveys.notifications;

import zickinc.thing.surveys.BasePresenter;
import zickinc.thing.surveys.BaseView;
import zickinc.thing.surveys.data.PushNotification;


import java.util.ArrayList;

/**
 * Interacción MVP en Notificaciones
 */
public interface PushNotificationContract {

    interface View extends BaseView<Presenter>{

        void showNotifications(ArrayList<PushNotification> notifications);

        void showEmptyState(boolean empty);

        void popPushNotification(PushNotification pushMessage);
    }

    interface Presenter extends BasePresenter{

        void registerAppClient();

        void loadNotifications();

        void savePushMessage(String title, String description,
                             String expiryDate, String discount);
    }
}
