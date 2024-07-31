package p494zk;

import dk.C7011h;

/* renamed from: zk.g1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13061g1 extends AbstractC13064h0 {

    /* renamed from: c */
    private long f35440c;

    /* renamed from: d */
    private boolean f35441d;

    /* renamed from: e */
    private C7011h<AbstractC13128x0<?>> f35442e;

    /* renamed from: J0 */
    public static /* synthetic */ void m43173J0(AbstractC13061g1 abstractC13061g1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC13061g1.m43176I0(z10);
    }

    /* renamed from: L0 */
    private final long m43174L0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m43175Y0(AbstractC13061g1 abstractC13061g1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC13061g1.m43179W0(z10);
    }

    /* renamed from: I0 */
    public final void m43176I0(boolean z10) {
        long m43174L0 = this.f35440c - m43174L0(z10);
        this.f35440c = m43174L0;
        if (m43174L0 <= 0 && this.f35441d) {
            shutdown();
        }
    }

    /* renamed from: R0 */
    public final void m43177R0(AbstractC13128x0<?> abstractC13128x0) {
        C7011h<AbstractC13128x0<?>> c7011h = this.f35442e;
        if (c7011h == null) {
            c7011h = new C7011h<>();
            this.f35442e = c7011h;
        }
        c7011h.addLast(abstractC13128x0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T0 */
    public long mo43178T0() {
        C7011h<AbstractC13128x0<?>> c7011h = this.f35442e;
        return (c7011h == null || c7011h.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: W0 */
    public final void m43179W0(boolean z10) {
        this.f35440c += m43174L0(z10);
        if (z10) {
            return;
        }
        this.f35441d = true;
    }

    /* renamed from: a1 */
    public final boolean m43180a1() {
        return this.f35440c >= m43174L0(true);
    }

    /* renamed from: b1 */
    public final boolean m43181b1() {
        C7011h<AbstractC13128x0<?>> c7011h = this.f35442e;
        if (c7011h != null) {
            return c7011h.isEmpty();
        }
        return true;
    }

    /* renamed from: c1 */
    public long mo43182c1() {
        return !m43183j1() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: j1 */
    public final boolean m43183j1() {
        AbstractC13128x0<?> m20357q;
        C7011h<AbstractC13128x0<?>> c7011h = this.f35442e;
        if (c7011h == null || (m20357q = c7011h.m20357q()) == null) {
            return false;
        }
        m20357q.run();
        return true;
    }

    /* renamed from: q1 */
    public boolean m43184q1() {
        return false;
    }

    public void shutdown() {
    }
}
