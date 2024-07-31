package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.R7 */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3865R7 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3421Ju A00;

    public ViewOnTouchListenerC3865R7(TextureViewSurfaceTextureListenerC3421Ju textureViewSurfaceTextureListenerC3421Ju) {
        this.A00 = textureViewSurfaceTextureListenerC3421Ju;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        z10 = this.A00.A0G;
        if (z10) {
            return true;
        }
        mediaController = this.A00.A0A;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A0A;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A0A;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A0A;
                mediaController3.show();
            }
        }
        return true;
    }
}
