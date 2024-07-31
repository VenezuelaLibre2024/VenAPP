package p481z6;

import java.io.EOFException;
import java.util.Arrays;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.C12612d;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: z6.b */
/* loaded from: classes.dex */
public final class C12808b implements InterfaceC12621k {

    /* renamed from: r */
    private static final int[] f34881r;

    /* renamed from: u */
    private static final int f34884u;

    /* renamed from: a */
    private final byte[] f34885a;

    /* renamed from: b */
    private final int f34886b;

    /* renamed from: c */
    private boolean f34887c;

    /* renamed from: d */
    private long f34888d;

    /* renamed from: e */
    private int f34889e;

    /* renamed from: f */
    private int f34890f;

    /* renamed from: g */
    private boolean f34891g;

    /* renamed from: h */
    private long f34892h;

    /* renamed from: i */
    private int f34893i;

    /* renamed from: j */
    private int f34894j;

    /* renamed from: k */
    private long f34895k;

    /* renamed from: l */
    private InterfaceC12623m f34896l;

    /* renamed from: m */
    private InterfaceC12609b0 f34897m;

    /* renamed from: n */
    private InterfaceC12636z f34898n;

    /* renamed from: o */
    private boolean f34899o;

    /* renamed from: p */
    public static final InterfaceC12626p f34879p = new InterfaceC12626p() { // from class: z6.a
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m42450m;
            m42450m = C12808b.m42450m();
            return m42450m;
        }
    };

    /* renamed from: q */
    private static final int[] f34880q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f34882s = C11172r0.m34935m0("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f34883t = C11172r0.m34935m0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f34881r = iArr;
        f34884u = iArr[8];
    }

    public C12808b() {
        this(0);
    }

    public C12808b(int i10) {
        this.f34886b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f34885a = new byte[1];
        this.f34893i = -1;
    }

    /* renamed from: d */
    private void m42443d() {
        C11137a.m34607i(this.f34897m);
        C11172r0.m34928j(this.f34896l);
    }

    /* renamed from: g */
    private static int m42444g(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    /* renamed from: h */
    private InterfaceC12636z m42445h(long j10, boolean z10) {
        return new C12612d(j10, this.f34892h, m42444g(this.f34893i, 20000L), this.f34893i, z10);
    }

    /* renamed from: i */
    private int m42446i(int i10) {
        if (m42448k(i10)) {
            return this.f34887c ? f34881r[i10] : f34880q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f34887c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw C11005b3.m33715a(sb2.toString(), null);
    }

    /* renamed from: j */
    private boolean m42447j(int i10) {
        return !this.f34887c && (i10 < 12 || i10 > 14);
    }

    /* renamed from: k */
    private boolean m42448k(int i10) {
        return i10 >= 0 && i10 <= 15 && (m42449l(i10) || m42447j(i10));
    }

    /* renamed from: l */
    private boolean m42449l(int i10) {
        return this.f34887c && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ InterfaceC12621k[] m42450m() {
        return new InterfaceC12621k[]{new C12808b()};
    }

    /* renamed from: n */
    private void m42451n() {
        if (this.f34899o) {
            return;
        }
        this.f34899o = true;
        boolean z10 = this.f34887c;
        this.f34897m.mo332c(new C11108u1.b().m34552g0(z10 ? "audio/amr-wb" : "audio/3gpp").m34544Y(f34884u).m34529J(1).m34553h0(z10 ? 16000 : 8000).m34526G());
    }

    /* renamed from: o */
    private void m42452o(long j10, int i10) {
        InterfaceC12636z bVar;
        int i11;
        if (this.f34891g) {
            return;
        }
        int i12 = this.f34886b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f34893i) == -1 || i11 == this.f34889e)) {
            bVar = new InterfaceC12636z.b(-9223372036854775807L);
        } else if (this.f34894j < 20 && i10 != -1) {
            return;
        } else {
            bVar = m42445h(j10, (i12 & 2) != 0);
        }
        this.f34898n = bVar;
        this.f34896l.mo323p(bVar);
        this.f34891g = true;
    }

    /* renamed from: p */
    private static boolean m42453p(InterfaceC12622l interfaceC12622l, byte[] bArr) {
        interfaceC12622l.mo41534f();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC12622l.mo41540q(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: q */
    private int m42454q(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41540q(this.f34885a, 0, 1);
        byte b10 = this.f34885a[0];
        if ((b10 & 131) <= 0) {
            return m42446i((b10 >> 3) & 15);
        }
        throw C11005b3.m33715a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    /* renamed from: r */
    private boolean m42455r(InterfaceC12622l interfaceC12622l) {
        int length;
        byte[] bArr = f34882s;
        if (m42453p(interfaceC12622l, bArr)) {
            this.f34887c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f34883t;
            if (!m42453p(interfaceC12622l, bArr2)) {
                return false;
            }
            this.f34887c = true;
            length = bArr2.length;
        }
        interfaceC12622l.mo41538n(length);
        return true;
    }

    /* renamed from: s */
    private int m42456s(InterfaceC12622l interfaceC12622l) {
        if (this.f34890f == 0) {
            try {
                int m42454q = m42454q(interfaceC12622l);
                this.f34889e = m42454q;
                this.f34890f = m42454q;
                if (this.f34893i == -1) {
                    this.f34892h = interfaceC12622l.getPosition();
                    this.f34893i = this.f34889e;
                }
                if (this.f34893i == this.f34889e) {
                    this.f34894j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int m41512f = this.f34897m.m41512f(interfaceC12622l, this.f34890f, true);
        if (m41512f == -1) {
            return -1;
        }
        int i10 = this.f34890f - m41512f;
        this.f34890f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f34897m.mo331b(this.f34895k + this.f34888d, 1, this.f34889e, 0, null);
        this.f34888d += 20000;
        return 0;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f34888d = 0L;
        this.f34889e = 0;
        this.f34890f = 0;
        if (j10 != 0) {
            InterfaceC12636z interfaceC12636z = this.f34898n;
            if (interfaceC12636z instanceof C12612d) {
                this.f34895k = ((C12612d) interfaceC12636z).m41520b(j10);
                return;
            }
        }
        this.f34895k = 0L;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f34896l = interfaceC12623m;
        this.f34897m = interfaceC12623m.mo308d(0, 1);
        interfaceC12623m.mo324q();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return m42455r(interfaceC12622l);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        m42443d();
        if (interfaceC12622l.getPosition() == 0 && !m42455r(interfaceC12622l)) {
            throw C11005b3.m33715a("Could not find AMR header.", null);
        }
        m42451n();
        int m42456s = m42456s(interfaceC12622l);
        m42452o(interfaceC12622l.getLength(), m42456s);
        return m42456s;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
