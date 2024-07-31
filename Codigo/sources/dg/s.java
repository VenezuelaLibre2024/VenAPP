package dg;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final float f14155a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14156b;

    public s(float f10, float f11) {
        this.f14155a = f10;
        this.f14156b = f11;
    }

    private static float a(s sVar, s sVar2, s sVar3) {
        float f10 = sVar2.f14155a;
        float f11 = sVar2.f14156b;
        return ((sVar3.f14155a - f10) * (sVar.f14156b - f11)) - ((sVar3.f14156b - f11) * (sVar.f14155a - f10));
    }

    public static float b(s sVar, s sVar2) {
        return lg.a.a(sVar.f14155a, sVar.f14156b, sVar2.f14155a, sVar2.f14156b);
    }

    public static void e(s[] sVarArr) {
        s sVar;
        s sVar2;
        s sVar3;
        float b10 = b(sVarArr[0], sVarArr[1]);
        float b11 = b(sVarArr[1], sVarArr[2]);
        float b12 = b(sVarArr[0], sVarArr[2]);
        if (b11 >= b10 && b11 >= b12) {
            sVar = sVarArr[0];
            sVar2 = sVarArr[1];
            sVar3 = sVarArr[2];
        } else if (b12 < b11 || b12 < b10) {
            sVar = sVarArr[2];
            sVar2 = sVarArr[0];
            sVar3 = sVarArr[1];
        } else {
            sVar = sVarArr[1];
            sVar2 = sVarArr[0];
            sVar3 = sVarArr[2];
        }
        if (a(sVar2, sVar, sVar3) < 0.0f) {
            s sVar4 = sVar3;
            sVar3 = sVar2;
            sVar2 = sVar4;
        }
        sVarArr[0] = sVar2;
        sVarArr[1] = sVar;
        sVarArr[2] = sVar3;
    }

    public final float c() {
        return this.f14155a;
    }

    public final float d() {
        return this.f14156b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f14155a == sVar.f14155a && this.f14156b == sVar.f14156b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f14155a) * 31) + Float.floatToIntBits(this.f14156b);
    }

    public final String toString() {
        return "(" + this.f14155a + ',' + this.f14156b + ')';
    }
}
