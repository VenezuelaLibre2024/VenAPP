package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nu */
/* loaded from: assets/audience_network.dex */
public final class C3666Nu extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", ""};
    public final int A00;
    public final LinearLayout A01;
    public final C4474b3 A02;
    public final C4337Yn A03;
    public final InterfaceC3369J2 A04;
    public final InterfaceC3560MC A05;

    public C3666Nu(C4337Yn c4337Yn, C4474b3 c4474b3, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, int i10, int i11) {
        super(c4337Yn);
        this.A03 = c4337Yn;
        this.A02 = c4474b3;
        this.A04 = interfaceC3369J2;
        this.A05 = interfaceC3560MC;
        this.A00 = i10;
        LinearLayout linearLayout = new LinearLayout(c4337Yn);
        this.A01 = linearLayout;
        A00();
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i11);
    }

    private void A00() {
        int i10 = 0;
        while (true) {
            C4474b3 c4474b3 = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i11 = c4474b3.A0s();
            if (i10 < i11) {
                C4033Tp c4033Tp = new C4033Tp(this.A03, this.A02.A0v(i10), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i12 = C4033Tp.A0B;
                int i13 = C4033Tp.A0B;
                int i14 = C4033Tp.A0B;
                int i15 = C4033Tp.A0B;
                layoutParams.setMargins(i12, i13, i14, i15);
                c4033Tp.setLayoutParams(layoutParams);
                this.A01.addView(c4033Tp);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i10) {
        if (i10 != 1) {
            this.A01.setOrientation(0);
            LinearLayout linearLayout = this.A01;
            int i11 = this.A00;
            linearLayout.setPadding(0, i11, 0, (int) (i11 * 0.25d));
            return;
        }
        this.A01.setOrientation(1);
        LinearLayout linearLayout2 = this.A01;
        int i12 = this.A00;
        linearLayout2.setPadding(0, (int) (i12 * 1.5d), 0, i12);
    }
}
