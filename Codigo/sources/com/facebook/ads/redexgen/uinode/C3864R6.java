package com.facebook.ads.redexgen.uinode;

import android.media.MediaPlayer;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.R6 */
/* loaded from: assets/audience_network.dex */
public class C3864R6 implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"hSLXxwS3ED2PXa4HWxT5O8AkoZWeLCaL", "Gmogcdio2x0gXeHeLgUduGgoR45wUaaW", "srtP07DjK9aYu1B8NyoR8EE0J7RhN7X5", "MH7", "NBYiw3cvWUp2yNoHdye4I6uBFIshebL3", "osH0FOpWNHuyeeWL1EivPIw0cJCzEheb", "y4KJdcSo65PTSQflVKQ3KiIVJaTfePYu", "FLJEaU0xa"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3421Ju A00;

    public C3864R6(TextureViewSurfaceTextureListenerC3421Ju textureViewSurfaceTextureListenerC3421Ju) {
        this.A00 = textureViewSurfaceTextureListenerC3421Ju;
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
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer == null) {
            return 0;
        }
        mediaPlayer2 = this.A00.A06;
        return mediaPlayer2.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 0;
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
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            TextureViewSurfaceTextureListenerC3421Ju textureViewSurfaceTextureListenerC3421Ju = this.A00;
            if (A01[3].length() == 27) {
                throw new RuntimeException();
            }
            A01[1] = "lkPRs4KbLtabABAzVL2ijXaoS745wM0q";
            mediaPlayer2 = textureViewSurfaceTextureListenerC3421Ju.A06;
            if (mediaPlayer2.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3870RC interfaceC3870RC;
        InterfaceC3870RC interfaceC3870RC2;
        interfaceC3870RC = this.A00.A0E;
        if (interfaceC3870RC != null) {
            interfaceC3870RC2 = this.A00.A0E;
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
        interfaceC3870RC = this.A00.A0E;
        if (interfaceC3870RC != null) {
            interfaceC3870RC2 = this.A00.A0E;
            interfaceC3870RC2.ACE();
        }
    }
}
