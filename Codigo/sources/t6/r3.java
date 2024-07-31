package t6;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public interface r3 {
    static int F(int i10) {
        return i10 & 7;
    }

    static int j(int i10) {
        return i10 & 384;
    }

    static int l(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    static int m(int i10) {
        return i10 & 32;
    }

    static int n(int i10) {
        return i10 & 24;
    }

    static int o(int i10) {
        return v(i10, 0, 0);
    }

    static int t(int i10) {
        return i10 & 64;
    }

    static int v(int i10, int i11, int i12) {
        return l(i10, i11, i12, 0, RecognitionOptions.ITF);
    }

    int a(u1 u1Var);

    int g();

    String getName();

    int y();
}
