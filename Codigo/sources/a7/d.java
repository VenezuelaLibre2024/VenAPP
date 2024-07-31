package a7;

import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f92a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95d;

    /* renamed from: e, reason: collision with root package name */
    public final int f96e;

    /* renamed from: f, reason: collision with root package name */
    public final int f97f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f92a = i10;
        this.f93b = i11;
        this.f94c = i12;
        this.f95d = i13;
        this.f96e = i14;
        this.f97f = i15;
    }

    public static d c(e0 e0Var) {
        int u10 = e0Var.u();
        e0Var.V(12);
        int u11 = e0Var.u();
        int u12 = e0Var.u();
        int u13 = e0Var.u();
        e0Var.V(4);
        int u14 = e0Var.u();
        int u15 = e0Var.u();
        e0Var.V(8);
        return new d(u10, u11, u12, u13, u14, u15);
    }

    public long a() {
        return r0.O0(this.f96e, this.f94c * 1000000, this.f95d);
    }

    public int b() {
        int i10 = this.f92a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        s.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f92a));
        return -1;
    }

    @Override // a7.a
    public int getType() {
        return 1752331379;
    }
}
