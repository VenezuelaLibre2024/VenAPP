package gh;

import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @kf.c("name")
    private final String f16261a;

    public a(String name) {
        n.e(name, "name");
        this.f16261a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && n.a(this.f16261a, ((a) obj).f16261a);
    }

    public int hashCode() {
        return this.f16261a.hashCode();
    }

    public String toString() {
        return "App(name=" + this.f16261a + ')';
    }
}
