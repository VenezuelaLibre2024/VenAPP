package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f5024a;

    public b(List<c> topics) {
        n.e(topics, "topics");
        this.f5024a = topics;
    }

    public final List<c> a() {
        return this.f5024a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5024a.size() != bVar.f5024a.size()) {
            return false;
        }
        return n.a(new HashSet(this.f5024a), new HashSet(bVar.f5024a));
    }

    public int hashCode() {
        return Objects.hash(this.f5024a);
    }

    public String toString() {
        return "Topics=" + this.f5024a;
    }
}
