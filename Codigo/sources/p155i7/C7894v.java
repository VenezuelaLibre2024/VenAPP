package p155i7;

import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.v */
/* loaded from: classes.dex */
public final class C7894v implements InterfaceC7865b0 {

    /* renamed from: a */
    private C11108u1 f19180a;

    /* renamed from: b */
    private C11164n0 f19181b;

    /* renamed from: c */
    private InterfaceC12609b0 f19182c;

    public C7894v(String str) {
        this.f19180a = new C11108u1.b().m34552g0(str).m34526G();
    }

    /* renamed from: c */
    private void m24338c() {
        C11137a.m34607i(this.f19181b);
        C11172r0.m34928j(this.f19182c);
    }

    @Override // p155i7.InterfaceC7865b0
    /* renamed from: a */
    public void mo24181a(C11164n0 c11164n0, InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        this.f19181b = c11164n0;
        dVar.m24263a();
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 5);
        this.f19182c = mo308d;
        mo308d.mo332c(this.f19180a);
    }

    @Override // p155i7.InterfaceC7865b0
    /* renamed from: b */
    public void mo24182b(C11146e0 c11146e0) {
        m24338c();
        long m34827d = this.f19181b.m34827d();
        long m34828e = this.f19181b.m34828e();
        if (m34827d == -9223372036854775807L || m34828e == -9223372036854775807L) {
            return;
        }
        C11108u1 c11108u1 = this.f19180a;
        if (m34828e != c11108u1.f28767A) {
            C11108u1 m34526G = c11108u1.m34488c().m34556k0(m34828e).m34526G();
            this.f19180a = m34526G;
            this.f19182c.mo332c(m34526G);
        }
        int m34679a = c11146e0.m34679a();
        this.f19182c.m41511a(c11146e0, m34679a);
        this.f19182c.mo331b(m34827d, 1, m34679a, 0, null);
    }
}
