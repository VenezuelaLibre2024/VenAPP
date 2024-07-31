package nj;

import dj.q;

/* loaded from: classes3.dex */
public abstract class a<T, R> implements q<T>, mj.e<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final q<? super R> f21979a;

    /* renamed from: b, reason: collision with root package name */
    protected gj.b f21980b;

    /* renamed from: c, reason: collision with root package name */
    protected mj.e<T> f21981c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f21982d;

    /* renamed from: e, reason: collision with root package name */
    protected int f21983e;

    public a(q<? super R> qVar) {
        this.f21979a = qVar;
    }

    @Override // dj.q
    public void a() {
        if (this.f21982d) {
            return;
        }
        this.f21982d = true;
        this.f21979a.a();
    }

    @Override // dj.q
    public final void b(gj.b bVar) {
        if (kj.b.p(this.f21980b, bVar)) {
            this.f21980b = bVar;
            if (bVar instanceof mj.e) {
                this.f21981c = (mj.e) bVar;
            }
            if (e()) {
                this.f21979a.b(this);
                d();
            }
        }
    }

    @Override // mj.j
    public void clear() {
        this.f21981c.clear();
    }

    protected void d() {
    }

    @Override // gj.b
    public void dispose() {
        this.f21980b.dispose();
    }

    protected boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(Throwable th2) {
        hj.b.b(th2);
        this.f21980b.dispose();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i10) {
        mj.e<T> eVar = this.f21981c;
        if (eVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int l10 = eVar.l(i10);
        if (l10 != 0) {
            this.f21983e = l10;
        }
        return l10;
    }

    @Override // gj.b
    public boolean h() {
        return this.f21980b.h();
    }

    @Override // mj.j
    public boolean isEmpty() {
        return this.f21981c.isEmpty();
    }

    @Override // mj.j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dj.q
    public void onError(Throwable th2) {
        if (this.f21982d) {
            yj.a.q(th2);
        } else {
            this.f21982d = true;
            this.f21979a.onError(th2);
        }
    }
}
