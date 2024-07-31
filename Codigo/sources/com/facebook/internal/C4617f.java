package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import dk.C7021m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.f */
/* loaded from: classes.dex */
public final class C4617f {

    /* renamed from: a */
    public static final C4617f f8716a = new C4617f();

    /* renamed from: b */
    private static final String[] f8717b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private C4617f() {
    }

    /* renamed from: a */
    public static final String m11195a() {
        HashSet m20472Y;
        if (C0033a.m107d(C4617f.class)) {
            return null;
        }
        try {
            Context m23860l = C7799e0.m23860l();
            List<ResolveInfo> queryIntentServices = m23860l.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            C9322n.m27780d(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            m20472Y = C7021m.m20472Y(f8717b);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && m20472Y.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4617f.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final String m11196b() {
        if (C0033a.m107d(C4617f.class)) {
            return null;
        }
        try {
            return C9322n.m27787k("fbconnect://cct.", C7799e0.m23860l().getPackageName());
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4617f.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m11197c(String developerDefinedRedirectURI) {
        if (C0033a.m107d(C4617f.class)) {
            return null;
        }
        try {
            C9322n.m27781e(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            C4636o0 c4636o0 = C4636o0.f8773a;
            return C4636o0.m11353d(C7799e0.m23860l(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : C4636o0.m11353d(C7799e0.m23860l(), m11196b()) ? m11196b() : "";
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4617f.class);
            return null;
        }
    }
}
