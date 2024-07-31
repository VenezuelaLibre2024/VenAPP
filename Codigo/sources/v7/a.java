package v7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t6.d4;
import u6.m3;
import v7.a0;
import v7.h0;
import x6.u;

/* loaded from: classes.dex */
public abstract class a implements a0 {

    /* renamed from: a */
    private final ArrayList<a0.c> f28236a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<a0.c> f28237b = new HashSet<>(1);

    /* renamed from: c */
    private final h0.a f28238c = new h0.a();

    /* renamed from: d */
    private final u.a f28239d = new u.a();

    /* renamed from: e */
    private Looper f28240e;

    /* renamed from: f */
    private d4 f28241f;

    /* renamed from: r */
    private m3 f28242r;

    public final m3 A() {
        return (m3) t8.a.i(this.f28242r);
    }

    public final boolean B() {
        return !this.f28237b.isEmpty();
    }

    protected abstract void C(s8.m0 m0Var);

    public final void D(d4 d4Var) {
        this.f28241f = d4Var;
        Iterator<a0.c> it = this.f28236a.iterator();
        while (it.hasNext()) {
            it.next().a(this, d4Var);
        }
    }

    protected abstract void E();

    @Override // v7.a0
    public final void a(a0.c cVar, s8.m0 m0Var, m3 m3Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f28240e;
        t8.a.a(looper == null || looper == myLooper);
        this.f28242r = m3Var;
        d4 d4Var = this.f28241f;
        this.f28236a.add(cVar);
        if (this.f28240e == null) {
            this.f28240e = myLooper;
            this.f28237b.add(cVar);
            C(m0Var);
        } else if (d4Var != null) {
            f(cVar);
            cVar.a(this, d4Var);
        }
    }

    @Override // v7.a0
    public final void b(a0.c cVar) {
        this.f28236a.remove(cVar);
        if (!this.f28236a.isEmpty()) {
            c(cVar);
            return;
        }
        this.f28240e = null;
        this.f28241f = null;
        this.f28242r = null;
        this.f28237b.clear();
        E();
    }

    @Override // v7.a0
    public final void c(a0.c cVar) {
        boolean z10 = !this.f28237b.isEmpty();
        this.f28237b.remove(cVar);
        if (z10 && this.f28237b.isEmpty()) {
            y();
        }
    }

    @Override // v7.a0
    public final void f(a0.c cVar) {
        t8.a.e(this.f28240e);
        boolean isEmpty = this.f28237b.isEmpty();
        this.f28237b.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    @Override // v7.a0
    public final void g(h0 h0Var) {
        this.f28238c.C(h0Var);
    }

    @Override // v7.a0
    public final void j(Handler handler, h0 h0Var) {
        t8.a.e(handler);
        t8.a.e(h0Var);
        this.f28238c.g(handler, h0Var);
    }

    @Override // v7.a0
    public final void q(x6.u uVar) {
        this.f28239d.t(uVar);
    }

    @Override // v7.a0
    public final void s(Handler handler, x6.u uVar) {
        t8.a.e(handler);
        t8.a.e(uVar);
        this.f28239d.g(handler, uVar);
    }

    public final u.a t(int i10, a0.b bVar) {
        return this.f28239d.u(i10, bVar);
    }

    public final u.a u(a0.b bVar) {
        return this.f28239d.u(0, bVar);
    }

    public final h0.a v(int i10, a0.b bVar, long j10) {
        return this.f28238c.F(i10, bVar, j10);
    }

    public final h0.a w(a0.b bVar) {
        return this.f28238c.F(0, bVar, 0L);
    }

    public final h0.a x(a0.b bVar, long j10) {
        t8.a.e(bVar);
        return this.f28238c.F(0, bVar, j10);
    }

    protected void y() {
    }

    protected void z() {
    }
}
