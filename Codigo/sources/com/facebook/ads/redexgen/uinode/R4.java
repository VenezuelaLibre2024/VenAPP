package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class R4 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1024Jv A00;

    public R4(TextureViewSurfaceTextureListenerC1024Jv textureViewSurfaceTextureListenerC1024Jv) {
        this.A00 = textureViewSurfaceTextureListenerC1024Jv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        mediaController = this.A00.A09;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A09;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A09;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A09;
                mediaController3.show();
            }
        }
        return true;
    }
}
