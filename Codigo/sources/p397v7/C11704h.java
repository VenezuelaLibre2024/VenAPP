package p397v7;

/* renamed from: v7.h */
/* loaded from: classes.dex */
public class C11704h implements InterfaceC11736w0 {

    /* renamed from: a */
    protected final InterfaceC11736w0[] f30710a;

    public C11704h(InterfaceC11736w0[] interfaceC11736w0Arr) {
        this.f30710a = interfaceC11736w0Arr;
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: b */
    public final long mo245b() {
        long j10 = Long.MAX_VALUE;
        for (InterfaceC11736w0 interfaceC11736w0 : this.f30710a) {
            long mo245b = interfaceC11736w0.mo245b();
            if (mo245b != Long.MIN_VALUE) {
                j10 = Math.min(j10, mo245b);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long mo245b = mo245b();
            if (mo245b == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (InterfaceC11736w0 interfaceC11736w0 : this.f30710a) {
                long mo245b2 = interfaceC11736w0.mo245b();
                boolean z12 = mo245b2 != Long.MIN_VALUE && mo245b2 <= j10;
                if (mo245b2 == mo245b || z12) {
                    z10 |= interfaceC11736w0.mo248e(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: f */
    public final long mo249f() {
        long j10 = Long.MAX_VALUE;
        for (InterfaceC11736w0 interfaceC11736w0 : this.f30710a) {
            long mo249f = interfaceC11736w0.mo249f();
            if (mo249f != Long.MIN_VALUE) {
                j10 = Math.min(j10, mo249f);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: g */
    public final void mo250g(long j10) {
        for (InterfaceC11736w0 interfaceC11736w0 : this.f30710a) {
            interfaceC11736w0.mo250g(j10);
        }
    }

    @Override // p397v7.InterfaceC11736w0
    public boolean isLoading() {
        for (InterfaceC11736w0 interfaceC11736w0 : this.f30710a) {
            if (interfaceC11736w0.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
