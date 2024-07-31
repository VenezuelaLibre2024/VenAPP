package a8;

import a8.f;
import a8.p;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.w;
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
import l7.a;
import q8.z;
import s8.a0;
import s8.d0;
import s8.e0;
import t6.b3;
import t6.u1;
import t6.u3;
import t6.v1;
import t8.r0;
import t8.w;
import v7.d1;
import v7.f1;
import v7.h0;
import v7.u0;
import v7.v0;
import v7.w0;
import v7.x;
import x6.u;
import x6.v;
import y6.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements e0.b<x7.f>, e0.f, w0, y6.m, u0.d {

    /* renamed from: j0, reason: collision with root package name */
    private static final Set<Integer> f198j0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private final Runnable A;
    private final Runnable B;
    private final Handler C;
    private final ArrayList<l> D;
    private final Map<String, x6.m> E;
    private x7.f F;
    private d[] G;
    private Set<Integer> I;
    private SparseIntArray J;
    private b0 K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private int P;
    private u1 Q;
    private u1 R;
    private boolean S;
    private f1 T;
    private Set<d1> U;
    private int[] V;
    private int W;
    private boolean X;
    private boolean[] Y;
    private boolean[] Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f199a;

    /* renamed from: a0, reason: collision with root package name */
    private long f200a0;

    /* renamed from: b, reason: collision with root package name */
    private final int f201b;

    /* renamed from: b0, reason: collision with root package name */
    private long f202b0;

    /* renamed from: c, reason: collision with root package name */
    private final b f203c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f204c0;

    /* renamed from: d, reason: collision with root package name */
    private final f f205d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f206d0;

    /* renamed from: e, reason: collision with root package name */
    private final s8.b f207e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f208e0;

    /* renamed from: f, reason: collision with root package name */
    private final u1 f209f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f210f0;

    /* renamed from: g0, reason: collision with root package name */
    private long f211g0;

    /* renamed from: h0, reason: collision with root package name */
    private x6.m f212h0;

    /* renamed from: i0, reason: collision with root package name */
    private i f213i0;

    /* renamed from: r, reason: collision with root package name */
    private final v f214r;

    /* renamed from: s, reason: collision with root package name */
    private final u.a f215s;

    /* renamed from: t, reason: collision with root package name */
    private final d0 f216t;

    /* renamed from: v, reason: collision with root package name */
    private final h0.a f218v;

    /* renamed from: w, reason: collision with root package name */
    private final int f219w;

    /* renamed from: y, reason: collision with root package name */
    private final ArrayList<i> f221y;

    /* renamed from: z, reason: collision with root package name */
    private final List<i> f222z;

    /* renamed from: u, reason: collision with root package name */
    private final e0 f217u = new e0("Loader:HlsSampleStreamWrapper");

    /* renamed from: x, reason: collision with root package name */
    private final f.b f220x = new f.b();
    private int[] H = new int[0];

    /* loaded from: classes.dex */
    public interface b extends w0.a<p> {
        void i(Uri uri);

        void onPrepared();
    }

    /* loaded from: classes.dex */
    private static class c implements b0 {

        /* renamed from: g, reason: collision with root package name */
        private static final u1 f223g = new u1.b().g0("application/id3").G();

        /* renamed from: h, reason: collision with root package name */
        private static final u1 f224h = new u1.b().g0("application/x-emsg").G();

        /* renamed from: a, reason: collision with root package name */
        private final n7.b f225a = new n7.b();

        /* renamed from: b, reason: collision with root package name */
        private final b0 f226b;

        /* renamed from: c, reason: collision with root package name */
        private final u1 f227c;

        /* renamed from: d, reason: collision with root package name */
        private u1 f228d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f229e;

        /* renamed from: f, reason: collision with root package name */
        private int f230f;

        public c(b0 b0Var, int i10) {
            u1 u1Var;
            this.f226b = b0Var;
            if (i10 == 1) {
                u1Var = f223g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                u1Var = f224h;
            }
            this.f227c = u1Var;
            this.f229e = new byte[0];
            this.f230f = 0;
        }

        private boolean g(n7.a aVar) {
            u1 H = aVar.H();
            return H != null && r0.c(this.f227c.f26517w, H.f26517w);
        }

        private void h(int i10) {
            byte[] bArr = this.f229e;
            if (bArr.length < i10) {
                this.f229e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private t8.e0 i(int i10, int i11) {
            int i12 = this.f230f - i11;
            t8.e0 e0Var = new t8.e0(Arrays.copyOfRange(this.f229e, i12 - i10, i12));
            byte[] bArr = this.f229e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f230f = i11;
            return e0Var;
        }

        @Override // y6.b0
        public void b(long j10, int i10, int i11, int i12, b0.a aVar) {
            t8.a.e(this.f228d);
            t8.e0 i13 = i(i11, i12);
            if (!r0.c(this.f228d.f26517w, this.f227c.f26517w)) {
                if (!"application/x-emsg".equals(this.f228d.f26517w)) {
                    t8.s.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f228d.f26517w);
                    return;
                }
                n7.a c10 = this.f225a.c(i13);
                if (!g(c10)) {
                    t8.s.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f227c.f26517w, c10.H()));
                    return;
                }
                i13 = new t8.e0((byte[]) t8.a.e(c10.q1()));
            }
            int a10 = i13.a();
            this.f226b.a(i13, a10);
            this.f226b.b(j10, i10, a10, i12, aVar);
        }

        @Override // y6.b0
        public void c(u1 u1Var) {
            this.f228d = u1Var;
            this.f226b.c(this.f227c);
        }

        @Override // y6.b0
        public void d(t8.e0 e0Var, int i10, int i11) {
            h(this.f230f + i10);
            e0Var.l(this.f229e, this.f230f, i10);
            this.f230f += i10;
        }

        @Override // y6.b0
        public int e(s8.h hVar, int i10, boolean z10, int i11) {
            h(this.f230f + i10);
            int read = hVar.read(this.f229e, this.f230f, i10);
            if (read != -1) {
                this.f230f += read;
                return read;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends u0 {
        private final Map<String, x6.m> H;
        private x6.m I;

        private d(s8.b bVar, v vVar, u.a aVar, Map<String, x6.m> map) {
            super(bVar, vVar, aVar);
            this.H = map;
        }

        private l7.a h0(l7.a aVar) {
            if (aVar == null) {
                return null;
            }
            int e10 = aVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= e10) {
                    i11 = -1;
                    break;
                }
                a.b d10 = aVar.d(i11);
                if ((d10 instanceof q7.l) && "com.apple.streaming.transportStreamTimestamp".equals(((q7.l) d10).f23592b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (e10 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[e10 - 1];
            while (i10 < e10) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.d(i10);
                }
                i10++;
            }
            return new l7.a(bVarArr);
        }

        @Override // v7.u0, y6.b0
        public void b(long j10, int i10, int i11, int i12, b0.a aVar) {
            super.b(j10, i10, i11, i12, aVar);
        }

        public void i0(x6.m mVar) {
            this.I = mVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f160k);
        }

        @Override // v7.u0
        public u1 w(u1 u1Var) {
            x6.m mVar;
            x6.m mVar2 = this.I;
            if (mVar2 == null) {
                mVar2 = u1Var.f26520z;
            }
            if (mVar2 != null && (mVar = this.H.get(mVar2.f30539c)) != null) {
                mVar2 = mVar;
            }
            l7.a h02 = h0(u1Var.f26515u);
            if (mVar2 != u1Var.f26520z || h02 != u1Var.f26515u) {
                u1Var = u1Var.c().O(mVar2).Z(h02).G();
            }
            return super.w(u1Var);
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map<String, x6.m> map, s8.b bVar2, long j10, u1 u1Var, v vVar, u.a aVar, d0 d0Var, h0.a aVar2, int i11) {
        this.f199a = str;
        this.f201b = i10;
        this.f203c = bVar;
        this.f205d = fVar;
        this.E = map;
        this.f207e = bVar2;
        this.f209f = u1Var;
        this.f214r = vVar;
        this.f215s = aVar;
        this.f216t = d0Var;
        this.f218v = aVar2;
        this.f219w = i11;
        Set<Integer> set = f198j0;
        this.I = new HashSet(set.size());
        this.J = new SparseIntArray(set.size());
        this.G = new d[0];
        this.Z = new boolean[0];
        this.Y = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f221y = arrayList;
        this.f222z = Collections.unmodifiableList(arrayList);
        this.D = new ArrayList<>();
        this.A = new Runnable() { // from class: a8.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.S();
            }
        };
        this.B = new Runnable() { // from class: a8.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.b0();
            }
        };
        this.C = r0.w();
        this.f200a0 = j10;
        this.f202b0 = j10;
    }

    private static y6.j B(int i10, int i11) {
        t8.s.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new y6.j();
    }

    private u0 C(int i10, int i11) {
        int length = this.G.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f207e, this.f214r, this.f215s, this.E);
        dVar.b0(this.f200a0);
        if (z10) {
            dVar.i0(this.f212h0);
        }
        dVar.a0(this.f211g0);
        i iVar = this.f213i0;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.H, i12);
        this.H = copyOf;
        copyOf[length] = i10;
        this.G = (d[]) r0.F0(this.G, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.Z, i12);
        this.Z = copyOf2;
        copyOf2[length] = z10;
        this.X |= z10;
        this.I.add(Integer.valueOf(i11));
        this.J.append(i11, length);
        if (L(i11) > L(this.L)) {
            this.M = length;
            this.L = i11;
        }
        this.Y = Arrays.copyOf(this.Y, i12);
        return dVar;
    }

    private f1 D(d1[] d1VarArr) {
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            u1[] u1VarArr = new u1[d1Var.f28288a];
            for (int i11 = 0; i11 < d1Var.f28288a; i11++) {
                u1 d10 = d1Var.d(i11);
                u1VarArr[i11] = d10.d(this.f214r.d(d10));
            }
            d1VarArr[i10] = new d1(d1Var.f28289b, u1VarArr);
        }
        return new f1(d1VarArr);
    }

    private static u1 E(u1 u1Var, u1 u1Var2, boolean z10) {
        String d10;
        String str;
        if (u1Var == null) {
            return u1Var2;
        }
        int k10 = w.k(u1Var2.f26517w);
        if (r0.K(u1Var.f26514t, k10) == 1) {
            d10 = r0.L(u1Var.f26514t, k10);
            str = w.g(d10);
        } else {
            d10 = w.d(u1Var.f26514t, u1Var2.f26517w);
            str = u1Var2.f26517w;
        }
        u1.b K = u1Var2.c().U(u1Var.f26506a).W(u1Var.f26507b).X(u1Var.f26508c).i0(u1Var.f26509d).e0(u1Var.f26510e).I(z10 ? u1Var.f26511f : -1).b0(z10 ? u1Var.f26512r : -1).K(d10);
        if (k10 == 2) {
            K.n0(u1Var.B).S(u1Var.C).R(u1Var.D);
        }
        if (str != null) {
            K.g0(str);
        }
        int i10 = u1Var.J;
        if (i10 != -1 && k10 == 1) {
            K.J(i10);
        }
        l7.a aVar = u1Var.f26515u;
        if (aVar != null) {
            l7.a aVar2 = u1Var2.f26515u;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            K.Z(aVar);
        }
        return K.G();
    }

    private void F(int i10) {
        t8.a.g(!this.f217u.j());
        while (true) {
            if (i10 >= this.f221y.size()) {
                i10 = -1;
                break;
            } else if (z(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = J().f30608h;
        i G = G(i10);
        if (this.f221y.isEmpty()) {
            this.f202b0 = this.f200a0;
        } else {
            ((i) com.google.common.collect.e0.d(this.f221y)).o();
        }
        this.f208e0 = false;
        this.f218v.D(this.L, G.f30607g, j10);
    }

    private i G(int i10) {
        i iVar = this.f221y.get(i10);
        ArrayList<i> arrayList = this.f221y;
        r0.N0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.G.length; i11++) {
            this.G[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean H(i iVar) {
        int i10 = iVar.f160k;
        int length = this.G.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.Y[i11] && this.G[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(u1 u1Var, u1 u1Var2) {
        String str = u1Var.f26517w;
        String str2 = u1Var2.f26517w;
        int k10 = w.k(str);
        if (k10 != 3) {
            return k10 == w.k(str2);
        }
        if (r0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || u1Var.O == u1Var2.O;
        }
        return false;
    }

    private i J() {
        return this.f221y.get(r0.size() - 1);
    }

    private b0 K(int i10, int i11) {
        t8.a.a(f198j0.contains(Integer.valueOf(i11)));
        int i12 = this.J.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.I.add(Integer.valueOf(i11))) {
            this.H[i12] = i10;
        }
        return this.H[i12] == i10 ? this.G[i12] : B(i10, i11);
    }

    private static int L(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void M(i iVar) {
        this.f213i0 = iVar;
        this.Q = iVar.f30604d;
        this.f202b0 = -9223372036854775807L;
        this.f221y.add(iVar);
        w.a p10 = com.google.common.collect.w.p();
        for (d dVar : this.G) {
            p10.a(Integer.valueOf(dVar.G()));
        }
        iVar.n(this, p10.k());
        for (d dVar2 : this.G) {
            dVar2.j0(iVar);
            if (iVar.f163n) {
                dVar2.g0();
            }
        }
    }

    private static boolean N(x7.f fVar) {
        return fVar instanceof i;
    }

    private boolean O() {
        return this.f202b0 != -9223372036854775807L;
    }

    private void R() {
        int i10 = this.T.f28314a;
        int[] iArr = new int[i10];
        this.V = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.G;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (I((u1) t8.a.i(dVarArr[i12].F()), this.T.c(i11).d(0))) {
                    this.V[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<l> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (!this.S && this.V == null && this.N) {
            for (d dVar : this.G) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.T != null) {
                R();
                return;
            }
            y();
            k0();
            this.f203c.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.N = true;
        S();
    }

    private void f0() {
        for (d dVar : this.G) {
            dVar.W(this.f204c0);
        }
        this.f204c0 = false;
    }

    private boolean g0(long j10) {
        int length = this.G.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.G[i10].Z(j10, false) && (this.Z[i10] || !this.X)) {
                return false;
            }
        }
        return true;
    }

    private void k0() {
        this.O = true;
    }

    private void p0(v0[] v0VarArr) {
        this.D.clear();
        for (v0 v0Var : v0VarArr) {
            if (v0Var != null) {
                this.D.add((l) v0Var);
            }
        }
    }

    private void w() {
        t8.a.g(this.O);
        t8.a.e(this.T);
        t8.a.e(this.U);
    }

    private void y() {
        u1 u1Var;
        int length = this.G.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((u1) t8.a.i(this.G[i12].F())).f26517w;
            int i13 = t8.w.s(str) ? 2 : t8.w.o(str) ? 1 : t8.w.r(str) ? 3 : -2;
            if (L(i13) > L(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        d1 j10 = this.f205d.j();
        int i14 = j10.f28288a;
        this.W = -1;
        this.V = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.V[i15] = i15;
        }
        d1[] d1VarArr = new d1[length];
        int i16 = 0;
        while (i16 < length) {
            u1 u1Var2 = (u1) t8.a.i(this.G[i16].F());
            if (i16 == i11) {
                u1[] u1VarArr = new u1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    u1 d10 = j10.d(i17);
                    if (i10 == 1 && (u1Var = this.f209f) != null) {
                        d10 = d10.l(u1Var);
                    }
                    u1VarArr[i17] = i14 == 1 ? u1Var2.l(d10) : E(d10, u1Var2, true);
                }
                d1VarArr[i16] = new d1(this.f199a, u1VarArr);
                this.W = i16;
            } else {
                u1 u1Var3 = (i10 == 2 && t8.w.o(u1Var2.f26517w)) ? this.f209f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f199a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                d1VarArr[i16] = new d1(sb2.toString(), E(u1Var3, u1Var2, false));
            }
            i16++;
        }
        this.T = D(d1VarArr);
        t8.a.g(this.U == null);
        this.U = Collections.emptySet();
    }

    private boolean z(int i10) {
        for (int i11 = i10; i11 < this.f221y.size(); i11++) {
            if (this.f221y.get(i11).f163n) {
                return false;
            }
        }
        i iVar = this.f221y.get(i10);
        for (int i12 = 0; i12 < this.G.length; i12++) {
            if (this.G[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    public void A() {
        if (this.O) {
            return;
        }
        e(this.f200a0);
    }

    public boolean P(int i10) {
        return !O() && this.G[i10].K(this.f208e0);
    }

    public boolean Q() {
        return this.L == 2;
    }

    public void T() {
        this.f217u.a();
        this.f205d.n();
    }

    public void U(int i10) {
        T();
        this.G[i10].N();
    }

    @Override // s8.e0.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void i(x7.f fVar, long j10, long j11, boolean z10) {
        this.F = null;
        v7.u uVar = new v7.u(fVar.f30601a, fVar.f30602b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f216t.c(fVar.f30601a);
        this.f218v.r(uVar, fVar.f30603c, this.f201b, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h);
        if (z10) {
            return;
        }
        if (O() || this.P == 0) {
            f0();
        }
        if (this.P > 0) {
            this.f203c.a(this);
        }
    }

    @Override // s8.e0.b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void m(x7.f fVar, long j10, long j11) {
        this.F = null;
        this.f205d.p(fVar);
        v7.u uVar = new v7.u(fVar.f30601a, fVar.f30602b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f216t.c(fVar.f30601a);
        this.f218v.u(uVar, fVar.f30603c, this.f201b, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h);
        if (this.O) {
            this.f203c.a(this);
        } else {
            e(this.f200a0);
        }
    }

    @Override // s8.e0.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public e0.c h(x7.f fVar, long j10, long j11, IOException iOException, int i10) {
        e0.c h10;
        int i11;
        boolean N = N(fVar);
        if (N && !((i) fVar).q() && (iOException instanceof a0) && ((i11 = ((a0) iOException).f25187d) == 410 || i11 == 404)) {
            return e0.f25218d;
        }
        long a10 = fVar.a();
        v7.u uVar = new v7.u(fVar.f30601a, fVar.f30602b, fVar.f(), fVar.e(), j10, j11, a10);
        d0.c cVar = new d0.c(uVar, new x(fVar.f30603c, this.f201b, fVar.f30604d, fVar.f30605e, fVar.f30606f, r0.a1(fVar.f30607g), r0.a1(fVar.f30608h)), iOException, i10);
        d0.b b10 = this.f216t.b(z.c(this.f205d.k()), cVar);
        boolean m10 = (b10 == null || b10.f25208a != 2) ? false : this.f205d.m(fVar, b10.f25209b);
        if (m10) {
            if (N && a10 == 0) {
                ArrayList<i> arrayList = this.f221y;
                t8.a.g(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f221y.isEmpty()) {
                    this.f202b0 = this.f200a0;
                } else {
                    ((i) com.google.common.collect.e0.d(this.f221y)).o();
                }
            }
            h10 = e0.f25220f;
        } else {
            long d10 = this.f216t.d(cVar);
            h10 = d10 != -9223372036854775807L ? e0.h(false, d10) : e0.f25221g;
        }
        e0.c cVar2 = h10;
        boolean z10 = !cVar2.c();
        this.f218v.w(uVar, fVar.f30603c, this.f201b, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h, iOException, z10);
        if (z10) {
            this.F = null;
            this.f216t.c(fVar.f30601a);
        }
        if (m10) {
            if (this.O) {
                this.f203c.a(this);
            } else {
                e(this.f200a0);
            }
        }
        return cVar2;
    }

    public void Y() {
        this.I.clear();
    }

    public boolean Z(Uri uri, d0.c cVar, boolean z10) {
        d0.b b10;
        if (!this.f205d.o(uri)) {
            return true;
        }
        long j10 = (z10 || (b10 = this.f216t.b(z.c(this.f205d.k()), cVar)) == null || b10.f25208a != 2) ? -9223372036854775807L : b10.f25209b;
        return this.f205d.q(uri, j10) && j10 != -9223372036854775807L;
    }

    @Override // v7.u0.d
    public void a(u1 u1Var) {
        this.C.post(this.A);
    }

    public void a0() {
        if (this.f221y.isEmpty()) {
            return;
        }
        i iVar = (i) com.google.common.collect.e0.d(this.f221y);
        int c10 = this.f205d.c(iVar);
        if (c10 == 1) {
            iVar.v();
        } else if (c10 == 2 && !this.f208e0 && this.f217u.j()) {
            this.f217u.f();
        }
    }

    @Override // v7.w0
    public long b() {
        if (O()) {
            return this.f202b0;
        }
        if (this.f208e0) {
            return Long.MIN_VALUE;
        }
        return J().f30608h;
    }

    public long c(long j10, u3 u3Var) {
        return this.f205d.b(j10, u3Var);
    }

    public void c0(d1[] d1VarArr, int i10, int... iArr) {
        this.T = D(d1VarArr);
        this.U = new HashSet();
        for (int i11 : iArr) {
            this.U.add(this.T.c(i11));
        }
        this.W = i10;
        Handler handler = this.C;
        final b bVar = this.f203c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: a8.m
            @Override // java.lang.Runnable
            public final void run() {
                p.b.this.onPrepared();
            }
        });
        k0();
    }

    @Override // y6.m
    public b0 d(int i10, int i11) {
        b0 b0Var;
        if (!f198j0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                b0[] b0VarArr = this.G;
                if (i12 >= b0VarArr.length) {
                    b0Var = null;
                    break;
                }
                if (this.H[i12] == i10) {
                    b0Var = b0VarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            b0Var = K(i10, i11);
        }
        if (b0Var == null) {
            if (this.f210f0) {
                return B(i10, i11);
            }
            b0Var = C(i10, i11);
        }
        if (i11 != 5) {
            return b0Var;
        }
        if (this.K == null) {
            this.K = new c(b0Var, this.f219w);
        }
        return this.K;
    }

    public int d0(int i10, v1 v1Var, w6.g gVar, int i11) {
        if (O()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f221y.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f221y.size() - 1 && H(this.f221y.get(i13))) {
                i13++;
            }
            r0.N0(this.f221y, 0, i13);
            i iVar = this.f221y.get(0);
            u1 u1Var = iVar.f30604d;
            if (!u1Var.equals(this.R)) {
                this.f218v.i(this.f201b, u1Var, iVar.f30605e, iVar.f30606f, iVar.f30607g);
            }
            this.R = u1Var;
        }
        if (!this.f221y.isEmpty() && !this.f221y.get(0).q()) {
            return -3;
        }
        int S = this.G[i10].S(v1Var, gVar, i11, this.f208e0);
        if (S == -5) {
            u1 u1Var2 = (u1) t8.a.e(v1Var.f26567b);
            if (i10 == this.M) {
                int Q = this.G[i10].Q();
                while (i12 < this.f221y.size() && this.f221y.get(i12).f160k != Q) {
                    i12++;
                }
                u1Var2 = u1Var2.l(i12 < this.f221y.size() ? this.f221y.get(i12).f30604d : (u1) t8.a.e(this.Q));
            }
            v1Var.f26567b = u1Var2;
        }
        return S;
    }

    @Override // v7.w0
    public boolean e(long j10) {
        List<i> list;
        long max;
        if (this.f208e0 || this.f217u.j() || this.f217u.i()) {
            return false;
        }
        if (O()) {
            list = Collections.emptyList();
            max = this.f202b0;
            for (d dVar : this.G) {
                dVar.b0(this.f202b0);
            }
        } else {
            list = this.f222z;
            i J = J();
            max = J.h() ? J.f30608h : Math.max(this.f200a0, J.f30607g);
        }
        List<i> list2 = list;
        long j11 = max;
        this.f220x.a();
        this.f205d.e(j10, j11, list2, this.O || !list2.isEmpty(), this.f220x);
        f.b bVar = this.f220x;
        boolean z10 = bVar.f149b;
        x7.f fVar = bVar.f148a;
        Uri uri = bVar.f150c;
        if (z10) {
            this.f202b0 = -9223372036854775807L;
            this.f208e0 = true;
            return true;
        }
        if (fVar == null) {
            if (uri != null) {
                this.f203c.i(uri);
            }
            return false;
        }
        if (N(fVar)) {
            M((i) fVar);
        }
        this.F = fVar;
        this.f218v.A(new v7.u(fVar.f30601a, fVar.f30602b, this.f217u.n(fVar, this, this.f216t.a(fVar.f30603c))), fVar.f30603c, this.f201b, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h);
        return true;
    }

    public void e0() {
        if (this.O) {
            for (d dVar : this.G) {
                dVar.R();
            }
        }
        this.f217u.m(this);
        this.C.removeCallbacksAndMessages(null);
        this.S = true;
        this.D.clear();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    @Override // v7.w0
    public long f() {
        /*
            r7 = this;
            boolean r0 = r7.f208e0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.O()
            if (r0 == 0) goto L10
            long r0 = r7.f202b0
            return r0
        L10:
            long r0 = r7.f200a0
            a8.i r2 = r7.J()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<a8.i> r2 = r7.f221y
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<a8.i> r2 = r7.f221y
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            a8.i r2 = (a8.i) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f30608h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.N
            if (r2 == 0) goto L55
            a8.p$d[] r2 = r7.G
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.z()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.p.f():long");
    }

    @Override // v7.w0
    public void g(long j10) {
        if (this.f217u.i() || O()) {
            return;
        }
        if (this.f217u.j()) {
            t8.a.e(this.F);
            if (this.f205d.v(j10, this.F, this.f222z)) {
                this.f217u.f();
                return;
            }
            return;
        }
        int size = this.f222z.size();
        while (size > 0 && this.f205d.c(this.f222z.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f222z.size()) {
            F(size);
        }
        int h10 = this.f205d.h(j10, this.f222z);
        if (h10 < this.f221y.size()) {
            F(h10);
        }
    }

    public boolean h0(long j10, boolean z10) {
        this.f200a0 = j10;
        if (O()) {
            this.f202b0 = j10;
            return true;
        }
        if (this.N && !z10 && g0(j10)) {
            return false;
        }
        this.f202b0 = j10;
        this.f208e0 = false;
        this.f221y.clear();
        if (this.f217u.j()) {
            if (this.N) {
                for (d dVar : this.G) {
                    dVar.r();
                }
            }
            this.f217u.f();
        } else {
            this.f217u.g();
            f0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i0(q8.r[] r20, boolean[] r21, v7.v0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.p.i0(q8.r[], boolean[], v7.v0[], boolean[], long, boolean):boolean");
    }

    @Override // v7.w0
    public boolean isLoading() {
        return this.f217u.j();
    }

    public void j0(x6.m mVar) {
        if (r0.c(this.f212h0, mVar)) {
            return;
        }
        this.f212h0 = mVar;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.G;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.Z[i10]) {
                dVarArr[i10].i0(mVar);
            }
            i10++;
        }
    }

    public void l0(boolean z10) {
        this.f205d.t(z10);
    }

    public void m0(long j10) {
        if (this.f211g0 != j10) {
            this.f211g0 = j10;
            for (d dVar : this.G) {
                dVar.a0(j10);
            }
        }
    }

    @Override // s8.e0.f
    public void n() {
        for (d dVar : this.G) {
            dVar.T();
        }
    }

    public int n0(int i10, long j10) {
        if (O()) {
            return 0;
        }
        d dVar = this.G[i10];
        int E = dVar.E(j10, this.f208e0);
        i iVar = (i) com.google.common.collect.e0.e(this.f221y, null);
        if (iVar != null && !iVar.q()) {
            E = Math.min(E, iVar.m(i10) - dVar.C());
        }
        dVar.e0(E);
        return E;
    }

    public void o() {
        T();
        if (this.f208e0 && !this.O) {
            throw b3.a("Loading finished before preparation is complete.", null);
        }
    }

    public void o0(int i10) {
        w();
        t8.a.e(this.V);
        int i11 = this.V[i10];
        t8.a.g(this.Y[i11]);
        this.Y[i11] = false;
    }

    @Override // y6.m
    public void p(y6.z zVar) {
    }

    @Override // y6.m
    public void q() {
        this.f210f0 = true;
        this.C.post(this.B);
    }

    public f1 r() {
        w();
        return this.T;
    }

    public void s(long j10, boolean z10) {
        if (!this.N || O()) {
            return;
        }
        int length = this.G.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.G[i10].q(j10, z10, this.Y[i10]);
        }
    }

    public int x(int i10) {
        w();
        t8.a.e(this.V);
        int i11 = this.V[i10];
        if (i11 == -1) {
            return this.U.contains(this.T.c(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.Y;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
