package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7741a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f7742b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private f() {
    }

    public static final String a() {
        HashSet Y;
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            Context l10 = i4.e0.l();
            List<ResolveInfo> queryIntentServices = l10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            kotlin.jvm.internal.n.d(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            Y = dk.m.Y(f7742b);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && Y.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    public static final String b() {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            return kotlin.jvm.internal.n.k("fbconnect://cct.", i4.e0.l().getPackageName());
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            o0 o0Var = o0.f7793a;
            return o0.d(i4.e0.l(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : o0.d(i4.e0.l(), b()) ? b() : "";
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }
}
