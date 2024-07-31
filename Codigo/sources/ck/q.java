package ck;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class q<A, B, C> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final A f7132a;

    /* renamed from: b, reason: collision with root package name */
    private final B f7133b;

    /* renamed from: c, reason: collision with root package name */
    private final C f7134c;

    public q(A a10, B b10, C c10) {
        this.f7132a = a10;
        this.f7133b = b10;
        this.f7134c = c10;
    }

    public final A a() {
        return this.f7132a;
    }

    public final B b() {
        return this.f7133b;
    }

    public final C c() {
        return this.f7134c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.n.a(this.f7132a, qVar.f7132a) && kotlin.jvm.internal.n.a(this.f7133b, qVar.f7133b) && kotlin.jvm.internal.n.a(this.f7134c, qVar.f7134c);
    }

    public int hashCode() {
        A a10 = this.f7132a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f7133b;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f7134c;
        return hashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f7132a + ", " + this.f7133b + ", " + this.f7134c + ')';
    }
}
