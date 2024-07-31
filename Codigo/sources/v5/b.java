package v5;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f27926a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27927b;

    /* renamed from: c, reason: collision with root package name */
    private int f27928c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27929d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27930e;

    /* renamed from: f, reason: collision with root package name */
    private Long f27931f;

    public b(String id2, String name, int i10, int i11, boolean z10, Long l10) {
        n.e(id2, "id");
        n.e(name, "name");
        this.f27926a = id2;
        this.f27927b = name;
        this.f27928c = i10;
        this.f27929d = i11;
        this.f27930e = z10;
        this.f27931f = l10;
    }

    public /* synthetic */ b(String str, String str2, int i10, int i11, boolean z10, Long l10, int i12, g gVar) {
        this(str, str2, i10, i11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? null : l10);
    }

    public final int a() {
        return this.f27928c;
    }

    public final String b() {
        return this.f27926a;
    }

    public final Long c() {
        return this.f27931f;
    }

    public final String d() {
        return this.f27927b;
    }

    public final boolean e() {
        return this.f27930e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f27926a, bVar.f27926a) && n.a(this.f27927b, bVar.f27927b) && this.f27928c == bVar.f27928c && this.f27929d == bVar.f27929d && this.f27930e == bVar.f27930e && n.a(this.f27931f, bVar.f27931f);
    }

    public final void f(Long l10) {
        this.f27931f = l10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f27926a.hashCode() * 31) + this.f27927b.hashCode()) * 31) + Integer.hashCode(this.f27928c)) * 31) + Integer.hashCode(this.f27929d)) * 31;
        boolean z10 = this.f27930e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Long l10 = this.f27931f;
        return i11 + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "AssetPathEntity(id=" + this.f27926a + ", name=" + this.f27927b + ", assetCount=" + this.f27928c + ", typeInt=" + this.f27929d + ", isAll=" + this.f27930e + ", modifiedDate=" + this.f27931f + ')';
    }
}
