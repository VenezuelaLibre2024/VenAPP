package gl;

import androidx.concurrent.futures.C0741b;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9332x;
import p030bl.C1814h;

/* renamed from: gl.n */
/* loaded from: classes3.dex */
public final class C7602n {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f17976b = AtomicReferenceFieldUpdater.newUpdater(C7602n.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f17977c = AtomicIntegerFieldUpdater.newUpdater(C7602n.class, "producerIndex");

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f17978d = AtomicIntegerFieldUpdater.newUpdater(C7602n.class, "consumerIndex");

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f17979e = AtomicIntegerFieldUpdater.newUpdater(C7602n.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC7596h> f17980a = new AtomicReferenceArray<>(RecognitionOptions.ITF);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: b */
    private final AbstractRunnableC7596h m23096b(AbstractRunnableC7596h abstractRunnableC7596h) {
        if (m23098d() == 127) {
            return abstractRunnableC7596h;
        }
        if (abstractRunnableC7596h.f17964b.mo23094b() == 1) {
            f17979e.incrementAndGet(this);
        }
        int i10 = f17977c.get(this) & 127;
        while (this.f17980a.get(i10) != null) {
            Thread.yield();
        }
        this.f17980a.lazySet(i10, abstractRunnableC7596h);
        f17977c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    private final void m23097c(AbstractRunnableC7596h abstractRunnableC7596h) {
        if (abstractRunnableC7596h != null) {
            if (abstractRunnableC7596h.f17964b.mo23094b() == 1) {
                f17979e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: d */
    private final int m23098d() {
        return f17977c.get(this) - f17978d.get(this);
    }

    /* renamed from: i */
    private final AbstractRunnableC7596h m23099i() {
        AbstractRunnableC7596h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17978d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f17977c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f17980a.getAndSet(i11, null)) != null) {
                m23097c(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m23100j(C7592d c7592d) {
        AbstractRunnableC7596h m23099i = m23099i();
        if (m23099i == null) {
            return false;
        }
        c7592d.m21660a(m23099i);
        return true;
    }

    /* renamed from: k */
    private final AbstractRunnableC7596h m23101k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC7596h abstractRunnableC7596h;
        do {
            atomicReferenceFieldUpdater = f17976b;
            abstractRunnableC7596h = (AbstractRunnableC7596h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC7596h != null) {
                if ((abstractRunnableC7596h.f17964b.mo23094b() == 1) == z10) {
                }
            }
            int i10 = f17978d.get(this);
            int i11 = f17977c.get(this);
            while (i10 != i11) {
                if (z10 && f17979e.get(this) == 0) {
                    return null;
                }
                i11--;
                AbstractRunnableC7596h m23103m = m23103m(i11, z10);
                if (m23103m != null) {
                    return m23103m;
                }
            }
            return null;
        } while (!C0741b.m3751a(atomicReferenceFieldUpdater, this, abstractRunnableC7596h, null));
        return abstractRunnableC7596h;
    }

    /* renamed from: l */
    private final AbstractRunnableC7596h m23102l(int i10) {
        int i11 = f17978d.get(this);
        int i12 = f17977c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f17979e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC7596h m23103m = m23103m(i11, z10);
            if (m23103m != null) {
                return m23103m;
            }
            i11 = i13;
        }
        return null;
    }

    /* renamed from: m */
    private final AbstractRunnableC7596h m23103m(int i10, boolean z10) {
        int i11 = i10 & 127;
        AbstractRunnableC7596h abstractRunnableC7596h = this.f17980a.get(i11);
        if (abstractRunnableC7596h != null) {
            if ((abstractRunnableC7596h.f17964b.mo23094b() == 1) == z10 && C1814h.m9805a(this.f17980a, i11, abstractRunnableC7596h, null)) {
                if (z10) {
                    f17979e.decrementAndGet(this);
                }
                return abstractRunnableC7596h;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, gl.h] */
    /* renamed from: o */
    private final long m23104o(int i10, C9332x<AbstractRunnableC7596h> c9332x) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f17976b;
            r12 = (AbstractRunnableC7596h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f17964b.mo23094b() == 1 ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long mo23090a = C7600l.f17972f.mo23090a() - r12.f17963a;
            long j10 = C7600l.f17968b;
            if (mo23090a < j10) {
                return j10 - mo23090a;
            }
        } while (!C0741b.m3751a(atomicReferenceFieldUpdater, this, r12, null));
        c9332x.f22581a = r12;
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC7596h m23105a(AbstractRunnableC7596h abstractRunnableC7596h, boolean z10) {
        if (z10) {
            return m23096b(abstractRunnableC7596h);
        }
        AbstractRunnableC7596h abstractRunnableC7596h2 = (AbstractRunnableC7596h) f17976b.getAndSet(this, abstractRunnableC7596h);
        if (abstractRunnableC7596h2 == null) {
            return null;
        }
        return m23096b(abstractRunnableC7596h2);
    }

    /* renamed from: e */
    public final int m23106e() {
        return f17976b.get(this) != null ? m23098d() + 1 : m23098d();
    }

    /* renamed from: f */
    public final void m23107f(C7592d c7592d) {
        AbstractRunnableC7596h abstractRunnableC7596h = (AbstractRunnableC7596h) f17976b.getAndSet(this, null);
        if (abstractRunnableC7596h != null) {
            c7592d.m21660a(abstractRunnableC7596h);
        }
        do {
        } while (m23100j(c7592d));
    }

    /* renamed from: g */
    public final AbstractRunnableC7596h m23108g() {
        AbstractRunnableC7596h abstractRunnableC7596h = (AbstractRunnableC7596h) f17976b.getAndSet(this, null);
        return abstractRunnableC7596h == null ? m23099i() : abstractRunnableC7596h;
    }

    /* renamed from: h */
    public final AbstractRunnableC7596h m23109h() {
        return m23101k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final long m23110n(int i10, C9332x<AbstractRunnableC7596h> c9332x) {
        T m23099i = i10 == 3 ? m23099i() : m23102l(i10);
        if (m23099i == 0) {
            return m23104o(i10, c9332x);
        }
        c9332x.f22581a = m23099i;
        return -1L;
    }
}
