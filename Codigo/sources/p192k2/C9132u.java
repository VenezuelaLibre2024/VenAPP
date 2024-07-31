package p192k2;

import androidx.work.C1522b;
import dk.C7033s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p094f2.C7269b;
import p094f2.C7286s;
import p094f2.EnumC7268a;
import p094f2.EnumC7281n;
import p227m.InterfaceC9531a;
import uk.C11585l;

/* renamed from: k2.u */
/* loaded from: classes.dex */
public final class C9132u {

    /* renamed from: u */
    public static final a f22002u = new a(null);

    /* renamed from: v */
    private static final String f22003v;

    /* renamed from: w */
    public static final InterfaceC9531a<List<c>, List<C7286s>> f22004w;

    /* renamed from: a */
    public final String f22005a;

    /* renamed from: b */
    public C7286s.a f22006b;

    /* renamed from: c */
    public String f22007c;

    /* renamed from: d */
    public String f22008d;

    /* renamed from: e */
    public C1522b f22009e;

    /* renamed from: f */
    public C1522b f22010f;

    /* renamed from: g */
    public long f22011g;

    /* renamed from: h */
    public long f22012h;

    /* renamed from: i */
    public long f22013i;

    /* renamed from: j */
    public C7269b f22014j;

    /* renamed from: k */
    public int f22015k;

    /* renamed from: l */
    public EnumC7268a f22016l;

    /* renamed from: m */
    public long f22017m;

    /* renamed from: n */
    public long f22018n;

    /* renamed from: o */
    public long f22019o;

    /* renamed from: p */
    public long f22020p;

    /* renamed from: q */
    public boolean f22021q;

    /* renamed from: r */
    public EnumC7281n f22022r;

    /* renamed from: s */
    private int f22023s;

    /* renamed from: t */
    private final int f22024t;

    /* renamed from: k2.u$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: k2.u$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public String f22025a;

        /* renamed from: b */
        public C7286s.a f22026b;

        public b(String id2, C7286s.a state) {
            C9322n.m27781e(id2, "id");
            C9322n.m27781e(state, "state");
            this.f22025a = id2;
            this.f22026b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9322n.m27777a(this.f22025a, bVar.f22025a) && this.f22026b == bVar.f22026b;
        }

        public int hashCode() {
            return (this.f22025a.hashCode() * 31) + this.f22026b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f22025a + ", state=" + this.f22026b + ')';
        }
    }

    /* renamed from: k2.u$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private String f22027a;

        /* renamed from: b */
        private C7286s.a f22028b;

        /* renamed from: c */
        private C1522b f22029c;

        /* renamed from: d */
        private int f22030d;

        /* renamed from: e */
        private final int f22031e;

        /* renamed from: f */
        private List<String> f22032f;

        /* renamed from: g */
        private List<C1522b> f22033g;

        public c(String id2, C7286s.a state, C1522b output, int i10, int i11, List<String> tags, List<C1522b> progress) {
            C9322n.m27781e(id2, "id");
            C9322n.m27781e(state, "state");
            C9322n.m27781e(output, "output");
            C9322n.m27781e(tags, "tags");
            C9322n.m27781e(progress, "progress");
            this.f22027a = id2;
            this.f22028b = state;
            this.f22029c = output;
            this.f22030d = i10;
            this.f22031e = i11;
            this.f22032f = tags;
            this.f22033g = progress;
        }

        /* renamed from: a */
        public final C7286s m26901a() {
            return new C7286s(UUID.fromString(this.f22027a), this.f22028b, this.f22029c, this.f22032f, this.f22033g.isEmpty() ^ true ? this.f22033g.get(0) : C1522b.f6562c, this.f22030d, this.f22031e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C9322n.m27777a(this.f22027a, cVar.f22027a) && this.f22028b == cVar.f22028b && C9322n.m27777a(this.f22029c, cVar.f22029c) && this.f22030d == cVar.f22030d && this.f22031e == cVar.f22031e && C9322n.m27777a(this.f22032f, cVar.f22032f) && C9322n.m27777a(this.f22033g, cVar.f22033g);
        }

        public int hashCode() {
            return (((((((((((this.f22027a.hashCode() * 31) + this.f22028b.hashCode()) * 31) + this.f22029c.hashCode()) * 31) + Integer.hashCode(this.f22030d)) * 31) + Integer.hashCode(this.f22031e)) * 31) + this.f22032f.hashCode()) * 31) + this.f22033g.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f22027a + ", state=" + this.f22028b + ", output=" + this.f22029c + ", runAttemptCount=" + this.f22030d + ", generation=" + this.f22031e + ", tags=" + this.f22032f + ", progress=" + this.f22033g + ')';
        }
    }

    static {
        String m21769i = AbstractC7277j.m21769i("WorkSpec");
        C9322n.m27780d(m21769i, "tagWithPrefix(\"WorkSpec\")");
        f22003v = m21769i;
        f22004w = new InterfaceC9531a() { // from class: k2.t
            @Override // p227m.InterfaceC9531a
            public final Object apply(Object obj) {
                List m26891b;
                m26891b = C9132u.m26891b((List) obj);
                return m26891b;
            }
        };
    }

    public C9132u(String id2, C7286s.a state, String workerClassName, String str, C1522b input, C1522b output, long j10, long j11, long j12, C7269b constraints, int i10, EnumC7268a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, EnumC7281n outOfQuotaPolicy, int i11, int i12) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(state, "state");
        C9322n.m27781e(workerClassName, "workerClassName");
        C9322n.m27781e(input, "input");
        C9322n.m27781e(output, "output");
        C9322n.m27781e(constraints, "constraints");
        C9322n.m27781e(backoffPolicy, "backoffPolicy");
        C9322n.m27781e(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f22005a = id2;
        this.f22006b = state;
        this.f22007c = workerClassName;
        this.f22008d = str;
        this.f22009e = input;
        this.f22010f = output;
        this.f22011g = j10;
        this.f22012h = j11;
        this.f22013i = j12;
        this.f22014j = constraints;
        this.f22015k = i10;
        this.f22016l = backoffPolicy;
        this.f22017m = j13;
        this.f22018n = j14;
        this.f22019o = j15;
        this.f22020p = j16;
        this.f22021q = z10;
        this.f22022r = outOfQuotaPolicy;
        this.f22023s = i11;
        this.f22024t = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C9132u(java.lang.String r31, p094f2.C7286s.a r32, java.lang.String r33, java.lang.String r34, androidx.work.C1522b r35, androidx.work.C1522b r36, long r37, long r39, long r41, p094f2.C7269b r43, int r44, p094f2.EnumC7268a r45, long r46, long r48, long r50, long r52, boolean r54, p094f2.EnumC7281n r55, int r56, int r57, int r58, kotlin.jvm.internal.C9315g r59) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p192k2.C9132u.<init>(java.lang.String, f2.s$a, java.lang.String, java.lang.String, androidx.work.b, androidx.work.b, long, long, long, f2.b, int, f2.a, long, long, long, long, boolean, f2.n, int, int, int, kotlin.jvm.internal.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9132u(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9132u(String newId, C9132u other) {
        this(newId, other.f22006b, other.f22007c, other.f22008d, new C1522b(other.f22009e), new C1522b(other.f22010f), other.f22011g, other.f22012h, other.f22013i, new C7269b(other.f22014j), other.f22015k, other.f22016l, other.f22017m, other.f22018n, other.f22019o, other.f22020p, other.f22021q, other.f22022r, other.f22023s, 0, 524288, null);
        C9322n.m27781e(newId, "newId");
        C9322n.m27781e(other, "other");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final List m26891b(List list) {
        int m20590r;
        if (list == null) {
            return null;
        }
        List list2 = list;
        m20590r = C7033s.m20590r(list2, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).m26901a());
        }
        return arrayList;
    }

    /* renamed from: c */
    public final long m26893c() {
        long m36296e;
        if (m26898i()) {
            long scalb = this.f22016l == EnumC7268a.LINEAR ? this.f22017m * this.f22015k : Math.scalb((float) this.f22017m, this.f22015k - 1);
            long j10 = this.f22018n;
            m36296e = C11585l.m36296e(scalb, 18000000L);
            return j10 + m36296e;
        }
        if (!m26899j()) {
            long j11 = this.f22018n;
            if (j11 == 0) {
                j11 = System.currentTimeMillis();
            }
            return this.f22011g + j11;
        }
        int i10 = this.f22023s;
        long j12 = this.f22018n;
        if (i10 == 0) {
            j12 += this.f22011g;
        }
        long j13 = this.f22013i;
        long j14 = this.f22012h;
        if (j13 != j14) {
            r3 = i10 == 0 ? (-1) * j13 : 0L;
            j12 += j14;
        } else if (i10 != 0) {
            r3 = j14;
        }
        return j12 + r3;
    }

    /* renamed from: d */
    public final C9132u m26894d(String id2, C7286s.a state, String workerClassName, String str, C1522b input, C1522b output, long j10, long j11, long j12, C7269b constraints, int i10, EnumC7268a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, EnumC7281n outOfQuotaPolicy, int i11, int i12) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(state, "state");
        C9322n.m27781e(workerClassName, "workerClassName");
        C9322n.m27781e(input, "input");
        C9322n.m27781e(output, "output");
        C9322n.m27781e(constraints, "constraints");
        C9322n.m27781e(backoffPolicy, "backoffPolicy");
        C9322n.m27781e(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C9132u(id2, state, workerClassName, str, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9132u)) {
            return false;
        }
        C9132u c9132u = (C9132u) obj;
        return C9322n.m27777a(this.f22005a, c9132u.f22005a) && this.f22006b == c9132u.f22006b && C9322n.m27777a(this.f22007c, c9132u.f22007c) && C9322n.m27777a(this.f22008d, c9132u.f22008d) && C9322n.m27777a(this.f22009e, c9132u.f22009e) && C9322n.m27777a(this.f22010f, c9132u.f22010f) && this.f22011g == c9132u.f22011g && this.f22012h == c9132u.f22012h && this.f22013i == c9132u.f22013i && C9322n.m27777a(this.f22014j, c9132u.f22014j) && this.f22015k == c9132u.f22015k && this.f22016l == c9132u.f22016l && this.f22017m == c9132u.f22017m && this.f22018n == c9132u.f22018n && this.f22019o == c9132u.f22019o && this.f22020p == c9132u.f22020p && this.f22021q == c9132u.f22021q && this.f22022r == c9132u.f22022r && this.f22023s == c9132u.f22023s && this.f22024t == c9132u.f22024t;
    }

    /* renamed from: f */
    public final int m26895f() {
        return this.f22024t;
    }

    /* renamed from: g */
    public final int m26896g() {
        return this.f22023s;
    }

    /* renamed from: h */
    public final boolean m26897h() {
        return !C9322n.m27777a(C7269b.f16282j, this.f22014j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f22005a.hashCode() * 31) + this.f22006b.hashCode()) * 31) + this.f22007c.hashCode()) * 31;
        String str = this.f22008d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f22009e.hashCode()) * 31) + this.f22010f.hashCode()) * 31) + Long.hashCode(this.f22011g)) * 31) + Long.hashCode(this.f22012h)) * 31) + Long.hashCode(this.f22013i)) * 31) + this.f22014j.hashCode()) * 31) + Integer.hashCode(this.f22015k)) * 31) + this.f22016l.hashCode()) * 31) + Long.hashCode(this.f22017m)) * 31) + Long.hashCode(this.f22018n)) * 31) + Long.hashCode(this.f22019o)) * 31) + Long.hashCode(this.f22020p)) * 31;
        boolean z10 = this.f22021q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode2 + i10) * 31) + this.f22022r.hashCode()) * 31) + Integer.hashCode(this.f22023s)) * 31) + Integer.hashCode(this.f22024t);
    }

    /* renamed from: i */
    public final boolean m26898i() {
        return this.f22006b == C7286s.a.ENQUEUED && this.f22015k > 0;
    }

    /* renamed from: j */
    public final boolean m26899j() {
        return this.f22012h != 0;
    }

    /* renamed from: k */
    public final void m26900k(long j10) {
        long m36298g;
        if (j10 > 18000000) {
            AbstractC7277j.m21767e().mo21777k(f22003v, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            AbstractC7277j.m21767e().mo21777k(f22003v, "Backoff delay duration less than minimum value");
        }
        m36298g = C11585l.m36298g(j10, 10000L, 18000000L);
        this.f22017m = m36298g;
    }

    public String toString() {
        return "{WorkSpec: " + this.f22005a + '}';
    }
}
