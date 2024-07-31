package a7;

import t8.e0;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f88a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91d;

    private c(int i10, int i11, int i12, int i13) {
        this.f88a = i10;
        this.f89b = i11;
        this.f90c = i12;
        this.f91d = i13;
    }

    public static c b(e0 e0Var) {
        int u10 = e0Var.u();
        e0Var.V(8);
        int u11 = e0Var.u();
        int u12 = e0Var.u();
        e0Var.V(4);
        int u13 = e0Var.u();
        e0Var.V(12);
        return new c(u10, u11, u12, u13);
    }

    public boolean a() {
        return (this.f89b & 16) == 16;
    }

    @Override // a7.a
    public int getType() {
        return 1751742049;
    }
}
