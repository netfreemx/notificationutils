/*
 * Created by OCristian Gonzalez on 02/12/23 17:51
 *  Copyright (c) NetFreeMexico 2023 . All rights reserved.
 */

package com.netfreemexico.notificationutils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.preference.PreferenceManager;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.netfreemexico.notificationutils.constants.AppConstants;

public class NotificationUtils implements AppConstants {
    private final Context context;

    public NotificationUtils(Context context) {
        this.context = context;
        if (!suscritedTopic() && Utils.hasConnected(context)) {
            suscribeTopic();
        }
    }

    public void setOpenClass(Class<? extends Activity> openClass) {
        prefs().edit().putString(INTENT_CLASS, openClass.getName()).apply();
    }

    private void suscribeTopic() {
        FirebaseMessaging.getInstance().subscribeToTopic(context.getPackageName())
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            prefs().edit().putBoolean(SUSCRITED_TOPIC, true).apply();
                        }
                    }
                });
    }

    private SharedPreferences prefs() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private boolean suscritedTopic() {
        return prefs().getBoolean(SUSCRITED_TOPIC, false);
    }



}
