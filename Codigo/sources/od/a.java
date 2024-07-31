package od;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: a */
    private final String f22505a;

    /* renamed from: b */
    private final List<String> f22506b;

    public a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f22505a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f22506b = list;
    }

    @Override // od.r
    public List<String> b() {
        return this.f22506b;
    }

    @Override // od.r
    public String c() {
        return this.f22505a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f22505a.equals(rVar.c()) && this.f22506b.equals(rVar.b());
    }

    public int hashCode() {
        return ((this.f22505a.hashCode() ^ 1000003) * 1000003) ^ this.f22506b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f22505a + ", usedDates=" + this.f22506b + "}";
    }
}
