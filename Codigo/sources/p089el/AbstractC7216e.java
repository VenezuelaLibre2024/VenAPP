package p089el;

import androidx.concurrent.futures.C0741b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9322n;
import p089el.AbstractC7216e;

/* renamed from: el.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7216e<N extends AbstractC7216e<N>> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16185a = AtomicReferenceFieldUpdater.newUpdater(AbstractC7216e.class, Object.class, "_next");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f16186b = AtomicReferenceFieldUpdater.newUpdater(AbstractC7216e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC7216e(N n10) {
        this._prev = n10;
    }

    /* renamed from: c */
    private final N m21554c() {
        N m21559g = m21559g();
        while (m21559g != null && m21559g.mo21560h()) {
            m21559g = (N) f16186b.get(m21559g);
        }
        return m21559g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [el.e] */
    /* renamed from: d */
    private final N m21555d() {
        ?? m21558e;
        N m21558e2 = m21558e();
        C9322n.m27778b(m21558e2);
        while (m21558e2.mo21560h() && (m21558e = m21558e2.m21558e()) != 0) {
            m21558e2 = m21558e;
        }
        return m21558e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final Object m21556f() {
        return f16185a.get(this);
    }

    /* renamed from: b */
    public final void m21557b() {
        f16186b.lazySet(this, null);
    }

    /* renamed from: e */
    public final N m21558e() {
        Object m21556f = m21556f();
        if (m21556f == C7214d.m21547a()) {
            return null;
        }
        return (N) m21556f;
    }

    /* renamed from: g */
    public final N m21559g() {
        return (N) f16186b.get(this);
    }

    /* renamed from: h */
    public abstract boolean mo21560h();

    /* renamed from: i */
    public final boolean m21561i() {
        return m21558e() == null;
    }

    /* renamed from: j */
    public final boolean m21562j() {
        return C0741b.m3751a(f16185a, this, null, C7214d.m21547a());
    }

    /* renamed from: k */
    public final void m21563k() {
        Object obj;
        if (m21561i()) {
            return;
        }
        while (true) {
            N m21554c = m21554c();
            N m21555d = m21555d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16186b;
            do {
                obj = atomicReferenceFieldUpdater.get(m21555d);
            } while (!C0741b.m3751a(atomicReferenceFieldUpdater, m21555d, obj, ((AbstractC7216e) obj) == null ? null : m21554c));
            if (m21554c != null) {
                f16185a.set(m21554c, m21555d);
            }
            if (!m21555d.mo21560h() || m21555d.m21561i()) {
                if (m21554c == null || !m21554c.mo21560h()) {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean m21564l(N n10) {
        return C0741b.m3751a(f16185a, this, null, n10);
    }
}
