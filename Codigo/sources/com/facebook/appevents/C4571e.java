package com.facebook.appevents;

import android.content.Context;
import com.facebook.internal.C4607a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.appevents.e */
/* loaded from: classes.dex */
public final class C4571e {

    /* renamed from: a */
    private final HashMap<C4563a, C4582j0> f8589a = new HashMap<>();

    /* renamed from: e */
    private final synchronized C4582j0 m10979e(C4563a c4563a) {
        Context m23860l;
        C4607a m11114e;
        C4582j0 c4582j0 = this.f8589a.get(c4563a);
        if (c4582j0 == null && (m11114e = C4607a.f8672f.m11114e((m23860l = C7799e0.m23860l()))) != null) {
            c4582j0 = new C4582j0(m11114e, C4589o.f8635b.m11051b(m23860l));
        }
        if (c4582j0 == null) {
            return null;
        }
        this.f8589a.put(c4563a, c4582j0);
        return c4582j0;
    }

    /* renamed from: a */
    public final synchronized void m10980a(C4563a accessTokenAppIdPair, C4569d appEvent) {
        C9322n.m27781e(accessTokenAppIdPair, "accessTokenAppIdPair");
        C9322n.m27781e(appEvent, "appEvent");
        C4582j0 m10979e = m10979e(accessTokenAppIdPair);
        if (m10979e != null) {
            m10979e.m11011a(appEvent);
        }
    }

    /* renamed from: b */
    public final synchronized void m10981b(C4580i0 c4580i0) {
        if (c4580i0 == null) {
            return;
        }
        for (Map.Entry<C4563a, List<C4569d>> entry : c4580i0.m11009b()) {
            C4582j0 m10979e = m10979e(entry.getKey());
            if (m10979e != null) {
                Iterator<C4569d> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    m10979e.m11011a(it.next());
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized C4582j0 m10982c(C4563a accessTokenAppIdPair) {
        C9322n.m27781e(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.f8589a.get(accessTokenAppIdPair);
    }

    /* renamed from: d */
    public final synchronized int m10983d() {
        int i10;
        Iterator<C4582j0> it = this.f8589a.values().iterator();
        i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().m11013c();
        }
        return i10;
    }

    /* renamed from: f */
    public final synchronized Set<C4563a> m10984f() {
        Set<C4563a> keySet;
        keySet = this.f8589a.keySet();
        C9322n.m27780d(keySet, "stateMap.keys");
        return keySet;
    }
}
