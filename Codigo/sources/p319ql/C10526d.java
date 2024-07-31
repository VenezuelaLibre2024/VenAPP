package p319ql;

import com.google.android.gms.common.api.C5101a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p450xk.C12525q;

/* renamed from: ql.d */
/* loaded from: classes3.dex */
public final class C10526d {

    /* renamed from: n */
    public static final b f26232n = new b(null);

    /* renamed from: o */
    public static final C10526d f26233o = new a().m31700d().m31698a();

    /* renamed from: p */
    public static final C10526d f26234p = new a().m31701e().m31699c(C5101a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).m31698a();

    /* renamed from: a */
    private final boolean f26235a;

    /* renamed from: b */
    private final boolean f26236b;

    /* renamed from: c */
    private final int f26237c;

    /* renamed from: d */
    private final int f26238d;

    /* renamed from: e */
    private final boolean f26239e;

    /* renamed from: f */
    private final boolean f26240f;

    /* renamed from: g */
    private final boolean f26241g;

    /* renamed from: h */
    private final int f26242h;

    /* renamed from: i */
    private final int f26243i;

    /* renamed from: j */
    private final boolean f26244j;

    /* renamed from: k */
    private final boolean f26245k;

    /* renamed from: l */
    private final boolean f26246l;

    /* renamed from: m */
    private String f26247m;

    /* renamed from: ql.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f26248a;

        /* renamed from: b */
        private boolean f26249b;

        /* renamed from: c */
        private int f26250c = -1;

        /* renamed from: d */
        private int f26251d = -1;

        /* renamed from: e */
        private int f26252e = -1;

        /* renamed from: f */
        private boolean f26253f;

        /* renamed from: g */
        private boolean f26254g;

        /* renamed from: h */
        private boolean f26255h;

        /* renamed from: b */
        private final int m31697b(long j10) {
            return j10 > 2147483647L ? C5101a.e.API_PRIORITY_OTHER : (int) j10;
        }

        /* renamed from: a */
        public final C10526d m31698a() {
            return new C10526d(this.f26248a, this.f26249b, this.f26250c, -1, false, false, false, this.f26251d, this.f26252e, this.f26253f, this.f26254g, this.f26255h, null, null);
        }

        /* renamed from: c */
        public final a m31699c(int i10, TimeUnit timeUnit) {
            C9322n.m27781e(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(C9322n.m27787k("maxStale < 0: ", Integer.valueOf(i10)).toString());
            }
            this.f26251d = m31697b(timeUnit.toSeconds(i10));
            return this;
        }

        /* renamed from: d */
        public final a m31700d() {
            this.f26248a = true;
            return this;
        }

        /* renamed from: e */
        public final a m31701e() {
            this.f26253f = true;
            return this;
        }
    }

    /* renamed from: ql.d$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final int m31702a(String str, String str2, int i10) {
            boolean m41057I;
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                m41057I = C12525q.m41057I(str2, str.charAt(i10), false, 2, null);
                if (m41057I) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p319ql.C10526d m31703b(p319ql.C10545t r31) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10526d.b.m31703b(ql.t):ql.d");
        }
    }

    private C10526d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f26235a = z10;
        this.f26236b = z11;
        this.f26237c = i10;
        this.f26238d = i11;
        this.f26239e = z12;
        this.f26240f = z13;
        this.f26241g = z14;
        this.f26242h = i12;
        this.f26243i = i13;
        this.f26244j = z15;
        this.f26245k = z16;
        this.f26246l = z17;
        this.f26247m = str;
    }

    public /* synthetic */ C10526d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, C9315g c9315g) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    /* renamed from: a */
    public final boolean m31685a() {
        return this.f26246l;
    }

    /* renamed from: b */
    public final boolean m31686b() {
        return this.f26239e;
    }

    /* renamed from: c */
    public final boolean m31687c() {
        return this.f26240f;
    }

    /* renamed from: d */
    public final int m31688d() {
        return this.f26237c;
    }

    /* renamed from: e */
    public final int m31689e() {
        return this.f26242h;
    }

    /* renamed from: f */
    public final int m31690f() {
        return this.f26243i;
    }

    /* renamed from: g */
    public final boolean m31691g() {
        return this.f26241g;
    }

    /* renamed from: h */
    public final boolean m31692h() {
        return this.f26235a;
    }

    /* renamed from: i */
    public final boolean m31693i() {
        return this.f26236b;
    }

    /* renamed from: j */
    public final boolean m31694j() {
        return this.f26245k;
    }

    /* renamed from: k */
    public final boolean m31695k() {
        return this.f26244j;
    }

    /* renamed from: l */
    public final int m31696l() {
        return this.f26238d;
    }

    public String toString() {
        String str = this.f26247m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (m31692h()) {
            sb2.append("no-cache, ");
        }
        if (m31693i()) {
            sb2.append("no-store, ");
        }
        if (m31688d() != -1) {
            sb2.append("max-age=");
            sb2.append(m31688d());
            sb2.append(", ");
        }
        if (m31696l() != -1) {
            sb2.append("s-maxage=");
            sb2.append(m31696l());
            sb2.append(", ");
        }
        if (m31686b()) {
            sb2.append("private, ");
        }
        if (m31687c()) {
            sb2.append("public, ");
        }
        if (m31691g()) {
            sb2.append("must-revalidate, ");
        }
        if (m31689e() != -1) {
            sb2.append("max-stale=");
            sb2.append(m31689e());
            sb2.append(", ");
        }
        if (m31690f() != -1) {
            sb2.append("min-fresh=");
            sb2.append(m31690f());
            sb2.append(", ");
        }
        if (m31695k()) {
            sb2.append("only-if-cached, ");
        }
        if (m31694j()) {
            sb2.append("no-transform, ");
        }
        if (m31685a()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f26247m = sb3;
        return sb3;
    }
}
