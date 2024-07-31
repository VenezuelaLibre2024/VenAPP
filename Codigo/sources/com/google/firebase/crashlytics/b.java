package com.google.firebase.crashlytics;

import sc.g;

/* loaded from: classes.dex */
public final class b {
    public static void a(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            a.d().f11860a.p(th2);
        }
    }

    public static void b(String str) {
        a.d().f11860a.w("com.crashlytics.flutter.build-id.0", str);
    }
}
