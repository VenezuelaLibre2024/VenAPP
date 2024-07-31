package ck;

import java.io.Serializable;
import kotlin.jvm.internal.C9322n;

/* renamed from: ck.m */
/* loaded from: classes3.dex */
public final class C2028m<A, B> implements Serializable {

    /* renamed from: a */
    private final A f8076a;

    /* renamed from: b */
    private final B f8077b;

    public C2028m(A a10, B b10) {
        this.f8076a = a10;
        this.f8077b = b10;
    }

    /* renamed from: a */
    public final A m10335a() {
        return this.f8076a;
    }

    /* renamed from: b */
    public final B m10336b() {
        return this.f8077b;
    }

    /* renamed from: c */
    public final A m10337c() {
        return this.f8076a;
    }

    /* renamed from: d */
    public final B m10338d() {
        return this.f8077b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2028m)) {
            return false;
        }
        C2028m c2028m = (C2028m) obj;
        return C9322n.m27777a(this.f8076a, c2028m.f8076a) && C9322n.m27777a(this.f8077b, c2028m.f8077b);
    }

    public int hashCode() {
        A a10 = this.f8076a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8077b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f8076a + ", " + this.f8077b + ')';
    }
}
