package p450xk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.c */
/* loaded from: classes3.dex */
public class C12511c extends C12510b {
    /* renamed from: d */
    public static int m40959d(char c10) {
        int m40957b = C12510b.m40957b(c10, 10);
        if (m40957b >= 0) {
            return m40957b;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    /* renamed from: e */
    public static final boolean m40960e(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
