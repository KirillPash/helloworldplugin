import com.google.protobuf.Message;
import com.intellij.ide.BrowserUtil;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notification;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import com.intellij.ui.AnActionButton;
import org.apache.tools.ant.taskdefs.optional.sound.AntSoundPlayer;
import org.apache.tools.ant.taskdefs.optional.sound.SoundTask;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class HelloWorld extends AnAction {
    @Override
    // Вывод диалового окна с заголовком и сообщением
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showMessageDialog("Hello world!", "Title", Messages.getInformationIcon());
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}
