package com.facebook.appevents;

import dk.C7042z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: com.facebook.appevents.i0 */
/* loaded from: classes.dex */
public final class C4580i0 implements Serializable {

    /* renamed from: b */
    public static final a f8603b = new a(null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a */
    private final HashMap<C4563a, List<C4569d>> f8604a;

    /* renamed from: com.facebook.appevents.i0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: com.facebook.appevents.i0$b */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: b */
        public static final a f8605b = new a(null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a */
        private final HashMap<C4563a, List<C4569d>> f8606a;

        /* renamed from: com.facebook.appevents.i0$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        public b(HashMap<C4563a, List<C4569d>> proxyEvents) {
            C9322n.m27781e(proxyEvents, "proxyEvents");
            this.f8606a = proxyEvents;
        }

        private final Object readResolve() {
            return new C4580i0(this.f8606a);
        }
    }

    public C4580i0() {
        this.f8604a = new HashMap<>();
    }

    public C4580i0(HashMap<C4563a, List<C4569d>> appEventMap) {
        C9322n.m27781e(appEventMap, "appEventMap");
        HashMap<C4563a, List<C4569d>> hashMap = new HashMap<>();
        this.f8604a = hashMap;
        hashMap.putAll(appEventMap);
    }

    private final Object writeReplace() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return new b(this.f8604a);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: a */
    public final void m11008a(C4563a accessTokenAppIdPair, List<C4569d> appEvents) {
        List<C4569d> m20632h0;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(accessTokenAppIdPair, "accessTokenAppIdPair");
            C9322n.m27781e(appEvents, "appEvents");
            if (!this.f8604a.containsKey(accessTokenAppIdPair)) {
                HashMap<C4563a, List<C4569d>> hashMap = this.f8604a;
                m20632h0 = C7042z.m20632h0(appEvents);
                hashMap.put(accessTokenAppIdPair, m20632h0);
            } else {
                List<C4569d> list = this.f8604a.get(accessTokenAppIdPair);
                if (list == null) {
                    return;
                }
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: b */
    public final Set<Map.Entry<C4563a, List<C4569d>>> m11009b() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<C4563a, List<C4569d>>> entrySet = this.f8604a.entrySet();
            C9322n.m27780d(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
