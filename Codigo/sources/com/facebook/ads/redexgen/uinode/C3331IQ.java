package com.facebook.ads.redexgen.uinode;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.IQ */
/* loaded from: assets/audience_network.dex */
public final class C3331IQ implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C24353F A00;

    public C3331IQ(C24353F c24353f, MediaCodec mediaCodec) {
        this.A00 = c24353f;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1S();
    }
}
