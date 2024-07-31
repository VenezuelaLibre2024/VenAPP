package v7;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import s8.b;
import v7.u0;
import y6.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final s8.b f28452a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28453b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.e0 f28454c;

    /* renamed from: d, reason: collision with root package name */
    private a f28455d;

    /* renamed from: e, reason: collision with root package name */
    private a f28456e;

    /* renamed from: f, reason: collision with root package name */
    private a f28457f;

    /* renamed from: g, reason: collision with root package name */
    private long f28458g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f28459a;

        /* renamed from: b, reason: collision with root package name */
        public long f28460b;

        /* renamed from: c, reason: collision with root package name */
        public s8.a f28461c;

        /* renamed from: d, reason: collision with root package name */
        public a f28462d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // s8.b.a
        public s8.a a() {
            return (s8.a) t8.a.e(this.f28461c);
        }

        public a b() {
            this.f28461c = null;
            a aVar = this.f28462d;
            this.f28462d = null;
            return aVar;
        }

        public void c(s8.a aVar, a aVar2) {
            this.f28461c = aVar;
            this.f28462d = aVar2;
        }

        public void d(long j10, int i10) {
            t8.a.g(this.f28461c == null);
            this.f28459a = j10;
            this.f28460b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f28459a)) + this.f28461c.f25186b;
        }

        @Override // s8.b.a
        public b.a next() {
            a aVar = this.f28462d;
            if (aVar == null || aVar.f28461c == null) {
                return null;
            }
            return aVar;
        }
    }

    public s0(s8.b bVar) {
        this.f28452a = bVar;
        int e10 = bVar.e();
        this.f28453b = e10;
        this.f28454c = new t8.e0(32);
        a aVar = new a(0L, e10);
        this.f28455d = aVar;
        this.f28456e = aVar;
        this.f28457f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f28461c == null) {
            return;
        }
        this.f28452a.d(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f28460b) {
            aVar = aVar.f28462d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f28458g + i10;
        this.f28458g = j10;
        a aVar = this.f28457f;
        if (j10 == aVar.f28460b) {
            this.f28457f = aVar.f28462d;
        }
    }

    private int h(int i10) {
        a aVar = this.f28457f;
        if (aVar.f28461c == null) {
            aVar.c(this.f28452a.b(), new a(this.f28457f.f28460b, this.f28453b));
        }
        return Math.min(i10, (int) (this.f28457f.f28460b - this.f28458g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f28460b - j10));
            byteBuffer.put(d10.f28461c.f25185a, d10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == d10.f28460b) {
                d10 = d10.f28462d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f28460b - j10));
            System.arraycopy(d10.f28461c.f25185a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == d10.f28460b) {
                d10 = d10.f28462d;
            }
        }
        return d10;
    }

    private static a k(a aVar, w6.g gVar, u0.b bVar, t8.e0 e0Var) {
        long j10 = bVar.f28503b;
        int i10 = 1;
        e0Var.Q(1);
        a j11 = j(aVar, j10, e0Var.e(), 1);
        long j12 = j10 + 1;
        byte b10 = e0Var.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        w6.c cVar = gVar.f29678b;
        byte[] bArr = cVar.f29654a;
        if (bArr == null) {
            cVar.f29654a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f29654a, i11);
        long j14 = j12 + i11;
        if (z10) {
            e0Var.Q(2);
            j13 = j(j13, j14, e0Var.e(), 2);
            j14 += 2;
            i10 = e0Var.N();
        }
        int i12 = i10;
        int[] iArr = cVar.f29657d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f29658e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            e0Var.Q(i13);
            j13 = j(j13, j14, e0Var.e(), i13);
            j14 += i13;
            e0Var.U(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = e0Var.N();
                iArr4[i14] = e0Var.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f28502a - ((int) (j14 - bVar.f28503b));
        }
        b0.a aVar2 = (b0.a) t8.r0.j(bVar.f28504c);
        cVar.c(i12, iArr2, iArr4, aVar2.f31690b, cVar.f29654a, aVar2.f31689a, aVar2.f31691c, aVar2.f31692d);
        long j15 = bVar.f28503b;
        int i15 = (int) (j14 - j15);
        bVar.f28503b = j15 + i15;
        bVar.f28502a -= i15;
        return j13;
    }

    private static a l(a aVar, w6.g gVar, u0.b bVar, t8.e0 e0Var) {
        long j10;
        ByteBuffer byteBuffer;
        if (gVar.A()) {
            aVar = k(aVar, gVar, bVar, e0Var);
        }
        if (gVar.q()) {
            e0Var.Q(4);
            a j11 = j(aVar, bVar.f28503b, e0Var.e(), 4);
            int L = e0Var.L();
            bVar.f28503b += 4;
            bVar.f28502a -= 4;
            gVar.y(L);
            aVar = i(j11, bVar.f28503b, gVar.f29679c, L);
            bVar.f28503b += L;
            int i10 = bVar.f28502a - L;
            bVar.f28502a = i10;
            gVar.C(i10);
            j10 = bVar.f28503b;
            byteBuffer = gVar.f29682f;
        } else {
            gVar.y(bVar.f28502a);
            j10 = bVar.f28503b;
            byteBuffer = gVar.f29679c;
        }
        return i(aVar, j10, byteBuffer, bVar.f28502a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f28455d;
            if (j10 < aVar.f28460b) {
                break;
            }
            this.f28452a.a(aVar.f28461c);
            this.f28455d = this.f28455d.b();
        }
        if (this.f28456e.f28459a < aVar.f28459a) {
            this.f28456e = aVar;
        }
    }

    public void c(long j10) {
        t8.a.a(j10 <= this.f28458g);
        this.f28458g = j10;
        if (j10 != 0) {
            a aVar = this.f28455d;
            if (j10 != aVar.f28459a) {
                while (this.f28458g > aVar.f28460b) {
                    aVar = aVar.f28462d;
                }
                a aVar2 = (a) t8.a.e(aVar.f28462d);
                a(aVar2);
                a aVar3 = new a(aVar.f28460b, this.f28453b);
                aVar.f28462d = aVar3;
                if (this.f28458g == aVar.f28460b) {
                    aVar = aVar3;
                }
                this.f28457f = aVar;
                if (this.f28456e == aVar2) {
                    this.f28456e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f28455d);
        a aVar4 = new a(this.f28458g, this.f28453b);
        this.f28455d = aVar4;
        this.f28456e = aVar4;
        this.f28457f = aVar4;
    }

    public long e() {
        return this.f28458g;
    }

    public void f(w6.g gVar, u0.b bVar) {
        l(this.f28456e, gVar, bVar, this.f28454c);
    }

    public void m(w6.g gVar, u0.b bVar) {
        this.f28456e = l(this.f28456e, gVar, bVar, this.f28454c);
    }

    public void n() {
        a(this.f28455d);
        this.f28455d.d(0L, this.f28453b);
        a aVar = this.f28455d;
        this.f28456e = aVar;
        this.f28457f = aVar;
        this.f28458g = 0L;
        this.f28452a.c();
    }

    public void o() {
        this.f28456e = this.f28455d;
    }

    public int p(s8.h hVar, int i10, boolean z10) {
        int h10 = h(i10);
        a aVar = this.f28457f;
        int read = hVar.read(aVar.f28461c.f25185a, aVar.e(this.f28458g), h10);
        if (read != -1) {
            g(read);
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(t8.e0 e0Var, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f28457f;
            e0Var.l(aVar.f28461c.f25185a, aVar.e(this.f28458g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
