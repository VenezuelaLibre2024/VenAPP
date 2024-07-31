package u8;

import java.util.Arrays;

/* loaded from: classes.dex */
final class e {

    /* renamed from: c, reason: collision with root package name */
    private boolean f27366c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27367d;

    /* renamed from: f, reason: collision with root package name */
    private int f27369f;

    /* renamed from: a, reason: collision with root package name */
    private a f27364a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f27365b = new a();

    /* renamed from: e, reason: collision with root package name */
    private long f27368e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27370a;

        /* renamed from: b, reason: collision with root package name */
        private long f27371b;

        /* renamed from: c, reason: collision with root package name */
        private long f27372c;

        /* renamed from: d, reason: collision with root package name */
        private long f27373d;

        /* renamed from: e, reason: collision with root package name */
        private long f27374e;

        /* renamed from: f, reason: collision with root package name */
        private long f27375f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f27376g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f27377h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f27374e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f27375f / j10;
        }

        public long b() {
            return this.f27375f;
        }

        public boolean d() {
            long j10 = this.f27373d;
            if (j10 == 0) {
                return false;
            }
            return this.f27376g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f27373d > 15 && this.f27377h == 0;
        }

        public void f(long j10) {
            int i10;
            long j11 = this.f27373d;
            if (j11 == 0) {
                this.f27370a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f27370a;
                this.f27371b = j12;
                this.f27375f = j12;
                this.f27374e = 1L;
            } else {
                long j13 = j10 - this.f27372c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f27371b) <= 1000000) {
                    this.f27374e++;
                    this.f27375f += j13;
                    boolean[] zArr = this.f27376g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        i10 = this.f27377h - 1;
                        this.f27377h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f27376g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        i10 = this.f27377h + 1;
                        this.f27377h = i10;
                    }
                }
            }
            this.f27373d++;
            this.f27372c = j10;
        }

        public void g() {
            this.f27373d = 0L;
            this.f27374e = 0L;
            this.f27375f = 0L;
            this.f27377h = 0;
            Arrays.fill(this.f27376g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f27364a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f27364a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f27369f;
    }

    public long d() {
        if (e()) {
            return this.f27364a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f27364a.e();
    }

    public void f(long j10) {
        this.f27364a.f(j10);
        if (this.f27364a.e() && !this.f27367d) {
            this.f27366c = false;
        } else if (this.f27368e != -9223372036854775807L) {
            if (!this.f27366c || this.f27365b.d()) {
                this.f27365b.g();
                this.f27365b.f(this.f27368e);
            }
            this.f27366c = true;
            this.f27365b.f(j10);
        }
        if (this.f27366c && this.f27365b.e()) {
            a aVar = this.f27364a;
            this.f27364a = this.f27365b;
            this.f27365b = aVar;
            this.f27366c = false;
            this.f27367d = false;
        }
        this.f27368e = j10;
        this.f27369f = this.f27364a.e() ? 0 : this.f27369f + 1;
    }

    public void g() {
        this.f27364a.g();
        this.f27365b.g();
        this.f27366c = false;
        this.f27368e = -9223372036854775807L;
        this.f27369f = 0;
    }
}
