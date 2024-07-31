package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.io.EOFException;
import t6.b3;
import y6.z;

/* loaded from: classes.dex */
public final class h implements y6.k {

    /* renamed from: m */
    public static final y6.p f17256m = new y6.p() { // from class: i7.g
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] i10;
            i10 = h.i();
            return i10;
        }
    };

    /* renamed from: a */
    private final int f17257a;

    /* renamed from: b */
    private final i f17258b;

    /* renamed from: c */
    private final t8.e0 f17259c;

    /* renamed from: d */
    private final t8.e0 f17260d;

    /* renamed from: e */
    private final t8.d0 f17261e;

    /* renamed from: f */
    private y6.m f17262f;

    /* renamed from: g */
    private long f17263g;

    /* renamed from: h */
    private long f17264h;

    /* renamed from: i */
    private int f17265i;

    /* renamed from: j */
    private boolean f17266j;

    /* renamed from: k */
    private boolean f17267k;

    /* renamed from: l */
    private boolean f17268l;

    public h() {
        this(0);
    }

    public h(int i10) {
        this.f17257a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f17258b = new i(true);
        this.f17259c = new t8.e0(RecognitionOptions.PDF417);
        this.f17265i = -1;
        this.f17264h = -1L;
        t8.e0 e0Var = new t8.e0(10);
        this.f17260d = e0Var;
        this.f17261e = new t8.d0(e0Var.e());
    }

    private void d(y6.l lVar) {
        if (this.f17266j) {
            return;
        }
        this.f17265i = -1;
        lVar.f();
        long j10 = 0;
        if (lVar.getPosition() == 0) {
            k(lVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (lVar.d(this.f17260d.e(), 0, 2, true)) {
            try {
                this.f17260d.U(0);
                if (!i.m(this.f17260d.N())) {
                    break;
                }
                if (!lVar.d(this.f17260d.e(), 0, 4, true)) {
                    break;
                }
                this.f17261e.p(14);
                int h10 = this.f17261e.h(13);
                if (h10 <= 6) {
                    this.f17266j = true;
                    throw b3.a("Malformed ADTS stream", null);
                }
                j10 += h10;
                i11++;
                if (i11 != 1000 && lVar.p(h10 - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i10 = i11;
        lVar.f();
        if (i10 > 0) {
            this.f17265i = (int) (j10 / i10);
        } else {
            this.f17265i = -1;
        }
        this.f17266j = true;
    }

    private static int g(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private y6.z h(long j10, boolean z10) {
        return new y6.d(j10, this.f17264h, g(this.f17265i, this.f17258b.k()), this.f17265i, z10);
    }

    public static /* synthetic */ y6.k[] i() {
        return new y6.k[]{new h()};
    }

    private void j(long j10, boolean z10) {
        if (this.f17268l) {
            return;
        }
        boolean z11 = (this.f17257a & 1) != 0 && this.f17265i > 0;
        if (z11 && this.f17258b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f17258b.k() == -9223372036854775807L) {
            this.f17262f.p(new z.b(-9223372036854775807L));
        } else {
            this.f17262f.p(h(j10, (this.f17257a & 2) != 0));
        }
        this.f17268l = true;
    }

    private int k(y6.l lVar) {
        int i10 = 0;
        while (true) {
            lVar.q(this.f17260d.e(), 0, 10);
            this.f17260d.U(0);
            if (this.f17260d.K() != 4801587) {
                break;
            }
            this.f17260d.V(3);
            int G = this.f17260d.G();
            i10 += G + 10;
            lVar.k(G);
        }
        lVar.f();
        lVar.k(i10);
        if (this.f17264h == -1) {
            this.f17264h = i10;
        }
        return i10;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f17267k = false;
        this.f17258b.c();
        this.f17263g = j11;
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f17262f = mVar;
        this.f17258b.d(mVar, new i0.d(0, 1));
        mVar.q();
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        int k10 = k(lVar);
        int i10 = k10;
        int i11 = 0;
        int i12 = 0;
        do {
            lVar.q(this.f17260d.e(), 0, 2);
            this.f17260d.U(0);
            if (i.m(this.f17260d.N())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.q(this.f17260d.e(), 0, 4);
                this.f17261e.p(14);
                int h10 = this.f17261e.h(13);
                if (h10 > 6) {
                    lVar.k(h10 - 6);
                    i12 += h10;
                }
            }
            i10++;
            lVar.f();
            lVar.k(i10);
            i11 = 0;
            i12 = 0;
        } while (i10 - k10 < 8192);
        return false;
    }

    @Override // y6.k
    public int f(y6.l lVar, y6.y yVar) {
        t8.a.i(this.f17262f);
        long length = lVar.getLength();
        int i10 = this.f17257a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) {
            d(lVar);
        }
        int read = lVar.read(this.f17259c.e(), 0, RecognitionOptions.PDF417);
        boolean z10 = read == -1;
        j(length, z10);
        if (z10) {
            return -1;
        }
        this.f17259c.U(0);
        this.f17259c.T(read);
        if (!this.f17267k) {
            this.f17258b.f(this.f17263g, 4);
            this.f17267k = true;
        }
        this.f17258b.b(this.f17259c);
        return 0;
    }

    @Override // y6.k
    public void release() {
    }
}
