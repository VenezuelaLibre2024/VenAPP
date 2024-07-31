package p040c8;

import gb.C7535b;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: c8.a */
/* loaded from: classes.dex */
public final class C1885a {

    /* renamed from: l */
    private static final byte[] f7851l = new byte[0];

    /* renamed from: a */
    public final byte f7852a;

    /* renamed from: b */
    public final boolean f7853b;

    /* renamed from: c */
    public final boolean f7854c;

    /* renamed from: d */
    public final byte f7855d;

    /* renamed from: e */
    public final boolean f7856e;

    /* renamed from: f */
    public final byte f7857f;

    /* renamed from: g */
    public final int f7858g;

    /* renamed from: h */
    public final long f7859h;

    /* renamed from: i */
    public final int f7860i;

    /* renamed from: j */
    public final byte[] f7861j;

    /* renamed from: k */
    public final byte[] f7862k;

    /* renamed from: c8.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private boolean f7863a;

        /* renamed from: b */
        private boolean f7864b;

        /* renamed from: c */
        private byte f7865c;

        /* renamed from: d */
        private int f7866d;

        /* renamed from: e */
        private long f7867e;

        /* renamed from: f */
        private int f7868f;

        /* renamed from: g */
        private byte[] f7869g = C1885a.f7851l;

        /* renamed from: h */
        private byte[] f7870h = C1885a.f7851l;

        /* renamed from: i */
        public C1885a m10021i() {
            return new C1885a(this);
        }

        /* renamed from: j */
        public b m10022j(byte[] bArr) {
            C11137a.m34603e(bArr);
            this.f7869g = bArr;
            return this;
        }

        /* renamed from: k */
        public b m10023k(boolean z10) {
            this.f7864b = z10;
            return this;
        }

        /* renamed from: l */
        public b m10024l(boolean z10) {
            this.f7863a = z10;
            return this;
        }

        /* renamed from: m */
        public b m10025m(byte[] bArr) {
            C11137a.m34603e(bArr);
            this.f7870h = bArr;
            return this;
        }

        /* renamed from: n */
        public b m10026n(byte b10) {
            this.f7865c = b10;
            return this;
        }

        /* renamed from: o */
        public b m10027o(int i10) {
            C11137a.m34599a(i10 >= 0 && i10 <= 65535);
            this.f7866d = i10 & 65535;
            return this;
        }

        /* renamed from: p */
        public b m10028p(int i10) {
            this.f7868f = i10;
            return this;
        }

        /* renamed from: q */
        public b m10029q(long j10) {
            this.f7867e = j10;
            return this;
        }
    }

    private C1885a(b bVar) {
        this.f7852a = (byte) 2;
        this.f7853b = bVar.f7863a;
        this.f7854c = false;
        this.f7856e = bVar.f7864b;
        this.f7857f = bVar.f7865c;
        this.f7858g = bVar.f7866d;
        this.f7859h = bVar.f7867e;
        this.f7860i = bVar.f7868f;
        byte[] bArr = bVar.f7869g;
        this.f7861j = bArr;
        this.f7855d = (byte) (bArr.length / 4);
        this.f7862k = bVar.f7870h;
    }

    /* renamed from: b */
    public static int m10010b(int i10) {
        return C7535b.m22884e(i10 + 1, 65536);
    }

    /* renamed from: c */
    public static int m10011c(int i10) {
        return C7535b.m22884e(i10 - 1, 65536);
    }

    /* renamed from: d */
    public static C1885a m10012d(C11146e0 c11146e0) {
        byte[] bArr;
        if (c11146e0.m34679a() < 12) {
            return null;
        }
        int m34664H = c11146e0.m34664H();
        byte b10 = (byte) (m34664H >> 6);
        boolean z10 = ((m34664H >> 5) & 1) == 1;
        byte b11 = (byte) (m34664H & 15);
        if (b10 != 2) {
            return null;
        }
        int m34664H2 = c11146e0.m34664H();
        boolean z11 = ((m34664H2 >> 7) & 1) == 1;
        byte b12 = (byte) (m34664H2 & 127);
        int m34670N = c11146e0.m34670N();
        long m34666J = c11146e0.m34666J();
        int m34692q = c11146e0.m34692q();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i10 = 0; i10 < b11; i10++) {
                c11146e0.m34688l(bArr, i10 * 4, 4);
            }
        } else {
            bArr = f7851l;
        }
        byte[] bArr2 = new byte[c11146e0.m34679a()];
        c11146e0.m34688l(bArr2, 0, c11146e0.m34679a());
        return new b().m10024l(z10).m10023k(z11).m10026n(b12).m10027o(m34670N).m10029q(m34666J).m10028p(m34692q).m10022j(bArr).m10025m(bArr2).m10021i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1885a.class != obj.getClass()) {
            return false;
        }
        C1885a c1885a = (C1885a) obj;
        return this.f7857f == c1885a.f7857f && this.f7858g == c1885a.f7858g && this.f7856e == c1885a.f7856e && this.f7859h == c1885a.f7859h && this.f7860i == c1885a.f7860i;
    }

    public int hashCode() {
        int i10 = (((((527 + this.f7857f) * 31) + this.f7858g) * 31) + (this.f7856e ? 1 : 0)) * 31;
        long j10 = this.f7859h;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f7860i;
    }

    public String toString() {
        return C11172r0.m34860C("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f7857f), Integer.valueOf(this.f7858g), Long.valueOf(this.f7859h), Integer.valueOf(this.f7860i), Boolean.valueOf(this.f7856e));
    }
}
