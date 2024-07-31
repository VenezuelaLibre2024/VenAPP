package p098f6;

/* renamed from: f6.b */
/* loaded from: classes.dex */
public final class C7298b {

    /* renamed from: a */
    private final String f16380a;

    private C7298b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f16380a = str;
    }

    /* renamed from: b */
    public static C7298b m21878b(String str) {
        return new C7298b(str);
    }

    /* renamed from: a */
    public String m21879a() {
        return this.f16380a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7298b) {
            return this.f16380a.equals(((C7298b) obj).f16380a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16380a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f16380a + "\"}";
    }
}
