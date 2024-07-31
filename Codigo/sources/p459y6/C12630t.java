package p459y6;

import java.util.Collections;
import java.util.List;
import p216l7.C9400a;
import p267o7.C9817a;
import p361t6.C11108u1;
import p363t8.C11144d0;
import p363t8.C11172r0;

/* renamed from: y6.t */
/* loaded from: classes.dex */
public final class C12630t {

    /* renamed from: a */
    public final int f34308a;

    /* renamed from: b */
    public final int f34309b;

    /* renamed from: c */
    public final int f34310c;

    /* renamed from: d */
    public final int f34311d;

    /* renamed from: e */
    public final int f34312e;

    /* renamed from: f */
    public final int f34313f;

    /* renamed from: g */
    public final int f34314g;

    /* renamed from: h */
    public final int f34315h;

    /* renamed from: i */
    public final int f34316i;

    /* renamed from: j */
    public final long f34317j;

    /* renamed from: k */
    public final a f34318k;

    /* renamed from: l */
    private final C9400a f34319l;

    /* renamed from: y6.t$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final long[] f34320a;

        /* renamed from: b */
        public final long[] f34321b;

        public a(long[] jArr, long[] jArr2) {
            this.f34320a = jArr;
            this.f34321b = jArr2;
        }
    }

    private C12630t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, C9400a c9400a) {
        this.f34308a = i10;
        this.f34309b = i11;
        this.f34310c = i12;
        this.f34311d = i13;
        this.f34312e = i14;
        this.f34313f = m41593j(i14);
        this.f34314g = i15;
        this.f34315h = i16;
        this.f34316i = m41592e(i16);
        this.f34317j = j10;
        this.f34318k = aVar;
        this.f34319l = c9400a;
    }

    public C12630t(byte[] bArr, int i10) {
        C11144d0 c11144d0 = new C11144d0(bArr);
        c11144d0.m34640p(i10 * 8);
        this.f34308a = c11144d0.m34632h(16);
        this.f34309b = c11144d0.m34632h(16);
        this.f34310c = c11144d0.m34632h(24);
        this.f34311d = c11144d0.m34632h(24);
        int m34632h = c11144d0.m34632h(20);
        this.f34312e = m34632h;
        this.f34313f = m41593j(m34632h);
        this.f34314g = c11144d0.m34632h(3) + 1;
        int m34632h2 = c11144d0.m34632h(5) + 1;
        this.f34315h = m34632h2;
        this.f34316i = m41592e(m34632h2);
        this.f34317j = c11144d0.m34634j(36);
        this.f34318k = null;
        this.f34319l = null;
    }

    /* renamed from: e */
    private static int m41592e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    private static int m41593j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public C12630t m41594a(List<C9817a> list) {
        return new C12630t(this.f34308a, this.f34309b, this.f34310c, this.f34311d, this.f34312e, this.f34314g, this.f34315h, this.f34317j, this.f34318k, m41600h(new C9400a(list)));
    }

    /* renamed from: b */
    public C12630t m41595b(a aVar) {
        return new C12630t(this.f34308a, this.f34309b, this.f34310c, this.f34311d, this.f34312e, this.f34314g, this.f34315h, this.f34317j, aVar, this.f34319l);
    }

    /* renamed from: c */
    public C12630t m41596c(List<String> list) {
        return new C12630t(this.f34308a, this.f34309b, this.f34310c, this.f34311d, this.f34312e, this.f34314g, this.f34315h, this.f34317j, this.f34318k, m41600h(C12615e0.m41544c(list)));
    }

    /* renamed from: d */
    public long m41597d() {
        long j10;
        long j11;
        int i10 = this.f34311d;
        if (i10 > 0) {
            j10 = (i10 + this.f34310c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f34308a;
            j10 = ((((i11 != this.f34309b || i11 <= 0) ? 4096L : i11) * this.f34314g) * this.f34315h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    /* renamed from: f */
    public long m41598f() {
        long j10 = this.f34317j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f34312e;
    }

    /* renamed from: g */
    public C11108u1 m41599g(byte[] bArr, C9400a c9400a) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f34311d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new C11108u1.b().m34552g0("audio/flac").m34544Y(i10).m34529J(this.f34314g).m34553h0(this.f34312e).m34541V(Collections.singletonList(bArr)).m34545Z(m41600h(c9400a)).m34526G();
    }

    /* renamed from: h */
    public C9400a m41600h(C9400a c9400a) {
        C9400a c9400a2 = this.f34319l;
        return c9400a2 == null ? c9400a : c9400a2.m27996b(c9400a);
    }

    /* renamed from: i */
    public long m41601i(long j10) {
        return C11172r0.m34944r((j10 * this.f34312e) / 1000000, 0L, this.f34317j - 1);
    }
}
