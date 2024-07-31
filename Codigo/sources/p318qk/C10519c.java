package p318qk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qk.c */
/* loaded from: classes3.dex */
public class C10519c extends C10518b {
    /* renamed from: a */
    public static int m31587a(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }
}
