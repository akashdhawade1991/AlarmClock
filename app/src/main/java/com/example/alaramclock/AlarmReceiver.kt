package com.example.alaramclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Vibrator

class AlarmReceiver :BroadcastReceiver() {

    companion object {
        var ringtone: Ringtone? = null
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        val vibrator = context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(40000)

        if (ringtone == null) {
            var alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)

            if (alarmUri == null) {
                alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            }
            ringtone = RingtoneManager.getRingtone(context, alarmUri)
        }

        if (intent?.action == "STOP_ALARM") {
            vibrator?.cancel()
            ringtone?.stop()
            return
        }else {
            ringtone?.play()
        }
    }
}
