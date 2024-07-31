package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.OD */
/* loaded from: assets/audience_network.dex */
public class RunnableC3685OD implements Runnable {
    public final /* synthetic */ C23271U A00;
    public final /* synthetic */ C3688OG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public RunnableC3685OD(C3688OG c3688og, String str, C23271U c23271u, String str2) {
        this.A01 = c3688og;
        this.A03 = str;
        this.A00 = c23271u;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        C4337Yn c4337Yn;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A01.A00;
            if (!z10) {
                return;
            }
            boolean z11 = false;
            this.A01.A00 = false;
            c4337Yn = this.A01.A03;
            Activity A0D = c4337Yn.A0D();
            boolean z12 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                if (A0D != null && A0D.isInMultiWindowMode()) {
                    z11 = true;
                }
                z12 = z11;
            }
            if (!z12 && C3475Kp.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03, this.A00, this.A02);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
