package o6;

import java.util.Map;
import o6.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a */
    private final r6.a f22241a;

    /* renamed from: b */
    private final Map<f6.d, f.b> f22242b;

    public b(r6.a aVar, Map<f6.d, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f22241a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f22242b = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o6.f
    public r6.a e() {
        return this.f22241a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f22241a.equals(fVar.e()) && this.f22242b.equals(fVar.h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o6.f
    public Map<f6.d, f.b> h() {
        return this.f22242b;
    }

    public int hashCode() {
        return ((this.f22241a.hashCode() ^ 1000003) * 1000003) ^ this.f22242b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f22241a + ", values=" + this.f22242b + "}";
    }
}
