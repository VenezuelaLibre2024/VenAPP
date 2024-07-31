package vj;

import dj.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import wj.g;
import xj.h;

/* loaded from: classes3.dex */
public class d<T> extends AtomicInteger implements i<T>, im.c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: a, reason: collision with root package name */
    final im.b<? super T> f29304a;

    /* renamed from: b, reason: collision with root package name */
    final xj.c f29305b = new xj.c();

    /* renamed from: c, reason: collision with root package name */
    final AtomicLong f29306c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<im.c> f29307d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f29308e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f29309f;

    public d(im.b<? super T> bVar) {
        this.f29304a = bVar;
    }

    @Override // im.b
    public void a() {
        this.f29309f = true;
        h.a(this.f29304a, this, this.f29305b);
    }

    @Override // im.b
    public void c(T t10) {
        h.c(this.f29304a, t10, this, this.f29305b);
    }

    @Override // im.c
    public void cancel() {
        if (this.f29309f) {
            return;
        }
        g.b(this.f29307d);
    }

    @Override // dj.i, im.b
    public void d(im.c cVar) {
        if (this.f29308e.compareAndSet(false, true)) {
            this.f29304a.d(this);
            g.l(this.f29307d, this.f29306c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // im.c
    public void i(long j10) {
        if (j10 > 0) {
            g.h(this.f29307d, this.f29306c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }

    @Override // im.b
    public void onError(Throwable th2) {
        this.f29309f = true;
        h.b(this.f29304a, th2, this, this.f29305b);
    }
}
