package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f20754a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20755b;

    public p(Class<?> jClass, String moduleName) {
        n.e(jClass, "jClass");
        n.e(moduleName, "moduleName");
        this.f20754a = jClass;
        this.f20755b = moduleName;
    }

    @Override // kotlin.jvm.internal.d
    public Class<?> a() {
        return this.f20754a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && n.a(a(), ((p) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
