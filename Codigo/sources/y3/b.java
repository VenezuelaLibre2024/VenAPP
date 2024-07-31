package y3;

import y3.f;

/* loaded from: classes.dex */
public final class b implements f, e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31595a;

    /* renamed from: b, reason: collision with root package name */
    private final f f31596b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f31597c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f31598d;

    /* renamed from: e, reason: collision with root package name */
    private f.a f31599e;

    /* renamed from: f, reason: collision with root package name */
    private f.a f31600f;

    public b(Object obj, f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f31599e = aVar;
        this.f31600f = aVar;
        this.f31595a = obj;
        this.f31596b = fVar;
    }

    private boolean k(e eVar) {
        f.a aVar;
        f.a aVar2 = this.f31599e;
        f.a aVar3 = f.a.FAILED;
        return aVar2 != aVar3 ? eVar.equals(this.f31597c) : eVar.equals(this.f31598d) && ((aVar = this.f31600f) == f.a.SUCCESS || aVar == aVar3);
    }

    private boolean l() {
        f fVar = this.f31596b;
        return fVar == null || fVar.b(this);
    }

    private boolean m() {
        f fVar = this.f31596b;
        return fVar == null || fVar.i(this);
    }

    private boolean n() {
        f fVar = this.f31596b;
        return fVar == null || fVar.f(this);
    }

    @Override // y3.f, y3.e
    public boolean a() {
        boolean z10;
        synchronized (this.f31595a) {
            z10 = this.f31597c.a() || this.f31598d.a();
        }
        return z10;
    }

    @Override // y3.f
    public boolean b(e eVar) {
        boolean z10;
        synchronized (this.f31595a) {
            z10 = l() && eVar.equals(this.f31597c);
        }
        return z10;
    }

    @Override // y3.f
    public void c(e eVar) {
        synchronized (this.f31595a) {
            if (eVar.equals(this.f31597c)) {
                this.f31599e = f.a.SUCCESS;
            } else if (eVar.equals(this.f31598d)) {
                this.f31600f = f.a.SUCCESS;
            }
            f fVar = this.f31596b;
            if (fVar != null) {
                fVar.c(this);
            }
        }
    }

    @Override // y3.e
    public void clear() {
        synchronized (this.f31595a) {
            f.a aVar = f.a.CLEARED;
            this.f31599e = aVar;
            this.f31597c.clear();
            if (this.f31600f != aVar) {
                this.f31600f = aVar;
                this.f31598d.clear();
            }
        }
    }

    @Override // y3.f
    public void d(e eVar) {
        synchronized (this.f31595a) {
            if (eVar.equals(this.f31598d)) {
                this.f31600f = f.a.FAILED;
                f fVar = this.f31596b;
                if (fVar != null) {
                    fVar.d(this);
                }
                return;
            }
            this.f31599e = f.a.FAILED;
            f.a aVar = this.f31600f;
            f.a aVar2 = f.a.RUNNING;
            if (aVar != aVar2) {
                this.f31600f = aVar2;
                this.f31598d.j();
            }
        }
    }

    @Override // y3.e
    public boolean e() {
        boolean z10;
        synchronized (this.f31595a) {
            f.a aVar = this.f31599e;
            f.a aVar2 = f.a.CLEARED;
            z10 = aVar == aVar2 && this.f31600f == aVar2;
        }
        return z10;
    }

    @Override // y3.f
    public boolean f(e eVar) {
        boolean n10;
        synchronized (this.f31595a) {
            n10 = n();
        }
        return n10;
    }

    @Override // y3.e
    public boolean g() {
        boolean z10;
        synchronized (this.f31595a) {
            f.a aVar = this.f31599e;
            f.a aVar2 = f.a.SUCCESS;
            z10 = aVar == aVar2 || this.f31600f == aVar2;
        }
        return z10;
    }

    @Override // y3.f
    public f getRoot() {
        f root;
        synchronized (this.f31595a) {
            f fVar = this.f31596b;
            root = fVar != null ? fVar.getRoot() : this;
        }
        return root;
    }

    @Override // y3.e
    public boolean h(e eVar) {
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        return this.f31597c.h(bVar.f31597c) && this.f31598d.h(bVar.f31598d);
    }

    @Override // y3.f
    public boolean i(e eVar) {
        boolean z10;
        synchronized (this.f31595a) {
            z10 = m() && k(eVar);
        }
        return z10;
    }

    @Override // y3.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f31595a) {
            f.a aVar = this.f31599e;
            f.a aVar2 = f.a.RUNNING;
            z10 = aVar == aVar2 || this.f31600f == aVar2;
        }
        return z10;
    }

    @Override // y3.e
    public void j() {
        synchronized (this.f31595a) {
            f.a aVar = this.f31599e;
            f.a aVar2 = f.a.RUNNING;
            if (aVar != aVar2) {
                this.f31599e = aVar2;
                this.f31597c.j();
            }
        }
    }

    public void o(e eVar, e eVar2) {
        this.f31597c = eVar;
        this.f31598d = eVar2;
    }

    @Override // y3.e
    public void pause() {
        synchronized (this.f31595a) {
            f.a aVar = this.f31599e;
            f.a aVar2 = f.a.RUNNING;
            if (aVar == aVar2) {
                this.f31599e = f.a.PAUSED;
                this.f31597c.pause();
            }
            if (this.f31600f == aVar2) {
                this.f31600f = f.a.PAUSED;
                this.f31598d.pause();
            }
        }
    }
}
