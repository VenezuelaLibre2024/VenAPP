package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class t {

    /* renamed from: c, reason: collision with root package name */
    private static t f11917c;

    /* renamed from: a, reason: collision with root package name */
    private Boolean f11918a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f11919b = null;

    private t() {
    }

    public static synchronized t a() {
        t tVar;
        synchronized (t.class) {
            if (f11917c == null) {
                f11917c = new t();
            }
            tVar = f11917c;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Context context) {
        if (this.f11919b == null) {
            this.f11919b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f11918a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11919b.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(Context context) {
        if (this.f11918a == null) {
            this.f11918a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f11918a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11918a.booleanValue();
    }
}
