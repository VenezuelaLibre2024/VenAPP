package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.firebase.iid.t */
/* loaded from: classes.dex */
public class C6188t {

    /* renamed from: c */
    private static C6188t f13132c;

    /* renamed from: a */
    private Boolean f13133a = null;

    /* renamed from: b */
    private Boolean f13134b = null;

    private C6188t() {
    }

    /* renamed from: a */
    public static synchronized C6188t m16773a() {
        C6188t c6188t;
        synchronized (C6188t.class) {
            if (f13132c == null) {
                f13132c = new C6188t();
            }
            c6188t = f13132c;
        }
        return c6188t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m16774b(Context context) {
        if (this.f13134b == null) {
            this.f13134b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f13133a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f13134b.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m16775c(Context context) {
        if (this.f13133a == null) {
            this.f13133a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f13133a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f13133a.booleanValue();
    }
}
