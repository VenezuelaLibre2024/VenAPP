package ck;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class m<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final A f7124a;

    /* renamed from: b, reason: collision with root package name */
    private final B f7125b;

    public m(A a10, B b10) {
        this.f7124a = a10;
        this.f7125b = b10;
    }

    public final A a() {
        return this.f7124a;
    }

    public final B b() {
        return this.f7125b;
    }

    public final A c() {
        return this.f7124a;
    }

    public final B d() {
        return this.f7125b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.n.a(this.f7124a, mVar.f7124a) && kotlin.jvm.internal.n.a(this.f7125b, mVar.f7125b);
    }

    public int hashCode() {
        A a10 = this.f7124a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f7125b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f7124a + ", " + this.f7125b + ')';
    }
}
