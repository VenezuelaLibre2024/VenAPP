package v7;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import t6.d4;
import v7.a0;
import v7.h0;
import x6.u;

/* loaded from: classes.dex */
public abstract class g<T> extends v7.a {

    /* renamed from: s, reason: collision with root package name */
    private final HashMap<T, b<T>> f28317s = new HashMap<>();

    /* renamed from: t, reason: collision with root package name */
    private Handler f28318t;

    /* renamed from: u, reason: collision with root package name */
    private s8.m0 f28319u;

    /* loaded from: classes.dex */
    private final class a implements h0, x6.u {

        /* renamed from: a, reason: collision with root package name */
        private final T f28320a;

        /* renamed from: b, reason: collision with root package name */
        private h0.a f28321b;

        /* renamed from: c, reason: collision with root package name */
        private u.a f28322c;

        public a(T t10) {
            this.f28321b = g.this.w(null);
            this.f28322c = g.this.u(null);
            this.f28320a = t10;
        }

        private x K(x xVar) {
            long H = g.this.H(this.f28320a, xVar.f28528f);
            long H2 = g.this.H(this.f28320a, xVar.f28529g);
            return (H == xVar.f28528f && H2 == xVar.f28529g) ? xVar : new x(xVar.f28523a, xVar.f28524b, xVar.f28525c, xVar.f28526d, xVar.f28527e, H, H2);
        }

        private boolean s(int i10, a0.b bVar) {
            a0.b bVar2;
            if (bVar != null) {
                bVar2 = g.this.G(this.f28320a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int I = g.this.I(this.f28320a, i10);
            h0.a aVar = this.f28321b;
            if (aVar.f28333a != I || !t8.r0.c(aVar.f28334b, bVar2)) {
                this.f28321b = g.this.v(I, bVar2, 0L);
            }
            u.a aVar2 = this.f28322c;
            if (aVar2.f30566a == I && t8.r0.c(aVar2.f30567b, bVar2)) {
                return true;
            }
            this.f28322c = g.this.t(I, bVar2);
            return true;
        }

        @Override // x6.u
        public void B(int i10, a0.b bVar) {
            if (s(i10, bVar)) {
                this.f28322c.i();
            }
        }

        @Override // x6.u
        public void C(int i10, a0.b bVar) {
            if (s(i10, bVar)) {
                this.f28322c.j();
            }
        }

        @Override // v7.h0
        public void D(int i10, a0.b bVar, u uVar, x xVar) {
            if (s(i10, bVar)) {
                this.f28321b.s(uVar, K(xVar));
            }
        }

        @Override // v7.h0
        public void F(int i10, a0.b bVar, u uVar, x xVar, IOException iOException, boolean z10) {
            if (s(i10, bVar)) {
                this.f28321b.y(uVar, K(xVar), iOException, z10);
            }
        }

        @Override // v7.h0
        public void G(int i10, a0.b bVar, u uVar, x xVar) {
            if (s(i10, bVar)) {
                this.f28321b.B(uVar, K(xVar));
            }
        }

        @Override // x6.u
        public void I(int i10, a0.b bVar, Exception exc) {
            if (s(i10, bVar)) {
                this.f28322c.l(exc);
            }
        }

        @Override // x6.u
        public void J(int i10, a0.b bVar, int i11) {
            if (s(i10, bVar)) {
                this.f28322c.k(i11);
            }
        }

        @Override // x6.u
        public void u(int i10, a0.b bVar) {
            if (s(i10, bVar)) {
                this.f28322c.h();
            }
        }

        @Override // v7.h0
        public void v(int i10, a0.b bVar, x xVar) {
            if (s(i10, bVar)) {
                this.f28321b.j(K(xVar));
            }
        }

        @Override // v7.h0
        public void w(int i10, a0.b bVar, x xVar) {
            if (s(i10, bVar)) {
                this.f28321b.E(K(xVar));
            }
        }

        @Override // v7.h0
        public void x(int i10, a0.b bVar, u uVar, x xVar) {
            if (s(i10, bVar)) {
                this.f28321b.v(uVar, K(xVar));
            }
        }

        @Override // x6.u
        public void y(int i10, a0.b bVar) {
            if (s(i10, bVar)) {
                this.f28322c.m();
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final a0 f28324a;

        /* renamed from: b, reason: collision with root package name */
        public final a0.c f28325b;

        /* renamed from: c, reason: collision with root package name */
        public final g<T>.a f28326c;

        public b(a0 a0Var, a0.c cVar, g<T>.a aVar) {
            this.f28324a = a0Var;
            this.f28325b = cVar;
            this.f28326c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.a
    public void C(s8.m0 m0Var) {
        this.f28319u = m0Var;
        this.f28318t = t8.r0.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.a
    public void E() {
        for (b<T> bVar : this.f28317s.values()) {
            bVar.f28324a.b(bVar.f28325b);
            bVar.f28324a.g(bVar.f28326c);
            bVar.f28324a.q(bVar.f28326c);
        }
        this.f28317s.clear();
    }

    protected abstract a0.b G(T t10, a0.b bVar);

    protected long H(T t10, long j10) {
        return j10;
    }

    protected int I(T t10, int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract void J(T t10, a0 a0Var, d4 d4Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(final T t10, a0 a0Var) {
        t8.a.a(!this.f28317s.containsKey(t10));
        a0.c cVar = new a0.c() { // from class: v7.f
            @Override // v7.a0.c
            public final void a(a0 a0Var2, d4 d4Var) {
                g.this.J(t10, a0Var2, d4Var);
            }
        };
        a aVar = new a(t10);
        this.f28317s.put(t10, new b<>(a0Var, cVar, aVar));
        a0Var.j((Handler) t8.a.e(this.f28318t), aVar);
        a0Var.s((Handler) t8.a.e(this.f28318t), aVar);
        a0Var.a(cVar, this.f28319u, A());
        if (B()) {
            return;
        }
        a0Var.c(cVar);
    }

    @Override // v7.a0
    public void n() {
        Iterator<b<T>> it = this.f28317s.values().iterator();
        while (it.hasNext()) {
            it.next().f28324a.n();
        }
    }

    @Override // v7.a
    protected void y() {
        for (b<T> bVar : this.f28317s.values()) {
            bVar.f28324a.c(bVar.f28325b);
        }
    }

    @Override // v7.a
    protected void z() {
        for (b<T> bVar : this.f28317s.values()) {
            bVar.f28324a.f(bVar.f28325b);
        }
    }
}
