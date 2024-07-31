package yl;

import dm.e;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f32018d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final dm.e f32019e;

    /* renamed from: f, reason: collision with root package name */
    public static final dm.e f32020f;

    /* renamed from: g, reason: collision with root package name */
    public static final dm.e f32021g;

    /* renamed from: h, reason: collision with root package name */
    public static final dm.e f32022h;

    /* renamed from: i, reason: collision with root package name */
    public static final dm.e f32023i;

    /* renamed from: j, reason: collision with root package name */
    public static final dm.e f32024j;

    /* renamed from: a, reason: collision with root package name */
    public final dm.e f32025a;

    /* renamed from: b, reason: collision with root package name */
    public final dm.e f32026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32027c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    static {
        e.a aVar = dm.e.f14291d;
        f32019e = aVar.c(":");
        f32020f = aVar.c(":status");
        f32021g = aVar.c(":method");
        f32022h = aVar.c(":path");
        f32023i = aVar.c(":scheme");
        f32024j = aVar.c(":authority");
    }

    public c(dm.e name, dm.e value) {
        kotlin.jvm.internal.n.e(name, "name");
        kotlin.jvm.internal.n.e(value, "value");
        this.f32025a = name;
        this.f32026b = value;
        this.f32027c = name.B() + 32 + value.B();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(dm.e name, String value) {
        this(name, dm.e.f14291d.c(value));
        kotlin.jvm.internal.n.e(name, "name");
        kotlin.jvm.internal.n.e(value, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.n.e(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.n.e(r3, r0)
            dm.e$a r0 = dm.e.f14291d
            dm.e r2 = r0.c(r2)
            dm.e r3 = r0.c(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.c.<init>(java.lang.String, java.lang.String):void");
    }

    public final dm.e a() {
        return this.f32025a;
    }

    public final dm.e b() {
        return this.f32026b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.n.a(this.f32025a, cVar.f32025a) && kotlin.jvm.internal.n.a(this.f32026b, cVar.f32026b);
    }

    public int hashCode() {
        return (this.f32025a.hashCode() * 31) + this.f32026b.hashCode();
    }

    public String toString() {
        return this.f32025a.F() + ": " + this.f32026b.F();
    }
}
