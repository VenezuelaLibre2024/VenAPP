package p361t6;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: t6.r3 */
/* loaded from: classes.dex */
public interface InterfaceC11095r3 {
    /* renamed from: F */
    static int m34454F(int i10) {
        return i10 & 7;
    }

    /* renamed from: j */
    static int m34455j(int i10) {
        return i10 & 384;
    }

    /* renamed from: l */
    static int m34456l(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    /* renamed from: m */
    static int m34457m(int i10) {
        return i10 & 32;
    }

    /* renamed from: n */
    static int m34458n(int i10) {
        return i10 & 24;
    }

    /* renamed from: o */
    static int m34459o(int i10) {
        return m34461v(i10, 0, 0);
    }

    /* renamed from: t */
    static int m34460t(int i10) {
        return i10 & 64;
    }

    /* renamed from: v */
    static int m34461v(int i10, int i11, int i12) {
        return m34456l(i10, i11, i12, 0, RecognitionOptions.ITF);
    }

    /* renamed from: a */
    int mo22834a(C11108u1 c11108u1);

    /* renamed from: g */
    int mo34245g();

    String getName();

    /* renamed from: y */
    int mo27379y();
}
