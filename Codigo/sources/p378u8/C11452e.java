package p378u8;

import java.util.Arrays;

/* renamed from: u8.e */
/* loaded from: classes.dex */
final class C11452e {

    /* renamed from: c */
    private boolean f29669c;

    /* renamed from: d */
    private boolean f29670d;

    /* renamed from: f */
    private int f29672f;

    /* renamed from: a */
    private a f29667a = new a();

    /* renamed from: b */
    private a f29668b = new a();

    /* renamed from: e */
    private long f29671e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f29673a;

        /* renamed from: b */
        private long f29674b;

        /* renamed from: c */
        private long f29675c;

        /* renamed from: d */
        private long f29676d;

        /* renamed from: e */
        private long f29677e;

        /* renamed from: f */
        private long f29678f;

        /* renamed from: g */
        private final boolean[] f29679g = new boolean[15];

        /* renamed from: h */
        private int f29680h;

        /* renamed from: c */
        private static int m35784c(long j10) {
            return (int) (j10 % 15);
        }

        /* renamed from: a */
        public long m35785a() {
            long j10 = this.f29677e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f29678f / j10;
        }

        /* renamed from: b */
        public long m35786b() {
            return this.f29678f;
        }

        /* renamed from: d */
        public boolean m35787d() {
            long j10 = this.f29676d;
            if (j10 == 0) {
                return false;
            }
            return this.f29679g[m35784c(j10 - 1)];
        }

        /* renamed from: e */
        public boolean m35788e() {
            return this.f29676d > 15 && this.f29680h == 0;
        }

        /* renamed from: f */
        public void m35789f(long j10) {
            int i10;
            long j11 = this.f29676d;
            if (j11 == 0) {
                this.f29673a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f29673a;
                this.f29674b = j12;
                this.f29678f = j12;
                this.f29677e = 1L;
            } else {
                long j13 = j10 - this.f29675c;
                int m35784c = m35784c(j11);
                if (Math.abs(j13 - this.f29674b) <= 1000000) {
                    this.f29677e++;
                    this.f29678f += j13;
                    boolean[] zArr = this.f29679g;
                    if (zArr[m35784c]) {
                        zArr[m35784c] = false;
                        i10 = this.f29680h - 1;
                        this.f29680h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f29679g;
                    if (!zArr2[m35784c]) {
                        zArr2[m35784c] = true;
                        i10 = this.f29680h + 1;
                        this.f29680h = i10;
                    }
                }
            }
            this.f29676d++;
            this.f29675c = j10;
        }

        /* renamed from: g */
        public void m35790g() {
            this.f29676d = 0L;
            this.f29677e = 0L;
            this.f29678f = 0L;
            this.f29680h = 0;
            Arrays.fill(this.f29679g, false);
        }
    }

    /* renamed from: a */
    public long m35777a() {
        if (m35781e()) {
            return this.f29667a.m35785a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m35778b() {
        if (m35781e()) {
            return (float) (1.0E9d / this.f29667a.m35785a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m35779c() {
        return this.f29672f;
    }

    /* renamed from: d */
    public long m35780d() {
        if (m35781e()) {
            return this.f29667a.m35786b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m35781e() {
        return this.f29667a.m35788e();
    }

    /* renamed from: f */
    public void m35782f(long j10) {
        this.f29667a.m35789f(j10);
        if (this.f29667a.m35788e() && !this.f29670d) {
            this.f29669c = false;
        } else if (this.f29671e != -9223372036854775807L) {
            if (!this.f29669c || this.f29668b.m35787d()) {
                this.f29668b.m35790g();
                this.f29668b.m35789f(this.f29671e);
            }
            this.f29669c = true;
            this.f29668b.m35789f(j10);
        }
        if (this.f29669c && this.f29668b.m35788e()) {
            a aVar = this.f29667a;
            this.f29667a = this.f29668b;
            this.f29668b = aVar;
            this.f29669c = false;
            this.f29670d = false;
        }
        this.f29671e = j10;
        this.f29672f = this.f29667a.m35788e() ? 0 : this.f29672f + 1;
    }

    /* renamed from: g */
    public void m35783g() {
        this.f29667a.m35790g();
        this.f29668b.m35790g();
        this.f29669c = false;
        this.f29671e = -9223372036854775807L;
        this.f29672f = 0;
    }
}
