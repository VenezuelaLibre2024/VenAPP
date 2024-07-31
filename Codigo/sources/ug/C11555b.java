package ug;

/* renamed from: ug.b */
/* loaded from: classes2.dex */
public class C11555b {

    /* renamed from: a */
    private final int f30002a;

    /* renamed from: b */
    private final int f30003b;

    public C11555b(int i10, int i11) {
        this.f30002a = i10;
        this.f30003b = i11;
    }

    /* renamed from: a */
    public final int m36217a() {
        return this.f30003b;
    }

    /* renamed from: b */
    public final int m36218b() {
        return this.f30002a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11555b)) {
            return false;
        }
        C11555b c11555b = (C11555b) obj;
        return this.f30002a == c11555b.f30002a && this.f30003b == c11555b.f30003b;
    }

    public final int hashCode() {
        return this.f30002a ^ this.f30003b;
    }

    public final String toString() {
        return this.f30002a + "(" + this.f30003b + ')';
    }
}
