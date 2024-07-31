package y6;

import java.util.Collections;
import java.util.List;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f31772a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31774c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31775d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31776e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31777f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31778g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31779h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31780i;

    /* renamed from: j, reason: collision with root package name */
    public final long f31781j;

    /* renamed from: k, reason: collision with root package name */
    public final a f31782k;

    /* renamed from: l, reason: collision with root package name */
    private final l7.a f31783l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f31784a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f31785b;

        public a(long[] jArr, long[] jArr2) {
            this.f31784a = jArr;
            this.f31785b = jArr2;
        }
    }

    private t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, l7.a aVar2) {
        this.f31772a = i10;
        this.f31773b = i11;
        this.f31774c = i12;
        this.f31775d = i13;
        this.f31776e = i14;
        this.f31777f = j(i14);
        this.f31778g = i15;
        this.f31779h = i16;
        this.f31780i = e(i16);
        this.f31781j = j10;
        this.f31782k = aVar;
        this.f31783l = aVar2;
    }

    public t(byte[] bArr, int i10) {
        t8.d0 d0Var = new t8.d0(bArr);
        d0Var.p(i10 * 8);
        this.f31772a = d0Var.h(16);
        this.f31773b = d0Var.h(16);
        this.f31774c = d0Var.h(24);
        this.f31775d = d0Var.h(24);
        int h10 = d0Var.h(20);
        this.f31776e = h10;
        this.f31777f = j(h10);
        this.f31778g = d0Var.h(3) + 1;
        int h11 = d0Var.h(5) + 1;
        this.f31779h = h11;
        this.f31780i = e(h11);
        this.f31781j = d0Var.j(36);
        this.f31782k = null;
        this.f31783l = null;
    }

    private static int e(int i10) {
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

    private static int j(int i10) {
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

    public t a(List<o7.a> list) {
        return new t(this.f31772a, this.f31773b, this.f31774c, this.f31775d, this.f31776e, this.f31778g, this.f31779h, this.f31781j, this.f31782k, h(new l7.a(list)));
    }

    public t b(a aVar) {
        return new t(this.f31772a, this.f31773b, this.f31774c, this.f31775d, this.f31776e, this.f31778g, this.f31779h, this.f31781j, aVar, this.f31783l);
    }

    public t c(List<String> list) {
        return new t(this.f31772a, this.f31773b, this.f31774c, this.f31775d, this.f31776e, this.f31778g, this.f31779h, this.f31781j, this.f31782k, h(e0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f31775d;
        if (i10 > 0) {
            j10 = (i10 + this.f31774c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f31772a;
            j10 = ((((i11 != this.f31773b || i11 <= 0) ? 4096L : i11) * this.f31778g) * this.f31779h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f31781j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f31776e;
    }

    public u1 g(byte[] bArr, l7.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f31775d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new u1.b().g0("audio/flac").Y(i10).J(this.f31778g).h0(this.f31776e).V(Collections.singletonList(bArr)).Z(h(aVar)).G();
    }

    public l7.a h(l7.a aVar) {
        l7.a aVar2 = this.f31783l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long i(long j10) {
        return r0.r((j10 * this.f31776e) / 1000000, 0L, this.f31781j - 1);
    }
}
