package p010a8;

import p099f7.C7310f;
import p119g7.C7471g;
import p155i7.C7864b;
import p155i7.C7870e;
import p155i7.C7876h;
import p155i7.C7877h0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11164n0;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;

/* renamed from: a8.b */
/* loaded from: classes.dex */
public final class C0044b implements InterfaceC0052j {

    /* renamed from: d */
    private static final C12635y f118d = new C12635y();

    /* renamed from: a */
    final InterfaceC12621k f119a;

    /* renamed from: b */
    private final C11108u1 f120b;

    /* renamed from: c */
    private final C11164n0 f121c;

    public C0044b(InterfaceC12621k interfaceC12621k, C11108u1 c11108u1, C11164n0 c11164n0) {
        this.f119a = interfaceC12621k;
        this.f120b = c11108u1;
        this.f121c = c11164n0;
    }

    @Override // p010a8.InterfaceC0052j
    /* renamed from: a */
    public boolean mo163a(InterfaceC12622l interfaceC12622l) {
        return this.f119a.mo124f(interfaceC12622l, f118d) == 0;
    }

    @Override // p010a8.InterfaceC0052j
    /* renamed from: b */
    public void mo164b(InterfaceC12623m interfaceC12623m) {
        this.f119a.mo122b(interfaceC12623m);
    }

    @Override // p010a8.InterfaceC0052j
    /* renamed from: c */
    public void mo165c() {
        this.f119a.mo121a(0L, 0L);
    }

    @Override // p010a8.InterfaceC0052j
    /* renamed from: d */
    public boolean mo166d() {
        InterfaceC12621k interfaceC12621k = this.f119a;
        return (interfaceC12621k instanceof C7877h0) || (interfaceC12621k instanceof C7471g);
    }

    @Override // p010a8.InterfaceC0052j
    /* renamed from: e */
    public boolean mo167e() {
        InterfaceC12621k interfaceC12621k = this.f119a;
        return (interfaceC12621k instanceof C7876h) || (interfaceC12621k instanceof C7864b) || (interfaceC12621k instanceof C7870e) || (interfaceC12621k instanceof C7310f);
    }

    @Override // p010a8.InterfaceC0052j
    /* renamed from: f */
    public InterfaceC0052j mo168f() {
        InterfaceC12621k c7310f;
        C11137a.m34605g(!mo166d());
        InterfaceC12621k interfaceC12621k = this.f119a;
        if (interfaceC12621k instanceof C0062t) {
            c7310f = new C0062t(this.f120b.f28788c, this.f121c);
        } else if (interfaceC12621k instanceof C7876h) {
            c7310f = new C7876h();
        } else if (interfaceC12621k instanceof C7864b) {
            c7310f = new C7864b();
        } else if (interfaceC12621k instanceof C7870e) {
            c7310f = new C7870e();
        } else {
            if (!(interfaceC12621k instanceof C7310f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f119a.getClass().getSimpleName());
            }
            c7310f = new C7310f();
        }
        return new C0044b(c7310f, this.f120b, this.f121c);
    }
}
