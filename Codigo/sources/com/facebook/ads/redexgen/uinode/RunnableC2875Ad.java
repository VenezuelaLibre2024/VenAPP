package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ad */
/* loaded from: assets/audience_network.dex */
public class RunnableC2875Ad implements Runnable {
    public static String[] A04 = {"FXI4YPweIufH3Pt2An4AzMiMJMICZW4T", "uwvDtUMtk5NfKP9ISDY7iI5dkoZYElca", "3X9Yz5oufkrzgSJKyyhGKrZukSdK4yin", "Yyt42t4P0aykOIe72Ke5sVEmhn6MxEuH", "iz4LAshm3lVaCmxiMFM9N835TW", "enfPo4zUqzsZuoLany8d1dcV5BB2cq5H", "laUDRm8UQKJHJcnNtldnOXq4xoZsd", "Oq3t3KRhK9K1doVwJCKt6wwkK0YNCaoI"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C2880Ai A02;
    public final /* synthetic */ String A03;

    public RunnableC2875Ad(C2880Ai c2880Ai, String str, long j10, long j11) {
        this.A02 = c2880Ai;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2881Aj interfaceC2881Aj;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC2881Aj = this.A02.A01;
            interfaceC2881Aj.AAo(this.A03, this.A01, this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            String[] strArr = A04;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "joW0YYt26OTJgtzaB2B3ZwKbOgOTkTMY";
        }
    }
}
