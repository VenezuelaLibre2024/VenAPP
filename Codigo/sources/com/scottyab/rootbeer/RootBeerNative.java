package com.scottyab.rootbeer;

import rh.a;

/* loaded from: classes3.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13560a = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f13560a = true;
        } catch (UnsatisfiedLinkError e10) {
            a.b(e10);
        }
    }

    public boolean a() {
        return f13560a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z10);
}
