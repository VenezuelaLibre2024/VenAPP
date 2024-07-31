package p065df;

import kotlin.jvm.internal.C9322n;

/* renamed from: df.y */
/* loaded from: classes2.dex */
public final class C6938y {

    /* renamed from: a */
    private final String f15473a;

    /* renamed from: b */
    private final String f15474b;

    /* renamed from: c */
    private final int f15475c;

    /* renamed from: d */
    private final long f15476d;

    public C6938y(String sessionId, String firstSessionId, int i10, long j10) {
        C9322n.m27781e(sessionId, "sessionId");
        C9322n.m27781e(firstSessionId, "firstSessionId");
        this.f15473a = sessionId;
        this.f15474b = firstSessionId;
        this.f15475c = i10;
        this.f15476d = j10;
    }

    /* renamed from: a */
    public final String m20071a() {
        return this.f15474b;
    }

    /* renamed from: b */
    public final String m20072b() {
        return this.f15473a;
    }

    /* renamed from: c */
    public final int m20073c() {
        return this.f15475c;
    }

    /* renamed from: d */
    public final long m20074d() {
        return this.f15476d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6938y)) {
            return false;
        }
        C6938y c6938y = (C6938y) obj;
        return C9322n.m27777a(this.f15473a, c6938y.f15473a) && C9322n.m27777a(this.f15474b, c6938y.f15474b) && this.f15475c == c6938y.f15475c && this.f15476d == c6938y.f15476d;
    }

    public int hashCode() {
        return (((((this.f15473a.hashCode() * 31) + this.f15474b.hashCode()) * 31) + Integer.hashCode(this.f15475c)) * 31) + Long.hashCode(this.f15476d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f15473a + ", firstSessionId=" + this.f15474b + ", sessionIndex=" + this.f15475c + ", sessionStartTimestampUs=" + this.f15476d + ')';
    }
}
