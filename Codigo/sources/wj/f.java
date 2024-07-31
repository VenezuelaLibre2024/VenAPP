package wj;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class f extends AtomicInteger implements im.c {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: a, reason: collision with root package name */
    im.c f30175a;

    /* renamed from: b, reason: collision with root package name */
    long f30176b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<im.c> f30177c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f30178d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    final AtomicLong f30179e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f30180f;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f30181r;

    final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        e();
    }

    @Override // im.c
    public void cancel() {
        if (this.f30180f) {
            return;
        }
        this.f30180f = true;
        b();
    }

    final void e() {
        int i10 = 1;
        long j10 = 0;
        im.c cVar = null;
        do {
            im.c cVar2 = this.f30177c.get();
            if (cVar2 != null) {
                cVar2 = this.f30177c.getAndSet(null);
            }
            long j11 = this.f30178d.get();
            if (j11 != 0) {
                j11 = this.f30178d.getAndSet(0L);
            }
            long j12 = this.f30179e.get();
            if (j12 != 0) {
                j12 = this.f30179e.getAndSet(0L);
            }
            im.c cVar3 = this.f30175a;
            if (this.f30180f) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f30175a = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long j13 = this.f30176b;
                if (j13 != Long.MAX_VALUE) {
                    j13 = xj.d.c(j13, j11);
                    if (j13 != Long.MAX_VALUE) {
                        j13 -= j12;
                        if (j13 < 0) {
                            g.m(j13);
                            j13 = 0;
                        }
                    }
                    this.f30176b = j13;
                }
                if (cVar2 != null) {
                    if (cVar3 != null) {
                        cVar3.cancel();
                    }
                    this.f30175a = cVar2;
                    if (j13 != 0) {
                        j10 = xj.d.c(j10, j13);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && j11 != 0) {
                    j10 = xj.d.c(j10, j11);
                    cVar = cVar3;
                }
            }
            i10 = addAndGet(-i10);
        } while (i10 != 0);
        if (j10 != 0) {
            cVar.i(j10);
        }
    }

    public final boolean g() {
        return this.f30181r;
    }

    public final void h(long j10) {
        if (this.f30181r) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            xj.d.a(this.f30179e, j10);
            b();
            return;
        }
        long j11 = this.f30176b;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                g.m(j12);
                j12 = 0;
            }
            this.f30176b = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        e();
    }

    @Override // im.c
    public final void i(long j10) {
        if (!g.p(j10) || this.f30181r) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            xj.d.a(this.f30178d, j10);
            b();
            return;
        }
        long j11 = this.f30176b;
        if (j11 != Long.MAX_VALUE) {
            long c10 = xj.d.c(j11, j10);
            this.f30176b = c10;
            if (c10 == Long.MAX_VALUE) {
                this.f30181r = true;
            }
        }
        im.c cVar = this.f30175a;
        if (decrementAndGet() != 0) {
            e();
        }
        if (cVar != null) {
            cVar.i(j10);
        }
    }

    public final void j(im.c cVar) {
        if (this.f30180f) {
            cVar.cancel();
            return;
        }
        lj.b.d(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            im.c andSet = this.f30177c.getAndSet(cVar);
            if (andSet != null) {
                andSet.cancel();
            }
            b();
            return;
        }
        im.c cVar2 = this.f30175a;
        if (cVar2 != null) {
            cVar2.cancel();
        }
        this.f30175a = cVar;
        long j10 = this.f30176b;
        if (decrementAndGet() != 0) {
            e();
        }
        if (j10 != 0) {
            cVar.i(j10);
        }
    }
}
