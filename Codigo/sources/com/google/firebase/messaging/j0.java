package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12124a;

    /* renamed from: b, reason: collision with root package name */
    private String f12125b;

    /* renamed from: c, reason: collision with root package name */
    private String f12126c;

    /* renamed from: d, reason: collision with root package name */
    private int f12127d;

    /* renamed from: e, reason: collision with root package name */
    private int f12128e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Context context) {
        this.f12124a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(zb.g gVar) {
        String f10 = gVar.r().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = gVar.r().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f12124a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f12124a.getPackageName());
        if (f10 != null) {
            this.f12125b = Integer.toString(f10.versionCode);
            this.f12126c = f10.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f12125b == null) {
            h();
        }
        return this.f12125b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f12126c == null) {
            h();
        }
        return this.f12126c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        if (this.f12127d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f12127d = f10.versionCode;
        }
        return this.f12127d;
    }

    synchronized int e() {
        int i10 = this.f12128e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f12124a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!la.p.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f12128e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f12128e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (la.p.i()) {
            this.f12128e = 2;
        } else {
            this.f12128e = 1;
        }
        return this.f12128e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
