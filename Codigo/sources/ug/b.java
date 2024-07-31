package ug;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f27679a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27680b;

    public b(int i10, int i11) {
        this.f27679a = i10;
        this.f27680b = i11;
    }

    public final int a() {
        return this.f27680b;
    }

    public final int b() {
        return this.f27679a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27679a == bVar.f27679a && this.f27680b == bVar.f27680b;
    }

    public final int hashCode() {
        return this.f27679a ^ this.f27680b;
    }

    public final String toString() {
        return this.f27679a + "(" + this.f27680b + ')';
    }
}
