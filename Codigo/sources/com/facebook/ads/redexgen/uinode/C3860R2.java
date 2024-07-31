package com.facebook.ads.redexgen.uinode;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.R2 */
/* loaded from: assets/audience_network.dex */
public class C3860R2 implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3422Jv A00;

    public C3860R2(TextureViewSurfaceTextureListenerC3422Jv textureViewSurfaceTextureListenerC3422Jv) {
        this.A00 = textureViewSurfaceTextureListenerC3422Jv;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C3854Qw c3854Qw;
        C3854Qw c3854Qw2;
        c3854Qw = this.A00.A0C;
        if (c3854Qw == null) {
            return 0;
        }
        c3854Qw2 = this.A00.A0C;
        return c3854Qw2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C3854Qw c3854Qw;
        C3854Qw c3854Qw2;
        c3854Qw = this.A00.A0C;
        if (c3854Qw == null) {
            return 0;
        }
        c3854Qw2 = this.A00.A0C;
        return c3854Qw2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C3854Qw c3854Qw;
        C3854Qw c3854Qw2;
        c3854Qw = this.A00.A0C;
        if (c3854Qw != null) {
            c3854Qw2 = this.A00.A0C;
            if (c3854Qw2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3870RC interfaceC3870RC;
        InterfaceC3870RC interfaceC3870RC2;
        interfaceC3870RC = this.A00.A0F;
        if (interfaceC3870RC != null) {
            interfaceC3870RC2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            interfaceC3870RC2.ACD();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        this.A00.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC3870RC interfaceC3870RC;
        InterfaceC3870RC interfaceC3870RC2;
        interfaceC3870RC = this.A00.A0F;
        if (interfaceC3870RC != null) {
            interfaceC3870RC2 = this.A00.A0F;
            interfaceC3870RC2.ACE();
        }
    }
}
