package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: e, reason: collision with root package name */
    private static w0 f12197e;

    /* renamed from: a, reason: collision with root package name */
    private String f12198a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f12199b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f12200c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f12201d = new ArrayDeque();

    private w0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                startService = h1.h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized w0 b() {
        w0 w0Var;
        synchronized (w0.class) {
            if (f12197e == null) {
                f12197e = new w0();
            }
            w0Var = f12197e;
        }
        return w0Var;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        String str3 = this.f12198a;
        if (str3 != null) {
            return str3;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    str2 = context.getPackageName() + serviceInfo.name;
                } else {
                    str2 = serviceInfo.name;
                }
                this.f12198a = str2;
                return this.f12198a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Intent c() {
        return this.f12201d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.f12200c == null) {
            this.f12200c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f12199b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f12200c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.f12199b == null) {
            this.f12199b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f12199b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f12199b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f12201d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
