package p397v7;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p351s8.C10809a;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10823h;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p397v7.C11732u0;
import p414w6.C12078c;
import p414w6.C12082g;
import p459y6.InterfaceC12609b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v7.s0 */
/* loaded from: classes.dex */
public class C11728s0 {

    /* renamed from: a */
    private final InterfaceC10811b f30866a;

    /* renamed from: b */
    private final int f30867b;

    /* renamed from: c */
    private final C11146e0 f30868c;

    /* renamed from: d */
    private a f30869d;

    /* renamed from: e */
    private a f30870e;

    /* renamed from: f */
    private a f30871f;

    /* renamed from: g */
    private long f30872g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.s0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC10811b.a {

        /* renamed from: a */
        public long f30873a;

        /* renamed from: b */
        public long f30874b;

        /* renamed from: c */
        public C10809a f30875c;

        /* renamed from: d */
        public a f30876d;

        public a(long j10, int i10) {
            m37022d(j10, i10);
        }

        @Override // p351s8.InterfaceC10811b.a
        /* renamed from: a */
        public C10809a mo32946a() {
            return (C10809a) C11137a.m34603e(this.f30875c);
        }

        /* renamed from: b */
        public a m37020b() {
            this.f30875c = null;
            a aVar = this.f30876d;
            this.f30876d = null;
            return aVar;
        }

        /* renamed from: c */
        public void m37021c(C10809a c10809a, a aVar) {
            this.f30875c = c10809a;
            this.f30876d = aVar;
        }

        /* renamed from: d */
        public void m37022d(long j10, int i10) {
            C11137a.m34605g(this.f30875c == null);
            this.f30873a = j10;
            this.f30874b = j10 + i10;
        }

        /* renamed from: e */
        public int m37023e(long j10) {
            return ((int) (j10 - this.f30873a)) + this.f30875c.f27305b;
        }

        @Override // p351s8.InterfaceC10811b.a
        public InterfaceC10811b.a next() {
            a aVar = this.f30876d;
            if (aVar == null || aVar.f30875c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C11728s0(InterfaceC10811b interfaceC10811b) {
        this.f30866a = interfaceC10811b;
        int mo32945e = interfaceC10811b.mo32945e();
        this.f30867b = mo32945e;
        this.f30868c = new C11146e0(32);
        a aVar = new a(0L, mo32945e);
        this.f30869d = aVar;
        this.f30870e = aVar;
        this.f30871f = aVar;
    }

    /* renamed from: a */
    private void m37003a(a aVar) {
        if (aVar.f30875c == null) {
            return;
        }
        this.f30866a.mo32944d(aVar);
        aVar.m37020b();
    }

    /* renamed from: d */
    private static a m37004d(a aVar, long j10) {
        while (j10 >= aVar.f30874b) {
            aVar = aVar.f30876d;
        }
        return aVar;
    }

    /* renamed from: g */
    private void m37005g(int i10) {
        long j10 = this.f30872g + i10;
        this.f30872g = j10;
        a aVar = this.f30871f;
        if (j10 == aVar.f30874b) {
            this.f30871f = aVar.f30876d;
        }
    }

    /* renamed from: h */
    private int m37006h(int i10) {
        a aVar = this.f30871f;
        if (aVar.f30875c == null) {
            aVar.m37021c(this.f30866a.mo32942b(), new a(this.f30871f.f30874b, this.f30867b));
        }
        return Math.min(i10, (int) (this.f30871f.f30874b - this.f30872g));
    }

    /* renamed from: i */
    private static a m37007i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a m37004d = m37004d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (m37004d.f30874b - j10));
            byteBuffer.put(m37004d.f30875c.f27304a, m37004d.m37023e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == m37004d.f30874b) {
                m37004d = m37004d.f30876d;
            }
        }
        return m37004d;
    }

    /* renamed from: j */
    private static a m37008j(a aVar, long j10, byte[] bArr, int i10) {
        a m37004d = m37004d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (m37004d.f30874b - j10));
            System.arraycopy(m37004d.f30875c.f27304a, m37004d.m37023e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == m37004d.f30874b) {
                m37004d = m37004d.f30876d;
            }
        }
        return m37004d;
    }

    /* renamed from: k */
    private static a m37009k(a aVar, C12082g c12082g, C11732u0.b bVar, C11146e0 c11146e0) {
        long j10 = bVar.f30924b;
        int i10 = 1;
        c11146e0.m34673Q(1);
        a m37008j = m37008j(aVar, j10, c11146e0.m34682e(), 1);
        long j11 = j10 + 1;
        byte b10 = c11146e0.m34682e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        C12078c c12078c = c12082g.f32141b;
        byte[] bArr = c12078c.f32117a;
        if (bArr == null) {
            c12078c.f32117a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a m37008j2 = m37008j(m37008j, j11, c12078c.f32117a, i11);
        long j12 = j11 + i11;
        if (z10) {
            c11146e0.m34673Q(2);
            m37008j2 = m37008j(m37008j2, j12, c11146e0.m34682e(), 2);
            j12 += 2;
            i10 = c11146e0.m34670N();
        }
        int i12 = i10;
        int[] iArr = c12078c.f32120d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c12078c.f32121e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            c11146e0.m34673Q(i13);
            m37008j2 = m37008j(m37008j2, j12, c11146e0.m34682e(), i13);
            j12 += i13;
            c11146e0.m34677U(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = c11146e0.m34670N();
                iArr4[i14] = c11146e0.m34668L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f30923a - ((int) (j12 - bVar.f30924b));
        }
        InterfaceC12609b0.a aVar2 = (InterfaceC12609b0.a) C11172r0.m34928j(bVar.f30925c);
        c12078c.m38801c(i12, iArr2, iArr4, aVar2.f34226b, c12078c.f32117a, aVar2.f34225a, aVar2.f34227c, aVar2.f34228d);
        long j13 = bVar.f30924b;
        int i15 = (int) (j12 - j13);
        bVar.f30924b = j13 + i15;
        bVar.f30923a -= i15;
        return m37008j2;
    }

    /* renamed from: l */
    private static a m37010l(a aVar, C12082g c12082g, C11732u0.b bVar, C11146e0 c11146e0) {
        long j10;
        ByteBuffer byteBuffer;
        if (c12082g.m38809A()) {
            aVar = m37009k(aVar, c12082g, bVar, c11146e0);
        }
        if (c12082g.m38792q()) {
            c11146e0.m34673Q(4);
            a m37008j = m37008j(aVar, bVar.f30924b, c11146e0.m34682e(), 4);
            int m34668L = c11146e0.m34668L();
            bVar.f30924b += 4;
            bVar.f30923a -= 4;
            c12082g.m38811y(m34668L);
            aVar = m37007i(m37008j, bVar.f30924b, c12082g.f32142c, m34668L);
            bVar.f30924b += m34668L;
            int i10 = bVar.f30923a - m34668L;
            bVar.f30923a = i10;
            c12082g.m38810C(i10);
            j10 = bVar.f30924b;
            byteBuffer = c12082g.f32145f;
        } else {
            c12082g.m38811y(bVar.f30923a);
            j10 = bVar.f30924b;
            byteBuffer = c12082g.f32142c;
        }
        return m37007i(aVar, j10, byteBuffer, bVar.f30923a);
    }

    /* renamed from: b */
    public void m37011b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f30869d;
            if (j10 < aVar.f30874b) {
                break;
            }
            this.f30866a.mo32941a(aVar.f30875c);
            this.f30869d = this.f30869d.m37020b();
        }
        if (this.f30870e.f30873a < aVar.f30873a) {
            this.f30870e = aVar;
        }
    }

    /* renamed from: c */
    public void m37012c(long j10) {
        C11137a.m34599a(j10 <= this.f30872g);
        this.f30872g = j10;
        if (j10 != 0) {
            a aVar = this.f30869d;
            if (j10 != aVar.f30873a) {
                while (this.f30872g > aVar.f30874b) {
                    aVar = aVar.f30876d;
                }
                a aVar2 = (a) C11137a.m34603e(aVar.f30876d);
                m37003a(aVar2);
                a aVar3 = new a(aVar.f30874b, this.f30867b);
                aVar.f30876d = aVar3;
                if (this.f30872g == aVar.f30874b) {
                    aVar = aVar3;
                }
                this.f30871f = aVar;
                if (this.f30870e == aVar2) {
                    this.f30870e = aVar3;
                    return;
                }
                return;
            }
        }
        m37003a(this.f30869d);
        a aVar4 = new a(this.f30872g, this.f30867b);
        this.f30869d = aVar4;
        this.f30870e = aVar4;
        this.f30871f = aVar4;
    }

    /* renamed from: e */
    public long m37013e() {
        return this.f30872g;
    }

    /* renamed from: f */
    public void m37014f(C12082g c12082g, C11732u0.b bVar) {
        m37010l(this.f30870e, c12082g, bVar, this.f30868c);
    }

    /* renamed from: m */
    public void m37015m(C12082g c12082g, C11732u0.b bVar) {
        this.f30870e = m37010l(this.f30870e, c12082g, bVar, this.f30868c);
    }

    /* renamed from: n */
    public void m37016n() {
        m37003a(this.f30869d);
        this.f30869d.m37022d(0L, this.f30867b);
        a aVar = this.f30869d;
        this.f30870e = aVar;
        this.f30871f = aVar;
        this.f30872g = 0L;
        this.f30866a.mo32943c();
    }

    /* renamed from: o */
    public void m37017o() {
        this.f30870e = this.f30869d;
    }

    /* renamed from: p */
    public int m37018p(InterfaceC10823h interfaceC10823h, int i10, boolean z10) {
        int m37006h = m37006h(i10);
        a aVar = this.f30871f;
        int read = interfaceC10823h.read(aVar.f30875c.f27304a, aVar.m37023e(this.f30872g), m37006h);
        if (read != -1) {
            m37005g(read);
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: q */
    public void m37019q(C11146e0 c11146e0, int i10) {
        while (i10 > 0) {
            int m37006h = m37006h(i10);
            a aVar = this.f30871f;
            c11146e0.m34688l(aVar.f30875c.f27304a, aVar.m37023e(this.f30872g), m37006h);
            i10 -= m37006h;
            m37005g(m37006h);
        }
    }
}
