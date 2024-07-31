package p363t8;

import p361t6.C11047i3;

/* renamed from: t8.j0 */
/* loaded from: classes.dex */
public final class C11156j0 implements InterfaceC11176u {

    /* renamed from: a */
    private final InterfaceC11143d f28987a;

    /* renamed from: b */
    private boolean f28988b;

    /* renamed from: c */
    private long f28989c;

    /* renamed from: d */
    private long f28990d;

    /* renamed from: e */
    private C11047i3 f28991e = C11047i3.f28424d;

    public C11156j0(InterfaceC11143d interfaceC11143d) {
        this.f28987a = interfaceC11143d;
    }

    /* renamed from: a */
    public void m34754a(long j10) {
        this.f28989c = j10;
        if (this.f28988b) {
            this.f28990d = this.f28987a.mo34622b();
        }
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: b */
    public void mo34465b(C11047i3 c11047i3) {
        if (this.f28988b) {
            m34754a(mo34472w());
        }
        this.f28991e = c11047i3;
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: c */
    public C11047i3 mo34466c() {
        return this.f28991e;
    }

    /* renamed from: d */
    public void m34755d() {
        if (this.f28988b) {
            return;
        }
        this.f28990d = this.f28987a.mo34622b();
        this.f28988b = true;
    }

    /* renamed from: e */
    public void m34756e() {
        if (this.f28988b) {
            m34754a(mo34472w());
            this.f28988b = false;
        }
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: w */
    public long mo34472w() {
        long j10 = this.f28989c;
        if (!this.f28988b) {
            return j10;
        }
        long mo34622b = this.f28987a.mo34622b() - this.f28990d;
        C11047i3 c11047i3 = this.f28991e;
        return j10 + (c11047i3.f28428a == 1.0f ? C11172r0.m34861C0(mo34622b) : c11047i3.m34161c(mo34622b));
    }
}
