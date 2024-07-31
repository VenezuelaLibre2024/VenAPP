package p171j3;

import androidx.core.util.InterfaceC0981e;
import p036c4.C1870k;
import p055d4.AbstractC6844c;
import p055d4.C6842a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j3.u */
/* loaded from: classes.dex */
public final class C8974u<Z> implements InterfaceC8975v<Z>, C6842a.f {

    /* renamed from: e */
    private static final InterfaceC0981e<C8974u<?>> f21483e = C6842a.m19766d(20, new a());

    /* renamed from: a */
    private final AbstractC6844c f21484a = AbstractC6844c.m19780a();

    /* renamed from: b */
    private InterfaceC8975v<Z> f21485b;

    /* renamed from: c */
    private boolean f21486c;

    /* renamed from: d */
    private boolean f21487d;

    /* renamed from: j3.u$a */
    /* loaded from: classes.dex */
    class a implements C6842a.d<C8974u<?>> {
        a() {
        }

        @Override // p055d4.C6842a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8974u<?> mo19770a() {
            return new C8974u<>();
        }
    }

    C8974u() {
    }

    /* renamed from: a */
    private void m26330a(InterfaceC8975v<Z> interfaceC8975v) {
        this.f21487d = false;
        this.f21486c = true;
        this.f21485b = interfaceC8975v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <Z> C8974u<Z> m26331b(InterfaceC8975v<Z> interfaceC8975v) {
        C8974u<Z> c8974u = (C8974u) C1870k.m9950d(f21483e.mo4821b());
        c8974u.m26330a(interfaceC8975v);
        return c8974u;
    }

    /* renamed from: c */
    private void m26332c() {
        this.f21485b = null;
        f21483e.mo4820a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m26333d() {
        this.f21484a.mo19782c();
        if (!this.f21486c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f21486c = false;
        if (this.f21487d) {
            mo26310q();
        }
    }

    @Override // p171j3.InterfaceC8975v
    public Z get() {
        return this.f21485b.get();
    }

    @Override // p055d4.C6842a.f
    /* renamed from: h */
    public AbstractC6844c mo19773h() {
        return this.f21484a;
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public int mo26309p() {
        return this.f21485b.mo26309p();
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public synchronized void mo26310q() {
        this.f21484a.mo19782c();
        this.f21487d = true;
        if (!this.f21486c) {
            this.f21485b.mo26310q();
            m26332c();
        }
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<Z> mo26311r() {
        return this.f21485b.mo26311r();
    }
}
