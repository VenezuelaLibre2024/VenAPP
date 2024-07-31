package z6;

import java.io.EOFException;
import java.util.Arrays;
import t6.b3;
import t6.u1;
import t8.r0;
import y6.b0;
import y6.d;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f32330r;

    /* renamed from: u, reason: collision with root package name */
    private static final int f32333u;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f32334a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32335b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32336c;

    /* renamed from: d, reason: collision with root package name */
    private long f32337d;

    /* renamed from: e, reason: collision with root package name */
    private int f32338e;

    /* renamed from: f, reason: collision with root package name */
    private int f32339f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32340g;

    /* renamed from: h, reason: collision with root package name */
    private long f32341h;

    /* renamed from: i, reason: collision with root package name */
    private int f32342i;

    /* renamed from: j, reason: collision with root package name */
    private int f32343j;

    /* renamed from: k, reason: collision with root package name */
    private long f32344k;

    /* renamed from: l, reason: collision with root package name */
    private m f32345l;

    /* renamed from: m, reason: collision with root package name */
    private b0 f32346m;

    /* renamed from: n, reason: collision with root package name */
    private z f32347n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f32348o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f32328p = new p() { // from class: z6.a
        @Override // y6.p
        public final k[] c() {
            k[] m10;
            m10 = b.m();
            return m10;
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f32329q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f32331s = r0.m0("#!AMR\n");

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f32332t = r0.m0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f32330r = iArr;
        f32333u = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f32335b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f32334a = new byte[1];
        this.f32342i = -1;
    }

    private void d() {
        t8.a.i(this.f32346m);
        r0.j(this.f32345l);
    }

    private static int g(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private z h(long j10, boolean z10) {
        return new d(j10, this.f32341h, g(this.f32342i, 20000L), this.f32342i, z10);
    }

    private int i(int i10) {
        if (k(i10)) {
            return this.f32336c ? f32330r[i10] : f32329q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f32336c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw b3.a(sb2.toString(), null);
    }

    private boolean j(int i10) {
        return !this.f32336c && (i10 < 12 || i10 > 14);
    }

    private boolean k(int i10) {
        return i10 >= 0 && i10 <= 15 && (l(i10) || j(i10));
    }

    private boolean l(int i10) {
        return this.f32336c && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] m() {
        return new k[]{new b()};
    }

    private void n() {
        if (this.f32348o) {
            return;
        }
        this.f32348o = true;
        boolean z10 = this.f32336c;
        this.f32346m.c(new u1.b().g0(z10 ? "audio/amr-wb" : "audio/3gpp").Y(f32333u).J(1).h0(z10 ? 16000 : 8000).G());
    }

    private void o(long j10, int i10) {
        z bVar;
        int i11;
        if (this.f32340g) {
            return;
        }
        int i12 = this.f32335b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f32342i) == -1 || i11 == this.f32338e)) {
            bVar = new z.b(-9223372036854775807L);
        } else if (this.f32343j < 20 && i10 != -1) {
            return;
        } else {
            bVar = h(j10, (i12 & 2) != 0);
        }
        this.f32347n = bVar;
        this.f32345l.p(bVar);
        this.f32340g = true;
    }

    private static boolean p(l lVar, byte[] bArr) {
        lVar.f();
        byte[] bArr2 = new byte[bArr.length];
        lVar.q(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(l lVar) {
        lVar.f();
        lVar.q(this.f32334a, 0, 1);
        byte b10 = this.f32334a[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        throw b3.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean r(l lVar) {
        int length;
        byte[] bArr = f32331s;
        if (p(lVar, bArr)) {
            this.f32336c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f32332t;
            if (!p(lVar, bArr2)) {
                return false;
            }
            this.f32336c = true;
            length = bArr2.length;
        }
        lVar.n(length);
        return true;
    }

    private int s(l lVar) {
        if (this.f32339f == 0) {
            try {
                int q10 = q(lVar);
                this.f32338e = q10;
                this.f32339f = q10;
                if (this.f32342i == -1) {
                    this.f32341h = lVar.getPosition();
                    this.f32342i = this.f32338e;
                }
                if (this.f32342i == this.f32338e) {
                    this.f32343j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int f10 = this.f32346m.f(lVar, this.f32339f, true);
        if (f10 == -1) {
            return -1;
        }
        int i10 = this.f32339f - f10;
        this.f32339f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f32346m.b(this.f32344k + this.f32337d, 1, this.f32338e, 0, null);
        this.f32337d += 20000;
        return 0;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f32337d = 0L;
        this.f32338e = 0;
        this.f32339f = 0;
        if (j10 != 0) {
            z zVar = this.f32347n;
            if (zVar instanceof d) {
                this.f32344k = ((d) zVar).b(j10);
                return;
            }
        }
        this.f32344k = 0L;
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f32345l = mVar;
        this.f32346m = mVar.d(0, 1);
        mVar.q();
    }

    @Override // y6.k
    public boolean e(l lVar) {
        return r(lVar);
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        d();
        if (lVar.getPosition() == 0 && !r(lVar)) {
            throw b3.a("Could not find AMR header.", null);
        }
        n();
        int s10 = s(lVar);
        o(lVar.getLength(), s10);
        return s10;
    }

    @Override // y6.k
    public void release() {
    }
}
