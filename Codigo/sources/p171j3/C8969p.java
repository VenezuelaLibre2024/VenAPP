package p171j3;

import p036c4.C1870k;
import p129h3.InterfaceC7622f;

/* renamed from: j3.p */
/* loaded from: classes.dex */
class C8969p<Z> implements InterfaceC8975v<Z> {

    /* renamed from: a */
    private final boolean f21461a;

    /* renamed from: b */
    private final boolean f21462b;

    /* renamed from: c */
    private final InterfaceC8975v<Z> f21463c;

    /* renamed from: d */
    private final a f21464d;

    /* renamed from: e */
    private final InterfaceC7622f f21465e;

    /* renamed from: f */
    private int f21466f;

    /* renamed from: r */
    private boolean f21467r;

    /* renamed from: j3.p$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: d */
        void mo26274d(InterfaceC7622f interfaceC7622f, C8969p<?> c8969p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8969p(InterfaceC8975v<Z> interfaceC8975v, boolean z10, boolean z11, InterfaceC7622f interfaceC7622f, a aVar) {
        this.f21463c = (InterfaceC8975v) C1870k.m9950d(interfaceC8975v);
        this.f21461a = z10;
        this.f21462b = z11;
        this.f21465e = interfaceC7622f;
        this.f21464d = (a) C1870k.m9950d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m26305a() {
        if (this.f21467r) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f21466f++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC8975v<Z> m26306b() {
        return this.f21463c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m26307c() {
        return this.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26308d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f21466f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f21466f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f21464d.mo26274d(this.f21465e, this);
        }
    }

    @Override // p171j3.InterfaceC8975v
    public Z get() {
        return this.f21463c.get();
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public int mo26309p() {
        return this.f21463c.mo26309p();
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public synchronized void mo26310q() {
        if (this.f21466f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f21467r) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f21467r = true;
        if (this.f21462b) {
            this.f21463c.mo26310q();
        }
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<Z> mo26311r() {
        return this.f21463c.mo26311r();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f21461a + ", listener=" + this.f21464d + ", key=" + this.f21465e + ", acquired=" + this.f21466f + ", isRecycled=" + this.f21467r + ", resource=" + this.f21463c + '}';
    }
}
