package com.facebook.ads.redexgen.uinode;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.QW */
/* loaded from: assets/audience_network.dex */
public class C3828QW implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C27278D A00;

    public C3828QW(C27278D c27278d) {
        this.A00 = c27278d;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new C3507LL(this, i10));
    }
}
