package p361t6;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11139b;
import p363t8.C11172r0;
import p415w7.C12088c;

/* renamed from: t6.d4 */
/* loaded from: classes.dex */
public abstract class AbstractC11018d4 implements InterfaceC11076o {

    /* renamed from: a */
    public static final AbstractC11018d4 f28214a = new a();

    /* renamed from: b */
    private static final String f28215b = C11172r0.m34945r0(0);

    /* renamed from: c */
    private static final String f28216c = C11172r0.m34945r0(1);

    /* renamed from: d */
    private static final String f28217d = C11172r0.m34945r0(2);

    /* renamed from: e */
    public static final InterfaceC11076o.a<AbstractC11018d4> f28218e = new InterfaceC11076o.a() { // from class: t6.c4
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            AbstractC11018d4 m33997c;
            m33997c = AbstractC11018d4.m33997c(bundle);
            return m33997c;
        }
    };

    /* renamed from: t6.d4$a */
    /* loaded from: classes.dex */
    class a extends AbstractC11018d4 {
        a() {
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: g */
        public int mo11856g(Object obj) {
            return -1;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: l */
        public b mo11857l(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: n */
        public int mo11858n() {
            return 0;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: r */
        public Object mo11859r(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: t */
        public d mo11860t(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: u */
        public int mo11861u() {
            return 0;
        }
    }

    /* renamed from: t6.d4$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC11076o {

        /* renamed from: s */
        private static final String f28219s = C11172r0.m34945r0(0);

        /* renamed from: t */
        private static final String f28220t = C11172r0.m34945r0(1);

        /* renamed from: u */
        private static final String f28221u = C11172r0.m34945r0(2);

        /* renamed from: v */
        private static final String f28222v = C11172r0.m34945r0(3);

        /* renamed from: w */
        private static final String f28223w = C11172r0.m34945r0(4);

        /* renamed from: x */
        public static final InterfaceC11076o.a<b> f28224x = new InterfaceC11076o.a() { // from class: t6.e4
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                AbstractC11018d4.b m34009d;
                m34009d = AbstractC11018d4.b.m34009d(bundle);
                return m34009d;
            }
        };

        /* renamed from: a */
        public Object f28225a;

        /* renamed from: b */
        public Object f28226b;

        /* renamed from: c */
        public int f28227c;

        /* renamed from: d */
        public long f28228d;

        /* renamed from: e */
        public long f28229e;

        /* renamed from: f */
        public boolean f28230f;

        /* renamed from: r */
        private C12088c f28231r = C12088c.f32171r;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static b m34009d(Bundle bundle) {
            int i10 = bundle.getInt(f28219s, 0);
            long j10 = bundle.getLong(f28220t, -9223372036854775807L);
            long j11 = bundle.getLong(f28221u, 0L);
            boolean z10 = bundle.getBoolean(f28222v, false);
            Bundle bundle2 = bundle.getBundle(f28223w);
            C12088c mo22759a = bundle2 != null ? C12088c.f32177x.mo22759a(bundle2) : C12088c.f32171r;
            b bVar = new b();
            bVar.m34028w(null, null, i10, j10, j11, mo22759a, z10);
            return bVar;
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            int i10 = this.f28227c;
            if (i10 != 0) {
                bundle.putInt(f28219s, i10);
            }
            long j10 = this.f28228d;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f28220t, j10);
            }
            long j11 = this.f28229e;
            if (j11 != 0) {
                bundle.putLong(f28221u, j11);
            }
            boolean z10 = this.f28230f;
            if (z10) {
                bundle.putBoolean(f28222v, z10);
            }
            if (!this.f28231r.equals(C12088c.f32171r)) {
                bundle.putBundle(f28223w, this.f28231r.mo22762a());
            }
            return bundle;
        }

        /* renamed from: e */
        public int m34010e(int i10) {
            return this.f28231r.m38829d(i10).f32194b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return C11172r0.m34914c(this.f28225a, bVar.f28225a) && C11172r0.m34914c(this.f28226b, bVar.f28226b) && this.f28227c == bVar.f28227c && this.f28228d == bVar.f28228d && this.f28229e == bVar.f28229e && this.f28230f == bVar.f28230f && C11172r0.m34914c(this.f28231r, bVar.f28231r);
        }

        /* renamed from: f */
        public long m34011f(int i10, int i11) {
            C12088c.a m38829d = this.f28231r.m38829d(i10);
            if (m38829d.f32194b != -1) {
                return m38829d.f32198f[i11];
            }
            return -9223372036854775807L;
        }

        /* renamed from: g */
        public int m34012g() {
            return this.f28231r.f32179b;
        }

        /* renamed from: h */
        public int m34013h(long j10) {
            return this.f28231r.m38830e(j10, this.f28228d);
        }

        public int hashCode() {
            Object obj = this.f28225a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f28226b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f28227c) * 31;
            long j10 = this.f28228d;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f28229e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f28230f ? 1 : 0)) * 31) + this.f28231r.hashCode();
        }

        /* renamed from: i */
        public int m34014i(long j10) {
            return this.f28231r.m38831f(j10, this.f28228d);
        }

        /* renamed from: j */
        public long m34015j(int i10) {
            return this.f28231r.m38829d(i10).f32193a;
        }

        /* renamed from: k */
        public long m34016k() {
            return this.f28231r.f32180c;
        }

        /* renamed from: l */
        public int m34017l(int i10, int i11) {
            C12088c.a m38829d = this.f28231r.m38829d(i10);
            if (m38829d.f32194b != -1) {
                return m38829d.f32197e[i11];
            }
            return 0;
        }

        /* renamed from: m */
        public long m34018m(int i10) {
            return this.f28231r.m38829d(i10).f32199r;
        }

        /* renamed from: n */
        public long m34019n() {
            return this.f28228d;
        }

        /* renamed from: o */
        public int m34020o(int i10) {
            return this.f28231r.m38829d(i10).m38836f();
        }

        /* renamed from: p */
        public int m34021p(int i10, int i11) {
            return this.f28231r.m38829d(i10).m38837g(i11);
        }

        /* renamed from: q */
        public long m34022q() {
            return C11172r0.m34910a1(this.f28229e);
        }

        /* renamed from: r */
        public long m34023r() {
            return this.f28229e;
        }

        /* renamed from: s */
        public int m34024s() {
            return this.f28231r.f32182e;
        }

        /* renamed from: t */
        public boolean m34025t(int i10) {
            return !this.f28231r.m38829d(i10).m38838h();
        }

        /* renamed from: u */
        public boolean m34026u(int i10) {
            return this.f28231r.m38829d(i10).f32200s;
        }

        /* renamed from: v */
        public b m34027v(Object obj, Object obj2, int i10, long j10, long j11) {
            return m34028w(obj, obj2, i10, j10, j11, C12088c.f32171r, false);
        }

        /* renamed from: w */
        public b m34028w(Object obj, Object obj2, int i10, long j10, long j11, C12088c c12088c, boolean z10) {
            this.f28225a = obj;
            this.f28226b = obj2;
            this.f28227c = i10;
            this.f28228d = j10;
            this.f28229e = j11;
            this.f28231r = c12088c;
            this.f28230f = z10;
            return this;
        }
    }

    /* renamed from: t6.d4$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC11018d4 {

        /* renamed from: f */
        private final AbstractC5907w<d> f28232f;

        /* renamed from: r */
        private final AbstractC5907w<b> f28233r;

        /* renamed from: s */
        private final int[] f28234s;

        /* renamed from: t */
        private final int[] f28235t;

        public c(AbstractC5907w<d> abstractC5907w, AbstractC5907w<b> abstractC5907w2, int[] iArr) {
            C11137a.m34599a(abstractC5907w.size() == iArr.length);
            this.f28232f = abstractC5907w;
            this.f28233r = abstractC5907w2;
            this.f28234s = iArr;
            this.f28235t = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f28235t[iArr[i10]] = i10;
            }
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: f */
        public int mo33625f(boolean z10) {
            if (m34005v()) {
                return -1;
            }
            if (z10) {
                return this.f28234s[0];
            }
            return 0;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: g */
        public int mo11856g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: h */
        public int mo33626h(boolean z10) {
            if (m34005v()) {
                return -1;
            }
            return z10 ? this.f28234s[mo11861u() - 1] : mo11861u() - 1;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: j */
        public int mo33627j(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != mo33626h(z10)) {
                return z10 ? this.f28234s[this.f28235t[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return mo33625f(z10);
            }
            return -1;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: l */
        public b mo11857l(int i10, b bVar, boolean z10) {
            b bVar2 = this.f28233r.get(i10);
            bVar.m34028w(bVar2.f28225a, bVar2.f28226b, bVar2.f28227c, bVar2.f28228d, bVar2.f28229e, bVar2.f28231r, bVar2.f28230f);
            return bVar;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: n */
        public int mo11858n() {
            return this.f28233r.size();
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: q */
        public int mo33629q(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != mo33625f(z10)) {
                return z10 ? this.f28234s[this.f28235t[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return mo33626h(z10);
            }
            return -1;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: r */
        public Object mo11859r(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: t */
        public d mo11860t(int i10, d dVar, long j10) {
            d dVar2 = this.f28232f.get(i10);
            dVar.m34037j(dVar2.f28255a, dVar2.f28257c, dVar2.f28258d, dVar2.f28259e, dVar2.f28260f, dVar2.f28261r, dVar2.f28262s, dVar2.f28263t, dVar2.f28265v, dVar2.f28267x, dVar2.f28268y, dVar2.f28269z, dVar2.f28253A, dVar2.f28254B);
            dVar.f28266w = dVar2.f28266w;
            return dVar;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: u */
        public int mo11861u() {
            return this.f28232f.size();
        }
    }

    /* renamed from: t6.d4$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC11076o {

        /* renamed from: C */
        public static final Object f28236C = new Object();

        /* renamed from: D */
        private static final Object f28237D = new Object();

        /* renamed from: E */
        private static final C11010c2 f28238E = new C11010c2.c().m33731d("com.google.android.exoplayer2.Timeline").m33734g(Uri.EMPTY).m33728a();

        /* renamed from: F */
        private static final String f28239F = C11172r0.m34945r0(1);

        /* renamed from: G */
        private static final String f28240G = C11172r0.m34945r0(2);

        /* renamed from: H */
        private static final String f28241H = C11172r0.m34945r0(3);

        /* renamed from: I */
        private static final String f28242I = C11172r0.m34945r0(4);

        /* renamed from: J */
        private static final String f28243J = C11172r0.m34945r0(5);

        /* renamed from: K */
        private static final String f28244K = C11172r0.m34945r0(6);

        /* renamed from: L */
        private static final String f28245L = C11172r0.m34945r0(7);

        /* renamed from: M */
        private static final String f28246M = C11172r0.m34945r0(8);

        /* renamed from: N */
        private static final String f28247N = C11172r0.m34945r0(9);

        /* renamed from: O */
        private static final String f28248O = C11172r0.m34945r0(10);

        /* renamed from: P */
        private static final String f28249P = C11172r0.m34945r0(11);

        /* renamed from: Q */
        private static final String f28250Q = C11172r0.m34945r0(12);

        /* renamed from: R */
        private static final String f28251R = C11172r0.m34945r0(13);

        /* renamed from: S */
        public static final InterfaceC11076o.a<d> f28252S = new InterfaceC11076o.a() { // from class: t6.f4
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                AbstractC11018d4.d m34030c;
                m34030c = AbstractC11018d4.d.m34030c(bundle);
                return m34030c;
            }
        };

        /* renamed from: A */
        public int f28253A;

        /* renamed from: B */
        public long f28254B;

        /* renamed from: b */
        @Deprecated
        public Object f28256b;

        /* renamed from: d */
        public Object f28258d;

        /* renamed from: e */
        public long f28259e;

        /* renamed from: f */
        public long f28260f;

        /* renamed from: r */
        public long f28261r;

        /* renamed from: s */
        public boolean f28262s;

        /* renamed from: t */
        public boolean f28263t;

        /* renamed from: u */
        @Deprecated
        public boolean f28264u;

        /* renamed from: v */
        public C11010c2.g f28265v;

        /* renamed from: w */
        public boolean f28266w;

        /* renamed from: x */
        public long f28267x;

        /* renamed from: y */
        public long f28268y;

        /* renamed from: z */
        public int f28269z;

        /* renamed from: a */
        public Object f28255a = f28236C;

        /* renamed from: c */
        public C11010c2 f28257c = f28238E;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static d m34030c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f28239F);
            C11010c2 mo22759a = bundle2 != null ? C11010c2.f28022z.mo22759a(bundle2) : C11010c2.f28016t;
            long j10 = bundle.getLong(f28240G, -9223372036854775807L);
            long j11 = bundle.getLong(f28241H, -9223372036854775807L);
            long j12 = bundle.getLong(f28242I, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(f28243J, false);
            boolean z11 = bundle.getBoolean(f28244K, false);
            Bundle bundle3 = bundle.getBundle(f28245L);
            C11010c2.g mo22759a2 = bundle3 != null ? C11010c2.g.f28086w.mo22759a(bundle3) : null;
            boolean z12 = bundle.getBoolean(f28246M, false);
            long j13 = bundle.getLong(f28247N, 0L);
            long j14 = bundle.getLong(f28248O, -9223372036854775807L);
            int i10 = bundle.getInt(f28249P, 0);
            int i11 = bundle.getInt(f28250Q, 0);
            long j15 = bundle.getLong(f28251R, 0L);
            d dVar = new d();
            dVar.m34037j(f28237D, mo22759a, null, j10, j11, j12, z10, z11, mo22759a2, j13, j14, i10, i11, j15);
            dVar.f28266w = z12;
            return dVar;
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            if (!C11010c2.f28016t.equals(this.f28257c)) {
                bundle.putBundle(f28239F, this.f28257c.mo22762a());
            }
            long j10 = this.f28259e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f28240G, j10);
            }
            long j11 = this.f28260f;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f28241H, j11);
            }
            long j12 = this.f28261r;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f28242I, j12);
            }
            boolean z10 = this.f28262s;
            if (z10) {
                bundle.putBoolean(f28243J, z10);
            }
            boolean z11 = this.f28263t;
            if (z11) {
                bundle.putBoolean(f28244K, z11);
            }
            C11010c2.g gVar = this.f28265v;
            if (gVar != null) {
                bundle.putBundle(f28245L, gVar.mo22762a());
            }
            boolean z12 = this.f28266w;
            if (z12) {
                bundle.putBoolean(f28246M, z12);
            }
            long j13 = this.f28267x;
            if (j13 != 0) {
                bundle.putLong(f28247N, j13);
            }
            long j14 = this.f28268y;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(f28248O, j14);
            }
            int i10 = this.f28269z;
            if (i10 != 0) {
                bundle.putInt(f28249P, i10);
            }
            int i11 = this.f28253A;
            if (i11 != 0) {
                bundle.putInt(f28250Q, i11);
            }
            long j15 = this.f28254B;
            if (j15 != 0) {
                bundle.putLong(f28251R, j15);
            }
            return bundle;
        }

        /* renamed from: d */
        public long m34031d() {
            return C11172r0.m34912b0(this.f28261r);
        }

        /* renamed from: e */
        public long m34032e() {
            return C11172r0.m34910a1(this.f28267x);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return C11172r0.m34914c(this.f28255a, dVar.f28255a) && C11172r0.m34914c(this.f28257c, dVar.f28257c) && C11172r0.m34914c(this.f28258d, dVar.f28258d) && C11172r0.m34914c(this.f28265v, dVar.f28265v) && this.f28259e == dVar.f28259e && this.f28260f == dVar.f28260f && this.f28261r == dVar.f28261r && this.f28262s == dVar.f28262s && this.f28263t == dVar.f28263t && this.f28266w == dVar.f28266w && this.f28267x == dVar.f28267x && this.f28268y == dVar.f28268y && this.f28269z == dVar.f28269z && this.f28253A == dVar.f28253A && this.f28254B == dVar.f28254B;
        }

        /* renamed from: f */
        public long m34033f() {
            return this.f28267x;
        }

        /* renamed from: g */
        public long m34034g() {
            return C11172r0.m34910a1(this.f28268y);
        }

        /* renamed from: h */
        public long m34035h() {
            return this.f28254B;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f28255a.hashCode()) * 31) + this.f28257c.hashCode()) * 31;
            Object obj = this.f28258d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C11010c2.g gVar = this.f28265v;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f28259e;
            int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f28260f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f28261r;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f28262s ? 1 : 0)) * 31) + (this.f28263t ? 1 : 0)) * 31) + (this.f28266w ? 1 : 0)) * 31;
            long j13 = this.f28267x;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f28268y;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f28269z) * 31) + this.f28253A) * 31;
            long j15 = this.f28254B;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        /* renamed from: i */
        public boolean m34036i() {
            C11137a.m34605g(this.f28264u == (this.f28265v != null));
            return this.f28265v != null;
        }

        /* renamed from: j */
        public d m34037j(Object obj, C11010c2 c11010c2, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C11010c2.g gVar, long j13, long j14, int i10, int i11, long j15) {
            C11010c2.h hVar;
            this.f28255a = obj;
            this.f28257c = c11010c2 != null ? c11010c2 : f28238E;
            this.f28256b = (c11010c2 == null || (hVar = c11010c2.f28024b) == null) ? null : hVar.f28104h;
            this.f28258d = obj2;
            this.f28259e = j10;
            this.f28260f = j11;
            this.f28261r = j12;
            this.f28262s = z10;
            this.f28263t = z11;
            this.f28264u = gVar != null;
            this.f28265v = gVar;
            this.f28267x = j13;
            this.f28268y = j14;
            this.f28269z = i10;
            this.f28253A = i11;
            this.f28254B = j15;
            this.f28266w = false;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static AbstractC11018d4 m33997c(Bundle bundle) {
        AbstractC5907w m33998d = m33998d(d.f28252S, C11139b.m34610a(bundle, f28215b));
        AbstractC5907w m33998d2 = m33998d(b.f28224x, C11139b.m34610a(bundle, f28216c));
        int[] intArray = bundle.getIntArray(f28217d);
        if (intArray == null) {
            intArray = m33999e(m33998d.size());
        }
        return new c(m33998d, m33998d2, intArray);
    }

    /* renamed from: d */
    private static <T extends InterfaceC11076o> AbstractC5907w<T> m33998d(InterfaceC11076o.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC5907w.m15081v();
        }
        AbstractC5907w.a aVar2 = new AbstractC5907w.a();
        AbstractC5907w<Bundle> m34303a = BinderC11071n.m34303a(iBinder);
        for (int i10 = 0; i10 < m34303a.size(); i10++) {
            aVar2.mo14724a(aVar.mo22759a(m34303a.get(i10)));
        }
        return aVar2.m15094k();
    }

    /* renamed from: e */
    private static int[] m33999e(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public final Bundle mo22762a() {
        ArrayList arrayList = new ArrayList();
        int mo11861u = mo11861u();
        d dVar = new d();
        for (int i10 = 0; i10 < mo11861u; i10++) {
            arrayList.add(mo11860t(i10, dVar, 0L).mo22762a());
        }
        ArrayList arrayList2 = new ArrayList();
        int mo11858n = mo11858n();
        b bVar = new b();
        for (int i11 = 0; i11 < mo11858n; i11++) {
            arrayList2.add(mo11857l(i11, bVar, false).mo22762a());
        }
        int[] iArr = new int[mo11861u];
        if (mo11861u > 0) {
            iArr[0] = mo33625f(true);
        }
        for (int i12 = 1; i12 < mo11861u; i12++) {
            iArr[i12] = mo33627j(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        C11139b.m34612c(bundle, f28215b, new BinderC11071n(arrayList));
        C11139b.m34612c(bundle, f28216c, new BinderC11071n(arrayList2));
        bundle.putIntArray(f28217d, iArr);
        return bundle;
    }

    public boolean equals(Object obj) {
        int mo33626h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC11018d4)) {
            return false;
        }
        AbstractC11018d4 abstractC11018d4 = (AbstractC11018d4) obj;
        if (abstractC11018d4.mo11861u() != mo11861u() || abstractC11018d4.mo11858n() != mo11858n()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < mo11861u(); i10++) {
            if (!m34004s(i10, dVar).equals(abstractC11018d4.m34004s(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < mo11858n(); i11++) {
            if (!mo11857l(i11, bVar, true).equals(abstractC11018d4.mo11857l(i11, bVar2, true))) {
                return false;
            }
        }
        int mo33625f = mo33625f(true);
        if (mo33625f != abstractC11018d4.mo33625f(true) || (mo33626h = mo33626h(true)) != abstractC11018d4.mo33626h(true)) {
            return false;
        }
        while (mo33625f != mo33626h) {
            int mo33627j = mo33627j(mo33625f, 0, true);
            if (mo33627j != abstractC11018d4.mo33627j(mo33625f, 0, true)) {
                return false;
            }
            mo33625f = mo33627j;
        }
        return true;
    }

    /* renamed from: f */
    public int mo33625f(boolean z10) {
        return m34005v() ? -1 : 0;
    }

    /* renamed from: g */
    public abstract int mo11856g(Object obj);

    /* renamed from: h */
    public int mo33626h(boolean z10) {
        if (m34005v()) {
            return -1;
        }
        return mo11861u() - 1;
    }

    public int hashCode() {
        int i10;
        d dVar = new d();
        b bVar = new b();
        int mo11861u = 217 + mo11861u();
        int i11 = 0;
        while (true) {
            i10 = mo11861u * 31;
            if (i11 >= mo11861u()) {
                break;
            }
            mo11861u = i10 + m34004s(i11, dVar).hashCode();
            i11++;
        }
        int mo11858n = i10 + mo11858n();
        for (int i12 = 0; i12 < mo11858n(); i12++) {
            mo11858n = (mo11858n * 31) + mo11857l(i12, bVar, true).hashCode();
        }
        int mo33625f = mo33625f(true);
        while (mo33625f != -1) {
            mo11858n = (mo11858n * 31) + mo33625f;
            mo33625f = mo33627j(mo33625f, 0, true);
        }
        return mo11858n;
    }

    /* renamed from: i */
    public final int m34000i(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = m34001k(i10, bVar).f28227c;
        if (m34004s(i12, dVar).f28253A != i10) {
            return i10 + 1;
        }
        int mo33627j = mo33627j(i12, i11, z10);
        if (mo33627j == -1) {
            return -1;
        }
        return m34004s(mo33627j, dVar).f28269z;
    }

    /* renamed from: j */
    public int mo33627j(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == mo33626h(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo33626h(z10) ? mo33625f(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public final b m34001k(int i10, b bVar) {
        return mo11857l(i10, bVar, false);
    }

    /* renamed from: l */
    public abstract b mo11857l(int i10, b bVar, boolean z10);

    /* renamed from: m */
    public b mo33628m(Object obj, b bVar) {
        return mo11857l(mo11856g(obj), bVar, true);
    }

    /* renamed from: n */
    public abstract int mo11858n();

    /* renamed from: o */
    public final Pair<Object, Long> m34002o(d dVar, b bVar, int i10, long j10) {
        return (Pair) C11137a.m34603e(m34003p(dVar, bVar, i10, j10, 0L));
    }

    /* renamed from: p */
    public final Pair<Object, Long> m34003p(d dVar, b bVar, int i10, long j10, long j11) {
        C11137a.m34601c(i10, 0, mo11861u());
        mo11860t(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.m34033f();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f28269z;
        m34001k(i11, bVar);
        while (i11 < dVar.f28253A && bVar.f28229e != j10) {
            int i12 = i11 + 1;
            if (m34001k(i12, bVar).f28229e > j10) {
                break;
            }
            i11 = i12;
        }
        mo11857l(i11, bVar, true);
        long j12 = j10 - bVar.f28229e;
        long j13 = bVar.f28228d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(C11137a.m34603e(bVar.f28226b), Long.valueOf(Math.max(0L, j12)));
    }

    /* renamed from: q */
    public int mo33629q(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == mo33625f(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo33625f(z10) ? mo33626h(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    public abstract Object mo11859r(int i10);

    /* renamed from: s */
    public final d m34004s(int i10, d dVar) {
        return mo11860t(i10, dVar, 0L);
    }

    /* renamed from: t */
    public abstract d mo11860t(int i10, d dVar, long j10);

    /* renamed from: u */
    public abstract int mo11861u();

    /* renamed from: v */
    public final boolean m34005v() {
        return mo11861u() == 0;
    }

    /* renamed from: w */
    public final boolean m34006w(int i10, b bVar, d dVar, int i11, boolean z10) {
        return m34000i(i10, bVar, dVar, i11, z10) == -1;
    }
}
