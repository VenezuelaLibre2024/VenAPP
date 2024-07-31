package com.facebook.ads.redexgen.uinode;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.HX */
/* loaded from: assets/audience_network.dex */
public class C3278HX extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C4147Vg A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3278HX(C4147Vg c4147Vg, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c4147Vg;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } finally {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            AbstractC3447KL.A00(th3, this);
        }
    }
}
