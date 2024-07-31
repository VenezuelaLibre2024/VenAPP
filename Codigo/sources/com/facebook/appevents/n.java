package com.facebook.appevents;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f7658a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7659b = n.class.getName();

    private n() {
    }

    public static final synchronized void a(a accessTokenAppIdPair, j0 appEvents) {
        synchronized (n.class) {
            if (a5.a.d(n.class)) {
                return;
            }
            try {
                kotlin.jvm.internal.n.e(accessTokenAppIdPair, "accessTokenAppIdPair");
                kotlin.jvm.internal.n.e(appEvents, "appEvents");
                q4.g.b();
                i0 a10 = f.a();
                a10.a(accessTokenAppIdPair, appEvents.d());
                f.b(a10);
            } catch (Throwable th2) {
                a5.a.b(th2, n.class);
            }
        }
    }

    public static final synchronized void b(e eventsToPersist) {
        synchronized (n.class) {
            if (a5.a.d(n.class)) {
                return;
            }
            try {
                kotlin.jvm.internal.n.e(eventsToPersist, "eventsToPersist");
                q4.g.b();
                i0 a10 = f.a();
                for (a aVar : eventsToPersist.f()) {
                    j0 c10 = eventsToPersist.c(aVar);
                    if (c10 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    a10.a(aVar, c10.d());
                }
                f.b(a10);
            } catch (Throwable th2) {
                a5.a.b(th2, n.class);
            }
        }
    }
}
