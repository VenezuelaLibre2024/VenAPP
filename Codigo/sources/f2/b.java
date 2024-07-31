package f2;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.q0;
import dk.z;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i */
    public static final C0235b f14858i = new C0235b(null);

    /* renamed from: j */
    public static final b f14859j = new b(null, false, false, false, false, 0, 0, null, 255, null);

    /* renamed from: a */
    private final k f14860a;

    /* renamed from: b */
    private final boolean f14861b;

    /* renamed from: c */
    private final boolean f14862c;

    /* renamed from: d */
    private final boolean f14863d;

    /* renamed from: e */
    private final boolean f14864e;

    /* renamed from: f */
    private final long f14865f;

    /* renamed from: g */
    private final long f14866g;

    /* renamed from: h */
    private final Set<c> f14867h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f14868a;

        /* renamed from: b */
        private boolean f14869b;

        /* renamed from: d */
        private boolean f14871d;

        /* renamed from: e */
        private boolean f14872e;

        /* renamed from: c */
        private k f14870c = k.NOT_REQUIRED;

        /* renamed from: f */
        private long f14873f = -1;

        /* renamed from: g */
        private long f14874g = -1;

        /* renamed from: h */
        private Set<c> f14875h = new LinkedHashSet();

        public final b a() {
            Set j02;
            j02 = z.j0(this.f14875h);
            long j10 = this.f14873f;
            long j11 = this.f14874g;
            return new b(this.f14870c, this.f14868a, this.f14869b, this.f14871d, this.f14872e, j10, j11, j02);
        }

        public final a b(k networkType) {
            kotlin.jvm.internal.n.e(networkType, "networkType");
            this.f14870c = networkType;
            return this;
        }

        public final a c(boolean z10) {
            this.f14872e = z10;
            return this;
        }
    }

    /* renamed from: f2.b$b */
    /* loaded from: classes.dex */
    public static final class C0235b {
        private C0235b() {
        }

        public /* synthetic */ C0235b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final Uri f14876a;

        /* renamed from: b */
        private final boolean f14877b;

        public c(Uri uri, boolean z10) {
            kotlin.jvm.internal.n.e(uri, "uri");
            this.f14876a = uri;
            this.f14877b = z10;
        }

        public final Uri a() {
            return this.f14876a;
        }

        public final boolean b() {
            return this.f14877b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!kotlin.jvm.internal.n.a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.a(this.f14876a, cVar.f14876a) && this.f14877b == cVar.f14877b;
        }

        public int hashCode() {
            return (this.f14876a.hashCode() * 31) + Boolean.hashCode(this.f14877b);
        }
    }

    public b() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(f2.b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.n.e(r13, r0)
            boolean r3 = r13.f14861b
            boolean r4 = r13.f14862c
            f2.k r2 = r13.f14860a
            boolean r5 = r13.f14863d
            boolean r6 = r13.f14864e
            java.util.Set<f2.b$c> r11 = r13.f14867h
            long r7 = r13.f14865f
            long r9 = r13.f14866g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.<init>(f2.b):void");
    }

    public b(k requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> contentUriTriggers) {
        kotlin.jvm.internal.n.e(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.n.e(contentUriTriggers, "contentUriTriggers");
        this.f14860a = requiredNetworkType;
        this.f14861b = z10;
        this.f14862c = z11;
        this.f14863d = z12;
        this.f14864e = z13;
        this.f14865f = j10;
        this.f14866g = j11;
        this.f14867h = contentUriTriggers;
    }

    public /* synthetic */ b(k kVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? k.NOT_REQUIRED : kVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) == 0 ? z13 : false, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) == 0 ? j11 : -1L, (i10 & RecognitionOptions.ITF) != 0 ? q0.e() : set);
    }

    public final long a() {
        return this.f14866g;
    }

    public final long b() {
        return this.f14865f;
    }

    public final Set<c> c() {
        return this.f14867h;
    }

    public final k d() {
        return this.f14860a;
    }

    public final boolean e() {
        return !this.f14867h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.n.a(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f14861b == bVar.f14861b && this.f14862c == bVar.f14862c && this.f14863d == bVar.f14863d && this.f14864e == bVar.f14864e && this.f14865f == bVar.f14865f && this.f14866g == bVar.f14866g && this.f14860a == bVar.f14860a) {
            return kotlin.jvm.internal.n.a(this.f14867h, bVar.f14867h);
        }
        return false;
    }

    public final boolean f() {
        return this.f14863d;
    }

    public final boolean g() {
        return this.f14861b;
    }

    public final boolean h() {
        return this.f14862c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f14860a.hashCode() * 31) + (this.f14861b ? 1 : 0)) * 31) + (this.f14862c ? 1 : 0)) * 31) + (this.f14863d ? 1 : 0)) * 31) + (this.f14864e ? 1 : 0)) * 31;
        long j10 = this.f14865f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14866g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f14867h.hashCode();
    }

    public final boolean i() {
        return this.f14864e;
    }
}
