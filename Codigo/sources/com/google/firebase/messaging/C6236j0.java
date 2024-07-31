package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import la.C9471p;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.j0 */
/* loaded from: classes.dex */
public class C6236j0 {

    /* renamed from: a */
    private final Context f13339a;

    /* renamed from: b */
    private String f13340b;

    /* renamed from: c */
    private String f13341c;

    /* renamed from: d */
    private int f13342d;

    /* renamed from: e */
    private int f13343e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6236j0(Context context) {
        this.f13339a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m17069c(C12867g c12867g) {
        String m42647f = c12867g.m42632r().m42647f();
        if (m42647f != null) {
            return m42647f;
        }
        String m42644c = c12867g.m42632r().m42644c();
        if (!m42644c.startsWith("1:")) {
            return m42644c;
        }
        String[] split = m42644c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m17070f(String str) {
        try {
            return this.f13339a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m17071h() {
        PackageInfo m17070f = m17070f(this.f13339a.getPackageName());
        if (m17070f != null) {
            this.f13340b = Integer.toString(m17070f.versionCode);
            this.f13341c = m17070f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m17072a() {
        if (this.f13340b == null) {
            m17071h();
        }
        return this.f13340b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m17073b() {
        if (this.f13341c == null) {
            m17071h();
        }
        return this.f13341c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m17074d() {
        PackageInfo m17070f;
        if (this.f13342d == 0 && (m17070f = m17070f("com.google.android.gms")) != null) {
            this.f13342d = m17070f.versionCode;
        }
        return this.f13342d;
    }

    /* renamed from: e */
    synchronized int m17075e() {
        int i10 = this.f13343e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f13339a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C9471p.m28172i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f13343e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f13343e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C9471p.m28172i()) {
            this.f13343e = 2;
        } else {
            this.f13343e = 1;
        }
        return this.f13343e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m17076g() {
        return m17075e() != 0;
    }
}
