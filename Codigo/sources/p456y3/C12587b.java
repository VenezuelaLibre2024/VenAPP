package p456y3;

import p456y3.InterfaceC12591f;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public final class C12587b implements InterfaceC12591f, InterfaceC12590e {

    /* renamed from: a */
    private final Object f34126a;

    /* renamed from: b */
    private final InterfaceC12591f f34127b;

    /* renamed from: c */
    private volatile InterfaceC12590e f34128c;

    /* renamed from: d */
    private volatile InterfaceC12590e f34129d;

    /* renamed from: e */
    private InterfaceC12591f.a f34130e;

    /* renamed from: f */
    private InterfaceC12591f.a f34131f;

    public C12587b(Object obj, InterfaceC12591f interfaceC12591f) {
        InterfaceC12591f.a aVar = InterfaceC12591f.a.CLEARED;
        this.f34130e = aVar;
        this.f34131f = aVar;
        this.f34126a = obj;
        this.f34127b = interfaceC12591f;
    }

    /* renamed from: k */
    private boolean m41377k(InterfaceC12590e interfaceC12590e) {
        InterfaceC12591f.a aVar;
        InterfaceC12591f.a aVar2 = this.f34130e;
        InterfaceC12591f.a aVar3 = InterfaceC12591f.a.FAILED;
        return aVar2 != aVar3 ? interfaceC12590e.equals(this.f34128c) : interfaceC12590e.equals(this.f34129d) && ((aVar = this.f34131f) == InterfaceC12591f.a.SUCCESS || aVar == aVar3);
    }

    /* renamed from: l */
    private boolean m41378l() {
        InterfaceC12591f interfaceC12591f = this.f34127b;
        return interfaceC12591f == null || interfaceC12591f.mo41382b(this);
    }

    /* renamed from: m */
    private boolean m41379m() {
        InterfaceC12591f interfaceC12591f = this.f34127b;
        return interfaceC12591f == null || interfaceC12591f.mo41389i(this);
    }

    /* renamed from: n */
    private boolean m41380n() {
        InterfaceC12591f interfaceC12591f = this.f34127b;
        return interfaceC12591f == null || interfaceC12591f.mo41386f(this);
    }

    @Override // p456y3.InterfaceC12591f, p456y3.InterfaceC12590e
    /* renamed from: a */
    public boolean mo41381a() {
        boolean z10;
        synchronized (this.f34126a) {
            z10 = this.f34128c.mo41381a() || this.f34129d.mo41381a();
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: b */
    public boolean mo41382b(InterfaceC12590e interfaceC12590e) {
        boolean z10;
        synchronized (this.f34126a) {
            z10 = m41378l() && interfaceC12590e.equals(this.f34128c);
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: c */
    public void mo41383c(InterfaceC12590e interfaceC12590e) {
        synchronized (this.f34126a) {
            if (interfaceC12590e.equals(this.f34128c)) {
                this.f34130e = InterfaceC12591f.a.SUCCESS;
            } else if (interfaceC12590e.equals(this.f34129d)) {
                this.f34131f = InterfaceC12591f.a.SUCCESS;
            }
            InterfaceC12591f interfaceC12591f = this.f34127b;
            if (interfaceC12591f != null) {
                interfaceC12591f.mo41383c(this);
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    public void clear() {
        synchronized (this.f34126a) {
            InterfaceC12591f.a aVar = InterfaceC12591f.a.CLEARED;
            this.f34130e = aVar;
            this.f34128c.clear();
            if (this.f34131f != aVar) {
                this.f34131f = aVar;
                this.f34129d.clear();
            }
        }
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: d */
    public void mo41384d(InterfaceC12590e interfaceC12590e) {
        synchronized (this.f34126a) {
            if (interfaceC12590e.equals(this.f34129d)) {
                this.f34131f = InterfaceC12591f.a.FAILED;
                InterfaceC12591f interfaceC12591f = this.f34127b;
                if (interfaceC12591f != null) {
                    interfaceC12591f.mo41384d(this);
                }
                return;
            }
            this.f34130e = InterfaceC12591f.a.FAILED;
            InterfaceC12591f.a aVar = this.f34131f;
            InterfaceC12591f.a aVar2 = InterfaceC12591f.a.RUNNING;
            if (aVar != aVar2) {
                this.f34131f = aVar2;
                this.f34129d.mo41390j();
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: e */
    public boolean mo41385e() {
        boolean z10;
        synchronized (this.f34126a) {
            InterfaceC12591f.a aVar = this.f34130e;
            InterfaceC12591f.a aVar2 = InterfaceC12591f.a.CLEARED;
            z10 = aVar == aVar2 && this.f34131f == aVar2;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: f */
    public boolean mo41386f(InterfaceC12590e interfaceC12590e) {
        boolean m41380n;
        synchronized (this.f34126a) {
            m41380n = m41380n();
        }
        return m41380n;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: g */
    public boolean mo41387g() {
        boolean z10;
        synchronized (this.f34126a) {
            InterfaceC12591f.a aVar = this.f34130e;
            InterfaceC12591f.a aVar2 = InterfaceC12591f.a.SUCCESS;
            z10 = aVar == aVar2 || this.f34131f == aVar2;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    public InterfaceC12591f getRoot() {
        InterfaceC12591f root;
        synchronized (this.f34126a) {
            InterfaceC12591f interfaceC12591f = this.f34127b;
            root = interfaceC12591f != null ? interfaceC12591f.getRoot() : this;
        }
        return root;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: h */
    public boolean mo41388h(InterfaceC12590e interfaceC12590e) {
        if (!(interfaceC12590e instanceof C12587b)) {
            return false;
        }
        C12587b c12587b = (C12587b) interfaceC12590e;
        return this.f34128c.mo41388h(c12587b.f34128c) && this.f34129d.mo41388h(c12587b.f34129d);
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: i */
    public boolean mo41389i(InterfaceC12590e interfaceC12590e) {
        boolean z10;
        synchronized (this.f34126a) {
            z10 = m41379m() && m41377k(interfaceC12590e);
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f34126a) {
            InterfaceC12591f.a aVar = this.f34130e;
            InterfaceC12591f.a aVar2 = InterfaceC12591f.a.RUNNING;
            z10 = aVar == aVar2 || this.f34131f == aVar2;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: j */
    public void mo41390j() {
        synchronized (this.f34126a) {
            InterfaceC12591f.a aVar = this.f34130e;
            InterfaceC12591f.a aVar2 = InterfaceC12591f.a.RUNNING;
            if (aVar != aVar2) {
                this.f34130e = aVar2;
                this.f34128c.mo41390j();
            }
        }
    }

    /* renamed from: o */
    public void m41391o(InterfaceC12590e interfaceC12590e, InterfaceC12590e interfaceC12590e2) {
        this.f34128c = interfaceC12590e;
        this.f34129d = interfaceC12590e2;
    }

    @Override // p456y3.InterfaceC12590e
    public void pause() {
        synchronized (this.f34126a) {
            InterfaceC12591f.a aVar = this.f34130e;
            InterfaceC12591f.a aVar2 = InterfaceC12591f.a.RUNNING;
            if (aVar == aVar2) {
                this.f34130e = InterfaceC12591f.a.PAUSED;
                this.f34128c.pause();
            }
            if (this.f34131f == aVar2) {
                this.f34131f = InterfaceC12591f.a.PAUSED;
                this.f34129d.pause();
            }
        }
    }
}
