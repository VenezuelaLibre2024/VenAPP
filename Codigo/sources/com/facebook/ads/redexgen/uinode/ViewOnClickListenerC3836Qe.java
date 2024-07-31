package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qe */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3836Qe implements View.OnClickListener {
    public final /* synthetic */ C26707C A00;

    public ViewOnClickListenerC3836Qe(C26707C c26707c) {
        this.A00 = c26707c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3930SA videoView;
        C3377JA c3377ja;
        C4337Yn c4337Yn;
        C3930SA videoView2;
        C3930SA videoView3;
        C3930SA videoView4;
        C3377JA c3377ja2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                c3377ja = this.A00.A02;
                if (c3377ja != null) {
                    c3377ja2 = this.A00.A02;
                    c3377ja2.A04(EnumC3376J9.A0p, null);
                }
                c4337Yn = this.A00.A01;
                c4337Yn.A0E().A35();
                int[] iArr = C3837Qf.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0b(EnumC3818QM.A04, 12);
                        return;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0e(true, 8);
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
