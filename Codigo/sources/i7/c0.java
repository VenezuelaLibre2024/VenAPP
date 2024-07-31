package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import t8.n0;
import t8.r0;

/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f17218a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17219b = new t8.e0(32);

    /* renamed from: c, reason: collision with root package name */
    private int f17220c;

    /* renamed from: d, reason: collision with root package name */
    private int f17221d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17222e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17223f;

    public c0(b0 b0Var) {
        this.f17218a = b0Var;
    }

    @Override // i7.i0
    public void a(n0 n0Var, y6.m mVar, i0.d dVar) {
        this.f17218a.a(n0Var, mVar, dVar);
        this.f17223f = true;
    }

    @Override // i7.i0
    public void b(t8.e0 e0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int f10 = z10 ? e0Var.f() + e0Var.H() : -1;
        if (this.f17223f) {
            if (!z10) {
                return;
            }
            this.f17223f = false;
            e0Var.U(f10);
            this.f17221d = 0;
        }
        while (e0Var.a() > 0) {
            int i11 = this.f17221d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int H = e0Var.H();
                    e0Var.U(e0Var.f() - 1);
                    if (H == 255) {
                        this.f17223f = true;
                        return;
                    }
                }
                int min = Math.min(e0Var.a(), 3 - this.f17221d);
                e0Var.l(this.f17219b.e(), this.f17221d, min);
                int i12 = this.f17221d + min;
                this.f17221d = i12;
                if (i12 == 3) {
                    this.f17219b.U(0);
                    this.f17219b.T(3);
                    this.f17219b.V(1);
                    int H2 = this.f17219b.H();
                    int H3 = this.f17219b.H();
                    this.f17222e = (H2 & RecognitionOptions.ITF) != 0;
                    this.f17220c = (((H2 & 15) << 8) | H3) + 3;
                    int b10 = this.f17219b.b();
                    int i13 = this.f17220c;
                    if (b10 < i13) {
                        this.f17219b.c(Math.min(4098, Math.max(i13, this.f17219b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(e0Var.a(), this.f17220c - this.f17221d);
                e0Var.l(this.f17219b.e(), this.f17221d, min2);
                int i14 = this.f17221d + min2;
                this.f17221d = i14;
                int i15 = this.f17220c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f17222e) {
                        this.f17219b.T(i15);
                    } else {
                        if (r0.t(this.f17219b.e(), 0, this.f17220c, -1) != 0) {
                            this.f17223f = true;
                            return;
                        }
                        this.f17219b.T(this.f17220c - 4);
                    }
                    this.f17219b.U(0);
                    this.f17218a.b(this.f17219b);
                    this.f17221d = 0;
                }
            }
        }
    }

    @Override // i7.i0
    public void c() {
        this.f17223f = true;
    }
}
