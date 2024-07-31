package ck;

import java.io.Serializable;
import kotlin.jvm.internal.C9322n;

/* renamed from: ck.q */
/* loaded from: classes3.dex */
public final class C2032q<A, B, C> implements Serializable {

    /* renamed from: a */
    private final A f8084a;

    /* renamed from: b */
    private final B f8085b;

    /* renamed from: c */
    private final C f8086c;

    public C2032q(A a10, B b10, C c10) {
        this.f8084a = a10;
        this.f8085b = b10;
        this.f8086c = c10;
    }

    /* renamed from: a */
    public final A m10350a() {
        return this.f8084a;
    }

    /* renamed from: b */
    public final B m10351b() {
        return this.f8085b;
    }

    /* renamed from: c */
    public final C m10352c() {
        return this.f8086c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2032q)) {
            return false;
        }
        C2032q c2032q = (C2032q) obj;
        return C9322n.m27777a(this.f8084a, c2032q.f8084a) && C9322n.m27777a(this.f8085b, c2032q.f8085b) && C9322n.m27777a(this.f8086c, c2032q.f8086c);
    }

    public int hashCode() {
        A a10 = this.f8084a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8085b;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f8086c;
        return hashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f8084a + ", " + this.f8085b + ", " + this.f8086c + ')';
    }
}
