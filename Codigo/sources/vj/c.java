package vj;

import dj.i;
import java.util.concurrent.atomic.AtomicReference;
import wj.g;

/* loaded from: classes3.dex */
public final class c<T> extends AtomicReference<im.c> implements i<T>, im.c, gj.b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a, reason: collision with root package name */
    final jj.d<? super T> f29300a;

    /* renamed from: b, reason: collision with root package name */
    final jj.d<? super Throwable> f29301b;

    /* renamed from: c, reason: collision with root package name */
    final jj.a f29302c;

    /* renamed from: d, reason: collision with root package name */
    final jj.d<? super im.c> f29303d;

    public c(jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar, jj.d<? super im.c> dVar3) {
        this.f29300a = dVar;
        this.f29301b = dVar2;
        this.f29302c = aVar;
        this.f29303d = dVar3;
    }

    @Override // im.b
    public void a() {
        im.c cVar = get();
        g gVar = g.CANCELLED;
        if (cVar != gVar) {
            lazySet(gVar);
            try {
                this.f29302c.run();
            } catch (Throwable th2) {
                hj.b.b(th2);
                yj.a.q(th2);
            }
        }
    }

    @Override // im.b
    public void c(T t10) {
        if (h()) {
            return;
        }
        try {
            this.f29300a.accept(t10);
        } catch (Throwable th2) {
            hj.b.b(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // im.c
    public void cancel() {
        g.b(this);
    }

    @Override // dj.i, im.b
    public void d(im.c cVar) {
        if (g.o(this, cVar)) {
            try {
                this.f29303d.accept(this);
            } catch (Throwable th2) {
                hj.b.b(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // gj.b
    public void dispose() {
        cancel();
    }

    @Override // gj.b
    public boolean h() {
        return get() == g.CANCELLED;
    }

    @Override // im.c
    public void i(long j10) {
        get().i(j10);
    }

    @Override // im.b
    public void onError(Throwable th2) {
        im.c cVar = get();
        g gVar = g.CANCELLED;
        if (cVar == gVar) {
            yj.a.q(th2);
            return;
        }
        lazySet(gVar);
        try {
            this.f29301b.accept(th2);
        } catch (Throwable th3) {
            hj.b.b(th3);
            yj.a.q(new hj.a(th2, th3));
        }
    }
}
