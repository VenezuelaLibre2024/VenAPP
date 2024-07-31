package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.H4 */
/* loaded from: assets/audience_network.dex */
public class C3249H4 extends IOException {
    public final int A00;
    public final C3243Gy A01;

    public C3249H4(IOException iOException, C3243Gy c3243Gy, int i10) {
        super(iOException);
        this.A01 = c3243Gy;
        this.A00 = i10;
    }

    public C3249H4(String str, C3243Gy c3243Gy, int i10) {
        super(str);
        this.A01 = c3243Gy;
        this.A00 = i10;
    }

    public C3249H4(String str, IOException iOException, C3243Gy c3243Gy, int i10) {
        super(str, iOException);
        this.A01 = c3243Gy;
        this.A00 = i10;
    }
}
