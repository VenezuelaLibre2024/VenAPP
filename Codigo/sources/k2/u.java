package k2;

import f2.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final a f20220u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    private static final String f20221v;

    /* renamed from: w, reason: collision with root package name */
    public static final m.a<List<c>, List<f2.s>> f20222w;

    /* renamed from: a, reason: collision with root package name */
    public final String f20223a;

    /* renamed from: b, reason: collision with root package name */
    public s.a f20224b;

    /* renamed from: c, reason: collision with root package name */
    public String f20225c;

    /* renamed from: d, reason: collision with root package name */
    public String f20226d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f20227e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f20228f;

    /* renamed from: g, reason: collision with root package name */
    public long f20229g;

    /* renamed from: h, reason: collision with root package name */
    public long f20230h;

    /* renamed from: i, reason: collision with root package name */
    public long f20231i;

    /* renamed from: j, reason: collision with root package name */
    public f2.b f20232j;

    /* renamed from: k, reason: collision with root package name */
    public int f20233k;

    /* renamed from: l, reason: collision with root package name */
    public f2.a f20234l;

    /* renamed from: m, reason: collision with root package name */
    public long f20235m;

    /* renamed from: n, reason: collision with root package name */
    public long f20236n;

    /* renamed from: o, reason: collision with root package name */
    public long f20237o;

    /* renamed from: p, reason: collision with root package name */
    public long f20238p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20239q;

    /* renamed from: r, reason: collision with root package name */
    public f2.n f20240r;

    /* renamed from: s, reason: collision with root package name */
    private int f20241s;

    /* renamed from: t, reason: collision with root package name */
    private final int f20242t;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f20243a;

        /* renamed from: b, reason: collision with root package name */
        public s.a f20244b;

        public b(String id2, s.a state) {
            kotlin.jvm.internal.n.e(id2, "id");
            kotlin.jvm.internal.n.e(state, "state");
            this.f20243a = id2;
            this.f20244b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.n.a(this.f20243a, bVar.f20243a) && this.f20244b == bVar.f20244b;
        }

        public int hashCode() {
            return (this.f20243a.hashCode() * 31) + this.f20244b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f20243a + ", state=" + this.f20244b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f20245a;

        /* renamed from: b, reason: collision with root package name */
        private s.a f20246b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.work.b f20247c;

        /* renamed from: d, reason: collision with root package name */
        private int f20248d;

        /* renamed from: e, reason: collision with root package name */
        private final int f20249e;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f20250f;

        /* renamed from: g, reason: collision with root package name */
        private List<androidx.work.b> f20251g;

        public c(String id2, s.a state, androidx.work.b output, int i10, int i11, List<String> tags, List<androidx.work.b> progress) {
            kotlin.jvm.internal.n.e(id2, "id");
            kotlin.jvm.internal.n.e(state, "state");
            kotlin.jvm.internal.n.e(output, "output");
            kotlin.jvm.internal.n.e(tags, "tags");
            kotlin.jvm.internal.n.e(progress, "progress");
            this.f20245a = id2;
            this.f20246b = state;
            this.f20247c = output;
            this.f20248d = i10;
            this.f20249e = i11;
            this.f20250f = tags;
            this.f20251g = progress;
        }

        public final f2.s a() {
            return new f2.s(UUID.fromString(this.f20245a), this.f20246b, this.f20247c, this.f20250f, this.f20251g.isEmpty() ^ true ? this.f20251g.get(0) : androidx.work.b.f5711c, this.f20248d, this.f20249e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.a(this.f20245a, cVar.f20245a) && this.f20246b == cVar.f20246b && kotlin.jvm.internal.n.a(this.f20247c, cVar.f20247c) && this.f20248d == cVar.f20248d && this.f20249e == cVar.f20249e && kotlin.jvm.internal.n.a(this.f20250f, cVar.f20250f) && kotlin.jvm.internal.n.a(this.f20251g, cVar.f20251g);
        }

        public int hashCode() {
            return (((((((((((this.f20245a.hashCode() * 31) + this.f20246b.hashCode()) * 31) + this.f20247c.hashCode()) * 31) + Integer.hashCode(this.f20248d)) * 31) + Integer.hashCode(this.f20249e)) * 31) + this.f20250f.hashCode()) * 31) + this.f20251g.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f20245a + ", state=" + this.f20246b + ", output=" + this.f20247c + ", runAttemptCount=" + this.f20248d + ", generation=" + this.f20249e + ", tags=" + this.f20250f + ", progress=" + this.f20251g + ')';
        }
    }

    static {
        String i10 = f2.j.i("WorkSpec");
        kotlin.jvm.internal.n.d(i10, "tagWithPrefix(\"WorkSpec\")");
        f20221v = i10;
        f20222w = new m.a() { // from class: k2.t
            @Override // m.a
            public final Object apply(Object obj) {
                List b10;
                b10 = u.b((List) obj);
                return b10;
            }
        };
    }

    public u(String id2, s.a state, String workerClassName, String str, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, f2.b constraints, int i10, f2.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, f2.n outOfQuotaPolicy, int i11, int i12) {
        kotlin.jvm.internal.n.e(id2, "id");
        kotlin.jvm.internal.n.e(state, "state");
        kotlin.jvm.internal.n.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.n.e(input, "input");
        kotlin.jvm.internal.n.e(output, "output");
        kotlin.jvm.internal.n.e(constraints, "constraints");
        kotlin.jvm.internal.n.e(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.n.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f20223a = id2;
        this.f20224b = state;
        this.f20225c = workerClassName;
        this.f20226d = str;
        this.f20227e = input;
        this.f20228f = output;
        this.f20229g = j10;
        this.f20230h = j11;
        this.f20231i = j12;
        this.f20232j = constraints;
        this.f20233k = i10;
        this.f20234l = backoffPolicy;
        this.f20235m = j13;
        this.f20236n = j14;
        this.f20237o = j15;
        this.f20238p = j16;
        this.f20239q = z10;
        this.f20240r = outOfQuotaPolicy;
        this.f20241s = i11;
        this.f20242t = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ u(java.lang.String r31, f2.s.a r32, java.lang.String r33, java.lang.String r34, androidx.work.b r35, androidx.work.b r36, long r37, long r39, long r41, f2.b r43, int r44, f2.a r45, long r46, long r48, long r50, long r52, boolean r54, f2.n r55, int r56, int r57, int r58, kotlin.jvm.internal.g r59) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.u.<init>(java.lang.String, f2.s$a, java.lang.String, java.lang.String, androidx.work.b, androidx.work.b, long, long, long, f2.b, int, f2.a, long, long, long, long, boolean, f2.n, int, int, int, kotlin.jvm.internal.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        kotlin.jvm.internal.n.e(id2, "id");
        kotlin.jvm.internal.n.e(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String newId, u other) {
        this(newId, other.f20224b, other.f20225c, other.f20226d, new androidx.work.b(other.f20227e), new androidx.work.b(other.f20228f), other.f20229g, other.f20230h, other.f20231i, new f2.b(other.f20232j), other.f20233k, other.f20234l, other.f20235m, other.f20236n, other.f20237o, other.f20238p, other.f20239q, other.f20240r, other.f20241s, 0, 524288, null);
        kotlin.jvm.internal.n.e(newId, "newId");
        kotlin.jvm.internal.n.e(other, "other");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        int r10;
        if (list == null) {
            return null;
        }
        List list2 = list;
        r10 = dk.s.r(list2, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).a());
        }
        return arrayList;
    }

    public final long c() {
        long e10;
        if (i()) {
            long scalb = this.f20234l == f2.a.LINEAR ? this.f20235m * this.f20233k : Math.scalb((float) this.f20235m, this.f20233k - 1);
            long j10 = this.f20236n;
            e10 = uk.l.e(scalb, 18000000L);
            return j10 + e10;
        }
        if (!j()) {
            long j11 = this.f20236n;
            if (j11 == 0) {
                j11 = System.currentTimeMillis();
            }
            return this.f20229g + j11;
        }
        int i10 = this.f20241s;
        long j12 = this.f20236n;
        if (i10 == 0) {
            j12 += this.f20229g;
        }
        long j13 = this.f20231i;
        long j14 = this.f20230h;
        if (j13 != j14) {
            r3 = i10 == 0 ? (-1) * j13 : 0L;
            j12 += j14;
        } else if (i10 != 0) {
            r3 = j14;
        }
        return j12 + r3;
    }

    public final u d(String id2, s.a state, String workerClassName, String str, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, f2.b constraints, int i10, f2.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, f2.n outOfQuotaPolicy, int i11, int i12) {
        kotlin.jvm.internal.n.e(id2, "id");
        kotlin.jvm.internal.n.e(state, "state");
        kotlin.jvm.internal.n.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.n.e(input, "input");
        kotlin.jvm.internal.n.e(output, "output");
        kotlin.jvm.internal.n.e(constraints, "constraints");
        kotlin.jvm.internal.n.e(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.n.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new u(id2, state, workerClassName, str, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.n.a(this.f20223a, uVar.f20223a) && this.f20224b == uVar.f20224b && kotlin.jvm.internal.n.a(this.f20225c, uVar.f20225c) && kotlin.jvm.internal.n.a(this.f20226d, uVar.f20226d) && kotlin.jvm.internal.n.a(this.f20227e, uVar.f20227e) && kotlin.jvm.internal.n.a(this.f20228f, uVar.f20228f) && this.f20229g == uVar.f20229g && this.f20230h == uVar.f20230h && this.f20231i == uVar.f20231i && kotlin.jvm.internal.n.a(this.f20232j, uVar.f20232j) && this.f20233k == uVar.f20233k && this.f20234l == uVar.f20234l && this.f20235m == uVar.f20235m && this.f20236n == uVar.f20236n && this.f20237o == uVar.f20237o && this.f20238p == uVar.f20238p && this.f20239q == uVar.f20239q && this.f20240r == uVar.f20240r && this.f20241s == uVar.f20241s && this.f20242t == uVar.f20242t;
    }

    public final int f() {
        return this.f20242t;
    }

    public final int g() {
        return this.f20241s;
    }

    public final boolean h() {
        return !kotlin.jvm.internal.n.a(f2.b.f14859j, this.f20232j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f20223a.hashCode() * 31) + this.f20224b.hashCode()) * 31) + this.f20225c.hashCode()) * 31;
        String str = this.f20226d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20227e.hashCode()) * 31) + this.f20228f.hashCode()) * 31) + Long.hashCode(this.f20229g)) * 31) + Long.hashCode(this.f20230h)) * 31) + Long.hashCode(this.f20231i)) * 31) + this.f20232j.hashCode()) * 31) + Integer.hashCode(this.f20233k)) * 31) + this.f20234l.hashCode()) * 31) + Long.hashCode(this.f20235m)) * 31) + Long.hashCode(this.f20236n)) * 31) + Long.hashCode(this.f20237o)) * 31) + Long.hashCode(this.f20238p)) * 31;
        boolean z10 = this.f20239q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode2 + i10) * 31) + this.f20240r.hashCode()) * 31) + Integer.hashCode(this.f20241s)) * 31) + Integer.hashCode(this.f20242t);
    }

    public final boolean i() {
        return this.f20224b == s.a.ENQUEUED && this.f20233k > 0;
    }

    public final boolean j() {
        return this.f20230h != 0;
    }

    public final void k(long j10) {
        long g10;
        if (j10 > 18000000) {
            f2.j.e().k(f20221v, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            f2.j.e().k(f20221v, "Backoff delay duration less than minimum value");
        }
        g10 = uk.l.g(j10, 10000L, 18000000L);
        this.f20235m = g10;
    }

    public String toString() {
        return "{WorkSpec: " + this.f20223a + '}';
    }
}
