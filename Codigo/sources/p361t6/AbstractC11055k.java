package p361t6;

import com.google.android.gms.common.api.C5101a;
import com.google.common.collect.AbstractC5907w;
import java.util.List;
import p361t6.AbstractC11018d4;

/* renamed from: t6.k */
/* loaded from: classes.dex */
public abstract class AbstractC11055k implements InterfaceC11053j3 {

    /* renamed from: a */
    protected final AbstractC11018d4.d f28499a = new AbstractC11018d4.d();

    /* renamed from: R */
    private int m34218R() {
        int mo33914J = mo33914J();
        if (mo33914J == 1) {
            return 0;
        }
        return mo33914J;
    }

    /* renamed from: T */
    private void m34219T(long j10, int i10) {
        mo33917S(mo33911G(), j10, i10, false);
    }

    /* renamed from: U */
    private void m34220U(int i10, int i11) {
        mo33917S(i10, -9223372036854775807L, i11, false);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: A */
    public final void mo34194A(float f10) {
        mo33924b(mo33925c().m34162e(f10));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: E */
    public final boolean mo34195E() {
        AbstractC11018d4 mo33941r = mo33941r();
        return !mo33941r.m34005v() && mo33941r.m34004s(mo33911G(), this.f28499a).f28262s;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: M */
    public final boolean mo34196M() {
        AbstractC11018d4 mo33941r = mo33941r();
        return !mo33941r.m34005v() && mo33941r.m34004s(mo33911G(), this.f28499a).m34036i();
    }

    /* renamed from: N */
    public final void m34221N(List<C11010c2> list) {
        mo33908C(C5101a.e.API_PRIORITY_OTHER, list);
    }

    /* renamed from: O */
    public final long m34222O() {
        AbstractC11018d4 mo33941r = mo33941r();
        if (mo33941r.m34005v()) {
            return -9223372036854775807L;
        }
        return mo33941r.m34004s(mo33911G(), this.f28499a).m34034g();
    }

    /* renamed from: P */
    public final int m34223P() {
        AbstractC11018d4 mo33941r = mo33941r();
        if (mo33941r.m34005v()) {
            return -1;
        }
        return mo33941r.mo33627j(mo33911G(), m34218R(), mo33915K());
    }

    /* renamed from: Q */
    public final int m34224Q() {
        AbstractC11018d4 mo33941r = mo33941r();
        if (mo33941r.m34005v()) {
            return -1;
        }
        return mo33941r.mo33629q(mo33911G(), m34218R(), mo33915K());
    }

    /* renamed from: S */
    public abstract void mo33917S(int i10, long j10, int i11, boolean z10);

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: d */
    public final void mo34197d() {
        mo33935k(true);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: i */
    public final void mo34198i() {
        m34220U(mo33911G(), 4);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: n */
    public final boolean mo34199n() {
        return m34223P() != -1;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: p */
    public final boolean mo34200p() {
        AbstractC11018d4 mo33941r = mo33941r();
        return !mo33941r.m34005v() && mo33941r.m34004s(mo33911G(), this.f28499a).f28263t;
    }

    @Override // p361t6.InterfaceC11053j3
    public final void pause() {
        mo33935k(false);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: v */
    public final void mo34201v(C11010c2 c11010c2) {
        m34221N(AbstractC5907w.m15082w(c11010c2));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: x */
    public final boolean mo34202x() {
        return m34224Q() != -1;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: z */
    public final void mo34203z(long j10) {
        m34219T(j10, 5);
    }
}
