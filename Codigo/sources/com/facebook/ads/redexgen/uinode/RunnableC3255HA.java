package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.HA */
/* loaded from: assets/audience_network.dex */
public final class RunnableC3255HA implements Runnable {
    public static String[] A01 = {"BmKinCb0ORgH5YT6QEPNEdPG5BIrV919", "RrpZp1EIRgeOUq", "Ca1SPfl0dz9KAt", "zhmlwbNwPznx", "7jJUrwGry4mih92LDU6O3PWbUCa6TtH4", "sKESQRPWVDqFwHnN3GkmIQDR7e7o03aB", "zO7umpSxplFyuffK9okpPTJ", "H4akUxKhPo45mOW6T86EyDo0HkYEEM5g"};
    public final InterfaceC3254H9 A00;

    public RunnableC3255HA(InterfaceC3254H9 interfaceC3254H9) {
        this.A00 = interfaceC3254H9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.AC6();
        } catch (Throwable th2) {
            String[] strArr = A01;
            if (strArr[7].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "GDxGCrC4dpg2r7Xv0BfDxqnxSKrgagP1";
            strArr2[4] = "VpgUhJfq71uWqUUos9O7NvvplilxX9fX";
            AbstractC3447KL.A00(th2, this);
        }
    }
}
