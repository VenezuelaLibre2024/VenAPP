package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import ql.a0;
import ql.c0;
import ql.e;
import ql.f;
import ql.u;
import se.h;
import we.k;

/* loaded from: classes.dex */
public class d implements f {

    /* renamed from: a */
    private final f f12324a;

    /* renamed from: b */
    private final h f12325b;

    /* renamed from: c */
    private final l f12326c;

    /* renamed from: d */
    private final long f12327d;

    public d(f fVar, k kVar, l lVar, long j10) {
        this.f12324a = fVar;
        this.f12325b = h.c(kVar);
        this.f12327d = j10;
        this.f12326c = lVar;
    }

    @Override // ql.f
    public void a(e eVar, c0 c0Var) {
        FirebasePerfOkHttpClient.a(c0Var, this.f12325b, this.f12327d, this.f12326c.c());
        this.f12324a.a(eVar, c0Var);
    }

    @Override // ql.f
    public void b(e eVar, IOException iOException) {
        a0 o10 = eVar.o();
        if (o10 != null) {
            u i10 = o10.i();
            if (i10 != null) {
                this.f12325b.x(i10.s().toString());
            }
            if (o10.g() != null) {
                this.f12325b.l(o10.g());
            }
        }
        this.f12325b.r(this.f12327d);
        this.f12325b.v(this.f12326c.c());
        ue.d.d(this.f12325b);
        this.f12324a.b(eVar, iOException);
    }
}
