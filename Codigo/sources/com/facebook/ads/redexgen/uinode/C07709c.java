package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07709c extends Exception {
    public final int A00;
    public final int A01;

    public C07709c(int i10, String str, Throwable th2, int i11) {
        super(str, th2);
        this.A01 = i10;
        this.A00 = i11;
    }

    public static C07709c A00(IOException iOException) {
        return new C07709c(0, null, iOException, -1);
    }

    public static C07709c A01(Exception exc, int i10) {
        return new C07709c(1, null, exc, i10);
    }

    public static C07709c A02(RuntimeException runtimeException) {
        return new C07709c(2, null, runtimeException, -1);
    }
}