package e7;

import java.util.ArrayDeque;
import t6.b3;
import y6.l;

/* loaded from: classes.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14507a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f14508b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final g f14509c = new g();

    /* renamed from: d, reason: collision with root package name */
    private e7.b f14510d;

    /* renamed from: e, reason: collision with root package name */
    private int f14511e;

    /* renamed from: f, reason: collision with root package name */
    private int f14512f;

    /* renamed from: g, reason: collision with root package name */
    private long f14513g;

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f14514a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14515b;

        private b(int i10, long j10) {
            this.f14514a = i10;
            this.f14515b = j10;
        }
    }

    private long c(l lVar) {
        lVar.f();
        while (true) {
            lVar.q(this.f14507a, 0, 4);
            int c10 = g.c(this.f14507a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f14507a, c10, false);
                if (this.f14510d.f(a10)) {
                    lVar.n(c10);
                    return a10;
                }
            }
            lVar.n(1);
        }
    }

    private double d(l lVar, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(lVar, i10));
    }

    private long e(l lVar, int i10) {
        lVar.readFully(this.f14507a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f14507a[i11] & 255);
        }
        return j10;
    }

    private static String f(l lVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        lVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // e7.c
    public boolean a(l lVar) {
        t8.a.i(this.f14510d);
        while (true) {
            b peek = this.f14508b.peek();
            if (peek != null && lVar.getPosition() >= peek.f14515b) {
                this.f14510d.a(this.f14508b.pop().f14514a);
                return true;
            }
            if (this.f14511e == 0) {
                long d10 = this.f14509c.d(lVar, true, false, 4);
                if (d10 == -2) {
                    d10 = c(lVar);
                }
                if (d10 == -1) {
                    return false;
                }
                this.f14512f = (int) d10;
                this.f14511e = 1;
            }
            if (this.f14511e == 1) {
                this.f14513g = this.f14509c.d(lVar, false, true, 8);
                this.f14511e = 2;
            }
            int e10 = this.f14510d.e(this.f14512f);
            if (e10 != 0) {
                if (e10 == 1) {
                    long position = lVar.getPosition();
                    this.f14508b.push(new b(this.f14512f, this.f14513g + position));
                    this.f14510d.h(this.f14512f, position, this.f14513g);
                    this.f14511e = 0;
                    return true;
                }
                if (e10 == 2) {
                    long j10 = this.f14513g;
                    if (j10 <= 8) {
                        this.f14510d.d(this.f14512f, e(lVar, (int) j10));
                        this.f14511e = 0;
                        return true;
                    }
                    throw b3.a("Invalid integer size: " + this.f14513g, null);
                }
                if (e10 == 3) {
                    long j11 = this.f14513g;
                    if (j11 <= 2147483647L) {
                        this.f14510d.g(this.f14512f, f(lVar, (int) j11));
                        this.f14511e = 0;
                        return true;
                    }
                    throw b3.a("String element size: " + this.f14513g, null);
                }
                if (e10 == 4) {
                    this.f14510d.c(this.f14512f, (int) this.f14513g, lVar);
                    this.f14511e = 0;
                    return true;
                }
                if (e10 != 5) {
                    throw b3.a("Invalid element type " + e10, null);
                }
                long j12 = this.f14513g;
                if (j12 == 4 || j12 == 8) {
                    this.f14510d.b(this.f14512f, d(lVar, (int) j12));
                    this.f14511e = 0;
                    return true;
                }
                throw b3.a("Invalid float size: " + this.f14513g, null);
            }
            lVar.n((int) this.f14513g);
            this.f14511e = 0;
        }
    }

    @Override // e7.c
    public void b(e7.b bVar) {
        this.f14510d = bVar;
    }

    @Override // e7.c
    public void reset() {
        this.f14511e = 0;
        this.f14508b.clear();
        this.f14509c.e();
    }
}
