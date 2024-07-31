package p273od;

import java.util.List;

/* renamed from: od.a */
/* loaded from: classes.dex */
final class C9911a extends AbstractC9928r {

    /* renamed from: a */
    private final String f24438a;

    /* renamed from: b */
    private final List<String> f24439b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9911a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f24438a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f24439b = list;
    }

    @Override // p273od.AbstractC9928r
    /* renamed from: b */
    public List<String> mo29625b() {
        return this.f24439b;
    }

    @Override // p273od.AbstractC9928r
    /* renamed from: c */
    public String mo29626c() {
        return this.f24438a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9928r)) {
            return false;
        }
        AbstractC9928r abstractC9928r = (AbstractC9928r) obj;
        return this.f24438a.equals(abstractC9928r.mo29626c()) && this.f24439b.equals(abstractC9928r.mo29625b());
    }

    public int hashCode() {
        return ((this.f24438a.hashCode() ^ 1000003) * 1000003) ^ this.f24439b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f24438a + ", usedDates=" + this.f24439b + "}";
    }
}
