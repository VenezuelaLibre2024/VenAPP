package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N8 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3618N8 implements View.OnClickListener {
    public static String[] A02 = {"0jbDV4SqpRnuIwDLdLhaSwFsy", "4CrQo2YdoWcqlYT3QJHt1izZuISw0o1a", "L1hOW0A7sRjLAVrGrG7yuKVrDUUFxwrZ", "r8z", "jBR", "EADx", "Dw2r3KoKizw7HI548vOXrftmgV6TcaYT", "JzZVJSkZeh7kJVI6l2oDTz"};
    public final /* synthetic */ C3602Ms A00;
    public final /* synthetic */ C4048U4 A01;

    public ViewOnClickListenerC3618N8(C4048U4 c4048u4, C3602Ms c3602Ms) {
        this.A01 = c4048u4;
        this.A00 = c3602Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(EnumC23892U.A03);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            if (A02[7].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "wzs";
            strArr[0] = "95EfxSbyIArn9raLN6CoppC7A";
        }
    }
}