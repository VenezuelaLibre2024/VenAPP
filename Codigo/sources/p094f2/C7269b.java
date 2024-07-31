package p094f2;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7030q0;
import dk.C7042z;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C7269b {

    /* renamed from: i */
    public static final b f16281i = new b(null);

    /* renamed from: j */
    public static final C7269b f16282j = new C7269b(null, false, false, false, false, 0, 0, null, 255, null);

    /* renamed from: a */
    private final EnumC7278k f16283a;

    /* renamed from: b */
    private final boolean f16284b;

    /* renamed from: c */
    private final boolean f16285c;

    /* renamed from: d */
    private final boolean f16286d;

    /* renamed from: e */
    private final boolean f16287e;

    /* renamed from: f */
    private final long f16288f;

    /* renamed from: g */
    private final long f16289g;

    /* renamed from: h */
    private final Set<c> f16290h;

    /* renamed from: f2.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f16291a;

        /* renamed from: b */
        private boolean f16292b;

        /* renamed from: d */
        private boolean f16294d;

        /* renamed from: e */
        private boolean f16295e;

        /* renamed from: c */
        private EnumC7278k f16293c = EnumC7278k.NOT_REQUIRED;

        /* renamed from: f */
        private long f16296f = -1;

        /* renamed from: g */
        private long f16297g = -1;

        /* renamed from: h */
        private Set<c> f16298h = new LinkedHashSet();

        /* renamed from: a */
        public final C7269b m21750a() {
            Set m20634j0;
            m20634j0 = C7042z.m20634j0(this.f16298h);
            long j10 = this.f16296f;
            long j11 = this.f16297g;
            return new C7269b(this.f16293c, this.f16291a, this.f16292b, this.f16294d, this.f16295e, j10, j11, m20634j0);
        }

        /* renamed from: b */
        public final a m21751b(EnumC7278k networkType) {
            C9322n.m27781e(networkType, "networkType");
            this.f16293c = networkType;
            return this;
        }

        /* renamed from: c */
        public final a m21752c(boolean z10) {
            this.f16295e = z10;
            return this;
        }
    }

    /* renamed from: f2.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: f2.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final Uri f16299a;

        /* renamed from: b */
        private final boolean f16300b;

        public c(Uri uri, boolean z10) {
            C9322n.m27781e(uri, "uri");
            this.f16299a = uri;
            this.f16300b = z10;
        }

        /* renamed from: a */
        public final Uri m21753a() {
            return this.f16299a;
        }

        /* renamed from: b */
        public final boolean m21754b() {
            return this.f16300b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C9322n.m27777a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C9322n.m27779c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return C9322n.m27777a(this.f16299a, cVar.f16299a) && this.f16300b == cVar.f16300b;
        }

        public int hashCode() {
            return (this.f16299a.hashCode() * 31) + Boolean.hashCode(this.f16300b);
        }
    }

    public C7269b() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7269b(p094f2.C7269b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C9322n.m27781e(r13, r0)
            boolean r3 = r13.f16284b
            boolean r4 = r13.f16285c
            f2.k r2 = r13.f16283a
            boolean r5 = r13.f16286d
            boolean r6 = r13.f16287e
            java.util.Set<f2.b$c> r11 = r13.f16290h
            long r7 = r13.f16288f
            long r9 = r13.f16289g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f2.C7269b.<init>(f2.b):void");
    }

    public C7269b(EnumC7278k requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> contentUriTriggers) {
        C9322n.m27781e(requiredNetworkType, "requiredNetworkType");
        C9322n.m27781e(contentUriTriggers, "contentUriTriggers");
        this.f16283a = requiredNetworkType;
        this.f16284b = z10;
        this.f16285c = z11;
        this.f16286d = z12;
        this.f16287e = z13;
        this.f16288f = j10;
        this.f16289g = j11;
        this.f16290h = contentUriTriggers;
    }

    public /* synthetic */ C7269b(EnumC7278k enumC7278k, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? EnumC7278k.NOT_REQUIRED : enumC7278k, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) == 0 ? z13 : false, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) == 0 ? j11 : -1L, (i10 & RecognitionOptions.ITF) != 0 ? C7030q0.m20573e() : set);
    }

    /* renamed from: a */
    public final long m21741a() {
        return this.f16289g;
    }

    /* renamed from: b */
    public final long m21742b() {
        return this.f16288f;
    }

    /* renamed from: c */
    public final Set<c> m21743c() {
        return this.f16290h;
    }

    /* renamed from: d */
    public final EnumC7278k m21744d() {
        return this.f16283a;
    }

    /* renamed from: e */
    public final boolean m21745e() {
        return !this.f16290h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C9322n.m27777a(C7269b.class, obj.getClass())) {
            return false;
        }
        C7269b c7269b = (C7269b) obj;
        if (this.f16284b == c7269b.f16284b && this.f16285c == c7269b.f16285c && this.f16286d == c7269b.f16286d && this.f16287e == c7269b.f16287e && this.f16288f == c7269b.f16288f && this.f16289g == c7269b.f16289g && this.f16283a == c7269b.f16283a) {
            return C9322n.m27777a(this.f16290h, c7269b.f16290h);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m21746f() {
        return this.f16286d;
    }

    /* renamed from: g */
    public final boolean m21747g() {
        return this.f16284b;
    }

    /* renamed from: h */
    public final boolean m21748h() {
        return this.f16285c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f16283a.hashCode() * 31) + (this.f16284b ? 1 : 0)) * 31) + (this.f16285c ? 1 : 0)) * 31) + (this.f16286d ? 1 : 0)) * 31) + (this.f16287e ? 1 : 0)) * 31;
        long j10 = this.f16288f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f16289g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f16290h.hashCode();
    }

    /* renamed from: i */
    public final boolean m21749i() {
        return this.f16287e;
    }
}
