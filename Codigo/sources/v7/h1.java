package v7;

import t6.c2;
import t6.d4;
import v7.a0;

/* loaded from: classes.dex */
public abstract class h1 extends g<Void> {

    /* renamed from: w, reason: collision with root package name */
    private static final Void f28339w = null;

    /* renamed from: v, reason: collision with root package name */
    protected final a0 f28340v;

    /* JADX INFO: Access modifiers changed from: protected */
    public h1(a0 a0Var) {
        this.f28340v = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g, v7.a
    public final void C(s8.m0 m0Var) {
        super.C(m0Var);
        V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final a0.b G(Void r12, a0.b bVar) {
        return N(bVar);
    }

    protected a0.b N(a0.b bVar) {
        return bVar;
    }

    protected long O(long j10) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long H(Void r12, long j10) {
        return O(j10);
    }

    protected int Q(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int I(Void r12, int i10) {
        return Q(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J(Void r12, a0 a0Var, d4 d4Var) {
        T(d4Var);
    }

    protected abstract void T(d4 d4Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U() {
        L(f28339w, this.f28340v);
    }

    protected void V() {
        U();
    }

    @Override // v7.a0
    public c2 d() {
        return this.f28340v.d();
    }

    @Override // v7.a0
    public boolean o() {
        return this.f28340v.o();
    }

    @Override // v7.a0
    public d4 p() {
        return this.f28340v.p();
    }
}
