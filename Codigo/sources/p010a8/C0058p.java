package p010a8;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5867e0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p010a8.C0048f;
import p010a8.C0058p;
import p216l7.C9400a;
import p250n7.C9672a;
import p250n7.C9673b;
import p306q7.C10290l;
import p307q8.C10320z;
import p351s8.C10810a0;
import p351s8.C10818e0;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10823h;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.C11731u;
import p397v7.C11732u0;
import p397v7.C11737x;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11736w0;
import p414w6.C12082g;
import p436x6.C12318m;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;
import p437x7.AbstractC12340f;
import p459y6.C12620j;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a8.p */
/* loaded from: classes.dex */
public final class C0058p implements C10818e0.b<AbstractC12340f>, C10818e0.f, InterfaceC11736w0, InterfaceC12623m, C11732u0.d {

    /* renamed from: j0 */
    private static final Set<Integer> f221j0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    private final Runnable f222A;

    /* renamed from: B */
    private final Runnable f223B;

    /* renamed from: C */
    private final Handler f224C;

    /* renamed from: D */
    private final ArrayList<C0054l> f225D;

    /* renamed from: E */
    private final Map<String, C12318m> f226E;

    /* renamed from: F */
    private AbstractC12340f f227F;

    /* renamed from: G */
    private d[] f228G;

    /* renamed from: I */
    private Set<Integer> f230I;

    /* renamed from: J */
    private SparseIntArray f231J;

    /* renamed from: K */
    private InterfaceC12609b0 f232K;

    /* renamed from: L */
    private int f233L;

    /* renamed from: M */
    private int f234M;

    /* renamed from: N */
    private boolean f235N;

    /* renamed from: O */
    private boolean f236O;

    /* renamed from: P */
    private int f237P;

    /* renamed from: Q */
    private C11108u1 f238Q;

    /* renamed from: R */
    private C11108u1 f239R;

    /* renamed from: S */
    private boolean f240S;

    /* renamed from: T */
    private C11700f1 f241T;

    /* renamed from: U */
    private Set<C11694d1> f242U;

    /* renamed from: V */
    private int[] f243V;

    /* renamed from: W */
    private int f244W;

    /* renamed from: X */
    private boolean f245X;

    /* renamed from: Y */
    private boolean[] f246Y;

    /* renamed from: Z */
    private boolean[] f247Z;

    /* renamed from: a */
    private final String f248a;

    /* renamed from: a0 */
    private long f249a0;

    /* renamed from: b */
    private final int f250b;

    /* renamed from: b0 */
    private long f251b0;

    /* renamed from: c */
    private final b f252c;

    /* renamed from: c0 */
    private boolean f253c0;

    /* renamed from: d */
    private final C0048f f254d;

    /* renamed from: d0 */
    private boolean f255d0;

    /* renamed from: e */
    private final InterfaceC10811b f256e;

    /* renamed from: e0 */
    private boolean f257e0;

    /* renamed from: f */
    private final C11108u1 f258f;

    /* renamed from: f0 */
    private boolean f259f0;

    /* renamed from: g0 */
    private long f260g0;

    /* renamed from: h0 */
    private C12318m f261h0;

    /* renamed from: i0 */
    private C0051i f262i0;

    /* renamed from: r */
    private final InterfaceC12330v f263r;

    /* renamed from: s */
    private final InterfaceC12329u.a f264s;

    /* renamed from: t */
    private final InterfaceC10816d0 f265t;

    /* renamed from: v */
    private final InterfaceC11705h0.a f267v;

    /* renamed from: w */
    private final int f268w;

    /* renamed from: y */
    private final ArrayList<C0051i> f270y;

    /* renamed from: z */
    private final List<C0051i> f271z;

    /* renamed from: u */
    private final C10818e0 f266u = new C10818e0("Loader:HlsSampleStreamWrapper");

    /* renamed from: x */
    private final C0048f.b f269x = new C0048f.b();

    /* renamed from: H */
    private int[] f229H = new int[0];

    /* renamed from: a8.p$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC11736w0.a<C0058p> {
        /* renamed from: i */
        void mo260i(Uri uri);

        void onPrepared();
    }

    /* renamed from: a8.p$c */
    /* loaded from: classes.dex */
    private static class c implements InterfaceC12609b0 {

        /* renamed from: g */
        private static final C11108u1 f272g = new C11108u1.b().m34552g0("application/id3").m34526G();

        /* renamed from: h */
        private static final C11108u1 f273h = new C11108u1.b().m34552g0("application/x-emsg").m34526G();

        /* renamed from: a */
        private final C9673b f274a = new C9673b();

        /* renamed from: b */
        private final InterfaceC12609b0 f275b;

        /* renamed from: c */
        private final C11108u1 f276c;

        /* renamed from: d */
        private C11108u1 f277d;

        /* renamed from: e */
        private byte[] f278e;

        /* renamed from: f */
        private int f279f;

        public c(InterfaceC12609b0 interfaceC12609b0, int i10) {
            C11108u1 c11108u1;
            this.f275b = interfaceC12609b0;
            if (i10 == 1) {
                c11108u1 = f272g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                c11108u1 = f273h;
            }
            this.f276c = c11108u1;
            this.f278e = new byte[0];
            this.f279f = 0;
        }

        /* renamed from: g */
        private boolean m328g(C9672a c9672a) {
            C11108u1 mo28002H = c9672a.mo28002H();
            return mo28002H != null && C11172r0.m34914c(this.f276c.f28797w, mo28002H.f28797w);
        }

        /* renamed from: h */
        private void m329h(int i10) {
            byte[] bArr = this.f278e;
            if (bArr.length < i10) {
                this.f278e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        /* renamed from: i */
        private C11146e0 m330i(int i10, int i11) {
            int i12 = this.f279f - i11;
            C11146e0 c11146e0 = new C11146e0(Arrays.copyOfRange(this.f278e, i12 - i10, i12));
            byte[] bArr = this.f278e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f279f = i11;
            return c11146e0;
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: b */
        public void mo331b(long j10, int i10, int i11, int i12, InterfaceC12609b0.a aVar) {
            C11137a.m34603e(this.f277d);
            C11146e0 m330i = m330i(i11, i12);
            if (!C11172r0.m34914c(this.f277d.f28797w, this.f276c.f28797w)) {
                if (!"application/x-emsg".equals(this.f277d.f28797w)) {
                    C11173s.m34970i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f277d.f28797w);
                    return;
                }
                C9672a m28983c = this.f274a.m28983c(m330i);
                if (!m328g(m28983c)) {
                    C11173s.m34970i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f276c.f28797w, m28983c.mo28002H()));
                    return;
                }
                m330i = new C11146e0((byte[]) C11137a.m34603e(m28983c.mo28004q1()));
            }
            int m34679a = m330i.m34679a();
            this.f275b.m41511a(m330i, m34679a);
            this.f275b.mo331b(j10, i10, m34679a, i12, aVar);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: c */
        public void mo332c(C11108u1 c11108u1) {
            this.f277d = c11108u1;
            this.f275b.mo332c(this.f276c);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: d */
        public void mo333d(C11146e0 c11146e0, int i10, int i11) {
            m329h(this.f279f + i10);
            c11146e0.m34688l(this.f278e, this.f279f, i10);
            this.f279f += i10;
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: e */
        public int mo334e(InterfaceC10823h interfaceC10823h, int i10, boolean z10, int i11) {
            m329h(this.f279f + i10);
            int read = interfaceC10823h.read(this.f278e, this.f279f, i10);
            if (read != -1) {
                this.f279f += read;
                return read;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a8.p$d */
    /* loaded from: classes.dex */
    public static final class d extends C11732u0 {

        /* renamed from: H */
        private final Map<String, C12318m> f280H;

        /* renamed from: I */
        private C12318m f281I;

        private d(InterfaceC10811b interfaceC10811b, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar, Map<String, C12318m> map) {
            super(interfaceC10811b, interfaceC12330v, aVar);
            this.f280H = map;
        }

        /* renamed from: h0 */
        private C9400a m335h0(C9400a c9400a) {
            if (c9400a == null) {
                return null;
            }
            int m27999e = c9400a.m27999e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= m27999e) {
                    i11 = -1;
                    break;
                }
                C9400a.b m27998d = c9400a.m27998d(i11);
                if ((m27998d instanceof C10290l) && "com.apple.streaming.transportStreamTimestamp".equals(((C10290l) m27998d).f25560b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return c9400a;
            }
            if (m27999e == 1) {
                return null;
            }
            C9400a.b[] bVarArr = new C9400a.b[m27999e - 1];
            while (i10 < m27999e) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = c9400a.m27998d(i10);
                }
                i10++;
            }
            return new C9400a(bVarArr);
        }

        @Override // p397v7.C11732u0, p459y6.InterfaceC12609b0
        /* renamed from: b */
        public void mo331b(long j10, int i10, int i11, int i12, InterfaceC12609b0.a aVar) {
            super.mo331b(j10, i10, i11, i12, aVar);
        }

        /* renamed from: i0 */
        public void m336i0(C12318m c12318m) {
            this.f281I = c12318m;
            m37052I();
        }

        /* renamed from: j0 */
        public void m337j0(C0051i c0051i) {
            m37068f0(c0051i.f173k);
        }

        @Override // p397v7.C11732u0
        /* renamed from: w */
        public C11108u1 mo338w(C11108u1 c11108u1) {
            C12318m c12318m;
            C12318m c12318m2 = this.f281I;
            if (c12318m2 == null) {
                c12318m2 = c11108u1.f28800z;
            }
            if (c12318m2 != null && (c12318m = this.f280H.get(c12318m2.f33051c)) != null) {
                c12318m2 = c12318m;
            }
            C9400a m335h0 = m335h0(c11108u1.f28795u);
            if (c12318m2 != c11108u1.f28800z || m335h0 != c11108u1.f28795u) {
                c11108u1 = c11108u1.m34488c().m34534O(c12318m2).m34545Z(m335h0).m34526G();
            }
            return super.mo338w(c11108u1);
        }
    }

    public C0058p(String str, int i10, b bVar, C0048f c0048f, Map<String, C12318m> map, InterfaceC10811b interfaceC10811b, long j10, C11108u1 c11108u1, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar2, int i11) {
        this.f248a = str;
        this.f250b = i10;
        this.f252c = bVar;
        this.f254d = c0048f;
        this.f226E = map;
        this.f256e = interfaceC10811b;
        this.f258f = c11108u1;
        this.f263r = interfaceC12330v;
        this.f264s = aVar;
        this.f265t = interfaceC10816d0;
        this.f267v = aVar2;
        this.f268w = i11;
        Set<Integer> set = f221j0;
        this.f230I = new HashSet(set.size());
        this.f231J = new SparseIntArray(set.size());
        this.f228G = new d[0];
        this.f247Z = new boolean[0];
        this.f246Y = new boolean[0];
        ArrayList<C0051i> arrayList = new ArrayList<>();
        this.f270y = arrayList;
        this.f271z = Collections.unmodifiableList(arrayList);
        this.f225D = new ArrayList<>();
        this.f222A = new Runnable() { // from class: a8.n
            @Override // java.lang.Runnable
            public final void run() {
                C0058p.this.m283S();
            }
        };
        this.f223B = new Runnable() { // from class: a8.o
            @Override // java.lang.Runnable
            public final void run() {
                C0058p.this.m284b0();
            }
        };
        this.f224C = C11172r0.m34954w();
        this.f249a0 = j10;
        this.f251b0 = j10;
    }

    /* renamed from: B */
    private static C12620j m268B(int i10, int i11) {
        C11173s.m34970i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C12620j();
    }

    /* renamed from: C */
    private C11732u0 m269C(int i10, int i11) {
        int length = this.f228G.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f256e, this.f263r, this.f264s, this.f226E);
        dVar.m37065b0(this.f249a0);
        if (z10) {
            dVar.m336i0(this.f261h0);
        }
        dVar.m37064a0(this.f260g0);
        C0051i c0051i = this.f262i0;
        if (c0051i != null) {
            dVar.m337j0(c0051i);
        }
        dVar.m37066d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f229H, i12);
        this.f229H = copyOf;
        copyOf[length] = i10;
        this.f228G = (d[]) C11172r0.m34867F0(this.f228G, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f247Z, i12);
        this.f247Z = copyOf2;
        copyOf2[length] = z10;
        this.f245X |= z10;
        this.f230I.add(Integer.valueOf(i11));
        this.f231J.append(i11, length);
        if (m278L(i11) > m278L(this.f233L)) {
            this.f234M = length;
            this.f233L = i11;
        }
        this.f246Y = Arrays.copyOf(this.f246Y, i12);
        return dVar;
    }

    /* renamed from: D */
    private C11700f1 m270D(C11694d1[] c11694d1Arr) {
        for (int i10 = 0; i10 < c11694d1Arr.length; i10++) {
            C11694d1 c11694d1 = c11694d1Arr[i10];
            C11108u1[] c11108u1Arr = new C11108u1[c11694d1.f30658a];
            for (int i11 = 0; i11 < c11694d1.f30658a; i11++) {
                C11108u1 m36849d = c11694d1.m36849d(i11);
                c11108u1Arr[i11] = m36849d.m34489d(this.f263r.mo39795d(m36849d));
            }
            c11694d1Arr[i10] = new C11694d1(c11694d1.f30659b, c11108u1Arr);
        }
        return new C11700f1(c11694d1Arr);
    }

    /* renamed from: E */
    private static C11108u1 m271E(C11108u1 c11108u1, C11108u1 c11108u12, boolean z10) {
        String m34996d;
        String str;
        if (c11108u1 == null) {
            return c11108u12;
        }
        int m35003k = C11178w.m35003k(c11108u12.f28797w);
        if (C11172r0.m34876K(c11108u1.f28794t, m35003k) == 1) {
            m34996d = C11172r0.m34878L(c11108u1.f28794t, m35003k);
            str = C11178w.m34999g(m34996d);
        } else {
            m34996d = C11178w.m34996d(c11108u1.f28794t, c11108u12.f28797w);
            str = c11108u12.f28797w;
        }
        C11108u1.b m34530K = c11108u12.m34488c().m34540U(c11108u1.f28786a).m34542W(c11108u1.f28787b).m34543X(c11108u1.f28788c).m34554i0(c11108u1.f28789d).m34550e0(c11108u1.f28790e).m34528I(z10 ? c11108u1.f28791f : -1).m34547b0(z10 ? c11108u1.f28792r : -1).m34530K(m34996d);
        if (m35003k == 2) {
            m34530K.m34559n0(c11108u1.f28768B).m34538S(c11108u1.f28769C).m34537R(c11108u1.f28770D);
        }
        if (str != null) {
            m34530K.m34552g0(str);
        }
        int i10 = c11108u1.f28776J;
        if (i10 != -1 && m35003k == 1) {
            m34530K.m34529J(i10);
        }
        C9400a c9400a = c11108u1.f28795u;
        if (c9400a != null) {
            C9400a c9400a2 = c11108u12.f28795u;
            if (c9400a2 != null) {
                c9400a = c9400a2.m27996b(c9400a);
            }
            m34530K.m34545Z(c9400a);
        }
        return m34530K.m34526G();
    }

    /* renamed from: F */
    private void m272F(int i10) {
        C11137a.m34605g(!this.f266u.m32980j());
        while (true) {
            if (i10 >= this.f270y.size()) {
                i10 = -1;
                break;
            } else if (m293z(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = m276J().f33120h;
        C0051i m273G = m273G(i10);
        if (this.f270y.isEmpty()) {
            this.f251b0 = this.f249a0;
        } else {
            ((C0051i) C5867e0.m14838d(this.f270y)).m228o();
        }
        this.f257e0 = false;
        this.f267v.m36884D(this.f233L, m273G.f33119g, j10);
    }

    /* renamed from: G */
    private C0051i m273G(int i10) {
        C0051i c0051i = this.f270y.get(i10);
        ArrayList<C0051i> arrayList = this.f270y;
        C11172r0.m34883N0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f228G.length; i11++) {
            this.f228G[i11].m37074u(c0051i.m226m(i11));
        }
        return c0051i;
    }

    /* renamed from: H */
    private boolean m274H(C0051i c0051i) {
        int i10 = c0051i.f173k;
        int length = this.f228G.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f246Y[i11] && this.f228G[i11].m37056Q() == i10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    private static boolean m275I(C11108u1 c11108u1, C11108u1 c11108u12) {
        String str = c11108u1.f28797w;
        String str2 = c11108u12.f28797w;
        int m35003k = C11178w.m35003k(str);
        if (m35003k != 3) {
            return m35003k == C11178w.m35003k(str2);
        }
        if (C11172r0.m34914c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c11108u1.f28781O == c11108u12.f28781O;
        }
        return false;
    }

    /* renamed from: J */
    private C0051i m276J() {
        return this.f270y.get(r0.size() - 1);
    }

    /* renamed from: K */
    private InterfaceC12609b0 m277K(int i10, int i11) {
        C11137a.m34599a(f221j0.contains(Integer.valueOf(i11)));
        int i12 = this.f231J.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f230I.add(Integer.valueOf(i11))) {
            this.f229H[i12] = i10;
        }
        return this.f229H[i12] == i10 ? this.f228G[i12] : m268B(i10, i11);
    }

    /* renamed from: L */
    private static int m278L(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: M */
    private void m279M(C0051i c0051i) {
        this.f262i0 = c0051i;
        this.f238Q = c0051i.f33116d;
        this.f251b0 = -9223372036854775807L;
        this.f270y.add(c0051i);
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        for (d dVar : this.f228G) {
            m15077p.mo14724a(Integer.valueOf(dVar.m37051G()));
        }
        c0051i.m227n(this, m15077p.m15094k());
        for (d dVar2 : this.f228G) {
            dVar2.m337j0(c0051i);
            if (c0051i.f176n) {
                dVar2.m37069g0();
            }
        }
    }

    /* renamed from: N */
    private static boolean m280N(AbstractC12340f abstractC12340f) {
        return abstractC12340f instanceof C0051i;
    }

    /* renamed from: O */
    private boolean m281O() {
        return this.f251b0 != -9223372036854775807L;
    }

    /* renamed from: R */
    private void m282R() {
        int i10 = this.f241T.f30692a;
        int[] iArr = new int[i10];
        this.f243V = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f228G;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (m275I((C11108u1) C11137a.m34607i(dVarArr[i12].m37050F()), this.f241T.m36857c(i11).m36849d(0))) {
                    this.f243V[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<C0054l> it = this.f225D.iterator();
        while (it.hasNext()) {
            it.next().m263b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m283S() {
        if (!this.f240S && this.f243V == null && this.f235N) {
            for (d dVar : this.f228G) {
                if (dVar.m37050F() == null) {
                    return;
                }
            }
            if (this.f241T != null) {
                m282R();
                return;
            }
            m292y();
            m287k0();
            this.f252c.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m284b0() {
        this.f235N = true;
        m283S();
    }

    /* renamed from: f0 */
    private void m285f0() {
        for (d dVar : this.f228G) {
            dVar.m37061W(this.f253c0);
        }
        this.f253c0 = false;
    }

    /* renamed from: g0 */
    private boolean m286g0(long j10) {
        int length = this.f228G.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f228G[i10].m37063Z(j10, false) && (this.f247Z[i10] || !this.f245X)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    private void m287k0() {
        this.f236O = true;
    }

    /* renamed from: p0 */
    private void m288p0(InterfaceC11734v0[] interfaceC11734v0Arr) {
        this.f225D.clear();
        for (InterfaceC11734v0 interfaceC11734v0 : interfaceC11734v0Arr) {
            if (interfaceC11734v0 != null) {
                this.f225D.add((C0054l) interfaceC11734v0);
            }
        }
    }

    /* renamed from: w */
    private void m291w() {
        C11137a.m34605g(this.f236O);
        C11137a.m34603e(this.f241T);
        C11137a.m34603e(this.f242U);
    }

    /* renamed from: y */
    private void m292y() {
        C11108u1 c11108u1;
        int length = this.f228G.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((C11108u1) C11137a.m34607i(this.f228G[i12].m37050F())).f28797w;
            int i13 = C11178w.m35011s(str) ? 2 : C11178w.m35007o(str) ? 1 : C11178w.m35010r(str) ? 3 : -2;
            if (m278L(i13) > m278L(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        C11694d1 m193j = this.f254d.m193j();
        int i14 = m193j.f30658a;
        this.f244W = -1;
        this.f243V = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f243V[i15] = i15;
        }
        C11694d1[] c11694d1Arr = new C11694d1[length];
        int i16 = 0;
        while (i16 < length) {
            C11108u1 c11108u12 = (C11108u1) C11137a.m34607i(this.f228G[i16].m37050F());
            if (i16 == i11) {
                C11108u1[] c11108u1Arr = new C11108u1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    C11108u1 m36849d = m193j.m36849d(i17);
                    if (i10 == 1 && (c11108u1 = this.f258f) != null) {
                        m36849d = m36849d.m34493l(c11108u1);
                    }
                    c11108u1Arr[i17] = i14 == 1 ? c11108u12.m34493l(m36849d) : m271E(m36849d, c11108u12, true);
                }
                c11694d1Arr[i16] = new C11694d1(this.f248a, c11108u1Arr);
                this.f244W = i16;
            } else {
                C11108u1 c11108u13 = (i10 == 2 && C11178w.m35007o(c11108u12.f28797w)) ? this.f258f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f248a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                c11694d1Arr[i16] = new C11694d1(sb2.toString(), m271E(c11108u13, c11108u12, false));
            }
            i16++;
        }
        this.f241T = m270D(c11694d1Arr);
        C11137a.m34605g(this.f242U == null);
        this.f242U = Collections.emptySet();
    }

    /* renamed from: z */
    private boolean m293z(int i10) {
        for (int i11 = i10; i11 < this.f270y.size(); i11++) {
            if (this.f270y.get(i11).f176n) {
                return false;
            }
        }
        C0051i c0051i = this.f270y.get(i10);
        for (int i12 = 0; i12 < this.f228G.length; i12++) {
            if (this.f228G[i12].m37048C() > c0051i.m226m(i12)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public void m294A() {
        if (this.f236O) {
            return;
        }
        mo248e(this.f249a0);
    }

    /* renamed from: P */
    public boolean m295P(int i10) {
        return !m281O() && this.f228G[i10].m37054K(this.f257e0);
    }

    /* renamed from: Q */
    public boolean m296Q() {
        return this.f233L == 2;
    }

    /* renamed from: T */
    public void m297T() {
        this.f266u.mo11869a();
        this.f254d.m196n();
    }

    /* renamed from: U */
    public void m298U(int i10) {
        m297T();
        this.f228G[i10].m37055N();
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo313i(AbstractC12340f abstractC12340f, long j10, long j11, boolean z10) {
        this.f227F = null;
        C11731u c11731u = new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, abstractC12340f.m39904f(), abstractC12340f.m39903e(), j10, j11, abstractC12340f.m39901a());
        this.f265t.m32954c(abstractC12340f.f33113a);
        this.f267v.m36891r(c11731u, abstractC12340f.f33115c, this.f250b, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h);
        if (z10) {
            return;
        }
        if (m281O() || this.f237P == 0) {
            m285f0();
        }
        if (this.f237P > 0) {
            this.f252c.mo258a(this);
        }
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo317m(AbstractC12340f abstractC12340f, long j10, long j11) {
        this.f227F = null;
        this.f254d.m198p(abstractC12340f);
        C11731u c11731u = new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, abstractC12340f.m39904f(), abstractC12340f.m39903e(), j10, j11, abstractC12340f.m39901a());
        this.f265t.m32954c(abstractC12340f.f33113a);
        this.f267v.m36894u(c11731u, abstractC12340f.f33115c, this.f250b, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h);
        if (this.f236O) {
            this.f252c.mo258a(this);
        } else {
            mo248e(this.f249a0);
        }
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public C10818e0.c mo311h(AbstractC12340f abstractC12340f, long j10, long j11, IOException iOException, int i10) {
        C10818e0.c m32976h;
        int i11;
        boolean m280N = m280N(abstractC12340f);
        if (m280N && !((C0051i) abstractC12340f).m229q() && (iOException instanceof C10810a0) && ((i11 = ((C10810a0) iOException).f27306d) == 410 || i11 == 404)) {
            return C10818e0.f27337d;
        }
        long m39901a = abstractC12340f.m39901a();
        C11731u c11731u = new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, abstractC12340f.m39904f(), abstractC12340f.m39903e(), j10, j11, m39901a);
        InterfaceC10816d0.c cVar = new InterfaceC10816d0.c(c11731u, new C11737x(abstractC12340f.f33115c, this.f250b, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, C11172r0.m34910a1(abstractC12340f.f33119g), C11172r0.m34910a1(abstractC12340f.f33120h)), iOException, i10);
        InterfaceC10816d0.b mo32953b = this.f265t.mo32953b(C10320z.m31110c(this.f254d.m194k()), cVar);
        boolean m195m = (mo32953b == null || mo32953b.f27327a != 2) ? false : this.f254d.m195m(abstractC12340f, mo32953b.f27328b);
        if (m195m) {
            if (m280N && m39901a == 0) {
                ArrayList<C0051i> arrayList = this.f270y;
                C11137a.m34605g(arrayList.remove(arrayList.size() - 1) == abstractC12340f);
                if (this.f270y.isEmpty()) {
                    this.f251b0 = this.f249a0;
                } else {
                    ((C0051i) C5867e0.m14838d(this.f270y)).m228o();
                }
            }
            m32976h = C10818e0.f27339f;
        } else {
            long mo32955d = this.f265t.mo32955d(cVar);
            m32976h = mo32955d != -9223372036854775807L ? C10818e0.m32976h(false, mo32955d) : C10818e0.f27340g;
        }
        C10818e0.c cVar2 = m32976h;
        boolean z10 = !cVar2.m32987c();
        this.f267v.m36896w(c11731u, abstractC12340f.f33115c, this.f250b, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h, iOException, z10);
        if (z10) {
            this.f227F = null;
            this.f265t.m32954c(abstractC12340f.f33113a);
        }
        if (m195m) {
            if (this.f236O) {
                this.f252c.mo258a(this);
            } else {
                mo248e(this.f249a0);
            }
        }
        return cVar2;
    }

    /* renamed from: Y */
    public void m302Y() {
        this.f230I.clear();
    }

    /* renamed from: Z */
    public boolean m303Z(Uri uri, InterfaceC10816d0.c cVar, boolean z10) {
        InterfaceC10816d0.b mo32953b;
        if (!this.f254d.m197o(uri)) {
            return true;
        }
        long j10 = (z10 || (mo32953b = this.f265t.mo32953b(C10320z.m31110c(this.f254d.m194k()), cVar)) == null || mo32953b.f27327a != 2) ? -9223372036854775807L : mo32953b.f27328b;
        return this.f254d.m199q(uri, j10) && j10 != -9223372036854775807L;
    }

    @Override // p397v7.C11732u0.d
    /* renamed from: a */
    public void mo304a(C11108u1 c11108u1) {
        this.f224C.post(this.f222A);
    }

    /* renamed from: a0 */
    public void m305a0() {
        if (this.f270y.isEmpty()) {
            return;
        }
        C0051i c0051i = (C0051i) C5867e0.m14838d(this.f270y);
        int m190c = this.f254d.m190c(c0051i);
        if (m190c == 1) {
            c0051i.m230v();
        } else if (m190c == 2 && !this.f257e0 && this.f266u.m32980j()) {
            this.f266u.m32977f();
        }
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        if (m281O()) {
            return this.f251b0;
        }
        if (this.f257e0) {
            return Long.MIN_VALUE;
        }
        return m276J().f33120h;
    }

    /* renamed from: c */
    public long m306c(long j10, C11110u3 c11110u3) {
        return this.f254d.m189b(j10, c11110u3);
    }

    /* renamed from: c0 */
    public void m307c0(C11694d1[] c11694d1Arr, int i10, int... iArr) {
        this.f241T = m270D(c11694d1Arr);
        this.f242U = new HashSet();
        for (int i11 : iArr) {
            this.f242U.add(this.f241T.m36857c(i11));
        }
        this.f244W = i10;
        Handler handler = this.f224C;
        final b bVar = this.f252c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: a8.m
            @Override // java.lang.Runnable
            public final void run() {
                C0058p.b.this.onPrepared();
            }
        });
        m287k0();
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: d */
    public InterfaceC12609b0 mo308d(int i10, int i11) {
        InterfaceC12609b0 interfaceC12609b0;
        if (!f221j0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                InterfaceC12609b0[] interfaceC12609b0Arr = this.f228G;
                if (i12 >= interfaceC12609b0Arr.length) {
                    interfaceC12609b0 = null;
                    break;
                }
                if (this.f229H[i12] == i10) {
                    interfaceC12609b0 = interfaceC12609b0Arr[i12];
                    break;
                }
                i12++;
            }
        } else {
            interfaceC12609b0 = m277K(i10, i11);
        }
        if (interfaceC12609b0 == null) {
            if (this.f259f0) {
                return m268B(i10, i11);
            }
            interfaceC12609b0 = m269C(i10, i11);
        }
        if (i11 != 5) {
            return interfaceC12609b0;
        }
        if (this.f232K == null) {
            this.f232K = new c(interfaceC12609b0, this.f268w);
        }
        return this.f232K;
    }

    /* renamed from: d0 */
    public int m309d0(int i10, C11113v1 c11113v1, C12082g c12082g, int i11) {
        if (m281O()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f270y.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f270y.size() - 1 && m274H(this.f270y.get(i13))) {
                i13++;
            }
            C11172r0.m34883N0(this.f270y, 0, i13);
            C0051i c0051i = this.f270y.get(0);
            C11108u1 c11108u1 = c0051i.f33116d;
            if (!c11108u1.equals(this.f239R)) {
                this.f267v.m36888i(this.f250b, c11108u1, c0051i.f33117e, c0051i.f33118f, c0051i.f33119g);
            }
            this.f239R = c11108u1;
        }
        if (!this.f270y.isEmpty() && !this.f270y.get(0).m229q()) {
            return -3;
        }
        int m37058S = this.f228G[i10].m37058S(c11113v1, c12082g, i11, this.f257e0);
        if (m37058S == -5) {
            C11108u1 c11108u12 = (C11108u1) C11137a.m34603e(c11113v1.f28853b);
            if (i10 == this.f234M) {
                int m37056Q = this.f228G[i10].m37056Q();
                while (i12 < this.f270y.size() && this.f270y.get(i12).f173k != m37056Q) {
                    i12++;
                }
                c11108u12 = c11108u12.m34493l(i12 < this.f270y.size() ? this.f270y.get(i12).f33116d : (C11108u1) C11137a.m34603e(this.f238Q));
            }
            c11113v1.f28853b = c11108u12;
        }
        return m37058S;
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        List<C0051i> list;
        long max;
        if (this.f257e0 || this.f266u.m32980j() || this.f266u.m32979i()) {
            return false;
        }
        if (m281O()) {
            list = Collections.emptyList();
            max = this.f251b0;
            for (d dVar : this.f228G) {
                dVar.m37065b0(this.f251b0);
            }
        } else {
            list = this.f271z;
            C0051i m276J = m276J();
            max = m276J.mo225h() ? m276J.f33120h : Math.max(this.f249a0, m276J.f33119g);
        }
        List<C0051i> list2 = list;
        long j11 = max;
        this.f269x.m206a();
        this.f254d.m191e(j10, j11, list2, this.f236O || !list2.isEmpty(), this.f269x);
        C0048f.b bVar = this.f269x;
        boolean z10 = bVar.f149b;
        AbstractC12340f abstractC12340f = bVar.f148a;
        Uri uri = bVar.f150c;
        if (z10) {
            this.f251b0 = -9223372036854775807L;
            this.f257e0 = true;
            return true;
        }
        if (abstractC12340f == null) {
            if (uri != null) {
                this.f252c.mo260i(uri);
            }
            return false;
        }
        if (m280N(abstractC12340f)) {
            m279M((C0051i) abstractC12340f);
        }
        this.f227F = abstractC12340f;
        this.f267v.m36881A(new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, this.f266u.m32984n(abstractC12340f, this, this.f265t.mo32952a(abstractC12340f.f33115c))), abstractC12340f.f33115c, this.f250b, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h);
        return true;
    }

    /* renamed from: e0 */
    public void m310e0() {
        if (this.f236O) {
            for (d dVar : this.f228G) {
                dVar.m37057R();
            }
        }
        this.f266u.m32983m(this);
        this.f224C.removeCallbacksAndMessages(null);
        this.f240S = true;
        this.f225D.clear();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        /*
            r7 = this;
            boolean r0 = r7.f257e0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.m281O()
            if (r0 == 0) goto L10
            long r0 = r7.f251b0
            return r0
        L10:
            long r0 = r7.f249a0
            a8.i r2 = r7.m276J()
            boolean r3 = r2.mo225h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<a8.i> r2 = r7.f270y
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<a8.i> r2 = r7.f270y
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            a8.i r2 = (p010a8.C0051i) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f33120h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f235N
            if (r2 == 0) goto L55
            a8.p$d[] r2 = r7.f228G
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.m37077z()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010a8.C0058p.mo249f():long");
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        if (this.f266u.m32979i() || m281O()) {
            return;
        }
        if (this.f266u.m32980j()) {
            C11137a.m34603e(this.f227F);
            if (this.f254d.m203v(j10, this.f227F, this.f271z)) {
                this.f266u.m32977f();
                return;
            }
            return;
        }
        int size = this.f271z.size();
        while (size > 0 && this.f254d.m190c(this.f271z.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f271z.size()) {
            m272F(size);
        }
        int m192h = this.f254d.m192h(j10, this.f271z);
        if (m192h < this.f270y.size()) {
            m272F(m192h);
        }
    }

    /* renamed from: h0 */
    public boolean m312h0(long j10, boolean z10) {
        this.f249a0 = j10;
        if (m281O()) {
            this.f251b0 = j10;
            return true;
        }
        if (this.f235N && !z10 && m286g0(j10)) {
            return false;
        }
        this.f251b0 = j10;
        this.f257e0 = false;
        this.f270y.clear();
        if (this.f266u.m32980j()) {
            if (this.f235N) {
                for (d dVar : this.f228G) {
                    dVar.m37072r();
                }
            }
            this.f266u.m32977f();
        } else {
            this.f266u.m32978g();
            m285f0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m314i0(p307q8.InterfaceC10312r[] r20, boolean[] r21, p397v7.InterfaceC11734v0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p010a8.C0058p.m314i0(q8.r[], boolean[], v7.v0[], boolean[], long, boolean):boolean");
    }

    @Override // p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f266u.m32980j();
    }

    /* renamed from: j0 */
    public void m315j0(C12318m c12318m) {
        if (C11172r0.m34914c(this.f261h0, c12318m)) {
            return;
        }
        this.f261h0 = c12318m;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f228G;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f247Z[i10]) {
                dVarArr[i10].m336i0(c12318m);
            }
            i10++;
        }
    }

    /* renamed from: l0 */
    public void m316l0(boolean z10) {
        this.f254d.m201t(z10);
    }

    /* renamed from: m0 */
    public void m318m0(long j10) {
        if (this.f260g0 != j10) {
            this.f260g0 = j10;
            for (d dVar : this.f228G) {
                dVar.m37064a0(j10);
            }
        }
    }

    @Override // p351s8.C10818e0.f
    /* renamed from: n */
    public void mo319n() {
        for (d dVar : this.f228G) {
            dVar.m37059T();
        }
    }

    /* renamed from: n0 */
    public int m320n0(int i10, long j10) {
        if (m281O()) {
            return 0;
        }
        d dVar = this.f228G[i10];
        int m37049E = dVar.m37049E(j10, this.f257e0);
        C0051i c0051i = (C0051i) C5867e0.m14839e(this.f270y, null);
        if (c0051i != null && !c0051i.m229q()) {
            m37049E = Math.min(m37049E, c0051i.m226m(i10) - dVar.m37048C());
        }
        dVar.m37067e0(m37049E);
        return m37049E;
    }

    /* renamed from: o */
    public void m321o() {
        m297T();
        if (this.f257e0 && !this.f236O) {
            throw C11005b3.m33715a("Loading finished before preparation is complete.", null);
        }
    }

    /* renamed from: o0 */
    public void m322o0(int i10) {
        m291w();
        C11137a.m34603e(this.f243V);
        int i11 = this.f243V[i10];
        C11137a.m34605g(this.f246Y[i11]);
        this.f246Y[i11] = false;
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: p */
    public void mo323p(InterfaceC12636z interfaceC12636z) {
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: q */
    public void mo324q() {
        this.f259f0 = true;
        this.f224C.post(this.f223B);
    }

    /* renamed from: r */
    public C11700f1 m325r() {
        m291w();
        return this.f241T;
    }

    /* renamed from: s */
    public void m326s(long j10, boolean z10) {
        if (!this.f235N || m281O()) {
            return;
        }
        int length = this.f228G.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f228G[i10].m37071q(j10, z10, this.f246Y[i10]);
        }
    }

    /* renamed from: x */
    public int m327x(int i10) {
        m291w();
        C11137a.m34603e(this.f243V);
        int i11 = this.f243V[i10];
        if (i11 == -1) {
            return this.f242U.contains(this.f241T.m36857c(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.f246Y;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
