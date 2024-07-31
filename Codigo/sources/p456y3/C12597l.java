package p456y3;

import p456y3.InterfaceC12591f;

/* renamed from: y3.l */
/* loaded from: classes.dex */
public class C12597l implements InterfaceC12591f, InterfaceC12590e {

    /* renamed from: a */
    private final InterfaceC12591f f34174a;

    /* renamed from: b */
    private final Object f34175b;

    /* renamed from: c */
    private volatile InterfaceC12590e f34176c;

    /* renamed from: d */
    private volatile InterfaceC12590e f34177d;

    /* renamed from: e */
    private InterfaceC12591f.a f34178e;

    /* renamed from: f */
    private InterfaceC12591f.a f34179f;

    /* renamed from: g */
    private boolean f34180g;

    public C12597l(Object obj, InterfaceC12591f interfaceC12591f) {
        InterfaceC12591f.a aVar = InterfaceC12591f.a.CLEARED;
        this.f34178e = aVar;
        this.f34179f = aVar;
        this.f34175b = obj;
        this.f34174a = interfaceC12591f;
    }

    /* renamed from: k */
    private boolean m41428k() {
        InterfaceC12591f interfaceC12591f = this.f34174a;
        return interfaceC12591f == null || interfaceC12591f.mo41382b(this);
    }

    /* renamed from: l */
    private boolean m41429l() {
        InterfaceC12591f interfaceC12591f = this.f34174a;
        return interfaceC12591f == null || interfaceC12591f.mo41389i(this);
    }

    /* renamed from: m */
    private boolean m41430m() {
        InterfaceC12591f interfaceC12591f = this.f34174a;
        return interfaceC12591f == null || interfaceC12591f.mo41386f(this);
    }

    @Override // p456y3.InterfaceC12591f, p456y3.InterfaceC12590e
    /* renamed from: a */
    public boolean mo41381a() {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = this.f34177d.mo41381a() || this.f34176c.mo41381a();
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: b */
    public boolean mo41382b(InterfaceC12590e interfaceC12590e) {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = m41428k() && interfaceC12590e.equals(this.f34176c) && this.f34178e != InterfaceC12591f.a.PAUSED;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: c */
    public void mo41383c(InterfaceC12590e interfaceC12590e) {
        synchronized (this.f34175b) {
            if (interfaceC12590e.equals(this.f34177d)) {
                this.f34179f = InterfaceC12591f.a.SUCCESS;
                return;
            }
            this.f34178e = InterfaceC12591f.a.SUCCESS;
            InterfaceC12591f interfaceC12591f = this.f34174a;
            if (interfaceC12591f != null) {
                interfaceC12591f.mo41383c(this);
            }
            if (!this.f34179f.m41393b()) {
                this.f34177d.clear();
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    public void clear() {
        synchronized (this.f34175b) {
            this.f34180g = false;
            InterfaceC12591f.a aVar = InterfaceC12591f.a.CLEARED;
            this.f34178e = aVar;
            this.f34179f = aVar;
            this.f34177d.clear();
            this.f34176c.clear();
        }
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: d */
    public void mo41384d(InterfaceC12590e interfaceC12590e) {
        synchronized (this.f34175b) {
            if (!interfaceC12590e.equals(this.f34176c)) {
                this.f34179f = InterfaceC12591f.a.FAILED;
                return;
            }
            this.f34178e = InterfaceC12591f.a.FAILED;
            InterfaceC12591f interfaceC12591f = this.f34174a;
            if (interfaceC12591f != null) {
                interfaceC12591f.mo41384d(this);
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: e */
    public boolean mo41385e() {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = this.f34178e == InterfaceC12591f.a.CLEARED;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: f */
    public boolean mo41386f(InterfaceC12590e interfaceC12590e) {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = m41430m() && (interfaceC12590e.equals(this.f34176c) || this.f34178e != InterfaceC12591f.a.SUCCESS);
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: g */
    public boolean mo41387g() {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = this.f34178e == InterfaceC12591f.a.SUCCESS;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12591f
    public InterfaceC12591f getRoot() {
        InterfaceC12591f root;
        synchronized (this.f34175b) {
            InterfaceC12591f interfaceC12591f = this.f34174a;
            root = interfaceC12591f != null ? interfaceC12591f.getRoot() : this;
        }
        return root;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: h */
    public boolean mo41388h(InterfaceC12590e interfaceC12590e) {
        if (!(interfaceC12590e instanceof C12597l)) {
            return false;
        }
        C12597l c12597l = (C12597l) interfaceC12590e;
        if (this.f34176c == null) {
            if (c12597l.f34176c != null) {
                return false;
            }
        } else if (!this.f34176c.mo41388h(c12597l.f34176c)) {
            return false;
        }
        if (this.f34177d == null) {
            if (c12597l.f34177d != null) {
                return false;
            }
        } else if (!this.f34177d.mo41388h(c12597l.f34177d)) {
            return false;
        }
        return true;
    }

    @Override // p456y3.InterfaceC12591f
    /* renamed from: i */
    public boolean mo41389i(InterfaceC12590e interfaceC12590e) {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = m41429l() && interfaceC12590e.equals(this.f34176c) && !mo41381a();
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f34175b) {
            z10 = this.f34178e == InterfaceC12591f.a.RUNNING;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: j */
    public void mo41390j() {
        synchronized (this.f34175b) {
            this.f34180g = true;
            try {
                if (this.f34178e != InterfaceC12591f.a.SUCCESS) {
                    InterfaceC12591f.a aVar = this.f34179f;
                    InterfaceC12591f.a aVar2 = InterfaceC12591f.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f34179f = aVar2;
                        this.f34177d.mo41390j();
                    }
                }
                if (this.f34180g) {
                    InterfaceC12591f.a aVar3 = this.f34178e;
                    InterfaceC12591f.a aVar4 = InterfaceC12591f.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f34178e = aVar4;
                        this.f34176c.mo41390j();
                    }
                }
            } finally {
                this.f34180g = false;
            }
        }
    }

    /* renamed from: n */
    public void m41431n(InterfaceC12590e interfaceC12590e, InterfaceC12590e interfaceC12590e2) {
        this.f34176c = interfaceC12590e;
        this.f34177d = interfaceC12590e2;
    }

    @Override // p456y3.InterfaceC12590e
    public void pause() {
        synchronized (this.f34175b) {
            if (!this.f34179f.m41393b()) {
                this.f34179f = InterfaceC12591f.a.PAUSED;
                this.f34177d.pause();
            }
            if (!this.f34178e.m41393b()) {
                this.f34178e = InterfaceC12591f.a.PAUSED;
                this.f34176c.pause();
            }
        }
    }
}
