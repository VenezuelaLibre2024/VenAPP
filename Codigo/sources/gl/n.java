package gl;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16339b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16340c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16341d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16342e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<h> f16343a = new AtomicReferenceArray<>(RecognitionOptions.ITF);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f16327b.b() == 1) {
            f16342e.incrementAndGet(this);
        }
        int i10 = f16340c.get(this) & 127;
        while (this.f16343a.get(i10) != null) {
            Thread.yield();
        }
        this.f16343a.lazySet(i10, hVar);
        f16340c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            if (hVar.f16327b.b() == 1) {
                f16342e.decrementAndGet(this);
            }
        }
    }

    private final int d() {
        return f16340c.get(this) - f16341d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16341d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f16340c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f16343a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f16339b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f16327b.b() == 1) == z10) {
                }
            }
            int i10 = f16341d.get(this);
            int i11 = f16340c.get(this);
            while (i10 != i11) {
                if (z10 && f16342e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m10 = m(i11, z10);
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f16341d.get(this);
        int i12 = f16340c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f16342e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m10 = m(i11, z10);
            if (m10 != null) {
                return m10;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f16343a.get(i11);
        if (hVar != null) {
            if ((hVar.f16327b.b() == 1) == z10 && bl.h.a(this.f16343a, i11, hVar, null)) {
                if (z10) {
                    f16342e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, gl.h] */
    private final long o(int i10, x<h> xVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f16339b;
            r12 = (h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f16327b.b() == 1 ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long a10 = l.f16335f.a() - r12.f16326a;
            long j10 = l.f16331b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, r12, null));
        xVar.f20759a = r12;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f16339b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f16339b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f16339b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f16339b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i10, x<h> xVar) {
        T i11 = i10 == 3 ? i() : l(i10);
        if (i11 == 0) {
            return o(i10, xVar);
        }
        xVar.f20759a = i11;
        return -1L;
    }
}
