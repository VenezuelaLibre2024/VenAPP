package com.facebook.ads.redexgen.uinode;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0815Aw extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1384Xy A01;

    public C0815Aw(C1384Xy c1384Xy, AudioTrack audioTrack) {
        this.A01 = c1384Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
