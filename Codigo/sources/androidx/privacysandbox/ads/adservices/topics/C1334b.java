package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.privacysandbox.ads.adservices.topics.b */
/* loaded from: classes.dex */
public final class C1334b {

    /* renamed from: a */
    private final List<C1335c> f5778a;

    public C1334b(List<C1335c> topics) {
        C9322n.m27781e(topics, "topics");
        this.f5778a = topics;
    }

    /* renamed from: a */
    public final List<C1335c> m7453a() {
        return this.f5778a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1334b)) {
            return false;
        }
        C1334b c1334b = (C1334b) obj;
        if (this.f5778a.size() != c1334b.f5778a.size()) {
            return false;
        }
        return C9322n.m27777a(new HashSet(this.f5778a), new HashSet(c1334b.f5778a));
    }

    public int hashCode() {
        return Objects.hash(this.f5778a);
    }

    public String toString() {
        return "Topics=" + this.f5778a;
    }
}
