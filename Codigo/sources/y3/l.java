package y3;

import y3.f;

/* loaded from: classes.dex */
public class l implements f, e {

    /* renamed from: a, reason: collision with root package name */
    private final f f31638a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f31639b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f31640c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f31641d;

    /* renamed from: e, reason: collision with root package name */
    private f.a f31642e;

    /* renamed from: f, reason: collision with root package name */
    private f.a f31643f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31644g;

    public l(Object obj, f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f31642e = aVar;
        this.f31643f = aVar;
        this.f31639b = obj;
        this.f31638a = fVar;
    }

    private boolean k() {
        f fVar = this.f31638a;
        return fVar == null || fVar.b(this);
    }

    private boolean l() {
        f fVar = this.f31638a;
        return fVar == null || fVar.i(this);
    }

    private boolean m() {
        f fVar = this.f31638a;
        return fVar == null || fVar.f(this);
    }

    @Override // y3.f, y3.e
    public boolean a() {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = this.f31641d.a() || this.f31640c.a();
        }
        return z10;
    }

    @Override // y3.f
    public boolean b(e eVar) {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = k() && eVar.equals(this.f31640c) && this.f31642e != f.a.PAUSED;
        }
        return z10;
    }

    @Override // y3.f
    public void c(e eVar) {
        synchronized (this.f31639b) {
            if (eVar.equals(this.f31641d)) {
                this.f31643f = f.a.SUCCESS;
                return;
            }
            this.f31642e = f.a.SUCCESS;
            f fVar = this.f31638a;
            if (fVar != null) {
                fVar.c(this);
            }
            if (!this.f31643f.b()) {
                this.f31641d.clear();
            }
        }
    }

    @Override // y3.e
    public void clear() {
        synchronized (this.f31639b) {
            this.f31644g = false;
            f.a aVar = f.a.CLEARED;
            this.f31642e = aVar;
            this.f31643f = aVar;
            this.f31641d.clear();
            this.f31640c.clear();
        }
    }

    @Override // y3.f
    public void d(e eVar) {
        synchronized (this.f31639b) {
            if (!eVar.equals(this.f31640c)) {
                this.f31643f = f.a.FAILED;
                return;
            }
            this.f31642e = f.a.FAILED;
            f fVar = this.f31638a;
            if (fVar != null) {
                fVar.d(this);
            }
        }
    }

    @Override // y3.e
    public boolean e() {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = this.f31642e == f.a.CLEARED;
        }
        return z10;
    }

    @Override // y3.f
    public boolean f(e eVar) {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = m() && (eVar.equals(this.f31640c) || this.f31642e != f.a.SUCCESS);
        }
        return z10;
    }

    @Override // y3.e
    public boolean g() {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = this.f31642e == f.a.SUCCESS;
        }
        return z10;
    }

    @Override // y3.f
    public f getRoot() {
        f root;
        synchronized (this.f31639b) {
            f fVar = this.f31638a;
            root = fVar != null ? fVar.getRoot() : this;
        }
        return root;
    }

    @Override // y3.e
    public boolean h(e eVar) {
        if (!(eVar instanceof l)) {
            return false;
        }
        l lVar = (l) eVar;
        if (this.f31640c == null) {
            if (lVar.f31640c != null) {
                return false;
            }
        } else if (!this.f31640c.h(lVar.f31640c)) {
            return false;
        }
        if (this.f31641d == null) {
            if (lVar.f31641d != null) {
                return false;
            }
        } else if (!this.f31641d.h(lVar.f31641d)) {
            return false;
        }
        return true;
    }

    @Override // y3.f
    public boolean i(e eVar) {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = l() && eVar.equals(this.f31640c) && !a();
        }
        return z10;
    }

    @Override // y3.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f31639b) {
            z10 = this.f31642e == f.a.RUNNING;
        }
        return z10;
    }

    @Override // y3.e
    public void j() {
        synchronized (this.f31639b) {
            this.f31644g = true;
            try {
                if (this.f31642e != f.a.SUCCESS) {
                    f.a aVar = this.f31643f;
                    f.a aVar2 = f.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f31643f = aVar2;
                        this.f31641d.j();
                    }
                }
                if (this.f31644g) {
                    f.a aVar3 = this.f31642e;
                    f.a aVar4 = f.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f31642e = aVar4;
                        this.f31640c.j();
                    }
                }
            } finally {
                this.f31644g = false;
            }
        }
    }

    public void n(e eVar, e eVar2) {
        this.f31640c = eVar;
        this.f31641d = eVar2;
    }

    @Override // y3.e
    public void pause() {
        synchronized (this.f31639b) {
            if (!this.f31643f.b()) {
                this.f31643f = f.a.PAUSED;
                this.f31641d.pause();
            }
            if (!this.f31642e.b()) {
                this.f31642e = f.a.PAUSED;
                this.f31640c.pause();
            }
        }
    }
}
