package y6;

import y6.b0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31699a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f31700b;

    /* renamed from: c, reason: collision with root package name */
    private int f31701c;

    /* renamed from: d, reason: collision with root package name */
    private long f31702d;

    /* renamed from: e, reason: collision with root package name */
    private int f31703e;

    /* renamed from: f, reason: collision with root package name */
    private int f31704f;

    /* renamed from: g, reason: collision with root package name */
    private int f31705g;

    public void a(b0 b0Var, b0.a aVar) {
        if (this.f31701c > 0) {
            b0Var.b(this.f31702d, this.f31703e, this.f31704f, this.f31705g, aVar);
            this.f31701c = 0;
        }
    }

    public void b() {
        this.f31700b = false;
        this.f31701c = 0;
    }

    public void c(b0 b0Var, long j10, int i10, int i11, int i12, b0.a aVar) {
        t8.a.h(this.f31705g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f31700b) {
            int i13 = this.f31701c;
            int i14 = i13 + 1;
            this.f31701c = i14;
            if (i13 == 0) {
                this.f31702d = j10;
                this.f31703e = i10;
                this.f31704f = 0;
            }
            this.f31704f += i11;
            this.f31705g = i12;
            if (i14 >= 16) {
                a(b0Var, aVar);
            }
        }
    }

    public void d(l lVar) {
        if (this.f31700b) {
            return;
        }
        lVar.q(this.f31699a, 0, 10);
        lVar.f();
        if (v6.b.j(this.f31699a) == 0) {
            return;
        }
        this.f31700b = true;
    }
}
