package s8;

import java.util.ArrayList;
import t8.r0;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25238a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<m0> f25239b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f25240c;

    /* renamed from: d, reason: collision with root package name */
    private n f25241d;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(boolean z10) {
        this.f25238a = z10;
    }

    @Override // s8.j
    public final void l(m0 m0Var) {
        t8.a.e(m0Var);
        if (this.f25239b.contains(m0Var)) {
            return;
        }
        this.f25239b.add(m0Var);
        this.f25240c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(int i10) {
        n nVar = (n) r0.j(this.f25241d);
        for (int i11 = 0; i11 < this.f25240c; i11++) {
            this.f25239b.get(i11).a(this, nVar, this.f25238a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        n nVar = (n) r0.j(this.f25241d);
        for (int i10 = 0; i10 < this.f25240c; i10++) {
            this.f25239b.get(i10).c(this, nVar, this.f25238a);
        }
        this.f25241d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(n nVar) {
        for (int i10 = 0; i10 < this.f25240c; i10++) {
            this.f25239b.get(i10).f(this, nVar, this.f25238a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(n nVar) {
        this.f25241d = nVar;
        for (int i10 = 0; i10 < this.f25240c; i10++) {
            this.f25239b.get(i10).i(this, nVar, this.f25238a);
        }
    }
}
