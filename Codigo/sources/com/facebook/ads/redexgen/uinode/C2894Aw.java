package com.facebook.ads.redexgen.uinode;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Aw */
/* loaded from: assets/audience_network.dex */
public class C2894Aw extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C4286Xy A01;

    public C2894Aw(C4286Xy c4286Xy, AudioTrack audioTrack) {
        this.A01 = c4286Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
