package p175j7;

import android.util.Pair;
import io.flutter.embedding.android.KeyboardMap;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p396v6.C11682z0;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;

/* renamed from: j7.b */
/* loaded from: classes.dex */
public final class C8993b implements InterfaceC12621k {

    /* renamed from: h */
    public static final InterfaceC12626p f21543h = new InterfaceC12626p() { // from class: j7.a
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m26389g;
            m26389g = C8993b.m26389g();
            return m26389g;
        }
    };

    /* renamed from: a */
    private InterfaceC12623m f21544a;

    /* renamed from: b */
    private InterfaceC12609b0 f21545b;

    /* renamed from: e */
    private b f21548e;

    /* renamed from: c */
    private int f21546c = 0;

    /* renamed from: d */
    private long f21547d = -1;

    /* renamed from: f */
    private int f21549f = -1;

    /* renamed from: g */
    private long f21550g = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7.b$a */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: m */
        private static final int[] f21551m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f21552n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final InterfaceC12623m f21553a;

        /* renamed from: b */
        private final InterfaceC12609b0 f21554b;

        /* renamed from: c */
        private final C8994c f21555c;

        /* renamed from: d */
        private final int f21556d;

        /* renamed from: e */
        private final byte[] f21557e;

        /* renamed from: f */
        private final C11146e0 f21558f;

        /* renamed from: g */
        private final int f21559g;

        /* renamed from: h */
        private final C11108u1 f21560h;

        /* renamed from: i */
        private int f21561i;

        /* renamed from: j */
        private long f21562j;

        /* renamed from: k */
        private int f21563k;

        /* renamed from: l */
        private long f21564l;

        public a(InterfaceC12623m interfaceC12623m, InterfaceC12609b0 interfaceC12609b0, C8994c c8994c) {
            this.f21553a = interfaceC12623m;
            this.f21554b = interfaceC12609b0;
            this.f21555c = c8994c;
            int max = Math.max(1, c8994c.f21575c / 10);
            this.f21559g = max;
            C11146e0 c11146e0 = new C11146e0(c8994c.f21579g);
            c11146e0.m34701z();
            int m34701z = c11146e0.m34701z();
            this.f21556d = m34701z;
            int i10 = c8994c.f21574b;
            int i11 = (((c8994c.f21577e - (i10 * 4)) * 8) / (c8994c.f21578f * i10)) + 1;
            if (m34701z == i11) {
                int m34932l = C11172r0.m34932l(max, m34701z);
                this.f21557e = new byte[c8994c.f21577e * m34932l];
                this.f21558f = new C11146e0(m34932l * m26399h(m34701z, i10));
                int i12 = ((c8994c.f21575c * c8994c.f21577e) * 8) / m34701z;
                this.f21560h = new C11108u1.b().m34552g0("audio/raw").m34528I(i12).m34547b0(i12).m34544Y(m26399h(max, i10)).m34529J(c8994c.f21574b).m34553h0(c8994c.f21575c).m34546a0(2).m34526G();
                return;
            }
            throw C11005b3.m33715a("Expected frames per block: " + i11 + "; got: " + m34701z, null);
        }

        /* renamed from: d */
        private void m26395d(byte[] bArr, int i10, C11146e0 c11146e0) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f21555c.f21574b; i12++) {
                    m26396e(bArr, i11, i12, c11146e0.m34682e());
                }
            }
            int m26398g = m26398g(this.f21556d * i10);
            c11146e0.m34677U(0);
            c11146e0.m34676T(m26398g);
        }

        /* renamed from: e */
        private void m26396e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            C8994c c8994c = this.f21555c;
            int i12 = c8994c.f21577e;
            int i13 = c8994c.f21574b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f21552n[min];
            int i19 = ((i10 * this.f21556d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = C11172r0.m34942q(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f21551m[i22];
                int[] iArr = f21552n;
                min = C11172r0.m34942q(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        /* renamed from: f */
        private int m26397f(int i10) {
            return i10 / (this.f21555c.f21574b * 2);
        }

        /* renamed from: g */
        private int m26398g(int i10) {
            return m26399h(i10, this.f21555c.f21574b);
        }

        /* renamed from: h */
        private static int m26399h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        /* renamed from: i */
        private void m26400i(int i10) {
            long m34885O0 = this.f21562j + C11172r0.m34885O0(this.f21564l, 1000000L, this.f21555c.f21575c);
            int m26398g = m26398g(i10);
            this.f21554b.mo331b(m34885O0, 1, m26398g, this.f21563k - m26398g, null);
            this.f21564l += i10;
            this.f21563k -= m26398g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // p175j7.C8993b.b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo26401a(p459y6.InterfaceC12622l r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f21559g
                int r1 = r6.f21563k
                int r1 = r6.m26397f(r1)
                int r0 = r0 - r1
                int r1 = r6.f21556d
                int r0 = p363t8.C11172r0.m34932l(r0, r1)
                j7.c r1 = r6.f21555c
                int r1 = r1.f21577e
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
                int r3 = r6.f21561i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f21557e
                int r5 = r6.f21561i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f21561i
                int r4 = r4 + r3
                r6.f21561i = r4
                goto L1e
            L3e:
                int r7 = r6.f21561i
                j7.c r8 = r6.f21555c
                int r8 = r8.f21577e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f21557e
                t8.e0 r9 = r6.f21558f
                r6.m26395d(r8, r7, r9)
                int r8 = r6.f21561i
                j7.c r9 = r6.f21555c
                int r9 = r9.f21577e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f21561i = r8
                t8.e0 r7 = r6.f21558f
                int r7 = r7.m34684g()
                y6.b0 r8 = r6.f21554b
                t8.e0 r9 = r6.f21558f
                r8.m41511a(r9, r7)
                int r8 = r6.f21563k
                int r8 = r8 + r7
                r6.f21563k = r8
                int r7 = r6.m26397f(r8)
                int r8 = r6.f21559g
                if (r7 < r8) goto L75
                r6.m26400i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f21563k
                int r7 = r6.m26397f(r7)
                if (r7 <= 0) goto L82
                r6.m26400i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p175j7.C8993b.a.mo26401a(y6.l, long):boolean");
        }

        @Override // p175j7.C8993b.b
        /* renamed from: b */
        public void mo26402b(int i10, long j10) {
            this.f21553a.mo323p(new C8996e(this.f21555c, this.f21556d, i10, j10));
            this.f21554b.mo332c(this.f21560h);
        }

        @Override // p175j7.C8993b.b
        /* renamed from: c */
        public void mo26403c(long j10) {
            this.f21561i = 0;
            this.f21562j = j10;
            this.f21563k = 0;
            this.f21564l = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo26401a(InterfaceC12622l interfaceC12622l, long j10);

        /* renamed from: b */
        void mo26402b(int i10, long j10);

        /* renamed from: c */
        void mo26403c(long j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7.b$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final InterfaceC12623m f21565a;

        /* renamed from: b */
        private final InterfaceC12609b0 f21566b;

        /* renamed from: c */
        private final C8994c f21567c;

        /* renamed from: d */
        private final C11108u1 f21568d;

        /* renamed from: e */
        private final int f21569e;

        /* renamed from: f */
        private long f21570f;

        /* renamed from: g */
        private int f21571g;

        /* renamed from: h */
        private long f21572h;

        public c(InterfaceC12623m interfaceC12623m, InterfaceC12609b0 interfaceC12609b0, C8994c c8994c, String str, int i10) {
            this.f21565a = interfaceC12623m;
            this.f21566b = interfaceC12609b0;
            this.f21567c = c8994c;
            int i11 = (c8994c.f21574b * c8994c.f21578f) / 8;
            if (c8994c.f21577e == i11) {
                int i12 = c8994c.f21575c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f21569e = max;
                this.f21568d = new C11108u1.b().m34552g0(str).m34528I(i13).m34547b0(i13).m34544Y(max).m34529J(c8994c.f21574b).m34553h0(c8994c.f21575c).m34546a0(i10).m34526G();
                return;
            }
            throw C11005b3.m33715a("Expected block size: " + i11 + "; got: " + c8994c.f21577e, null);
        }

        @Override // p175j7.C8993b.b
        /* renamed from: a */
        public boolean mo26401a(InterfaceC12622l interfaceC12622l, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f21571g) < (i11 = this.f21569e)) {
                int m41512f = this.f21566b.m41512f(interfaceC12622l, (int) Math.min(i11 - i10, j11), true);
                if (m41512f == -1) {
                    j11 = 0;
                } else {
                    this.f21571g += m41512f;
                    j11 -= m41512f;
                }
            }
            int i12 = this.f21567c.f21577e;
            int i13 = this.f21571g / i12;
            if (i13 > 0) {
                long m34885O0 = this.f21570f + C11172r0.m34885O0(this.f21572h, 1000000L, r1.f21575c);
                int i14 = i13 * i12;
                int i15 = this.f21571g - i14;
                this.f21566b.mo331b(m34885O0, 1, i14, i15, null);
                this.f21572h += i13;
                this.f21571g = i15;
            }
            return j11 <= 0;
        }

        @Override // p175j7.C8993b.b
        /* renamed from: b */
        public void mo26402b(int i10, long j10) {
            this.f21565a.mo323p(new C8996e(this.f21567c, 1, i10, j10));
            this.f21566b.mo332c(this.f21568d);
        }

        @Override // p175j7.C8993b.b
        /* renamed from: c */
        public void mo26403c(long j10) {
            this.f21570f = j10;
            this.f21571g = 0;
            this.f21572h = 0L;
        }
    }

    /* renamed from: d */
    private void m26388d() {
        C11137a.m34607i(this.f21545b);
        C11172r0.m34928j(this.f21544a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ InterfaceC12621k[] m26389g() {
        return new InterfaceC12621k[]{new C8993b()};
    }

    /* renamed from: h */
    private void m26390h(InterfaceC12622l interfaceC12622l) {
        C11137a.m34605g(interfaceC12622l.getPosition() == 0);
        int i10 = this.f21549f;
        if (i10 != -1) {
            interfaceC12622l.mo41538n(i10);
            this.f21546c = 4;
        } else {
            if (!C8995d.m26404a(interfaceC12622l)) {
                throw C11005b3.m33715a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC12622l.mo41538n((int) (interfaceC12622l.mo19807i() - interfaceC12622l.getPosition()));
            this.f21546c = 1;
        }
    }

    /* renamed from: i */
    private void m26391i(InterfaceC12622l interfaceC12622l) {
        b cVar;
        C8994c m26405b = C8995d.m26405b(interfaceC12622l);
        int i10 = m26405b.f21573a;
        if (i10 == 17) {
            cVar = new a(this.f21544a, this.f21545b, m26405b);
        } else if (i10 == 6) {
            cVar = new c(this.f21544a, this.f21545b, m26405b, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            cVar = new c(this.f21544a, this.f21545b, m26405b, "audio/g711-mlaw", -1);
        } else {
            int m36799a = C11682z0.m36799a(i10, m26405b.f21578f);
            if (m36799a == 0) {
                throw C11005b3.m33719e("Unsupported WAV format type: " + m26405b.f21573a);
            }
            cVar = new c(this.f21544a, this.f21545b, m26405b, "audio/raw", m36799a);
        }
        this.f21548e = cVar;
        this.f21546c = 3;
    }

    /* renamed from: j */
    private void m26392j(InterfaceC12622l interfaceC12622l) {
        this.f21547d = C8995d.m26406c(interfaceC12622l);
        this.f21546c = 2;
    }

    /* renamed from: k */
    private int m26393k(InterfaceC12622l interfaceC12622l) {
        C11137a.m34605g(this.f21550g != -1);
        return ((b) C11137a.m34603e(this.f21548e)).mo26401a(interfaceC12622l, this.f21550g - interfaceC12622l.getPosition()) ? -1 : 0;
    }

    /* renamed from: l */
    private void m26394l(InterfaceC12622l interfaceC12622l) {
        Pair<Long, Long> m26408e = C8995d.m26408e(interfaceC12622l);
        this.f21549f = ((Long) m26408e.first).intValue();
        long longValue = ((Long) m26408e.second).longValue();
        long j10 = this.f21547d;
        if (j10 != -1 && longValue == KeyboardMap.kValueMask) {
            longValue = j10;
        }
        this.f21550g = this.f21549f + longValue;
        long length = interfaceC12622l.getLength();
        if (length != -1 && this.f21550g > length) {
            C11173s.m34970i("WavExtractor", "Data exceeds input length: " + this.f21550g + ", " + length);
            this.f21550g = length;
        }
        ((b) C11137a.m34603e(this.f21548e)).mo26402b(this.f21549f, this.f21550g);
        this.f21546c = 4;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f21546c = j10 == 0 ? 0 : 4;
        b bVar = this.f21548e;
        if (bVar != null) {
            bVar.mo26403c(j11);
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f21544a = interfaceC12623m;
        this.f21545b = interfaceC12623m.mo308d(0, 1);
        interfaceC12623m.mo324q();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return C8995d.m26404a(interfaceC12622l);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        m26388d();
        int i10 = this.f21546c;
        if (i10 == 0) {
            m26390h(interfaceC12622l);
            return 0;
        }
        if (i10 == 1) {
            m26392j(interfaceC12622l);
            return 0;
        }
        if (i10 == 2) {
            m26391i(interfaceC12622l);
            return 0;
        }
        if (i10 == 3) {
            m26394l(interfaceC12622l);
            return 0;
        }
        if (i10 == 4) {
            return m26393k(interfaceC12622l);
        }
        throw new IllegalStateException();
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
