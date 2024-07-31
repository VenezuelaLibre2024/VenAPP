package p065df;

import kotlin.jvm.internal.C9322n;

/* renamed from: df.l */
/* loaded from: classes2.dex */
public final class C6925l {

    /* renamed from: a */
    private final String f15433a;

    public C6925l(String str) {
        this.f15433a = str;
    }

    /* renamed from: a */
    public final String m20042a() {
        return this.f15433a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6925l) && C9322n.m27777a(this.f15433a, ((C6925l) obj).f15433a);
    }

    public int hashCode() {
        String str = this.f15433a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f15433a + ')';
    }
}
