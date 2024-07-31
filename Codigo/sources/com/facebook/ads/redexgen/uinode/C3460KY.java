package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.KY */
/* loaded from: assets/audience_network.dex */
public final class C3460KY {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<C3460KY> A02 = new ThreadLocal<>();
    public final C3443KH A00 = new C3443KH();

    public static C3443KH A00() {
        return A02().A00;
    }

    public static C3443KH A01(C3459KX c3459kx) {
        C3443KH currentStackTraces = new C3443KH(A00());
        currentStackTraces.add(c3459kx);
        return currentStackTraces;
    }

    public static C3460KY A02() {
        ThreadLocal<C3460KY> threadLocal = A02;
        C3460KY c3460ky = threadLocal.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) == strArr[2].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
        strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
        if (c3460ky == null) {
            C3460KY c3460ky2 = new C3460KY();
            threadLocal.set(c3460ky2);
            return c3460ky2;
        }
        return c3460ky;
    }

    public static void A03(AbstractRunnableC3455KT abstractRunnableC3455KT) {
        C3443KH A05 = abstractRunnableC3455KT.A05();
        if (A05 != null) {
            C3443KH createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A05);
        }
    }

    public static void A04(AbstractRunnableC3455KT abstractRunnableC3455KT) {
        C3443KH A05 = abstractRunnableC3455KT.A05();
        if (A05 != null) {
            C3443KH createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.removeAll(A05);
        }
    }
}
