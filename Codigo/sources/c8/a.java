package c8;

import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f6902l = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte f6903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6904b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6905c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f6906d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6907e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f6908f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6909g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6910h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6911i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f6912j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f6913k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6914a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f6915b;

        /* renamed from: c, reason: collision with root package name */
        private byte f6916c;

        /* renamed from: d, reason: collision with root package name */
        private int f6917d;

        /* renamed from: e, reason: collision with root package name */
        private long f6918e;

        /* renamed from: f, reason: collision with root package name */
        private int f6919f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f6920g = a.f6902l;

        /* renamed from: h, reason: collision with root package name */
        private byte[] f6921h = a.f6902l;

        public a i() {
            return new a(this);
        }

        public b j(byte[] bArr) {
            t8.a.e(bArr);
            this.f6920g = bArr;
            return this;
        }

        public b k(boolean z10) {
            this.f6915b = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f6914a = z10;
            return this;
        }

        public b m(byte[] bArr) {
            t8.a.e(bArr);
            this.f6921h = bArr;
            return this;
        }

        public b n(byte b10) {
            this.f6916c = b10;
            return this;
        }

        public b o(int i10) {
            t8.a.a(i10 >= 0 && i10 <= 65535);
            this.f6917d = i10 & 65535;
            return this;
        }

        public b p(int i10) {
            this.f6919f = i10;
            return this;
        }

        public b q(long j10) {
            this.f6918e = j10;
            return this;
        }
    }

    private a(b bVar) {
        this.f6903a = (byte) 2;
        this.f6904b = bVar.f6914a;
        this.f6905c = false;
        this.f6907e = bVar.f6915b;
        this.f6908f = bVar.f6916c;
        this.f6909g = bVar.f6917d;
        this.f6910h = bVar.f6918e;
        this.f6911i = bVar.f6919f;
        byte[] bArr = bVar.f6920g;
        this.f6912j = bArr;
        this.f6906d = (byte) (bArr.length / 4);
        this.f6913k = bVar.f6921h;
    }

    public static int b(int i10) {
        return gb.b.e(i10 + 1, 65536);
    }

    public static int c(int i10) {
        return gb.b.e(i10 - 1, 65536);
    }

    public static a d(e0 e0Var) {
        byte[] bArr;
        if (e0Var.a() < 12) {
            return null;
        }
        int H = e0Var.H();
        byte b10 = (byte) (H >> 6);
        boolean z10 = ((H >> 5) & 1) == 1;
        byte b11 = (byte) (H & 15);
        if (b10 != 2) {
            return null;
        }
        int H2 = e0Var.H();
        boolean z11 = ((H2 >> 7) & 1) == 1;
        byte b12 = (byte) (H2 & 127);
        int N = e0Var.N();
        long J = e0Var.J();
        int q10 = e0Var.q();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i10 = 0; i10 < b11; i10++) {
                e0Var.l(bArr, i10 * 4, 4);
            }
        } else {
            bArr = f6902l;
        }
        byte[] bArr2 = new byte[e0Var.a()];
        e0Var.l(bArr2, 0, e0Var.a());
        return new b().l(z10).k(z11).n(b12).o(N).q(J).p(q10).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6908f == aVar.f6908f && this.f6909g == aVar.f6909g && this.f6907e == aVar.f6907e && this.f6910h == aVar.f6910h && this.f6911i == aVar.f6911i;
    }

    public int hashCode() {
        int i10 = (((((527 + this.f6908f) * 31) + this.f6909g) * 31) + (this.f6907e ? 1 : 0)) * 31;
        long j10 = this.f6910h;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f6911i;
    }

    public String toString() {
        return r0.C("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f6908f), Integer.valueOf(this.f6909g), Long.valueOf(this.f6910h), Integer.valueOf(this.f6911i), Boolean.valueOf(this.f6907e));
    }
}
