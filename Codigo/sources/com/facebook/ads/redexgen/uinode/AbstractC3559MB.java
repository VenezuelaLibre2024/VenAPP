package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.MB */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3559MB extends LinearLayout {
    public static int A00 = (int) (AbstractC3499LD.A02 * 56.0f);

    public abstract void A04();

    public abstract void A05();

    public abstract void A06(C23221P c23221p, boolean z10);

    public abstract boolean A07();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC3558MA getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(C23331a c23331a, String str, int i10, C23391g c23391g);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC3544Lw enumC3544Lw);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(InterfaceC3558MA interfaceC3558MA);

    public AbstractC3559MB(Context context) {
        super(context);
    }
}
