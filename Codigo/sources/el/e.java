package el;

import el.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class e<N extends e<N>> {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14762a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14763b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(N n10) {
        this._prev = n10;
    }

    private final N c() {
        N g10 = g();
        while (g10 != null && g10.h()) {
            g10 = (N) f14763b.get(g10);
        }
        return g10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [el.e] */
    private final N d() {
        ?? e10;
        N e11 = e();
        kotlin.jvm.internal.n.b(e11);
        while (e11.h() && (e10 = e11.e()) != 0) {
            e11 = e10;
        }
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f14762a.get(this);
    }

    public final void b() {
        f14763b.lazySet(this, null);
    }

    public final N e() {
        Object f10 = f();
        if (f10 == d.a()) {
            return null;
        }
        return (N) f10;
    }

    public final N g() {
        return (N) f14763b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f14762a, this, null, d.a());
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            N c10 = c();
            N d10 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14763b;
            do {
                obj = atomicReferenceFieldUpdater.get(d10);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, d10, obj, ((e) obj) == null ? null : c10));
            if (c10 != null) {
                f14762a.set(c10, d10);
            }
            if (!d10.h() || d10.i()) {
                if (c10 == null || !c10.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n10) {
        return androidx.concurrent.futures.b.a(f14762a, this, null, n10);
    }
}
