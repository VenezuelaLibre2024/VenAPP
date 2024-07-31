package com.facebook.ads.redexgen.uinode;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Av */
/* loaded from: assets/audience_network.dex */
public class C2893Av extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C4286Xy A01;

    public C2893Av(C4286Xy c4286Xy, AudioTrack audioTrack) {
        this.A01 = c4286Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                conditionVariable = this.A01.A0f;
                conditionVariable.open();
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
