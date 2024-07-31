package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M8 implements View.OnClickListener {
    public final /* synthetic */ C05741a A00;
    public final /* synthetic */ JA A01;
    public final /* synthetic */ M9 A02;
    public final /* synthetic */ MC A03;
    public final /* synthetic */ String A04;

    public M8(M9 m92, JA ja2, MC mc2, String str, C05741a c05741a) {
        this.A02 = m92;
        this.A01 = ja2;
        this.A03 = mc2;
        this.A04 = str;
        this.A00 = c05741a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2S c2s;
        C1399Yn c1399Yn;
        C1399Yn c1399Yn2;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A04(J9.A0A, null);
            c2s = this.A02.A02;
            c1399Yn = this.A02.A03;
            if (c2s.A0O(c1399Yn.A01(), true)) {
                this.A03.A9M(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C1047Kv c1047Kv = new C1047Kv();
                c1399Yn2 = this.A02.A03;
                C1047Kv.A0M(c1047Kv, c1399Yn2, AbstractC1050Ky.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
