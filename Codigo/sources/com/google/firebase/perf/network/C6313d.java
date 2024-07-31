package com.google.firebase.perf.network;

import com.google.firebase.perf.util.C6338l;
import java.io.IOException;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10546u;
import p319ql.InterfaceC10528e;
import p319ql.InterfaceC10530f;
import p383ue.C11551d;
import p422we.C12178k;
import se.C10909h;

/* renamed from: com.google.firebase.perf.network.d */
/* loaded from: classes.dex */
public class C6313d implements InterfaceC10530f {

    /* renamed from: a */
    private final InterfaceC10530f f13556a;

    /* renamed from: b */
    private final C10909h f13557b;

    /* renamed from: c */
    private final C6338l f13558c;

    /* renamed from: d */
    private final long f13559d;

    public C6313d(InterfaceC10530f interfaceC10530f, C12178k c12178k, C6338l c6338l, long j10) {
        this.f13556a = interfaceC10530f;
        this.f13557b = C10909h.m33290c(c12178k);
        this.f13559d = j10;
        this.f13558c = c6338l;
    }

    @Override // p319ql.InterfaceC10530f
    /* renamed from: a */
    public void mo17473a(InterfaceC10528e interfaceC10528e, C10525c0 c10525c0) {
        FirebasePerfOkHttpClient.m17415a(c10525c0, this.f13557b, this.f13559d, this.f13558c.m17532c());
        this.f13556a.mo17473a(interfaceC10528e, c10525c0);
    }

    @Override // p319ql.InterfaceC10530f
    /* renamed from: b */
    public void mo17474b(InterfaceC10528e interfaceC10528e, IOException iOException) {
        C10521a0 mo31715o = interfaceC10528e.mo31715o();
        if (mo31715o != null) {
            C10546u m31608i = mo31715o.m31608i();
            if (m31608i != null) {
                this.f13557b.m33311x(m31608i.m31884s().toString());
            }
            if (mo31715o.m31606g() != null) {
                this.f13557b.m33300l(mo31715o.m31606g());
            }
        }
        this.f13557b.m33305r(this.f13559d);
        this.f13557b.m33309v(this.f13558c.m17532c());
        C11551d.m36206d(this.f13557b);
        this.f13556a.mo17474b(interfaceC10528e, iOException);
    }
}
