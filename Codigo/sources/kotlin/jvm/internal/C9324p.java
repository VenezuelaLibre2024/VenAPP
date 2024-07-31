package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.p */
/* loaded from: classes3.dex */
public final class C9324p implements InterfaceC9312d {

    /* renamed from: a */
    private final Class<?> f22576a;

    /* renamed from: b */
    private final String f22577b;

    public C9324p(Class<?> jClass, String moduleName) {
        C9322n.m27781e(jClass, "jClass");
        C9322n.m27781e(moduleName, "moduleName");
        this.f22576a = jClass;
        this.f22577b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC9312d
    /* renamed from: a */
    public Class<?> mo27769a() {
        return this.f22576a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9324p) && C9322n.m27777a(mo27769a(), ((C9324p) obj).mo27769a());
    }

    public int hashCode() {
        return mo27769a().hashCode();
    }

    public String toString() {
        return mo27769a().toString() + " (Kotlin reflection is not available)";
    }
}
