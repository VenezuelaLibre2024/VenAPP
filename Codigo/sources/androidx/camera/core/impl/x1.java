package androidx.camera.core.impl;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class x1 extends a1 {

    /* renamed from: b, reason: collision with root package name */
    private final b0 f2669b;

    /* renamed from: c, reason: collision with root package name */
    private final w1 f2670c;

    public x1(b0 b0Var, w1 w1Var) {
        super(b0Var);
        this.f2669b = b0Var;
        this.f2670c = w1Var;
    }

    @Override // w.o
    public boolean d() {
        if (this.f2670c.l(5)) {
            return this.f2669b.d();
        }
        return false;
    }

    @Override // w.o
    public LiveData<Integer> g() {
        return !this.f2670c.l(6) ? new androidx.lifecycle.r(0) : this.f2669b.g();
    }

    @Override // androidx.camera.core.impl.b0
    public b0 h() {
        return this.f2669b;
    }

    @Override // w.o
    public LiveData<w.k1> j() {
        return !this.f2670c.l(0) ? new androidx.lifecycle.r(b0.f.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f2669b.j();
    }
}
