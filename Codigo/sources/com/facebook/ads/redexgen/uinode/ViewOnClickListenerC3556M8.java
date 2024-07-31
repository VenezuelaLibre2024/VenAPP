package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.M8 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3556M8 implements View.OnClickListener {
    public final /* synthetic */ C23331a A00;
    public final /* synthetic */ C3377JA A01;
    public final /* synthetic */ C3557M9 A02;
    public final /* synthetic */ InterfaceC3560MC A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC3556M8(C3557M9 c3557m9, C3377JA c3377ja, InterfaceC3560MC interfaceC3560MC, String str, C23331a c23331a) {
        this.A02 = c3557m9;
        this.A01 = c3377ja;
        this.A03 = interfaceC3560MC;
        this.A04 = str;
        this.A00 = c23331a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C23872S c23872s;
        C4337Yn c4337Yn;
        C4337Yn c4337Yn2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A01.A04(EnumC3376J9.A0A, null);
            c23872s = this.A02.A02;
            c4337Yn = this.A02.A03;
            if (c23872s.A0O(c4337Yn.A01(), true)) {
                this.A03.A9M(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C3481Kv c3481Kv = new C3481Kv();
                c4337Yn2 = this.A02.A03;
                C3481Kv.A0M(c3481Kv, c4337Yn2, AbstractC3484Ky.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
