package qk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c extends b {
    public static int a(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }
}
