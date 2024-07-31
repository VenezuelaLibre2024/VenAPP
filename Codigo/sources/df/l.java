package df;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f14079a;

    public l(String str) {
        this.f14079a = str;
    }

    public final String a() {
        return this.f14079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.n.a(this.f14079a, ((l) obj).f14079a);
    }

    public int hashCode() {
        String str = this.f14079a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f14079a + ')';
    }
}
