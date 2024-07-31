package p397v7;

import java.io.IOException;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10811b;
import p361t6.C11110u3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11739y;

/* renamed from: v7.v */
/* loaded from: classes.dex */
public final class C11733v implements InterfaceC11739y, InterfaceC11739y.a {

    /* renamed from: a */
    public final InterfaceC11684a0.b f30928a;

    /* renamed from: b */
    private final long f30929b;

    /* renamed from: c */
    private final InterfaceC10811b f30930c;

    /* renamed from: d */
    private InterfaceC11684a0 f30931d;

    /* renamed from: e */
    private InterfaceC11739y f30932e;

    /* renamed from: f */
    private InterfaceC11739y.a f30933f;

    /* renamed from: r */
    private a f30934r;

    /* renamed from: s */
    private boolean f30935s;

    /* renamed from: t */
    private long f30936t = -9223372036854775807L;

    /* renamed from: v7.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m37086a(InterfaceC11684a0.b bVar, IOException iOException);

        /* renamed from: b */
        void m37087b(InterfaceC11684a0.b bVar);
    }

    public C11733v(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        this.f30928a = bVar;
        this.f30930c = interfaceC10811b;
        this.f30929b = j10;
    }

    /* renamed from: p */
    private long m37078p(long j10) {
        long j11 = this.f30936t;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo245b();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo246c(j10, c11110u3);
    }

    /* renamed from: d */
    public void m37079d(InterfaceC11684a0.b bVar) {
        long m37078p = m37078p(this.f30929b);
        InterfaceC11739y mo11843e = ((InterfaceC11684a0) C11137a.m34603e(this.f30931d)).mo11843e(bVar, this.f30930c, m37078p);
        this.f30932e = mo11843e;
        if (this.f30933f != null) {
            mo11843e.mo252k(this, m37078p);
        }
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        InterfaceC11739y interfaceC11739y = this.f30932e;
        return interfaceC11739y != null && interfaceC11739y.mo248e(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo249f();
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo250g(j10);
    }

    @Override // p397v7.InterfaceC11739y.a
    /* renamed from: h */
    public void mo34427h(InterfaceC11739y interfaceC11739y) {
        ((InterfaceC11739y.a) C11172r0.m34928j(this.f30933f)).mo34427h(this);
        a aVar = this.f30934r;
        if (aVar != null) {
            aVar.m37087b(this.f30928a);
        }
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        InterfaceC11739y interfaceC11739y = this.f30932e;
        return interfaceC11739y != null && interfaceC11739y.isLoading();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo251j(j10);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f30933f = aVar;
        InterfaceC11739y interfaceC11739y = this.f30932e;
        if (interfaceC11739y != null) {
            interfaceC11739y.mo252k(this, m37078p(this.f30929b));
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo253l();
    }

    /* renamed from: m */
    public long m37080m() {
        return this.f30936t;
    }

    /* renamed from: n */
    public long m37081n() {
        return this.f30929b;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        try {
            InterfaceC11739y interfaceC11739y = this.f30932e;
            if (interfaceC11739y != null) {
                interfaceC11739y.mo254o();
            } else {
                InterfaceC11684a0 interfaceC11684a0 = this.f30931d;
                if (interfaceC11684a0 != null) {
                    interfaceC11684a0.mo11845n();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f30934r;
            if (aVar == null) {
                throw e10;
            }
            if (this.f30935s) {
                return;
            }
            this.f30935s = true;
            aVar.m37086a(this.f30928a, e10);
        }
    }

    @Override // p397v7.InterfaceC11736w0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo258a(InterfaceC11739y interfaceC11739y) {
        ((InterfaceC11739y.a) C11172r0.m34928j(this.f30933f)).mo258a(this);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo255r();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo256s(j10, z10);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f30936t;
        if (j12 == -9223372036854775807L || j10 != this.f30929b) {
            j11 = j10;
        } else {
            this.f30936t = -9223372036854775807L;
            j11 = j12;
        }
        return ((InterfaceC11739y) C11172r0.m34928j(this.f30932e)).mo257t(interfaceC10312rArr, zArr, interfaceC11734v0Arr, zArr2, j11);
    }

    /* renamed from: u */
    public void m37083u(long j10) {
        this.f30936t = j10;
    }

    /* renamed from: v */
    public void m37084v() {
        if (this.f30932e != null) {
            ((InterfaceC11684a0) C11137a.m34603e(this.f30931d)).mo11844l(this.f30932e);
        }
    }

    /* renamed from: w */
    public void m37085w(InterfaceC11684a0 interfaceC11684a0) {
        C11137a.m34605g(this.f30931d == null);
        this.f30931d = interfaceC11684a0;
    }
}
