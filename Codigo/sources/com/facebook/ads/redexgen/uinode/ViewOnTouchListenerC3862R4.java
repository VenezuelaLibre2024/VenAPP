package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.R4 */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3862R4 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3422Jv A00;

    public ViewOnTouchListenerC3862R4(TextureViewSurfaceTextureListenerC3422Jv textureViewSurfaceTextureListenerC3422Jv) {
        this.A00 = textureViewSurfaceTextureListenerC3422Jv;
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
