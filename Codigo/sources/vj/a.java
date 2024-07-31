package vj;

import mj.g;

/* loaded from: classes3.dex */
public abstract class a<T, R> implements mj.a<T>, g<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final mj.a<? super R> f29290a;

    /* renamed from: b, reason: collision with root package name */
    protected im.c f29291b;

    /* renamed from: c, reason: collision with root package name */
    protected g<T> f29292c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f29293d;

    /* renamed from: e, reason: collision with root package name */
    protected int f29294e;

    public a(mj.a<? super R> aVar) {
        this.f29290a = aVar;
    }

    @Override // im.b
    public void a() {
        if (this.f29293d) {
            return;
        }
        this.f29293d = true;
        this.f29290a.a();
    }

    protected void b() {
    }

    @Override // im.c
    public void cancel() {
        this.f29291b.cancel();
    }

    @Override // mj.j
    public void clear() {
        this.f29292c.clear();
    }

    @Override // dj.i, im.b
    public final void d(im.c cVar) {
        if (wj.g.q(this.f29291b, cVar)) {
            this.f29291b = cVar;
            if (cVar instanceof g) {
                this.f29292c = (g) cVar;
            }
            if (e()) {
                this.f29290a.d(this);
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
        this.f29291b.cancel();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i10) {
        g<T> gVar = this.f29292c;
        if (gVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int l10 = gVar.l(i10);
        if (l10 != 0) {
            this.f29294e = l10;
        }
        return l10;
    }

    @Override // im.c
    public void i(long j10) {
        this.f29291b.i(j10);
    }

    @Override // mj.j
    public boolean isEmpty() {
        return this.f29292c.isEmpty();
    }

    @Override // mj.j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // im.b
    public void onError(Throwable th2) {
        if (this.f29293d) {
            yj.a.q(th2);
        } else {
            this.f29293d = true;
            this.f29290a.onError(th2);
        }
    }
}
