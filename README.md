# Laqorr Android Launcher
This application simply demonstrates how an application can launch the Laqorr Media Player.

When you press the _Launch_ button, the following code executes:

````
final Intent msg = new Intent();
final String action = "com.datmedia.laqorr.mediaplayer";
msg.setAction(action);
Context context = this;
context.sendBroadcast(msg);
````

If Laqorr is installed it will receive this boradcast and launch its Media Player activity. When the Media Player activity detects a mouse click or a screen touch it will close again.
