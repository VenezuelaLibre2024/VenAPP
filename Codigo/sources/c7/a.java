package c7;

import c7.e;
import java.util.Collections;
import t6.u1;
import t8.e0;
import v6.a;
import y6.b0;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6871e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f6872b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6873c;

    /* renamed from: d, reason: collision with root package name */
    private int f6874d;

    public a(b0 b0Var) {
        super(b0Var);
    }

    @Override // c7.e
    protected boolean b(e0 e0Var) {
        u1.b h02;
        if (this.f6872b) {
            e0Var.V(1);
        } else {
            int H = e0Var.H();
            int i10 = (H >> 4) & 15;
            this.f6874d = i10;
            if (i10 == 2) {
                h02 = new u1.b().g0("audio/mpeg").J(1).h0(f6871e[(H >> 2) & 3]);
            } else if (i10 == 7 || i10 == 8) {
                h02 = new u1.b().g0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(8000);
            } else {
                if (i10 != 10) {
                    throw new e.a("Audio format not supported: " + this.f6874d);
                }
                this.f6872b = true;
            }
            this.f6895a.c(h02.G());
            this.f6873c = true;
            this.f6872b = true;
        }
        return true;
    }

    @Override // c7.e
    protected boolean c(e0 e0Var, long j10) {
        if (this.f6874d == 2) {
            int a10 = e0Var.a();
            this.f6895a.a(e0Var, a10);
            this.f6895a.b(j10, 1, a10, 0, null);
            return true;
        }
        int H = e0Var.H();
        if (H != 0 || this.f6873c) {
            if (this.f6874d == 10 && H != 1) {
                return false;
            }
            int a11 = e0Var.a();
            this.f6895a.a(e0Var, a11);
            this.f6895a.b(j10, 1, a11, 0, null);
            return true;
        }
        int a12 = e0Var.a();
        byte[] bArr = new byte[a12];
        e0Var.l(bArr, 0, a12);
        a.b f10 = v6.a.f(bArr);
        this.f6895a.c(new u1.b().g0("audio/mp4a-latm").K(f10.f27942c).J(f10.f27941b).h0(f10.f27940a).V(Collections.singletonList(bArr)).G());
        this.f6873c = true;
        return false;
    }
}
