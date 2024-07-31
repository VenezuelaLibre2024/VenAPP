package com.facebook.appevents;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<a, j0> f7614a = new HashMap<>();

    private final synchronized j0 e(a aVar) {
        Context l10;
        com.facebook.internal.a e10;
        j0 j0Var = this.f7614a.get(aVar);
        if (j0Var == null && (e10 = com.facebook.internal.a.f7697f.e((l10 = i4.e0.l()))) != null) {
            j0Var = new j0(e10, o.f7660b.b(l10));
        }
        if (j0Var == null) {
            return null;
        }
        this.f7614a.put(aVar, j0Var);
        return j0Var;
    }

    public final synchronized void a(a accessTokenAppIdPair, d appEvent) {
        kotlin.jvm.internal.n.e(accessTokenAppIdPair, "accessTokenAppIdPair");
        kotlin.jvm.internal.n.e(appEvent, "appEvent");
        j0 e10 = e(accessTokenAppIdPair);
        if (e10 != null) {
            e10.a(appEvent);
        }
    }

    public final synchronized void b(i0 i0Var) {
        if (i0Var == null) {
            return;
        }
        for (Map.Entry<a, List<d>> entry : i0Var.b()) {
            j0 e10 = e(entry.getKey());
            if (e10 != null) {
                Iterator<d> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    e10.a(it.next());
                }
            }
        }
    }

    public final synchronized j0 c(a accessTokenAppIdPair) {
        kotlin.jvm.internal.n.e(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.f7614a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int i10;
        Iterator<j0> it = this.f7614a.values().iterator();
        i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().c();
        }
        return i10;
    }

    public final synchronized Set<a> f() {
        Set<a> keySet;
        keySet = this.f7614a.keySet();
        kotlin.jvm.internal.n.d(keySet, "stateMap.keys");
        return keySet;
    }
}
