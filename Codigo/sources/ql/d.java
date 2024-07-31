package ql;

import com.google.android.gms.common.api.a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final b f24190n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final d f24191o = new a().d().a();

    /* renamed from: p, reason: collision with root package name */
    public static final d f24192p = new a().e().c(a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24193a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24194b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24195c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24196d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24197e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24198f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24199g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24200h;

    /* renamed from: i, reason: collision with root package name */
    private final int f24201i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f24202j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f24203k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24204l;

    /* renamed from: m, reason: collision with root package name */
    private String f24205m;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f24206a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24207b;

        /* renamed from: c, reason: collision with root package name */
        private int f24208c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f24209d = -1;

        /* renamed from: e, reason: collision with root package name */
        private int f24210e = -1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24211f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f24212g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24213h;

        private final int b(long j10) {
            return j10 > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) j10;
        }

        public final d a() {
            return new d(this.f24206a, this.f24207b, this.f24208c, -1, false, false, false, this.f24209d, this.f24210e, this.f24211f, this.f24212g, this.f24213h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            kotlin.jvm.internal.n.e(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k("maxStale < 0: ", Integer.valueOf(i10)).toString());
            }
            this.f24209d = b(timeUnit.toSeconds(i10));
            return this;
        }

        public final a d() {
            this.f24206a = true;
            return this;
        }

        public final a e() {
            this.f24211f = true;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            boolean I;
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                I = xk.q.I(str2, str.charAt(i10), false, 2, null);
                if (I) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ql.d b(ql.t r31) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.d.b.b(ql.t):ql.d");
        }
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f24193a = z10;
        this.f24194b = z11;
        this.f24195c = i10;
        this.f24196d = i11;
        this.f24197e = z12;
        this.f24198f = z13;
        this.f24199g = z14;
        this.f24200h = i12;
        this.f24201i = i13;
        this.f24202j = z15;
        this.f24203k = z16;
        this.f24204l = z17;
        this.f24205m = str;
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, kotlin.jvm.internal.g gVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f24204l;
    }

    public final boolean b() {
        return this.f24197e;
    }

    public final boolean c() {
        return this.f24198f;
    }

    public final int d() {
        return this.f24195c;
    }

    public final int e() {
        return this.f24200h;
    }

    public final int f() {
        return this.f24201i;
    }

    public final boolean g() {
        return this.f24199g;
    }

    public final boolean h() {
        return this.f24193a;
    }

    public final boolean i() {
        return this.f24194b;
    }

    public final boolean j() {
        return this.f24203k;
    }

    public final boolean k() {
        return this.f24202j;
    }

    public final int l() {
        return this.f24196d;
    }

    public String toString() {
        String str = this.f24205m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (h()) {
            sb2.append("no-cache, ");
        }
        if (i()) {
            sb2.append("no-store, ");
        }
        if (d() != -1) {
            sb2.append("max-age=");
            sb2.append(d());
            sb2.append(", ");
        }
        if (l() != -1) {
            sb2.append("s-maxage=");
            sb2.append(l());
            sb2.append(", ");
        }
        if (b()) {
            sb2.append("private, ");
        }
        if (c()) {
            sb2.append("public, ");
        }
        if (g()) {
            sb2.append("must-revalidate, ");
        }
        if (e() != -1) {
            sb2.append("max-stale=");
            sb2.append(e());
            sb2.append(", ");
        }
        if (f() != -1) {
            sb2.append("min-fresh=");
            sb2.append(f());
            sb2.append(", ");
        }
        if (k()) {
            sb2.append("only-if-cached, ");
        }
        if (j()) {
            sb2.append("no-transform, ");
        }
        if (a()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f24205m = sb3;
        return sb3;
    }
}
