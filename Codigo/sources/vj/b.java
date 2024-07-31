package vj;

import dj.i;
import mj.g;

/* loaded from: classes3.dex */
public abstract class b<T, R> implements i<T>, g<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final im.b<? super R> f29295a;

    /* renamed from: b, reason: collision with root package name */
    protected im.c f29296b;

    /* renamed from: c, reason: collision with root package name */
    protected g<T> f29297c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f29298d;

    /* renamed from: e, reason: collision with root package name */
    protected int f29299e;

    public b(im.b<? super R> bVar) {
        this.f29295a = bVar;
    }

    @Override // im.b
    public void a() {
        if (this.f29298d) {
            return;
        }
        this.f29298d = true;
        this.f29295a.a();
    }

    protected void b() {
    }

    @Override // im.c
    public void cancel() {
        this.f29296b.cancel();
    }

    @Override // mj.j
    public void clear() {
        this.f29297c.clear();
    }

    @Override // dj.i, im.b
    public final void d(im.c cVar) {
        if (wj.g.q(this.f29296b, cVar)) {
            this.f29296b = cVar;
            if (cVar instanceof g) {
                this.f29297c = (g) cVar;
            }
            if (e()) {
                this.f29295a.d(this);
                b();
            }
        }
    }

    protected boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(Throwable th2) {
        hj.b.b(th2);
        this.f29296b.cancel();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i10) {
        g<T> gVar = this.f29297c;
        if (gVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int l10 = gVar.l(i10);
        if (l10 != 0) {
            this.f29299e = l10;
        }
        return l10;
    }

    @Override // im.c
    public void i(long j10) {
        this.f29296b.i(j10);
    }

    @Override // mj.j
    public boolean isEmpty() {
        return this.f29297c.isEmpty();
    }

    @Override // mj.j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // im.b
    public void onError(Throwable th2) {
        if (this.f29298d) {
            yj.a.q(th2);
        } else {
            this.f29298d = true;
            this.f29295a.onError(th2);
        }
    }
}
