package j8;

import android.graphics.Bitmap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g8.b;
import g8.h;
import g8.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: o, reason: collision with root package name */
    private final e0 f19808o;

    /* renamed from: p, reason: collision with root package name */
    private final e0 f19809p;

    /* renamed from: q, reason: collision with root package name */
    private final C0311a f19810q;

    /* renamed from: r, reason: collision with root package name */
    private Inflater f19811r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j8.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0311a {

        /* renamed from: a, reason: collision with root package name */
        private final e0 f19812a = new e0();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f19813b = new int[RecognitionOptions.QR_CODE];

        /* renamed from: c, reason: collision with root package name */
        private boolean f19814c;

        /* renamed from: d, reason: collision with root package name */
        private int f19815d;

        /* renamed from: e, reason: collision with root package name */
        private int f19816e;

        /* renamed from: f, reason: collision with root package name */
        private int f19817f;

        /* renamed from: g, reason: collision with root package name */
        private int f19818g;

        /* renamed from: h, reason: collision with root package name */
        private int f19819h;

        /* renamed from: i, reason: collision with root package name */
        private int f19820i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(e0 e0Var, int i10) {
            int K;
            if (i10 < 4) {
                return;
            }
            e0Var.V(3);
            int i11 = i10 - 4;
            if ((e0Var.H() & RecognitionOptions.ITF) != 0) {
                if (i11 < 7 || (K = e0Var.K()) < 4) {
                    return;
                }
                this.f19819h = e0Var.N();
                this.f19820i = e0Var.N();
                this.f19812a.Q(K - 4);
                i11 -= 7;
            }
            int f10 = this.f19812a.f();
            int g10 = this.f19812a.g();
            if (f10 >= g10 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, g10 - f10);
            e0Var.l(this.f19812a.e(), f10, min);
            this.f19812a.U(f10 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(e0 e0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f19815d = e0Var.N();
            this.f19816e = e0Var.N();
            e0Var.V(11);
            this.f19817f = e0Var.N();
            this.f19818g = e0Var.N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(e0 e0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            e0Var.V(2);
            Arrays.fill(this.f19813b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int H = e0Var.H();
                int H2 = e0Var.H();
                int H3 = e0Var.H();
                int H4 = e0Var.H();
                double d10 = H2;
                double d11 = H3 - 128;
                double d12 = H4 - 128;
                this.f19813b[H] = (r0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (e0Var.H() << 24) | (r0.q((int) ((1.402d * d11) + d10), 0, 255) << 16) | r0.q((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f19814c = true;
        }

        public g8.b d() {
            int i10;
            if (this.f19815d == 0 || this.f19816e == 0 || this.f19819h == 0 || this.f19820i == 0 || this.f19812a.g() == 0 || this.f19812a.f() != this.f19812a.g() || !this.f19814c) {
                return null;
            }
            this.f19812a.U(0);
            int i11 = this.f19819h * this.f19820i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int H = this.f19812a.H();
                if (H != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f19813b[H];
                } else {
                    int H2 = this.f19812a.H();
                    if (H2 != 0) {
                        i10 = ((H2 & 64) == 0 ? H2 & 63 : ((H2 & 63) << 8) | this.f19812a.H()) + i12;
                        Arrays.fill(iArr, i12, i10, (H2 & RecognitionOptions.ITF) == 0 ? 0 : this.f19813b[this.f19812a.H()]);
                    }
                }
                i12 = i10;
            }
            return new b.C0262b().f(Bitmap.createBitmap(iArr, this.f19819h, this.f19820i, Bitmap.Config.ARGB_8888)).k(this.f19817f / this.f19815d).l(0).h(this.f19818g / this.f19816e, 0).i(0).n(this.f19819h / this.f19815d).g(this.f19820i / this.f19816e).a();
        }

        public void h() {
            this.f19815d = 0;
            this.f19816e = 0;
            this.f19817f = 0;
            this.f19818g = 0;
            this.f19819h = 0;
            this.f19820i = 0;
            this.f19812a.Q(0);
            this.f19814c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f19808o = new e0();
        this.f19809p = new e0();
        this.f19810q = new C0311a();
    }

    private void B(e0 e0Var) {
        if (e0Var.a() <= 0 || e0Var.j() != 120) {
            return;
        }
        if (this.f19811r == null) {
            this.f19811r = new Inflater();
        }
        if (r0.q0(e0Var, this.f19809p, this.f19811r)) {
            e0Var.S(this.f19809p.e(), this.f19809p.g());
        }
    }

    private static g8.b C(e0 e0Var, C0311a c0311a) {
        int g10 = e0Var.g();
        int H = e0Var.H();
        int N = e0Var.N();
        int f10 = e0Var.f() + N;
        g8.b bVar = null;
        if (f10 > g10) {
            e0Var.U(g10);
            return null;
        }
        if (H != 128) {
            switch (H) {
                case 20:
                    c0311a.g(e0Var, N);
                    break;
                case 21:
                    c0311a.e(e0Var, N);
                    break;
                case 22:
                    c0311a.f(e0Var, N);
                    break;
            }
        } else {
            bVar = c0311a.d();
            c0311a.h();
        }
        e0Var.U(f10);
        return bVar;
    }

    @Override // g8.h
    protected i z(byte[] bArr, int i10, boolean z10) {
        this.f19808o.S(bArr, i10);
        B(this.f19808o);
        this.f19810q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f19808o.a() >= 3) {
            g8.b C = C(this.f19808o, this.f19810q);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
