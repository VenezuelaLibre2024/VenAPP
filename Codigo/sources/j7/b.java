package j7;

import android.util.Pair;
import io.flutter.embedding.android.KeyboardMap;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.r0;
import t8.s;
import v6.z0;
import y6.b0;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.y;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final p f19764h = new p() { // from class: j7.a
        @Override // y6.p
        public final k[] c() {
            k[] g10;
            g10 = b.g();
            return g10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private m f19765a;

    /* renamed from: b, reason: collision with root package name */
    private b0 f19766b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0310b f19769e;

    /* renamed from: c, reason: collision with root package name */
    private int f19767c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f19768d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f19770f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f19771g = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0310b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f19772m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f19773n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final m f19774a;

        /* renamed from: b, reason: collision with root package name */
        private final b0 f19775b;

        /* renamed from: c, reason: collision with root package name */
        private final j7.c f19776c;

        /* renamed from: d, reason: collision with root package name */
        private final int f19777d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f19778e;

        /* renamed from: f, reason: collision with root package name */
        private final e0 f19779f;

        /* renamed from: g, reason: collision with root package name */
        private final int f19780g;

        /* renamed from: h, reason: collision with root package name */
        private final u1 f19781h;

        /* renamed from: i, reason: collision with root package name */
        private int f19782i;

        /* renamed from: j, reason: collision with root package name */
        private long f19783j;

        /* renamed from: k, reason: collision with root package name */
        private int f19784k;

        /* renamed from: l, reason: collision with root package name */
        private long f19785l;

        public a(m mVar, b0 b0Var, j7.c cVar) {
            this.f19774a = mVar;
            this.f19775b = b0Var;
            this.f19776c = cVar;
            int max = Math.max(1, cVar.f19796c / 10);
            this.f19780g = max;
            e0 e0Var = new e0(cVar.f19800g);
            e0Var.z();
            int z10 = e0Var.z();
            this.f19777d = z10;
            int i10 = cVar.f19795b;
            int i11 = (((cVar.f19798e - (i10 * 4)) * 8) / (cVar.f19799f * i10)) + 1;
            if (z10 == i11) {
                int l10 = r0.l(max, z10);
                this.f19778e = new byte[cVar.f19798e * l10];
                this.f19779f = new e0(l10 * h(z10, i10));
                int i12 = ((cVar.f19796c * cVar.f19798e) * 8) / z10;
                this.f19781h = new u1.b().g0("audio/raw").I(i12).b0(i12).Y(h(max, i10)).J(cVar.f19795b).h0(cVar.f19796c).a0(2).G();
                return;
            }
            throw b3.a("Expected frames per block: " + i11 + "; got: " + z10, null);
        }

        private void d(byte[] bArr, int i10, e0 e0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f19776c.f19795b; i12++) {
                    e(bArr, i11, i12, e0Var.e());
                }
            }
            int g10 = g(this.f19777d * i10);
            e0Var.U(0);
            e0Var.T(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            j7.c cVar = this.f19776c;
            int i12 = cVar.f19798e;
            int i13 = cVar.f19795b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f19773n[min];
            int i19 = ((i10 * this.f19777d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = r0.q(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f19772m[i22];
                int[] iArr = f19773n;
                min = r0.q(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f19776c.f19795b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f19776c.f19795b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long O0 = this.f19783j + r0.O0(this.f19785l, 1000000L, this.f19776c.f19796c);
            int g10 = g(i10);
            this.f19775b.b(O0, 1, g10, this.f19784k - g10, null);
            this.f19785l += i10;
            this.f19784k -= g10;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // j7.b.InterfaceC0310b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(y6.l r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f19780g
                int r1 = r6.f19784k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f19777d
                int r0 = t8.r0.l(r0, r1)
                j7.c r1 = r6.f19776c
                int r1 = r1.f19798e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f19782i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f19778e
                int r5 = r6.f19782i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f19782i
                int r4 = r4 + r3
                r6.f19782i = r4
                goto L1e
            L3e:
                int r7 = r6.f19782i
                j7.c r8 = r6.f19776c
                int r8 = r8.f19798e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f19778e
                t8.e0 r9 = r6.f19779f
                r6.d(r8, r7, r9)
                int r8 = r6.f19782i
                j7.c r9 = r6.f19776c
                int r9 = r9.f19798e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f19782i = r8
                t8.e0 r7 = r6.f19779f
                int r7 = r7.g()
                y6.b0 r8 = r6.f19775b
                t8.e0 r9 = r6.f19779f
                r8.a(r9, r7)
                int r8 = r6.f19784k
                int r8 = r8 + r7
                r6.f19784k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f19780g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f19784k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j7.b.a.a(y6.l, long):boolean");
        }

        @Override // j7.b.InterfaceC0310b
        public void b(int i10, long j10) {
            this.f19774a.p(new e(this.f19776c, this.f19777d, i10, j10));
            this.f19775b.c(this.f19781h);
        }

        @Override // j7.b.InterfaceC0310b
        public void c(long j10) {
            this.f19782i = 0;
            this.f19783j = j10;
            this.f19784k = 0;
            this.f19785l = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0310b {
        boolean a(l lVar, long j10);

        void b(int i10, long j10);

        void c(long j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC0310b {

        /* renamed from: a, reason: collision with root package name */
        private final m f19786a;

        /* renamed from: b, reason: collision with root package name */
        private final b0 f19787b;

        /* renamed from: c, reason: collision with root package name */
        private final j7.c f19788c;

        /* renamed from: d, reason: collision with root package name */
        private final u1 f19789d;

        /* renamed from: e, reason: collision with root package name */
        private final int f19790e;

        /* renamed from: f, reason: collision with root package name */
        private long f19791f;

        /* renamed from: g, reason: collision with root package name */
        private int f19792g;

        /* renamed from: h, reason: collision with root package name */
        private long f19793h;

        public c(m mVar, b0 b0Var, j7.c cVar, String str, int i10) {
            this.f19786a = mVar;
            this.f19787b = b0Var;
            this.f19788c = cVar;
            int i11 = (cVar.f19795b * cVar.f19799f) / 8;
            if (cVar.f19798e == i11) {
                int i12 = cVar.f19796c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f19790e = max;
                this.f19789d = new u1.b().g0(str).I(i13).b0(i13).Y(max).J(cVar.f19795b).h0(cVar.f19796c).a0(i10).G();
                return;
            }
            throw b3.a("Expected block size: " + i11 + "; got: " + cVar.f19798e, null);
        }

        @Override // j7.b.InterfaceC0310b
        public boolean a(l lVar, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f19792g) < (i11 = this.f19790e)) {
                int f10 = this.f19787b.f(lVar, (int) Math.min(i11 - i10, j11), true);
                if (f10 == -1) {
                    j11 = 0;
                } else {
                    this.f19792g += f10;
                    j11 -= f10;
                }
            }
            int i12 = this.f19788c.f19798e;
            int i13 = this.f19792g / i12;
            if (i13 > 0) {
                long O0 = this.f19791f + r0.O0(this.f19793h, 1000000L, r1.f19796c);
                int i14 = i13 * i12;
                int i15 = this.f19792g - i14;
                this.f19787b.b(O0, 1, i14, i15, null);
                this.f19793h += i13;
                this.f19792g = i15;
            }
            return j11 <= 0;
        }

        @Override // j7.b.InterfaceC0310b
        public void b(int i10, long j10) {
            this.f19786a.p(new e(this.f19788c, 1, i10, j10));
            this.f19787b.c(this.f19789d);
        }

        @Override // j7.b.InterfaceC0310b
        public void c(long j10) {
            this.f19791f = j10;
            this.f19792g = 0;
            this.f19793h = 0L;
        }
    }

    private void d() {
        t8.a.i(this.f19766b);
        r0.j(this.f19765a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] g() {
        return new k[]{new b()};
    }

    private void h(l lVar) {
        t8.a.g(lVar.getPosition() == 0);
        int i10 = this.f19770f;
        if (i10 != -1) {
            lVar.n(i10);
            this.f19767c = 4;
        } else {
            if (!d.a(lVar)) {
                throw b3.a("Unsupported or unrecognized wav file type.", null);
            }
            lVar.n((int) (lVar.i() - lVar.getPosition()));
            this.f19767c = 1;
        }
    }

    private void i(l lVar) {
        InterfaceC0310b cVar;
        j7.c b10 = d.b(lVar);
        int i10 = b10.f19794a;
        if (i10 == 17) {
            cVar = new a(this.f19765a, this.f19766b, b10);
        } else if (i10 == 6) {
            cVar = new c(this.f19765a, this.f19766b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            cVar = new c(this.f19765a, this.f19766b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = z0.a(i10, b10.f19799f);
            if (a10 == 0) {
                throw b3.e("Unsupported WAV format type: " + b10.f19794a);
            }
            cVar = new c(this.f19765a, this.f19766b, b10, "audio/raw", a10);
        }
        this.f19769e = cVar;
        this.f19767c = 3;
    }

    private void j(l lVar) {
        this.f19768d = d.c(lVar);
        this.f19767c = 2;
    }

    private int k(l lVar) {
        t8.a.g(this.f19771g != -1);
        return ((InterfaceC0310b) t8.a.e(this.f19769e)).a(lVar, this.f19771g - lVar.getPosition()) ? -1 : 0;
    }

    private void l(l lVar) {
        Pair<Long, Long> e10 = d.e(lVar);
        this.f19770f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f19768d;
        if (j10 != -1 && longValue == KeyboardMap.kValueMask) {
            longValue = j10;
        }
        this.f19771g = this.f19770f + longValue;
        long length = lVar.getLength();
        if (length != -1 && this.f19771g > length) {
            s.i("WavExtractor", "Data exceeds input length: " + this.f19771g + ", " + length);
            this.f19771g = length;
        }
        ((InterfaceC0310b) t8.a.e(this.f19769e)).b(this.f19770f, this.f19771g);
        this.f19767c = 4;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f19767c = j10 == 0 ? 0 : 4;
        InterfaceC0310b interfaceC0310b = this.f19769e;
        if (interfaceC0310b != null) {
            interfaceC0310b.c(j11);
        }
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f19765a = mVar;
        this.f19766b = mVar.d(0, 1);
        mVar.q();
    }

    @Override // y6.k
    public boolean e(l lVar) {
        return d.a(lVar);
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        d();
        int i10 = this.f19767c;
        if (i10 == 0) {
            h(lVar);
            return 0;
        }
        if (i10 == 1) {
            j(lVar);
            return 0;
        }
        if (i10 == 2) {
            i(lVar);
            return 0;
        }
        if (i10 == 3) {
            l(lVar);
            return 0;
        }
        if (i10 == 4) {
            return k(lVar);
        }
        throw new IllegalStateException();
    }

    @Override // y6.k
    public void release() {
    }
}
