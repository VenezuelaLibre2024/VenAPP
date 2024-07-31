package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class n1<T, B> {
    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b10, int i10, g gVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t10, T t11);

    final void l(B b10, f1 f1Var) {
        while (f1Var.A() != Integer.MAX_VALUE && m(b10, f1Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b10, f1 f1Var) {
        int a10 = f1Var.a();
        int a11 = t1.a(a10);
        int b11 = t1.b(a10);
        if (b11 == 0) {
            e(b10, a11, f1Var.H());
            return true;
        }
        if (b11 == 1) {
            b(b10, a11, f1Var.b());
            return true;
        }
        if (b11 == 2) {
            d(b10, a11, f1Var.o());
            return true;
        }
        if (b11 != 3) {
            if (b11 == 4) {
                return false;
            }
            if (b11 != 5) {
                throw b0.e();
            }
            a(b10, a11, f1Var.u());
            return true;
        }
        B n10 = n();
        int c10 = t1.c(a11, 4);
        l(n10, f1Var);
        if (c10 != f1Var.a()) {
            throw b0.b();
        }
        c(b10, a11, r(n10));
        return true;
    }

    abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(f1 f1Var);

    abstract T r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t10, u1 u1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t10, u1 u1Var);
}
