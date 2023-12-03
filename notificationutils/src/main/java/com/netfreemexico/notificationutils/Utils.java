/*
 * Created by OCristian Gonzalez on 02/12/23 18:05
 *  Copyright (c) NetFreeMexico 2023 . All rights reserved.
 */

package com.netfreemexico.notificationutils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Random;

public class Utils {
    public static boolean hasConnected(Context context) {
        try {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false;
            ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            Network network = manager.getActiveNetwork();
            NetworkCapabilities capabilities = manager.getNetworkCapabilities(network);
            boolean isCapabilities = capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
            boolean isConnected = capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED);

            return isCapabilities && isConnected;
        } catch (Exception ignore) {
            return false;
        }
    }

    public static int randomId() {
        Random random = new Random();
        return random.nextInt(10000);
    }
}
