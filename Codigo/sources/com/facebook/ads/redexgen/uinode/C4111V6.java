package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.V6 */
/* loaded from: assets/audience_network.dex */
public class C4111V6 extends AbstractC3871RD {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C4491bK A01;
    public final /* synthetic */ C4107V2 A02;
    public final /* synthetic */ boolean A03;

    public C4111V6(C4107V2 c4107v2, View view, boolean z10, C4491bK c4491bK) {
        this.A02 = c4107v2;
        this.A00 = view;
        this.A03 = z10;
        this.A01 = c4491bK;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A00() {
        C3402JZ c3402jz;
        c3402jz = this.A02.A0e;
        c3402jz.A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A02() {
        C3402JZ c3402jz;
        c3402jz = this.A02.A0e;
        c3402jz.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        C3402JZ c3402jz;
        C3402JZ c3402jz2;
        C4337Yn c4337Yn;
        C3872RE c3872re;
        WeakReference weakReference;
        C3528Lg c3528Lg;
        C3402JZ c3402jz3;
        C4481bA c4481bA;
        View view;
        View view2;
        C4481bA c4481bA2;
        View view3;
        C4481bA c4481bA3;
        View view4;
        C4481bA c4481bA4;
        EnumC3395JS enumC3395JS;
        C4481bA c4481bA5;
        boolean z10;
        C4481bA c4481bA6;
        boolean z11;
        C4481bA c4481bA7;
        boolean z12;
        C4481bA c4481bA8;
        boolean A0p;
        C4481bA c4481bA9;
        EnumC229912 enumC229912;
        C4481bA c4481bA10;
        boolean z13;
        C4481bA c4481bA11;
        NativeAdLayout nativeAdLayout;
        C4481bA c4481bA12;
        String str;
        C4481bA c4481bA13;
        C4481bA c4481bA14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C3872RE c3872re2;
        Drawable drawable;
        C3872RE c3872re3;
        C3402JZ c3402jz4;
        C3872RE c3872re4;
        C3402JZ c3402jz5;
        c3402jz = this.A02.A0e;
        c3402jz.A0B();
        if (C3348Ih.A1o(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C3815QJ) && !((C3815QJ) adContentsView).A02()) {
                    c3872re4 = this.A02.A0R;
                    c3872re4.A0T();
                    c3402jz5 = this.A02.A0e;
                    c3402jz5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                c3872re3 = this.A02.A0R;
                c3872re3.A0T();
                c3402jz4 = this.A02.A0e;
                c3402jz4.A07();
                return;
            }
            C4107V2.A0e(drawable, imageView);
        }
        c3402jz2 = this.A02.A0e;
        c4337Yn = this.A02.A0c;
        c3402jz2.A0C(c4337Yn, this.A01.A0G());
        c3872re = this.A02.A0R;
        if (c3872re != null) {
            c3872re2 = this.A02.A0R;
            c3872re2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC3871RD) weakReference3.get()).A03();
            }
        }
        c3528Lg = this.A02.A0f;
        if (c3528Lg.A07()) {
            c3402jz3 = this.A02.A0e;
            c3402jz3.A04();
            return;
        }
        this.A02.A0b();
        c4481bA = this.A02.A09;
        if (c4481bA != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c4481bA2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c4481bA2.A08(view3);
                    c4481bA3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c4481bA3.A07(view4);
                    c4481bA4 = this.A02.A09;
                    enumC3395JS = this.A02.A0I;
                    c4481bA4.A0B(enumC3395JS);
                    c4481bA5 = this.A02.A09;
                    z10 = this.A02.A0W;
                    c4481bA5.A0E(z10);
                    c4481bA6 = this.A02.A09;
                    z11 = this.A02.A0Z;
                    c4481bA6.A0I(z11);
                    c4481bA7 = this.A02.A09;
                    z12 = this.A02.A0Y;
                    c4481bA7.A0H(z12);
                    c4481bA8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c4481bA8.A0F(A0p);
                    c4481bA9 = this.A02.A09;
                    enumC229912 = this.A02.A08;
                    c4481bA9.A09(enumC229912);
                    c4481bA10 = this.A02.A09;
                    z13 = this.A02.A0X;
                    c4481bA10.A0G(z13);
                    c4481bA11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c4481bA11.A0A(AbstractC3599Mp.A00(nativeAdLayout));
                    c4481bA12 = this.A02.A09;
                    str = this.A02.A0S;
                    c4481bA12.A0C(str);
                    c4481bA13 = this.A02.A09;
                    c4481bA13.A0J(this.A03);
                    c4481bA14 = this.A02.A09;
                    c4481bA14.A02();
                }
            }
        }
    }
}
