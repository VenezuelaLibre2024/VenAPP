package p078e7;

import java.util.ArrayDeque;
import p361t6.C11005b3;
import p363t8.C11137a;
import p459y6.InterfaceC12622l;

/* renamed from: e7.a */
/* loaded from: classes.dex */
final class C7127a implements InterfaceC7129c {

    /* renamed from: a */
    private final byte[] f15879a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<b> f15880b = new ArrayDeque<>();

    /* renamed from: c */
    private final C7133g f15881c = new C7133g();

    /* renamed from: d */
    private InterfaceC7128b f15882d;

    /* renamed from: e */
    private int f15883e;

    /* renamed from: f */
    private int f15884f;

    /* renamed from: g */
    private long f15885g;

    /* renamed from: e7.a$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        private final int f15886a;

        /* renamed from: b */
        private final long f15887b;

        private b(int i10, long j10) {
            this.f15886a = i10;
            this.f15887b = j10;
        }
    }

    /* renamed from: c */
    private long m21079c(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41534f();
        while (true) {
            interfaceC12622l.mo41540q(this.f15879a, 0, 4);
            int m21147c = C7133g.m21147c(this.f15879a[0]);
            if (m21147c != -1 && m21147c <= 4) {
                int m21146a = (int) C7133g.m21146a(this.f15879a, m21147c, false);
                if (this.f15882d.mo21092f(m21146a)) {
                    interfaceC12622l.mo41538n(m21147c);
                    return m21146a;
                }
            }
            interfaceC12622l.mo41538n(1);
        }
    }

    /* renamed from: d */
    private double m21080d(InterfaceC12622l interfaceC12622l, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m21081e(interfaceC12622l, i10));
    }

    /* renamed from: e */
    private long m21081e(InterfaceC12622l interfaceC12622l, int i10) {
        interfaceC12622l.readFully(this.f15879a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f15879a[i11] & 255);
        }
        return j10;
    }

    /* renamed from: f */
    private static String m21082f(InterfaceC12622l interfaceC12622l, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC12622l.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // p078e7.InterfaceC7129c
    /* renamed from: a */
    public boolean mo21083a(InterfaceC12622l interfaceC12622l) {
        C11137a.m34607i(this.f15882d);
        while (true) {
            b peek = this.f15880b.peek();
            if (peek != null && interfaceC12622l.getPosition() >= peek.f15887b) {
                this.f15882d.mo21087a(this.f15880b.pop().f15886a);
                return true;
            }
            if (this.f15883e == 0) {
                long m21149d = this.f15881c.m21149d(interfaceC12622l, true, false, 4);
                if (m21149d == -2) {
                    m21149d = m21079c(interfaceC12622l);
                }
                if (m21149d == -1) {
                    return false;
                }
                this.f15884f = (int) m21149d;
                this.f15883e = 1;
            }
            if (this.f15883e == 1) {
                this.f15885g = this.f15881c.m21149d(interfaceC12622l, false, true, 8);
                this.f15883e = 2;
            }
            int mo21091e = this.f15882d.mo21091e(this.f15884f);
            if (mo21091e != 0) {
                if (mo21091e == 1) {
                    long position = interfaceC12622l.getPosition();
                    this.f15880b.push(new b(this.f15884f, this.f15885g + position));
                    this.f15882d.mo21094h(this.f15884f, position, this.f15885g);
                    this.f15883e = 0;
                    return true;
                }
                if (mo21091e == 2) {
                    long j10 = this.f15885g;
                    if (j10 <= 8) {
                        this.f15882d.mo21090d(this.f15884f, m21081e(interfaceC12622l, (int) j10));
                        this.f15883e = 0;
                        return true;
                    }
                    throw C11005b3.m33715a("Invalid integer size: " + this.f15885g, null);
                }
                if (mo21091e == 3) {
                    long j11 = this.f15885g;
                    if (j11 <= 2147483647L) {
                        this.f15882d.mo21093g(this.f15884f, m21082f(interfaceC12622l, (int) j11));
                        this.f15883e = 0;
                        return true;
                    }
                    throw C11005b3.m33715a("String element size: " + this.f15885g, null);
                }
                if (mo21091e == 4) {
                    this.f15882d.mo21089c(this.f15884f, (int) this.f15885g, interfaceC12622l);
                    this.f15883e = 0;
                    return true;
                }
                if (mo21091e != 5) {
                    throw C11005b3.m33715a("Invalid element type " + mo21091e, null);
                }
                long j12 = this.f15885g;
                if (j12 == 4 || j12 == 8) {
                    this.f15882d.mo21088b(this.f15884f, m21080d(interfaceC12622l, (int) j12));
                    this.f15883e = 0;
                    return true;
                }
                throw C11005b3.m33715a("Invalid float size: " + this.f15885g, null);
            }
            interfaceC12622l.mo41538n((int) this.f15885g);
            this.f15883e = 0;
        }
    }

    @Override // p078e7.InterfaceC7129c
    /* renamed from: b */
    public void mo21084b(InterfaceC7128b interfaceC7128b) {
        this.f15882d = interfaceC7128b;
    }

    @Override // p078e7.InterfaceC7129c
    public void reset() {
        this.f15883e = 0;
        this.f15880b.clear();
        this.f15881c.m21150e();
    }
}
