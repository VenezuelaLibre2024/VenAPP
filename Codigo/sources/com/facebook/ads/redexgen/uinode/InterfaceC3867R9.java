package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.R9 */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC3867R9 {
    void A8Q();

    boolean A8b();

    boolean A8c();

    boolean A9B();

    void ADu(boolean z10, int i10);

    void AGN(int i10);

    void AGS(EnumC3818QM enumC3818QM, int i10);

    void AGZ(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC3818QM getStartReason();

    EnumC3869RB getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC3870RC interfaceC3870RC);

    void setup(Uri uri);
}