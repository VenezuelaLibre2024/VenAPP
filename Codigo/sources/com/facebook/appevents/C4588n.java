package com.facebook.appevents;

import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p303q4.C10267g;

/* renamed from: com.facebook.appevents.n */
/* loaded from: classes.dex */
public final class C4588n {

    /* renamed from: a */
    public static final C4588n f8633a = new C4588n();

    /* renamed from: b */
    private static final String f8634b = C4588n.class.getName();

    private C4588n() {
    }

    /* renamed from: a */
    public static final synchronized void m11046a(C4563a accessTokenAppIdPair, C4582j0 appEvents) {
        synchronized (C4588n.class) {
            if (C0033a.m107d(C4588n.class)) {
                return;
            }
            try {
                C9322n.m27781e(accessTokenAppIdPair, "accessTokenAppIdPair");
                C9322n.m27781e(appEvents, "appEvents");
                C10267g.m30745b();
                C4580i0 m10986a = C4573f.m10986a();
                m10986a.m11008a(accessTokenAppIdPair, appEvents.m11014d());
                C4573f.m10987b(m10986a);
            } catch (Throwable th2) {
                C0033a.m105b(th2, C4588n.class);
            }
        }
    }

    /* renamed from: b */
    public static final synchronized void m11047b(C4571e eventsToPersist) {
        synchronized (C4588n.class) {
            if (C0033a.m107d(C4588n.class)) {
                return;
            }
            try {
                C9322n.m27781e(eventsToPersist, "eventsToPersist");
                C10267g.m30745b();
                C4580i0 m10986a = C4573f.m10986a();
                for (C4563a c4563a : eventsToPersist.m10984f()) {
                    C4582j0 m10982c = eventsToPersist.m10982c(c4563a);
                    if (m10982c == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    m10986a.m11008a(c4563a, m10982c.m11014d());
                }
                C4573f.m10987b(m10986a);
            } catch (Throwable th2) {
                C0033a.m105b(th2, C4588n.class);
            }
        }
    }
}
