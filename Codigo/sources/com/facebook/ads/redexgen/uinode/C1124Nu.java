package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nu */
/* loaded from: assets/audience_network.dex */
public final class C1124Nu extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", ""};
    public final int A00;
    public final LinearLayout A01;
    public final C1500b3 A02;
    public final C1399Yn A03;
    public final J2 A04;
    public final MC A05;

    public C1124Nu(C1399Yn c1399Yn, C1500b3 c1500b3, J2 j22, MC mc2, int i10, int i11) {
        super(c1399Yn);
        this.A03 = c1399Yn;
        this.A02 = c1500b3;
        this.A04 = j22;
        this.A05 = mc2;
        this.A00 = i10;
        LinearLayout linearLayout = new LinearLayout(c1399Yn);
        this.A01 = linearLayout;
        A00();
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i11);
    }

    private void A00() {
        int i10 = 0;
        while (true) {
            C1500b3 c1500b3 = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i11 = c1500b3.A0s();
            if (i10 < i11) {
                C1275Tp c1275Tp = new C1275Tp(this.A03, this.A02.A0v(i10), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i12 = C1275Tp.A0B;
                int i13 = C1275Tp.A0B;
                int i14 = C1275Tp.A0B;
                int i15 = C1275Tp.A0B;
                layoutParams.setMargins(i12, i13, i14, i15);
                c1275Tp.setLayoutParams(layoutParams);
                this.A01.addView(c1275Tp);
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
