package com.google.firebase.perf.metrics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p444xe.C12478k;
import p444xe.C12480m;
import ve.C11882a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.perf.metrics.b */
/* loaded from: classes.dex */
public class C6309b {

    /* renamed from: a */
    private final Trace f13546a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6309b(Trace trace) {
        this.f13546a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C12480m m17406a() {
        C12480m.b m40743S = C12480m.m40702H0().m40744T(this.f13546a.m17389f()).m40742R(this.f13546a.m17391h().m17534e()).m40743S(this.f13546a.m17391h().m17533d(this.f13546a.m17388e()));
        for (C6308a c6308a : this.f13546a.m17387d().values()) {
            m40743S.m40740O(c6308a.m17401b(), c6308a.m17400a());
        }
        List<Trace> m17392i = this.f13546a.m17392i();
        if (!m17392i.isEmpty()) {
            Iterator<Trace> it = m17392i.iterator();
            while (it.hasNext()) {
                m40743S.m40737L(new C6309b(it.next()).m17406a());
            }
        }
        m40743S.m40739N(this.f13546a.getAttributes());
        C12478k[] m38000b = C11882a.m38000b(this.f13546a.m17390g());
        if (m38000b != null) {
            m40743S.m40734I(Arrays.asList(m38000b));
        }
        return m40743S.build();
    }
}
