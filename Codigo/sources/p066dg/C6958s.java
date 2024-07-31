package p066dg;

import p222lg.C9506a;

/* renamed from: dg.s */
/* loaded from: classes2.dex */
public class C6958s {

    /* renamed from: a */
    private final float f15509a;

    /* renamed from: b */
    private final float f15510b;

    public C6958s(float f10, float f11) {
        this.f15509a = f10;
        this.f15510b = f11;
    }

    /* renamed from: a */
    private static float m20116a(C6958s c6958s, C6958s c6958s2, C6958s c6958s3) {
        float f10 = c6958s2.f15509a;
        float f11 = c6958s2.f15510b;
        return ((c6958s3.f15509a - f10) * (c6958s.f15510b - f11)) - ((c6958s3.f15510b - f11) * (c6958s.f15509a - f10));
    }

    /* renamed from: b */
    public static float m20117b(C6958s c6958s, C6958s c6958s2) {
        return C9506a.m28271a(c6958s.f15509a, c6958s.f15510b, c6958s2.f15509a, c6958s2.f15510b);
    }

    /* renamed from: e */
    public static void m20118e(C6958s[] c6958sArr) {
        C6958s c6958s;
        C6958s c6958s2;
        C6958s c6958s3;
        float m20117b = m20117b(c6958sArr[0], c6958sArr[1]);
        float m20117b2 = m20117b(c6958sArr[1], c6958sArr[2]);
        float m20117b3 = m20117b(c6958sArr[0], c6958sArr[2]);
        if (m20117b2 >= m20117b && m20117b2 >= m20117b3) {
            c6958s = c6958sArr[0];
            c6958s2 = c6958sArr[1];
            c6958s3 = c6958sArr[2];
        } else if (m20117b3 < m20117b2 || m20117b3 < m20117b) {
            c6958s = c6958sArr[2];
            c6958s2 = c6958sArr[0];
            c6958s3 = c6958sArr[1];
        } else {
            c6958s = c6958sArr[1];
            c6958s2 = c6958sArr[0];
            c6958s3 = c6958sArr[2];
        }
        if (m20116a(c6958s2, c6958s, c6958s3) < 0.0f) {
            C6958s c6958s4 = c6958s3;
            c6958s3 = c6958s2;
            c6958s2 = c6958s4;
        }
        c6958sArr[0] = c6958s2;
        c6958sArr[1] = c6958s;
        c6958sArr[2] = c6958s3;
    }

    /* renamed from: c */
    public final float m20119c() {
        return this.f15509a;
    }

    /* renamed from: d */
    public final float m20120d() {
        return this.f15510b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6958s)) {
            return false;
        }
        C6958s c6958s = (C6958s) obj;
        return this.f15509a == c6958s.f15509a && this.f15510b == c6958s.f15510b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f15509a) * 31) + Float.floatToIntBits(this.f15510b);
    }

    public final String toString() {
        return "(" + this.f15509a + ',' + this.f15510b + ')';
    }
}
