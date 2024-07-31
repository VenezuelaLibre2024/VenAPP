package p155i7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p155i7.InterfaceC7879i0;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: i7.h0 */
/* loaded from: classes.dex */
public final class C7877h0 implements InterfaceC12621k {

    /* renamed from: t */
    public static final InterfaceC12626p f18930t = new InterfaceC12626p() { // from class: i7.g0
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m24237w;
            m24237w = C7877h0.m24237w();
            return m24237w;
        }
    };

    /* renamed from: a */
    private final int f18931a;

    /* renamed from: b */
    private final int f18932b;

    /* renamed from: c */
    private final List<C11164n0> f18933c;

    /* renamed from: d */
    private final C11146e0 f18934d;

    /* renamed from: e */
    private final SparseIntArray f18935e;

    /* renamed from: f */
    private final InterfaceC7879i0.c f18936f;

    /* renamed from: g */
    private final SparseArray<InterfaceC7879i0> f18937g;

    /* renamed from: h */
    private final SparseBooleanArray f18938h;

    /* renamed from: i */
    private final SparseBooleanArray f18939i;

    /* renamed from: j */
    private final C7873f0 f18940j;

    /* renamed from: k */
    private C7871e0 f18941k;

    /* renamed from: l */
    private InterfaceC12623m f18942l;

    /* renamed from: m */
    private int f18943m;

    /* renamed from: n */
    private boolean f18944n;

    /* renamed from: o */
    private boolean f18945o;

    /* renamed from: p */
    private boolean f18946p;

    /* renamed from: q */
    private InterfaceC7879i0 f18947q;

    /* renamed from: r */
    private int f18948r;

    /* renamed from: s */
    private int f18949s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7.h0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC7865b0 {

        /* renamed from: a */
        private final C11144d0 f18950a = new C11144d0(new byte[4]);

        public a() {
        }

        @Override // p155i7.InterfaceC7865b0
        /* renamed from: a */
        public void mo24181a(C11164n0 c11164n0, InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        }

        @Override // p155i7.InterfaceC7865b0
        /* renamed from: b */
        public void mo24182b(C11146e0 c11146e0) {
            if (c11146e0.m34664H() == 0 && (c11146e0.m34664H() & RecognitionOptions.ITF) != 0) {
                c11146e0.m34678V(6);
                int m34679a = c11146e0.m34679a() / 4;
                for (int i10 = 0; i10 < m34679a; i10++) {
                    c11146e0.m34687k(this.f18950a, 4);
                    int m34632h = this.f18950a.m34632h(16);
                    this.f18950a.m34642r(3);
                    if (m34632h == 0) {
                        this.f18950a.m34642r(13);
                    } else {
                        int m34632h2 = this.f18950a.m34632h(13);
                        if (C7877h0.this.f18937g.get(m34632h2) == null) {
                            C7877h0.this.f18937g.put(m34632h2, new C7867c0(new b(m34632h2)));
                            C7877h0.m24225k(C7877h0.this);
                        }
                    }
                }
                if (C7877h0.this.f18931a != 2) {
                    C7877h0.this.f18937g.remove(0);
                }
            }
        }
    }

    /* renamed from: i7.h0$b */
    /* loaded from: classes.dex */
    private class b implements InterfaceC7865b0 {

        /* renamed from: a */
        private final C11144d0 f18952a = new C11144d0(new byte[5]);

        /* renamed from: b */
        private final SparseArray<InterfaceC7879i0> f18953b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f18954c = new SparseIntArray();

        /* renamed from: d */
        private final int f18955d;

        public b(int i10) {
            this.f18955d = i10;
        }

        /* renamed from: c */
        private InterfaceC7879i0.b m24241c(C11146e0 c11146e0, int i10) {
            int m34683f = c11146e0.m34683f();
            int i11 = i10 + m34683f;
            int i12 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (c11146e0.m34683f() < i11) {
                int m34664H = c11146e0.m34664H();
                int m34683f2 = c11146e0.m34683f() + c11146e0.m34664H();
                if (m34683f2 > i11) {
                    break;
                }
                if (m34664H == 5) {
                    long m34666J = c11146e0.m34666J();
                    if (m34666J != 1094921523) {
                        if (m34666J != 1161904947) {
                            if (m34666J != 1094921524) {
                                if (m34666J == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (m34664H != 106) {
                        if (m34664H != 122) {
                            if (m34664H == 127) {
                                if (c11146e0.m34664H() != 21) {
                                }
                                i12 = 172;
                            } else if (m34664H == 123) {
                                i12 = 138;
                            } else if (m34664H == 10) {
                                str = c11146e0.m34661E(3).trim();
                            } else if (m34664H == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c11146e0.m34683f() < m34683f2) {
                                    String trim = c11146e0.m34661E(3).trim();
                                    int m34664H2 = c11146e0.m34664H();
                                    byte[] bArr = new byte[4];
                                    c11146e0.m34688l(bArr, 0, 4);
                                    arrayList2.add(new InterfaceC7879i0.a(trim, m34664H2, bArr));
                                }
                                arrayList = arrayList2;
                                i12 = 89;
                            } else if (m34664H == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                c11146e0.m34678V(m34683f2 - c11146e0.m34683f());
            }
            c11146e0.m34677U(i11);
            return new InterfaceC7879i0.b(i12, str, arrayList, Arrays.copyOfRange(c11146e0.m34682e(), m34683f, i11));
        }

        @Override // p155i7.InterfaceC7865b0
        /* renamed from: a */
        public void mo24181a(C11164n0 c11164n0, InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        }

        @Override // p155i7.InterfaceC7865b0
        /* renamed from: b */
        public void mo24182b(C11146e0 c11146e0) {
            C11164n0 c11164n0;
            if (c11146e0.m34664H() != 2) {
                return;
            }
            if (C7877h0.this.f18931a == 1 || C7877h0.this.f18931a == 2 || C7877h0.this.f18943m == 1) {
                c11164n0 = (C11164n0) C7877h0.this.f18933c.get(0);
            } else {
                c11164n0 = new C11164n0(((C11164n0) C7877h0.this.f18933c.get(0)).m34826c());
                C7877h0.this.f18933c.add(c11164n0);
            }
            if ((c11146e0.m34664H() & RecognitionOptions.ITF) == 0) {
                return;
            }
            c11146e0.m34678V(1);
            int m34670N = c11146e0.m34670N();
            int i10 = 3;
            c11146e0.m34678V(3);
            c11146e0.m34687k(this.f18952a, 2);
            this.f18952a.m34642r(3);
            int i11 = 13;
            C7877h0.this.f18949s = this.f18952a.m34632h(13);
            c11146e0.m34687k(this.f18952a, 2);
            int i12 = 4;
            this.f18952a.m34642r(4);
            c11146e0.m34678V(this.f18952a.m34632h(12));
            if (C7877h0.this.f18931a == 2 && C7877h0.this.f18947q == null) {
                InterfaceC7879i0.b bVar = new InterfaceC7879i0.b(21, null, null, C11172r0.f29045f);
                C7877h0 c7877h0 = C7877h0.this;
                c7877h0.f18947q = c7877h0.f18936f.mo24261b(21, bVar);
                if (C7877h0.this.f18947q != null) {
                    C7877h0.this.f18947q.mo24191a(c11164n0, C7877h0.this.f18942l, new InterfaceC7879i0.d(m34670N, 21, 8192));
                }
            }
            this.f18953b.clear();
            this.f18954c.clear();
            int m34679a = c11146e0.m34679a();
            while (m34679a > 0) {
                c11146e0.m34687k(this.f18952a, 5);
                int m34632h = this.f18952a.m34632h(8);
                this.f18952a.m34642r(i10);
                int m34632h2 = this.f18952a.m34632h(i11);
                this.f18952a.m34642r(i12);
                int m34632h3 = this.f18952a.m34632h(12);
                InterfaceC7879i0.b m24241c = m24241c(c11146e0, m34632h3);
                if (m34632h == 6 || m34632h == 5) {
                    m34632h = m24241c.f18982a;
                }
                m34679a -= m34632h3 + 5;
                int i13 = C7877h0.this.f18931a == 2 ? m34632h : m34632h2;
                if (!C7877h0.this.f18938h.get(i13)) {
                    InterfaceC7879i0 mo24261b = (C7877h0.this.f18931a == 2 && m34632h == 21) ? C7877h0.this.f18947q : C7877h0.this.f18936f.mo24261b(m34632h, m24241c);
                    if (C7877h0.this.f18931a != 2 || m34632h2 < this.f18954c.get(i13, 8192)) {
                        this.f18954c.put(i13, m34632h2);
                        this.f18953b.put(i13, mo24261b);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f18954c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f18954c.keyAt(i14);
                int valueAt = this.f18954c.valueAt(i14);
                C7877h0.this.f18938h.put(keyAt, true);
                C7877h0.this.f18939i.put(valueAt, true);
                InterfaceC7879i0 valueAt2 = this.f18953b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != C7877h0.this.f18947q) {
                        valueAt2.mo24191a(c11164n0, C7877h0.this.f18942l, new InterfaceC7879i0.d(m34670N, keyAt, 8192));
                    }
                    C7877h0.this.f18937g.put(valueAt, valueAt2);
                }
            }
            if (C7877h0.this.f18931a != 2) {
                C7877h0.this.f18937g.remove(this.f18955d);
                C7877h0 c7877h02 = C7877h0.this;
                c7877h02.f18943m = c7877h02.f18931a == 1 ? 0 : C7877h0.this.f18943m - 1;
                if (C7877h0.this.f18943m != 0) {
                    return;
                } else {
                    C7877h0.this.f18942l.mo324q();
                }
            } else {
                if (C7877h0.this.f18944n) {
                    return;
                }
                C7877h0.this.f18942l.mo324q();
                C7877h0.this.f18943m = 0;
            }
            C7877h0.this.f18944n = true;
        }
    }

    public C7877h0() {
        this(0);
    }

    public C7877h0(int i10) {
        this(1, i10, 112800);
    }

    public C7877h0(int i10, int i11, int i12) {
        this(i10, new C11164n0(0L), new C7880j(i11), i12);
    }

    public C7877h0(int i10, C11164n0 c11164n0, InterfaceC7879i0.c cVar) {
        this(i10, c11164n0, cVar, 112800);
    }

    public C7877h0(int i10, C11164n0 c11164n0, InterfaceC7879i0.c cVar, int i11) {
        this.f18936f = (InterfaceC7879i0.c) C11137a.m34603e(cVar);
        this.f18932b = i11;
        this.f18931a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f18933c = Collections.singletonList(c11164n0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f18933c = arrayList;
            arrayList.add(c11164n0);
        }
        this.f18934d = new C11146e0(new byte[9400], 0);
        this.f18938h = new SparseBooleanArray();
        this.f18939i = new SparseBooleanArray();
        this.f18937g = new SparseArray<>();
        this.f18935e = new SparseIntArray();
        this.f18940j = new C7873f0(i11);
        this.f18942l = InterfaceC12623m.f34302o;
        this.f18949s = -1;
        m24239y();
    }

    /* renamed from: k */
    static /* synthetic */ int m24225k(C7877h0 c7877h0) {
        int i10 = c7877h0.f18943m;
        c7877h0.f18943m = i10 + 1;
        return i10;
    }

    /* renamed from: u */
    private boolean m24235u(InterfaceC12622l interfaceC12622l) {
        byte[] m34682e = this.f18934d.m34682e();
        if (9400 - this.f18934d.m34683f() < 188) {
            int m34679a = this.f18934d.m34679a();
            if (m34679a > 0) {
                System.arraycopy(m34682e, this.f18934d.m34683f(), m34682e, 0, m34679a);
            }
            this.f18934d.m34675S(m34682e, m34679a);
        }
        while (this.f18934d.m34679a() < 188) {
            int m34684g = this.f18934d.m34684g();
            int read = interfaceC12622l.read(m34682e, m34684g, 9400 - m34684g);
            if (read == -1) {
                return false;
            }
            this.f18934d.m34676T(m34684g + read);
        }
        return true;
    }

    /* renamed from: v */
    private int m24236v() {
        int m34683f = this.f18934d.m34683f();
        int m34684g = this.f18934d.m34684g();
        int m24270a = C7881j0.m24270a(this.f18934d.m34682e(), m34683f, m34684g);
        this.f18934d.m34677U(m24270a);
        int i10 = m24270a + 188;
        if (i10 > m34684g) {
            int i11 = this.f18948r + (m24270a - m34683f);
            this.f18948r = i11;
            if (this.f18931a == 2 && i11 > 376) {
                throw C11005b3.m33715a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f18948r = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ InterfaceC12621k[] m24237w() {
        return new InterfaceC12621k[]{new C7877h0()};
    }

    /* renamed from: x */
    private void m24238x(long j10) {
        InterfaceC12623m interfaceC12623m;
        InterfaceC12636z bVar;
        if (this.f18945o) {
            return;
        }
        this.f18945o = true;
        if (this.f18940j.m24208b() != -9223372036854775807L) {
            C7871e0 c7871e0 = new C7871e0(this.f18940j.m24209c(), this.f18940j.m24208b(), j10, this.f18949s, this.f18932b);
            this.f18941k = c7871e0;
            interfaceC12623m = this.f18942l;
            bVar = c7871e0.m41472b();
        } else {
            interfaceC12623m = this.f18942l;
            bVar = new InterfaceC12636z.b(this.f18940j.m24208b());
        }
        interfaceC12623m.mo323p(bVar);
    }

    /* renamed from: y */
    private void m24239y() {
        this.f18938h.clear();
        this.f18937g.clear();
        SparseArray<InterfaceC7879i0> mo24260a = this.f18936f.mo24260a();
        int size = mo24260a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18937g.put(mo24260a.keyAt(i10), mo24260a.valueAt(i10));
        }
        this.f18937g.put(0, new C7867c0(new a()));
        this.f18947q = null;
    }

    /* renamed from: z */
    private boolean m24240z(int i10) {
        return this.f18931a == 2 || this.f18944n || !this.f18939i.get(i10, false);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        C7871e0 c7871e0;
        C11137a.m34605g(this.f18931a != 2);
        int size = this.f18933c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C11164n0 c11164n0 = this.f18933c.get(i10);
            boolean z10 = c11164n0.m34828e() == -9223372036854775807L;
            if (!z10) {
                long m34826c = c11164n0.m34826c();
                z10 = (m34826c == -9223372036854775807L || m34826c == 0 || m34826c == j11) ? false : true;
            }
            if (z10) {
                c11164n0.m34829g(j11);
            }
        }
        if (j11 != 0 && (c7871e0 = this.f18941k) != null) {
            c7871e0.m41478h(j11);
        }
        this.f18934d.m34673Q(0);
        this.f18935e.clear();
        for (int i11 = 0; i11 < this.f18937g.size(); i11++) {
            this.f18937g.valueAt(i11).mo24193c();
        }
        this.f18948r = 0;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f18942l = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        boolean z10;
        byte[] m34682e = this.f18934d.m34682e();
        interfaceC12622l.mo41540q(m34682e, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (m34682e[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                interfaceC12622l.mo41538n(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        long length = interfaceC12622l.getLength();
        if (this.f18944n) {
            if (((length == -1 || this.f18931a == 2) ? false : true) && !this.f18940j.m24210d()) {
                return this.f18940j.m24211e(interfaceC12622l, c12635y, this.f18949s);
            }
            m24238x(length);
            if (this.f18946p) {
                this.f18946p = false;
                mo121a(0L, 0L);
                if (interfaceC12622l.getPosition() != 0) {
                    c12635y.f34331a = 0L;
                    return 1;
                }
            }
            C7871e0 c7871e0 = this.f18941k;
            if (c7871e0 != null && c7871e0.m41474d()) {
                return this.f18941k.m41473c(interfaceC12622l, c12635y);
            }
        }
        if (!m24235u(interfaceC12622l)) {
            return -1;
        }
        int m24236v = m24236v();
        int m34684g = this.f18934d.m34684g();
        if (m24236v > m34684g) {
            return 0;
        }
        int m34692q = this.f18934d.m34692q();
        if ((8388608 & m34692q) == 0) {
            int i10 = ((4194304 & m34692q) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & m34692q) >> 8;
            boolean z10 = (m34692q & 32) != 0;
            InterfaceC7879i0 interfaceC7879i0 = (m34692q & 16) != 0 ? this.f18937g.get(i11) : null;
            if (interfaceC7879i0 != null) {
                if (this.f18931a != 2) {
                    int i12 = m34692q & 15;
                    int i13 = this.f18935e.get(i11, i12 - 1);
                    this.f18935e.put(i11, i12);
                    if (i13 != i12) {
                        if (i12 != ((i13 + 1) & 15)) {
                            interfaceC7879i0.mo24193c();
                        }
                    }
                }
                if (z10) {
                    int m34664H = this.f18934d.m34664H();
                    i10 |= (this.f18934d.m34664H() & 64) != 0 ? 2 : 0;
                    this.f18934d.m34678V(m34664H - 1);
                }
                boolean z11 = this.f18944n;
                if (m24240z(i11)) {
                    this.f18934d.m34676T(m24236v);
                    interfaceC7879i0.mo24192b(this.f18934d, i10);
                    this.f18934d.m34676T(m34684g);
                }
                if (this.f18931a != 2 && !z11 && this.f18944n && length != -1) {
                    this.f18946p = true;
                }
            }
        }
        this.f18934d.m34677U(m24236v);
        return 0;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
