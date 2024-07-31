package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N1 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3611N1 implements View.OnClickListener {
    public static String[] A01 = {"KnJgliGO", "VwHKKtvbMk7FPKbBmIqapgeuC2T6fwds", "wENtEeepoPFkxQkEwI5qJp4A5OxzxToD", "COqx4q9kDUbjFrhSKPpHQyyB6JO5bBDL", "v63", "lzTgDb46XsVjhse8XoOOStoy8Mg7tCsc", "1yL2I4AIQTHR8fVHiYQ7c9e8uwPzvL3", "TX4RO1m5K"};
    public final /* synthetic */ C4049U5 A00;

    public ViewOnClickListenerC3611N1(C4049U5 c4049u5) {
        this.A00 = c4049u5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8P();
        } catch (Throwable th2) {
            String[] strArr = A01;
            if (strArr[3].charAt(11) != strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            A01[0] = "zPAJp5EfhF2KrfBUqv";
            AbstractC3447KL.A00(th2, this);
        }
    }
}
