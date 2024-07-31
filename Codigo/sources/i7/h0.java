package i7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t6.b3;
import t8.n0;
import t8.r0;
import y6.z;

/* loaded from: classes.dex */
public final class h0 implements y6.k {

    /* renamed from: t */
    public static final y6.p f17269t = new y6.p() { // from class: i7.g0
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] w10;
            w10 = h0.w();
            return w10;
        }
    };

    /* renamed from: a */
    private final int f17270a;

    /* renamed from: b */
    private final int f17271b;

    /* renamed from: c */
    private final List<n0> f17272c;

    /* renamed from: d */
    private final t8.e0 f17273d;

    /* renamed from: e */
    private final SparseIntArray f17274e;

    /* renamed from: f */
    private final i0.c f17275f;

    /* renamed from: g */
    private final SparseArray<i0> f17276g;

    /* renamed from: h */
    private final SparseBooleanArray f17277h;

    /* renamed from: i */
    private final SparseBooleanArray f17278i;

    /* renamed from: j */
    private final f0 f17279j;

    /* renamed from: k */
    private e0 f17280k;

    /* renamed from: l */
    private y6.m f17281l;

    /* renamed from: m */
    private int f17282m;

    /* renamed from: n */
    private boolean f17283n;

    /* renamed from: o */
    private boolean f17284o;

    /* renamed from: p */
    private boolean f17285p;

    /* renamed from: q */
    private i0 f17286q;

    /* renamed from: r */
    private int f17287r;

    /* renamed from: s */
    private int f17288s;

    /* loaded from: classes.dex */
    public class a implements b0 {

        /* renamed from: a */
        private final t8.d0 f17289a = new t8.d0(new byte[4]);

        public a() {
        }

        @Override // i7.b0
        public void a(n0 n0Var, y6.m mVar, i0.d dVar) {
        }

        @Override // i7.b0
        public void b(t8.e0 e0Var) {
            if (e0Var.H() == 0 && (e0Var.H() & RecognitionOptions.ITF) != 0) {
                e0Var.V(6);
                int a10 = e0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    e0Var.k(this.f17289a, 4);
                    int h10 = this.f17289a.h(16);
                    this.f17289a.r(3);
                    if (h10 == 0) {
                        this.f17289a.r(13);
                    } else {
                        int h11 = this.f17289a.h(13);
                        if (h0.this.f17276g.get(h11) == null) {
                            h0.this.f17276g.put(h11, new c0(new b(h11)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f17270a != 2) {
                    h0.this.f17276g.remove(0);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private class b implements b0 {

        /* renamed from: a */
        private final t8.d0 f17291a = new t8.d0(new byte[5]);

        /* renamed from: b */
        private final SparseArray<i0> f17292b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f17293c = new SparseIntArray();

        /* renamed from: d */
        private final int f17294d;

        public b(int i10) {
            this.f17294d = i10;
        }

        private i0.b c(t8.e0 e0Var, int i10) {
            int f10 = e0Var.f();
            int i11 = i10 + f10;
            int i12 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (e0Var.f() < i11) {
                int H = e0Var.H();
                int f11 = e0Var.f() + e0Var.H();
                if (f11 > i11) {
                    break;
                }
                if (H == 5) {
                    long J = e0Var.J();
                    if (J != 1094921523) {
                        if (J != 1161904947) {
                            if (J != 1094921524) {
                                if (J == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (H != 106) {
                        if (H != 122) {
                            if (H == 127) {
                                if (e0Var.H() != 21) {
                                }
                                i12 = 172;
                            } else if (H == 123) {
                                i12 = 138;
                            } else if (H == 10) {
                                str = e0Var.E(3).trim();
                            } else if (H == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (e0Var.f() < f11) {
                                    String trim = e0Var.E(3).trim();
                                    int H2 = e0Var.H();
                                    byte[] bArr = new byte[4];
                                    e0Var.l(bArr, 0, 4);
                                    arrayList2.add(new i0.a(trim, H2, bArr));
                                }
                                arrayList = arrayList2;
                                i12 = 89;
                            } else if (H == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                e0Var.V(f11 - e0Var.f());
            }
            e0Var.U(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(e0Var.e(), f10, i11));
        }

        @Override // i7.b0
        public void a(n0 n0Var, y6.m mVar, i0.d dVar) {
        }

        @Override // i7.b0
        public void b(t8.e0 e0Var) {
            n0 n0Var;
            if (e0Var.H() != 2) {
                return;
            }
            if (h0.this.f17270a == 1 || h0.this.f17270a == 2 || h0.this.f17282m == 1) {
                n0Var = (n0) h0.this.f17272c.get(0);
            } else {
                n0Var = new n0(((n0) h0.this.f17272c.get(0)).c());
                h0.this.f17272c.add(n0Var);
            }
            if ((e0Var.H() & RecognitionOptions.ITF) == 0) {
                return;
            }
            e0Var.V(1);
            int N = e0Var.N();
            int i10 = 3;
            e0Var.V(3);
            e0Var.k(this.f17291a, 2);
            this.f17291a.r(3);
            int i11 = 13;
            h0.this.f17288s = this.f17291a.h(13);
            e0Var.k(this.f17291a, 2);
            int i12 = 4;
            this.f17291a.r(4);
            e0Var.V(this.f17291a.h(12));
            if (h0.this.f17270a == 2 && h0.this.f17286q == null) {
                i0.b bVar = new i0.b(21, null, null, r0.f26749f);
                h0 h0Var = h0.this;
                h0Var.f17286q = h0Var.f17275f.b(21, bVar);
                if (h0.this.f17286q != null) {
                    h0.this.f17286q.a(n0Var, h0.this.f17281l, new i0.d(N, 21, 8192));
                }
            }
            this.f17292b.clear();
            this.f17293c.clear();
            int a10 = e0Var.a();
            while (a10 > 0) {
                e0Var.k(this.f17291a, 5);
                int h10 = this.f17291a.h(8);
                this.f17291a.r(i10);
                int h11 = this.f17291a.h(i11);
                this.f17291a.r(i12);
                int h12 = this.f17291a.h(12);
                i0.b c10 = c(e0Var, h12);
                if (h10 == 6 || h10 == 5) {
                    h10 = c10.f17321a;
                }
                a10 -= h12 + 5;
                int i13 = h0.this.f17270a == 2 ? h10 : h11;
                if (!h0.this.f17277h.get(i13)) {
                    i0 b10 = (h0.this.f17270a == 2 && h10 == 21) ? h0.this.f17286q : h0.this.f17275f.b(h10, c10);
                    if (h0.this.f17270a != 2 || h11 < this.f17293c.get(i13, 8192)) {
                        this.f17293c.put(i13, h11);
                        this.f17292b.put(i13, b10);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f17293c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f17293c.keyAt(i14);
                int valueAt = this.f17293c.valueAt(i14);
                h0.this.f17277h.put(keyAt, true);
                h0.this.f17278i.put(valueAt, true);
                i0 valueAt2 = this.f17292b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != h0.this.f17286q) {
                        valueAt2.a(n0Var, h0.this.f17281l, new i0.d(N, keyAt, 8192));
                    }
                    h0.this.f17276g.put(valueAt, valueAt2);
                }
            }
            if (h0.this.f17270a != 2) {
                h0.this.f17276g.remove(this.f17294d);
                h0 h0Var2 = h0.this;
                h0Var2.f17282m = h0Var2.f17270a == 1 ? 0 : h0.this.f17282m - 1;
                if (h0.this.f17282m != 0) {
                    return;
                } else {
                    h0.this.f17281l.q();
                }
            } else {
                if (h0.this.f17283n) {
                    return;
                }
                h0.this.f17281l.q();
                h0.this.f17282m = 0;
            }
            h0.this.f17283n = true;
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new n0(0L), new j(i11), i12);
    }

    public h0(int i10, n0 n0Var, i0.c cVar) {
        this(i10, n0Var, cVar, 112800);
    }

    public h0(int i10, n0 n0Var, i0.c cVar, int i11) {
        this.f17275f = (i0.c) t8.a.e(cVar);
        this.f17271b = i11;
        this.f17270a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f17272c = Collections.singletonList(n0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f17272c = arrayList;
            arrayList.add(n0Var);
        }
        this.f17273d = new t8.e0(new byte[9400], 0);
        this.f17277h = new SparseBooleanArray();
        this.f17278i = new SparseBooleanArray();
        this.f17276g = new SparseArray<>();
        this.f17274e = new SparseIntArray();
        this.f17279j = new f0(i11);
        this.f17281l = y6.m.f31766o;
        this.f17288s = -1;
        y();
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i10 = h0Var.f17282m;
        h0Var.f17282m = i10 + 1;
        return i10;
    }

    private boolean u(y6.l lVar) {
        byte[] e10 = this.f17273d.e();
        if (9400 - this.f17273d.f() < 188) {
            int a10 = this.f17273d.a();
            if (a10 > 0) {
                System.arraycopy(e10, this.f17273d.f(), e10, 0, a10);
            }
            this.f17273d.S(e10, a10);
        }
        while (this.f17273d.a() < 188) {
            int g10 = this.f17273d.g();
            int read = lVar.read(e10, g10, 9400 - g10);
            if (read == -1) {
                return false;
            }
            this.f17273d.T(g10 + read);
        }
        return true;
    }

    private int v() {
        int f10 = this.f17273d.f();
        int g10 = this.f17273d.g();
        int a10 = j0.a(this.f17273d.e(), f10, g10);
        this.f17273d.U(a10);
        int i10 = a10 + 188;
        if (i10 > g10) {
            int i11 = this.f17287r + (a10 - f10);
            this.f17287r = i11;
            if (this.f17270a == 2 && i11 > 376) {
                throw b3.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f17287r = 0;
        }
        return i10;
    }

    public static /* synthetic */ y6.k[] w() {
        return new y6.k[]{new h0()};
    }

    private void x(long j10) {
        y6.m mVar;
        y6.z bVar;
        if (this.f17284o) {
            return;
        }
        this.f17284o = true;
        if (this.f17279j.b() != -9223372036854775807L) {
            e0 e0Var = new e0(this.f17279j.c(), this.f17279j.b(), j10, this.f17288s, this.f17271b);
            this.f17280k = e0Var;
            mVar = this.f17281l;
            bVar = e0Var.b();
        } else {
            mVar = this.f17281l;
            bVar = new z.b(this.f17279j.b());
        }
        mVar.p(bVar);
    }

    private void y() {
        this.f17277h.clear();
        this.f17276g.clear();
        SparseArray<i0> a10 = this.f17275f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17276g.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f17276g.put(0, new c0(new a()));
        this.f17286q = null;
    }

    private boolean z(int i10) {
        return this.f17270a == 2 || this.f17283n || !this.f17278i.get(i10, false);
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        e0 e0Var;
        t8.a.g(this.f17270a != 2);
        int size = this.f17272c.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = this.f17272c.get(i10);
            boolean z10 = n0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = n0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                n0Var.g(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f17280k) != null) {
            e0Var.h(j11);
        }
        this.f17273d.Q(0);
        this.f17274e.clear();
        for (int i11 = 0; i11 < this.f17276g.size(); i11++) {
            this.f17276g.valueAt(i11).c();
        }
        this.f17287r = 0;
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f17281l = mVar;
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        boolean z10;
        byte[] e10 = this.f17273d.e();
        lVar.q(e10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (e10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                lVar.n(i10);
                return true;
            }
        }
        return false;
    }

    @Override // y6.k
    public int f(y6.l lVar, y6.y yVar) {
        long length = lVar.getLength();
        if (this.f17283n) {
            if (((length == -1 || this.f17270a == 2) ? false : true) && !this.f17279j.d()) {
                return this.f17279j.e(lVar, yVar, this.f17288s);
            }
            x(length);
            if (this.f17285p) {
                this.f17285p = false;
                a(0L, 0L);
                if (lVar.getPosition() != 0) {
                    yVar.f31795a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f17280k;
            if (e0Var != null && e0Var.d()) {
                return this.f17280k.c(lVar, yVar);
            }
        }
        if (!u(lVar)) {
            return -1;
        }
        int v10 = v();
        int g10 = this.f17273d.g();
        if (v10 > g10) {
            return 0;
        }
        int q10 = this.f17273d.q();
        if ((8388608 & q10) == 0) {
            int i10 = ((4194304 & q10) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & q10) >> 8;
            boolean z10 = (q10 & 32) != 0;
            i0 i0Var = (q10 & 16) != 0 ? this.f17276g.get(i11) : null;
            if (i0Var != null) {
                if (this.f17270a != 2) {
                    int i12 = q10 & 15;
                    int i13 = this.f17274e.get(i11, i12 - 1);
                    this.f17274e.put(i11, i12);
                    if (i13 != i12) {
                        if (i12 != ((i13 + 1) & 15)) {
                            i0Var.c();
                        }
                    }
                }
                if (z10) {
                    int H = this.f17273d.H();
                    i10 |= (this.f17273d.H() & 64) != 0 ? 2 : 0;
                    this.f17273d.V(H - 1);
                }
                boolean z11 = this.f17283n;
                if (z(i11)) {
                    this.f17273d.T(v10);
                    i0Var.b(this.f17273d, i10);
                    this.f17273d.T(g10);
                }
                if (this.f17270a != 2 && !z11 && this.f17283n && length != -1) {
                    this.f17285p = true;
                }
            }
        }
        this.f17273d.U(v10);
        return 0;
    }

    @Override // y6.k
    public void release() {
    }
}
