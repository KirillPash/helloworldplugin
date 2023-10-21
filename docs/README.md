# Плагин Hello World! для Intellij IDEA
Выполнил студент группы M3110 Пашкеев Кирилл Сергеевич
## Описание плагина
Плагин добавляет в IDE новое действие, которое вызывает диалоговое окно c сообщением "Hello World!".
Ссылка для загрузки плагина в формате ZIP (для установки в IntelliJ IDEA):
https://drive.google.com/file/d/1C6y2BYyQ1fkufdolTuyNxtqNTBe0CTaK/view?usp=sharing
## Код и коментарии к плагину
### plugin.xml
```
<!-- Plugin Configuration File. Read more: https://plugins.jetbrains.com/docs/intellij/plugin-configuration-file.html -->
<idea-plugin>
    <!-- Unique identifier of the plugin. It should be FQN. It cannot be changed between the plugin versions. -->
    <id>com.github.kirillpash.helloworldplugin</id>

    <!-- Public plugin name should be written in Title Case.
         Guidelines: https://plugins.jetbrains.com/docs/marketplace/plugin-overview-page.html#plugin-name -->
    <name>Hello World! Plugin</name>

    <!-- A displayed Vendor name or Organization ID displayed on the Plugins Page. -->
    <vendor email="409317@niuitmo.ru" url="https://www.github.com/kirillpash">KirillPash</vendor>

    <!-- Description of the plugin displayed on the Plugin Page and IDE Plugin Manager.
         Simple HTML elements (text formatting, paragraphs, and lists) can be added inside of <![CDATA[ ]]> tag.
         Guidelines: https://plugins.jetbrains.com/docs/marketplace/plugin-overview-page.html#plugin-description -->
    <description><![CDATA[
    <h1>Shows Hello World! message</h1>
    <p>developed by KirillPash</p>
    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Smiley.svg/langru-200px-Smiley.svg.png">
  ]]></description>

    <!-- Product and plugin compatibility requirements.
         Read more: https://plugins.jetbrains.com/docs/intellij/plugin-compatibility.html -->
    <depends>com.intellij.modules.platform</depends>

    <!-- Extension points defined by the plugin.
         Read more: https://plugins.jetbrains.com/docs/intellij/plugin-extension-points.html -->
    <extensions defaultExtensionNs="com.intellij">

        <!-- Объявление действия HelloWorld из класса HelloWorld, которое добавляет действие "Show "Hello World!" в
         раздел инструментов (Tools). Действие активируется нажатием на него в панели либо сочетанием
         Ctrl + Alt + 1 и выводит на экран диалоговое окно с заголовком и сообщением-->
    </extensions>
    <actions>
        <action id="HelloWorld" class="HelloWorld" text="Show &quot;Hello World!&quot;"
                description="Just greets the world, including you">
            <keyboard-shortcut
                    keymap="$default"
                    first-keystroke="control alt 1"/>
            <add-to-group group-id="ToolsMenu" anchor="first"/>
        </action>
    </actions>
</idea-plugin>
```
### HelloWorld.java
```
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
```
