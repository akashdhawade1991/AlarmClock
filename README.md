# AlarmClock APP


https://github.com/akashdhawade1991/AlarmClock/assets/68046117/3ba4dd0c-c51c-4bd8-92e9-39e295de1ee6


This Android application serves as a basic alarm clock. The user can set an alarm time through the TimePicker component. When the time is set, an alarm sound will play and the device will vibrate. The alarm can be toggled on and off using a ToggleButton.

# Components
 **AlarmReceiver:** This is a BroadcastReceiver class responsible for triggering the vibration and alarm sound when the alarm goes off. The alarm can be stopped by broadcasting an intent with action STOP_ALARM.

**Vibration:** The device vibrates for 40000 milliseconds (40 seconds) when the alarm goes off.

**Alarm Sound:** It will first attempt to get the default alarm ringtone. If it's not available, it will default to the notification sound.

# MainActivity
This activity allows the user to:

Set the desired alarm time via a TimePicker component.
Toggle the alarm ON or OFF using a ToggleButton.
When the alarm is toggled on, the app calculates the desired time and sets up the repeating alarm. If the current time surpasses the desired alarm time, the alarm is set to the next appropriate time interval (either next 12 hours for AM or next 24 hours for PM).

When the alarm is toggled off, the alarm and vibration are stopped and a message is displayed to the user.

# Usage
1. Launch the app.
3. Use the TimePicker to choose the desired time for the alarm.
3. Use the ToggleButton to switch the alarm ON or OFF.
