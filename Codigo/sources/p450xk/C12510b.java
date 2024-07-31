package p450xk;

import uk.C11579f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.b */
/* loaded from: classes3.dex */
public class C12510b {
    /* renamed from: a */
    public static int m40956a(int i10) {
        if (new C11579f(2, 36).m36274m(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C11579f(2, 36));
    }

    /* renamed from: b */
    public static final int m40957b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static final boolean m40958c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
