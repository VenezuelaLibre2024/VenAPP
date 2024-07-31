package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import la.C9471p;
import p485zb.C12867g;

/* renamed from: com.google.firebase.iid.n */
/* loaded from: classes.dex */
public class C6182n {

    /* renamed from: a */
    private final Context f13120a;

    /* renamed from: b */
    private String f13121b;

    /* renamed from: c */
    private String f13122c;

    /* renamed from: d */
    private int f13123d;

    /* renamed from: e */
    private int f13124e = 0;

    public C6182n(Context context) {
        this.f13120a = context;
    }

    /* renamed from: c */
    public static String m16763c(C12867g c12867g) {
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
    private PackageInfo m16764f(String str) {
        try {
            return this.f13120a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m16765h() {
        PackageInfo m16764f = m16764f(this.f13120a.getPackageName());
        if (m16764f != null) {
            this.f13121b = Integer.toString(m16764f.versionCode);
            this.f13122c = m16764f.versionName;
        }
    }

    /* renamed from: a */
    public synchronized String m16766a() {
        if (this.f13121b == null) {
            m16765h();
        }
        return this.f13121b;
    }

    /* renamed from: b */
    public synchronized String m16767b() {
        if (this.f13122c == null) {
            m16765h();
        }
        return this.f13122c;
    }

    /* renamed from: d */
    public synchronized int m16768d() {
        PackageInfo m16764f;
        if (this.f13123d == 0 && (m16764f = m16764f("com.google.android.gms")) != null) {
            this.f13123d = m16764f.versionCode;
        }
        return this.f13123d;
    }

    /* renamed from: e */
    public synchronized int m16769e() {
        int i10 = this.f13124e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f13120a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!C9471p.m28172i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f13124e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f13124e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (C9471p.m28172i()) {
            this.f13124e = 2;
            i11 = 2;
        } else {
            this.f13124e = 1;
        }
        return i11;
    }

    /* renamed from: g */
    public boolean m16770g() {
        return m16769e() != 0;
    }
}
