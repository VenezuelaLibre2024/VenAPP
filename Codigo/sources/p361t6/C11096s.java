package p361t6;

import p363t8.C11137a;
import p363t8.C11156j0;
import p363t8.InterfaceC11143d;
import p363t8.InterfaceC11176u;

/* renamed from: t6.s */
/* loaded from: classes.dex */
final class C11096s implements InterfaceC11176u {

    /* renamed from: a */
    private final C11156j0 f28704a;

    /* renamed from: b */
    private final a f28705b;

    /* renamed from: c */
    private InterfaceC11090q3 f28706c;

    /* renamed from: d */
    private InterfaceC11176u f28707d;

    /* renamed from: e */
    private boolean f28708e = true;

    /* renamed from: f */
    private boolean f28709f;

    /* renamed from: t6.s$a */
    /* loaded from: classes.dex */
    public interface a {
        void onPlaybackParametersChanged(C11047i3 c11047i3);
    }

    public C11096s(a aVar, InterfaceC11143d interfaceC11143d) {
        this.f28705b = aVar;
        this.f28704a = new C11156j0(interfaceC11143d);
    }

    /* renamed from: f */
    private boolean m34462f(boolean z10) {
        InterfaceC11090q3 interfaceC11090q3 = this.f28706c;
        return interfaceC11090q3 == null || interfaceC11090q3.mo22836e() || (!this.f28706c.mo22835d() && (z10 || this.f28706c.mo34247i()));
    }

    /* renamed from: j */
    private void m34463j(boolean z10) {
        if (m34462f(z10)) {
            this.f28708e = true;
            if (this.f28709f) {
                this.f28704a.m34755d();
                return;
            }
            return;
        }
        InterfaceC11176u interfaceC11176u = (InterfaceC11176u) C11137a.m34603e(this.f28707d);
        long mo34472w = interfaceC11176u.mo34472w();
        if (this.f28708e) {
            if (mo34472w < this.f28704a.mo34472w()) {
                this.f28704a.m34756e();
                return;
            } else {
                this.f28708e = false;
                if (this.f28709f) {
                    this.f28704a.m34755d();
                }
            }
        }
        this.f28704a.m34754a(mo34472w);
        C11047i3 mo34466c = interfaceC11176u.mo34466c();
        if (mo34466c.equals(this.f28704a.mo34466c())) {
            return;
        }
        this.f28704a.mo34465b(mo34466c);
        this.f28705b.onPlaybackParametersChanged(mo34466c);
    }

    /* renamed from: a */
    public void m34464a(InterfaceC11090q3 interfaceC11090q3) {
        if (interfaceC11090q3 == this.f28706c) {
            this.f28707d = null;
            this.f28706c = null;
            this.f28708e = true;
        }
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: b */
    public void mo34465b(C11047i3 c11047i3) {
        InterfaceC11176u interfaceC11176u = this.f28707d;
        if (interfaceC11176u != null) {
            interfaceC11176u.mo34465b(c11047i3);
            c11047i3 = this.f28707d.mo34466c();
        }
        this.f28704a.mo34465b(c11047i3);
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: c */
    public C11047i3 mo34466c() {
        InterfaceC11176u interfaceC11176u = this.f28707d;
        return interfaceC11176u != null ? interfaceC11176u.mo34466c() : this.f28704a.mo34466c();
    }

    /* renamed from: d */
    public void m34467d(InterfaceC11090q3 interfaceC11090q3) {
        InterfaceC11176u interfaceC11176u;
        InterfaceC11176u mo34233E = interfaceC11090q3.mo34233E();
        if (mo34233E == null || mo34233E == (interfaceC11176u = this.f28707d)) {
            return;
        }
        if (interfaceC11176u != null) {
            throw C11121x.m34569i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f28707d = mo34233E;
        this.f28706c = interfaceC11090q3;
        mo34233E.mo34465b(this.f28704a.mo34466c());
    }

    /* renamed from: e */
    public void m34468e(long j10) {
        this.f28704a.m34754a(j10);
    }

    /* renamed from: g */
    public void m34469g() {
        this.f28709f = true;
        this.f28704a.m34755d();
    }

    /* renamed from: h */
    public void m34470h() {
        this.f28709f = false;
        this.f28704a.m34756e();
    }

    /* renamed from: i */
    public long m34471i(boolean z10) {
        m34463j(z10);
        return mo34472w();
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: w */
    public long mo34472w() {
        return this.f28708e ? this.f28704a.mo34472w() : ((InterfaceC11176u) C11137a.m34603e(this.f28707d)).mo34472w();
    }
}
