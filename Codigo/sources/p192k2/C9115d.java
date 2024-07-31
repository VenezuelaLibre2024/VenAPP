package p192k2;

import kotlin.jvm.internal.C9322n;

/* renamed from: k2.d */
/* loaded from: classes.dex */
public final class C9115d {

    /* renamed from: a */
    private final String f21971a;

    /* renamed from: b */
    private final Long f21972b;

    public C9115d(String key, Long l10) {
        C9322n.m27781e(key, "key");
        this.f21971a = key;
        this.f21972b = l10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9115d(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        C9322n.m27781e(key, "key");
    }

    /* renamed from: a */
    public final String m26855a() {
        return this.f21971a;
    }

    /* renamed from: b */
    public final Long m26856b() {
        return this.f21972b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9115d)) {
            return false;
        }
        C9115d c9115d = (C9115d) obj;
        return C9322n.m27777a(this.f21971a, c9115d.f21971a) && C9322n.m27777a(this.f21972b, c9115d.f21972b);
    }

    public int hashCode() {
        int hashCode = this.f21971a.hashCode() * 31;
        Long l10 = this.f21972b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f21971a + ", value=" + this.f21972b + ')';
    }
}
