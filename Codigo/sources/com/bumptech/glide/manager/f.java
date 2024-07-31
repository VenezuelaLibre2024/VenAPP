package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.c;

/* loaded from: classes.dex */
public class f implements d {
    @Override // com.bumptech.glide.manager.d
    public c a(Context context, c.a aVar) {
        boolean z10 = androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new e(context, aVar) : new o();
    }
}
