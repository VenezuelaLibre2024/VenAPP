package com.google.firebase.perf.metrics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xe.k;
import xe.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Trace f12314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Trace trace) {
        this.f12314a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m a() {
        m.b S = m.H0().T(this.f12314a.f()).R(this.f12314a.h().e()).S(this.f12314a.h().d(this.f12314a.e()));
        for (a aVar : this.f12314a.d().values()) {
            S.O(aVar.b(), aVar.a());
        }
        List<Trace> i10 = this.f12314a.i();
        if (!i10.isEmpty()) {
            Iterator<Trace> it = i10.iterator();
            while (it.hasNext()) {
                S.L(new b(it.next()).a());
            }
        }
        S.N(this.f12314a.getAttributes());
        k[] b10 = ve.a.b(this.f12314a.g());
        if (b10 != null) {
            S.I(Arrays.asList(b10));
        }
        return S.build();
    }
}
