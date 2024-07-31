package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mz */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3609Mz implements View.OnClickListener {
    public static String[] A02 = {"Oq", "EvGClE7if1wWI664DgGuGJMVxIj5MmF8", "WEj5b", "ZnP49bXAxkKFgNqp8", "Y2wBPaH57L9Gttlp", "AMrJJ9So27w7KiYttAq3AFMsZzT3RVfH", "8te6O8WI5P7ERWBX", "5xXH0hCktOzz8vKUWRcLVJoUpm5lTBxe"};
    public final /* synthetic */ C3602Ms A00;
    public final /* synthetic */ C4049U5 A01;

    public ViewOnClickListenerC3609Mz(C4049U5 c4049u5, C3602Ms c3602Ms) {
        this.A01 = c4049u5;
        this.A00 = c3602Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(EnumC23892U.A05);
        } catch (Throwable th2) {
            if (A02[5].charAt(20) == 'D') {
                throw new RuntimeException();
            }
            A02[2] = "snOHg";
            AbstractC3447KL.A00(th2, this);
        }
    }
}
