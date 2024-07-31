package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.facebook.ads.redexgen.X.Lb */
/* loaded from: assets/audience_network.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC3523Lb implements View.OnSystemUiVisibilityChangeListener {
    public int A00;
    public Window A01;
    public final View A03;
    public EnumC3522La A02 = EnumC3522La.A03;
    public final Runnable A04 = new C4082Ud(this);

    public ViewOnSystemUiVisibilityChangeListenerC3523Lb(View view) {
        this.A03 = view;
        view.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i10, boolean z10) {
        Window window = this.A01;
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z10) {
            attributes.flags |= i10;
        } else {
            attributes.flags &= i10 ^ (-1);
        }
        this.A01.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z10) {
        if (EnumC3522La.A03.equals(this.A02)) {
            return;
        }
        int i10 = 3840;
        if (!z10) {
            i10 = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z10) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, 2000L);
        }
        this.A03.setSystemUiVisibility(i10);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(EnumC3522La enumC3522La) {
        this.A02 = enumC3522La;
        switch (C3521LZ.A00[this.A02.ordinal()]) {
            case 1:
                A00(67108864, true);
                A00(134217728, true);
                A02(false);
                return;
            default:
                A00(67108864, false);
                A00(134217728, false);
                this.A03.setSystemUiVisibility(0);
                return;
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        int diff = this.A00 ^ i10;
        this.A00 = i10;
        if ((diff & 2) != 0) {
            int diff2 = i10 & 2;
            if (diff2 == 0) {
                A02(true);
            }
        }
    }
}
