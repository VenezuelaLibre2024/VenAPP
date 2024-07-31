package p473yl;

import dm.C7061e;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: yl.c */
/* loaded from: classes3.dex */
public final class C12735c {

    /* renamed from: d */
    public static final a f34554d = new a(null);

    /* renamed from: e */
    public static final C7061e f34555e;

    /* renamed from: f */
    public static final C7061e f34556f;

    /* renamed from: g */
    public static final C7061e f34557g;

    /* renamed from: h */
    public static final C7061e f34558h;

    /* renamed from: i */
    public static final C7061e f34559i;

    /* renamed from: j */
    public static final C7061e f34560j;

    /* renamed from: a */
    public final C7061e f34561a;

    /* renamed from: b */
    public final C7061e f34562b;

    /* renamed from: c */
    public final int f34563c;

    /* renamed from: yl.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    static {
        C7061e.a aVar = C7061e.f15649d;
        f34555e = aVar.m20781c(":");
        f34556f = aVar.m20781c(":status");
        f34557g = aVar.m20781c(":method");
        f34558h = aVar.m20781c(":path");
        f34559i = aVar.m20781c(":scheme");
        f34560j = aVar.m20781c(":authority");
    }

    public C12735c(C7061e name, C7061e value) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(value, "value");
        this.f34561a = name;
        this.f34562b = value;
        this.f34563c = name.m20756B() + 32 + value.m20756B();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12735c(C7061e name, String value) {
        this(name, C7061e.f15649d.m20781c(value));
        C9322n.m27781e(name, "name");
        C9322n.m27781e(value, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C12735c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C9322n.m27781e(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C9322n.m27781e(r3, r0)
            dm.e$a r0 = dm.C7061e.f15649d
            dm.e r2 = r0.m20781c(r2)
            dm.e r3 = r0.m20781c(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p473yl.C12735c.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final C7061e m42050a() {
        return this.f34561a;
    }

    /* renamed from: b */
    public final C7061e m42051b() {
        return this.f34562b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12735c)) {
            return false;
        }
        C12735c c12735c = (C12735c) obj;
        return C9322n.m27777a(this.f34561a, c12735c.f34561a) && C9322n.m27777a(this.f34562b, c12735c.f34562b);
    }

    public int hashCode() {
        return (this.f34561a.hashCode() * 31) + this.f34562b.hashCode();
    }

    public String toString() {
        return this.f34561a.m20760F() + ": " + this.f34562b.m20760F();
    }
}
