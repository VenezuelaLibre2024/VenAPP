package com.google.firebase.crashlytics;

import sc.C10889g;

/* renamed from: com.google.firebase.crashlytics.b */
/* loaded from: classes.dex */
public final class C6166b {
    /* renamed from: a */
    public static void m16706a(Throwable th2) {
        if (th2 == null) {
            C10889g.m33216f().m33225k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            C6165a.m16693d().f13075a.m37882p(th2);
        }
    }

    /* renamed from: b */
    public static void m16707b(String str) {
        C6165a.m16693d().f13075a.m37889w("com.crashlytics.flutter.build-id.0", str);
    }
}
