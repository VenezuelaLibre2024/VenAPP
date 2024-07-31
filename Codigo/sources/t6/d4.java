package t6;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.common.collect.w;
import java.util.ArrayList;
import t6.c2;
import t6.d4;
import t6.o;
import w7.c;

/* loaded from: classes.dex */
public abstract class d4 implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final d4 f26044a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f26045b = t8.r0.r0(0);

    /* renamed from: c, reason: collision with root package name */
    private static final String f26046c = t8.r0.r0(1);

    /* renamed from: d, reason: collision with root package name */
    private static final String f26047d = t8.r0.r0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final o.a<d4> f26048e = new o.a() { // from class: t6.c4
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            d4 c10;
            c10 = d4.c(bundle);
            return c10;
        }
    };

    /* loaded from: classes.dex */
    class a extends d4 {
        a() {
        }

        @Override // t6.d4
        public int g(Object obj) {
            return -1;
        }

        @Override // t6.d4
        public b l(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t6.d4
        public int n() {
            return 0;
        }

        @Override // t6.d4
        public Object r(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t6.d4
        public d t(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t6.d4
        public int u() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o {

        /* renamed from: s, reason: collision with root package name */
        private static final String f26049s = t8.r0.r0(0);

        /* renamed from: t, reason: collision with root package name */
        private static final String f26050t = t8.r0.r0(1);

        /* renamed from: u, reason: collision with root package name */
        private static final String f26051u = t8.r0.r0(2);

        /* renamed from: v, reason: collision with root package name */
        private static final String f26052v = t8.r0.r0(3);

        /* renamed from: w, reason: collision with root package name */
        private static final String f26053w = t8.r0.r0(4);

        /* renamed from: x, reason: collision with root package name */
        public static final o.a<b> f26054x = new o.a() { // from class: t6.e4
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                d4.b d10;
                d10 = d4.b.d(bundle);
                return d10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public Object f26055a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26056b;

        /* renamed from: c, reason: collision with root package name */
        public int f26057c;

        /* renamed from: d, reason: collision with root package name */
        public long f26058d;

        /* renamed from: e, reason: collision with root package name */
        public long f26059e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f26060f;

        /* renamed from: r, reason: collision with root package name */
        private w7.c f26061r = w7.c.f29708r;

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(Bundle bundle) {
            int i10 = bundle.getInt(f26049s, 0);
            long j10 = bundle.getLong(f26050t, -9223372036854775807L);
            long j11 = bundle.getLong(f26051u, 0L);
            boolean z10 = bundle.getBoolean(f26052v, false);
            Bundle bundle2 = bundle.getBundle(f26053w);
            w7.c a10 = bundle2 != null ? w7.c.f29714x.a(bundle2) : w7.c.f29708r;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, a10, z10);
            return bVar;
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            int i10 = this.f26057c;
            if (i10 != 0) {
                bundle.putInt(f26049s, i10);
            }
            long j10 = this.f26058d;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f26050t, j10);
            }
            long j11 = this.f26059e;
            if (j11 != 0) {
                bundle.putLong(f26051u, j11);
            }
            boolean z10 = this.f26060f;
            if (z10) {
                bundle.putBoolean(f26052v, z10);
            }
            if (!this.f26061r.equals(w7.c.f29708r)) {
                bundle.putBundle(f26053w, this.f26061r.a());
            }
            return bundle;
        }

        public int e(int i10) {
            return this.f26061r.d(i10).f29729b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return t8.r0.c(this.f26055a, bVar.f26055a) && t8.r0.c(this.f26056b, bVar.f26056b) && this.f26057c == bVar.f26057c && this.f26058d == bVar.f26058d && this.f26059e == bVar.f26059e && this.f26060f == bVar.f26060f && t8.r0.c(this.f26061r, bVar.f26061r);
        }

        public long f(int i10, int i11) {
            c.a d10 = this.f26061r.d(i10);
            if (d10.f29729b != -1) {
                return d10.f29733f[i11];
            }
            return -9223372036854775807L;
        }

        public int g() {
            return this.f26061r.f29716b;
        }

        public int h(long j10) {
            return this.f26061r.e(j10, this.f26058d);
        }

        public int hashCode() {
            Object obj = this.f26055a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f26056b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f26057c) * 31;
            long j10 = this.f26058d;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f26059e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f26060f ? 1 : 0)) * 31) + this.f26061r.hashCode();
        }

        public int i(long j10) {
            return this.f26061r.f(j10, this.f26058d);
        }

        public long j(int i10) {
            return this.f26061r.d(i10).f29728a;
        }

        public long k() {
            return this.f26061r.f29717c;
        }

        public int l(int i10, int i11) {
            c.a d10 = this.f26061r.d(i10);
            if (d10.f29729b != -1) {
                return d10.f29732e[i11];
            }
            return 0;
        }

        public long m(int i10) {
            return this.f26061r.d(i10).f29734r;
        }

        public long n() {
            return this.f26058d;
        }

        public int o(int i10) {
            return this.f26061r.d(i10).f();
        }

        public int p(int i10, int i11) {
            return this.f26061r.d(i10).g(i11);
        }

        public long q() {
            return t8.r0.a1(this.f26059e);
        }

        public long r() {
            return this.f26059e;
        }

        public int s() {
            return this.f26061r.f29719e;
        }

        public boolean t(int i10) {
            return !this.f26061r.d(i10).h();
        }

        public boolean u(int i10) {
            return this.f26061r.d(i10).f29735s;
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, w7.c.f29708r, false);
        }

        public b w(Object obj, Object obj2, int i10, long j10, long j11, w7.c cVar, boolean z10) {
            this.f26055a = obj;
            this.f26056b = obj2;
            this.f26057c = i10;
            this.f26058d = j10;
            this.f26059e = j11;
            this.f26061r = cVar;
            this.f26060f = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d4 {

        /* renamed from: f, reason: collision with root package name */
        private final com.google.common.collect.w<d> f26062f;

        /* renamed from: r, reason: collision with root package name */
        private final com.google.common.collect.w<b> f26063r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f26064s;

        /* renamed from: t, reason: collision with root package name */
        private final int[] f26065t;

        public c(com.google.common.collect.w<d> wVar, com.google.common.collect.w<b> wVar2, int[] iArr) {
            t8.a.a(wVar.size() == iArr.length);
            this.f26062f = wVar;
            this.f26063r = wVar2;
            this.f26064s = iArr;
            this.f26065t = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f26065t[iArr[i10]] = i10;
            }
        }

        @Override // t6.d4
        public int f(boolean z10) {
            if (v()) {
                return -1;
            }
            if (z10) {
                return this.f26064s[0];
            }
            return 0;
        }

        @Override // t6.d4
        public int g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // t6.d4
        public int h(boolean z10) {
            if (v()) {
                return -1;
            }
            return z10 ? this.f26064s[u() - 1] : u() - 1;
        }

        @Override // t6.d4
        public int j(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != h(z10)) {
                return z10 ? this.f26064s[this.f26065t[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return f(z10);
            }
            return -1;
        }

        @Override // t6.d4
        public b l(int i10, b bVar, boolean z10) {
            b bVar2 = this.f26063r.get(i10);
            bVar.w(bVar2.f26055a, bVar2.f26056b, bVar2.f26057c, bVar2.f26058d, bVar2.f26059e, bVar2.f26061r, bVar2.f26060f);
            return bVar;
        }

        @Override // t6.d4
        public int n() {
            return this.f26063r.size();
        }

        @Override // t6.d4
        public int q(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != f(z10)) {
                return z10 ? this.f26064s[this.f26065t[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return h(z10);
            }
            return -1;
        }

        @Override // t6.d4
        public Object r(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // t6.d4
        public d t(int i10, d dVar, long j10) {
            d dVar2 = this.f26062f.get(i10);
            dVar.j(dVar2.f26066a, dVar2.f26068c, dVar2.f26069d, dVar2.f26070e, dVar2.f26071f, dVar2.f26072r, dVar2.f26073s, dVar2.f26074t, dVar2.f26076v, dVar2.f26078x, dVar2.f26079y, dVar2.f26080z, dVar2.A, dVar2.B);
            dVar.f26077w = dVar2.f26077w;
            return dVar;
        }

        @Override // t6.d4
        public int u() {
            return this.f26062f.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements o {
        public static final Object C = new Object();
        private static final Object D = new Object();
        private static final c2 E = new c2.c().d("com.google.android.exoplayer2.Timeline").g(Uri.EMPTY).a();
        private static final String F = t8.r0.r0(1);
        private static final String G = t8.r0.r0(2);
        private static final String H = t8.r0.r0(3);
        private static final String I = t8.r0.r0(4);
        private static final String J = t8.r0.r0(5);
        private static final String K = t8.r0.r0(6);
        private static final String L = t8.r0.r0(7);
        private static final String M = t8.r0.r0(8);
        private static final String N = t8.r0.r0(9);
        private static final String O = t8.r0.r0(10);
        private static final String P = t8.r0.r0(11);
        private static final String Q = t8.r0.r0(12);
        private static final String R = t8.r0.r0(13);
        public static final o.a<d> S = new o.a() { // from class: t6.f4
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                d4.d c10;
                c10 = d4.d.c(bundle);
                return c10;
            }
        };
        public int A;
        public long B;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f26067b;

        /* renamed from: d, reason: collision with root package name */
        public Object f26069d;

        /* renamed from: e, reason: collision with root package name */
        public long f26070e;

        /* renamed from: f, reason: collision with root package name */
        public long f26071f;

        /* renamed from: r, reason: collision with root package name */
        public long f26072r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f26073s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f26074t;

        /* renamed from: u, reason: collision with root package name */
        @Deprecated
        public boolean f26075u;

        /* renamed from: v, reason: collision with root package name */
        public c2.g f26076v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f26077w;

        /* renamed from: x, reason: collision with root package name */
        public long f26078x;

        /* renamed from: y, reason: collision with root package name */
        public long f26079y;

        /* renamed from: z, reason: collision with root package name */
        public int f26080z;

        /* renamed from: a, reason: collision with root package name */
        public Object f26066a = C;

        /* renamed from: c, reason: collision with root package name */
        public c2 f26068c = E;

        /* JADX INFO: Access modifiers changed from: private */
        public static d c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(F);
            c2 a10 = bundle2 != null ? c2.f25878z.a(bundle2) : c2.f25872t;
            long j10 = bundle.getLong(G, -9223372036854775807L);
            long j11 = bundle.getLong(H, -9223372036854775807L);
            long j12 = bundle.getLong(I, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(J, false);
            boolean z11 = bundle.getBoolean(K, false);
            Bundle bundle3 = bundle.getBundle(L);
            c2.g a11 = bundle3 != null ? c2.g.f25942w.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(M, false);
            long j13 = bundle.getLong(N, 0L);
            long j14 = bundle.getLong(O, -9223372036854775807L);
            int i10 = bundle.getInt(P, 0);
            int i11 = bundle.getInt(Q, 0);
            long j15 = bundle.getLong(R, 0L);
            d dVar = new d();
            dVar.j(D, a10, null, j10, j11, j12, z10, z11, a11, j13, j14, i10, i11, j15);
            dVar.f26077w = z12;
            return dVar;
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (!c2.f25872t.equals(this.f26068c)) {
                bundle.putBundle(F, this.f26068c.a());
            }
            long j10 = this.f26070e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(G, j10);
            }
            long j11 = this.f26071f;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(H, j11);
            }
            long j12 = this.f26072r;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(I, j12);
            }
            boolean z10 = this.f26073s;
            if (z10) {
                bundle.putBoolean(J, z10);
            }
            boolean z11 = this.f26074t;
            if (z11) {
                bundle.putBoolean(K, z11);
            }
            c2.g gVar = this.f26076v;
            if (gVar != null) {
                bundle.putBundle(L, gVar.a());
            }
            boolean z12 = this.f26077w;
            if (z12) {
                bundle.putBoolean(M, z12);
            }
            long j13 = this.f26078x;
            if (j13 != 0) {
                bundle.putLong(N, j13);
            }
            long j14 = this.f26079y;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(O, j14);
            }
            int i10 = this.f26080z;
            if (i10 != 0) {
                bundle.putInt(P, i10);
            }
            int i11 = this.A;
            if (i11 != 0) {
                bundle.putInt(Q, i11);
            }
            long j15 = this.B;
            if (j15 != 0) {
                bundle.putLong(R, j15);
            }
            return bundle;
        }

        public long d() {
            return t8.r0.b0(this.f26072r);
        }

        public long e() {
            return t8.r0.a1(this.f26078x);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return t8.r0.c(this.f26066a, dVar.f26066a) && t8.r0.c(this.f26068c, dVar.f26068c) && t8.r0.c(this.f26069d, dVar.f26069d) && t8.r0.c(this.f26076v, dVar.f26076v) && this.f26070e == dVar.f26070e && this.f26071f == dVar.f26071f && this.f26072r == dVar.f26072r && this.f26073s == dVar.f26073s && this.f26074t == dVar.f26074t && this.f26077w == dVar.f26077w && this.f26078x == dVar.f26078x && this.f26079y == dVar.f26079y && this.f26080z == dVar.f26080z && this.A == dVar.A && this.B == dVar.B;
        }

        public long f() {
            return this.f26078x;
        }

        public long g() {
            return t8.r0.a1(this.f26079y);
        }

        public long h() {
            return this.B;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f26066a.hashCode()) * 31) + this.f26068c.hashCode()) * 31;
            Object obj = this.f26069d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            c2.g gVar = this.f26076v;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f26070e;
            int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f26071f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f26072r;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f26073s ? 1 : 0)) * 31) + (this.f26074t ? 1 : 0)) * 31) + (this.f26077w ? 1 : 0)) * 31;
            long j13 = this.f26078x;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f26079y;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f26080z) * 31) + this.A) * 31;
            long j15 = this.B;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public boolean i() {
            t8.a.g(this.f26075u == (this.f26076v != null));
            return this.f26076v != null;
        }

        public d j(Object obj, c2 c2Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, c2.g gVar, long j13, long j14, int i10, int i11, long j15) {
            c2.h hVar;
            this.f26066a = obj;
            this.f26068c = c2Var != null ? c2Var : E;
            this.f26067b = (c2Var == null || (hVar = c2Var.f25880b) == null) ? null : hVar.f25960h;
            this.f26069d = obj2;
            this.f26070e = j10;
            this.f26071f = j11;
            this.f26072r = j12;
            this.f26073s = z10;
            this.f26074t = z11;
            this.f26075u = gVar != null;
            this.f26076v = gVar;
            this.f26078x = j13;
            this.f26079y = j14;
            this.f26080z = i10;
            this.A = i11;
            this.B = j15;
            this.f26077w = false;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d4 c(Bundle bundle) {
        com.google.common.collect.w d10 = d(d.S, t8.b.a(bundle, f26045b));
        com.google.common.collect.w d11 = d(b.f26054x, t8.b.a(bundle, f26046c));
        int[] intArray = bundle.getIntArray(f26047d);
        if (intArray == null) {
            intArray = e(d10.size());
        }
        return new c(d10, d11, intArray);
    }

    private static <T extends o> com.google.common.collect.w<T> d(o.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.google.common.collect.w.v();
        }
        w.a aVar2 = new w.a();
        com.google.common.collect.w<Bundle> a10 = n.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a(a10.get(i10)));
        }
        return aVar2.k();
    }

    private static int[] e(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    @Override // t6.o
    public final Bundle a() {
        ArrayList arrayList = new ArrayList();
        int u10 = u();
        d dVar = new d();
        for (int i10 = 0; i10 < u10; i10++) {
            arrayList.add(t(i10, dVar, 0L).a());
        }
        ArrayList arrayList2 = new ArrayList();
        int n10 = n();
        b bVar = new b();
        for (int i11 = 0; i11 < n10; i11++) {
            arrayList2.add(l(i11, bVar, false).a());
        }
        int[] iArr = new int[u10];
        if (u10 > 0) {
            iArr[0] = f(true);
        }
        for (int i12 = 1; i12 < u10; i12++) {
            iArr[i12] = j(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        t8.b.c(bundle, f26045b, new n(arrayList));
        t8.b.c(bundle, f26046c, new n(arrayList2));
        bundle.putIntArray(f26047d, iArr);
        return bundle;
    }

    public boolean equals(Object obj) {
        int h10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        if (d4Var.u() != u() || d4Var.n() != n()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < u(); i10++) {
            if (!s(i10, dVar).equals(d4Var.s(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < n(); i11++) {
            if (!l(i11, bVar, true).equals(d4Var.l(i11, bVar2, true))) {
                return false;
            }
        }
        int f10 = f(true);
        if (f10 != d4Var.f(true) || (h10 = h(true)) != d4Var.h(true)) {
            return false;
        }
        while (f10 != h10) {
            int j10 = j(f10, 0, true);
            if (j10 != d4Var.j(f10, 0, true)) {
                return false;
            }
            f10 = j10;
        }
        return true;
    }

    public int f(boolean z10) {
        return v() ? -1 : 0;
    }

    public abstract int g(Object obj);

    public int h(boolean z10) {
        if (v()) {
            return -1;
        }
        return u() - 1;
    }

    public int hashCode() {
        int i10;
        d dVar = new d();
        b bVar = new b();
        int u10 = 217 + u();
        int i11 = 0;
        while (true) {
            i10 = u10 * 31;
            if (i11 >= u()) {
                break;
            }
            u10 = i10 + s(i11, dVar).hashCode();
            i11++;
        }
        int n10 = i10 + n();
        for (int i12 = 0; i12 < n(); i12++) {
            n10 = (n10 * 31) + l(i12, bVar, true).hashCode();
        }
        int f10 = f(true);
        while (f10 != -1) {
            n10 = (n10 * 31) + f10;
            f10 = j(f10, 0, true);
        }
        return n10;
    }

    public final int i(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = k(i10, bVar).f26057c;
        if (s(i12, dVar).A != i10) {
            return i10 + 1;
        }
        int j10 = j(i12, i11, z10);
        if (j10 == -1) {
            return -1;
        }
        return s(j10, dVar).f26080z;
    }

    public int j(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == h(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == h(z10) ? f(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b k(int i10, b bVar) {
        return l(i10, bVar, false);
    }

    public abstract b l(int i10, b bVar, boolean z10);

    public b m(Object obj, b bVar) {
        return l(g(obj), bVar, true);
    }

    public abstract int n();

    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10) {
        return (Pair) t8.a.e(p(dVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> p(d dVar, b bVar, int i10, long j10, long j11) {
        t8.a.c(i10, 0, u());
        t(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.f();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f26080z;
        k(i11, bVar);
        while (i11 < dVar.A && bVar.f26059e != j10) {
            int i12 = i11 + 1;
            if (k(i12, bVar).f26059e > j10) {
                break;
            }
            i11 = i12;
        }
        l(i11, bVar, true);
        long j12 = j10 - bVar.f26059e;
        long j13 = bVar.f26058d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(t8.a.e(bVar.f26056b), Long.valueOf(Math.max(0L, j12)));
    }

    public int q(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == f(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == f(z10) ? h(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object r(int i10);

    public final d s(int i10, d dVar) {
        return t(i10, dVar, 0L);
    }

    public abstract d t(int i10, d dVar, long j10);

    public abstract int u();

    public final boolean v() {
        return u() == 0;
    }

    public final boolean w(int i10, b bVar, d dVar, int i11, boolean z10) {
        return i(i10, bVar, dVar, i11, z10) == -1;
    }
}
