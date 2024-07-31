package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11905a;

    /* renamed from: b, reason: collision with root package name */
    private String f11906b;

    /* renamed from: c, reason: collision with root package name */
    private String f11907c;

    /* renamed from: d, reason: collision with root package name */
    private int f11908d;

    /* renamed from: e, reason: collision with root package name */
    private int f11909e = 0;

    public n(Context context) {
        this.f11905a = context;
    }

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
            return this.f11905a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f11905a.getPackageName());
        if (f10 != null) {
            this.f11906b = Integer.toString(f10.versionCode);
            this.f11907c = f10.versionName;
        }
    }

    public synchronized String a() {
        if (this.f11906b == null) {
            h();
        }
        return this.f11906b;
    }

    public synchronized String b() {
        if (this.f11907c == null) {
            h();
        }
        return this.f11907c;
    }

    public synchronized int d() {
        PackageInfo f10;
        if (this.f11908d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f11908d = f10.versionCode;
        }
        return this.f11908d;
    }

    public synchronized int e() {
        int i10 = this.f11909e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f11905a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!la.p.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11909e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f11909e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (la.p.i()) {
            this.f11909e = 2;
            i11 = 2;
        } else {
            this.f11909e = 1;
        }
        return i11;
    }

    public boolean g() {
        return e() != 0;
    }
}
