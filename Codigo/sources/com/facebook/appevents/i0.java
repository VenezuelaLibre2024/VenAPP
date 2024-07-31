package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7628b = new a(null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<com.facebook.appevents.a, List<d>> f7629a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7630b = new a(null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<com.facebook.appevents.a, List<d>> f7631a;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(HashMap<com.facebook.appevents.a, List<d>> proxyEvents) {
            kotlin.jvm.internal.n.e(proxyEvents, "proxyEvents");
            this.f7631a = proxyEvents;
        }

        private final Object readResolve() {
            return new i0(this.f7631a);
        }
    }

    public i0() {
        this.f7629a = new HashMap<>();
    }

    public i0(HashMap<com.facebook.appevents.a, List<d>> appEventMap) {
        kotlin.jvm.internal.n.e(appEventMap, "appEventMap");
        HashMap<com.facebook.appevents.a, List<d>> hashMap = new HashMap<>();
        this.f7629a = hashMap;
        hashMap.putAll(appEventMap);
    }

    private final Object writeReplace() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return new b(this.f7629a);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final void a(com.facebook.appevents.a accessTokenAppIdPair, List<d> appEvents) {
        List<d> h02;
        if (a5.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.n.e(appEvents, "appEvents");
            if (!this.f7629a.containsKey(accessTokenAppIdPair)) {
                HashMap<com.facebook.appevents.a, List<d>> hashMap = this.f7629a;
                h02 = dk.z.h0(appEvents);
                hashMap.put(accessTokenAppIdPair, h02);
            } else {
                List<d> list = this.f7629a.get(accessTokenAppIdPair);
                if (list == null) {
                    return;
                }
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final Set<Map.Entry<com.facebook.appevents.a, List<d>>> b() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<com.facebook.appevents.a, List<d>>> entrySet = this.f7629a.entrySet();
            kotlin.jvm.internal.n.d(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }
}
