package p176j8;

import android.graphics.Bitmap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p120g8.AbstractC7490h;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: j8.a */
/* loaded from: classes.dex */
public final class C8997a extends AbstractC7490h {

    /* renamed from: o */
    private final C11146e0 f21587o;

    /* renamed from: p */
    private final C11146e0 f21588p;

    /* renamed from: q */
    private final a f21589q;

    /* renamed from: r */
    private Inflater f21590r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j8.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C11146e0 f21591a = new C11146e0();

        /* renamed from: b */
        private final int[] f21592b = new int[RecognitionOptions.QR_CODE];

        /* renamed from: c */
        private boolean f21593c;

        /* renamed from: d */
        private int f21594d;

        /* renamed from: e */
        private int f21595e;

        /* renamed from: f */
        private int f21596f;

        /* renamed from: g */
        private int f21597g;

        /* renamed from: h */
        private int f21598h;

        /* renamed from: i */
        private int f21599i;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m26416e(C11146e0 c11146e0, int i10) {
            int m34667K;
            if (i10 < 4) {
                return;
            }
            c11146e0.m34678V(3);
            int i11 = i10 - 4;
            if ((c11146e0.m34664H() & RecognitionOptions.ITF) != 0) {
                if (i11 < 7 || (m34667K = c11146e0.m34667K()) < 4) {
                    return;
                }
                this.f21598h = c11146e0.m34670N();
                this.f21599i = c11146e0.m34670N();
                this.f21591a.m34673Q(m34667K - 4);
                i11 -= 7;
            }
            int m34683f = this.f21591a.m34683f();
            int m34684g = this.f21591a.m34684g();
            if (m34683f >= m34684g || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, m34684g - m34683f);
            c11146e0.m34688l(this.f21591a.m34682e(), m34683f, min);
            this.f21591a.m34677U(m34683f + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m26417f(C11146e0 c11146e0, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f21594d = c11146e0.m34670N();
            this.f21595e = c11146e0.m34670N();
            c11146e0.m34678V(11);
            this.f21596f = c11146e0.m34670N();
            this.f21597g = c11146e0.m34670N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m26418g(C11146e0 c11146e0, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            c11146e0.m34678V(2);
            Arrays.fill(this.f21592b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int m34664H = c11146e0.m34664H();
                int m34664H2 = c11146e0.m34664H();
                int m34664H3 = c11146e0.m34664H();
                int m34664H4 = c11146e0.m34664H();
                double d10 = m34664H2;
                double d11 = m34664H3 - 128;
                double d12 = m34664H4 - 128;
                this.f21592b[m34664H] = (C11172r0.m34942q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (c11146e0.m34664H() << 24) | (C11172r0.m34942q((int) ((1.402d * d11) + d10), 0, 255) << 16) | C11172r0.m34942q((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f21593c = true;
        }

        /* renamed from: d */
        public C7484b m26419d() {
            int i10;
            if (this.f21594d == 0 || this.f21595e == 0 || this.f21598h == 0 || this.f21599i == 0 || this.f21591a.m34684g() == 0 || this.f21591a.m34683f() != this.f21591a.m34684g() || !this.f21593c) {
                return null;
            }
            this.f21591a.m34677U(0);
            int i11 = this.f21598h * this.f21599i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int m34664H = this.f21591a.m34664H();
                if (m34664H != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f21592b[m34664H];
                } else {
                    int m34664H2 = this.f21591a.m34664H();
                    if (m34664H2 != 0) {
                        i10 = ((m34664H2 & 64) == 0 ? m34664H2 & 63 : ((m34664H2 & 63) << 8) | this.f21591a.m34664H()) + i12;
                        Arrays.fill(iArr, i12, i10, (m34664H2 & RecognitionOptions.ITF) == 0 ? 0 : this.f21592b[this.f21591a.m34664H()]);
                    }
                }
                i12 = i10;
            }
            return new C7484b.b().m22769f(Bitmap.createBitmap(iArr, this.f21598h, this.f21599i, Bitmap.Config.ARGB_8888)).m22774k(this.f21596f / this.f21594d).m22775l(0).m22771h(this.f21597g / this.f21595e, 0).m22772i(0).m22777n(this.f21598h / this.f21594d).m22770g(this.f21599i / this.f21595e).m22764a();
        }

        /* renamed from: h */
        public void m26420h() {
            this.f21594d = 0;
            this.f21595e = 0;
            this.f21596f = 0;
            this.f21597g = 0;
            this.f21598h = 0;
            this.f21599i = 0;
            this.f21591a.m34673Q(0);
            this.f21593c = false;
        }
    }

    public C8997a() {
        super("PgsDecoder");
        this.f21587o = new C11146e0();
        this.f21588p = new C11146e0();
        this.f21589q = new a();
    }

    /* renamed from: B */
    private void m26411B(C11146e0 c11146e0) {
        if (c11146e0.m34679a() <= 0 || c11146e0.m34686j() != 120) {
            return;
        }
        if (this.f21590r == null) {
            this.f21590r = new Inflater();
        }
        if (C11172r0.m34943q0(c11146e0, this.f21588p, this.f21590r)) {
            c11146e0.m34675S(this.f21588p.m34682e(), this.f21588p.m34684g());
        }
    }

    /* renamed from: C */
    private static C7484b m26412C(C11146e0 c11146e0, a aVar) {
        int m34684g = c11146e0.m34684g();
        int m34664H = c11146e0.m34664H();
        int m34670N = c11146e0.m34670N();
        int m34683f = c11146e0.m34683f() + m34670N;
        C7484b c7484b = null;
        if (m34683f > m34684g) {
            c11146e0.m34677U(m34684g);
            return null;
        }
        if (m34664H != 128) {
            switch (m34664H) {
                case 20:
                    aVar.m26418g(c11146e0, m34670N);
                    break;
                case 21:
                    aVar.m26416e(c11146e0, m34670N);
                    break;
                case 22:
                    aVar.m26417f(c11146e0, m34670N);
                    break;
            }
        } else {
            c7484b = aVar.m26419d();
            aVar.m26420h();
        }
        c11146e0.m34677U(m34683f);
        return c7484b;
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        this.f21587o.m34675S(bArr, i10);
        m26411B(this.f21587o);
        this.f21589q.m26420h();
        ArrayList arrayList = new ArrayList();
        while (this.f21587o.m34679a() >= 3) {
            C7484b m26412C = m26412C(this.f21587o, this.f21589q);
            if (m26412C != null) {
                arrayList.add(m26412C);
            }
        }
        return new C8998b(Collections.unmodifiableList(arrayList));
    }
}
