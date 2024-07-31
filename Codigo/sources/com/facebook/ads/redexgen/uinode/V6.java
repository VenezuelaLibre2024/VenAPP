package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class V6 extends RD {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1517bK A01;
    public final /* synthetic */ V2 A02;
    public final /* synthetic */ boolean A03;

    public V6(V2 v22, View view, boolean z10, C1517bK c1517bK) {
        this.A02 = v22;
        this.A00 = view;
        this.A03 = z10;
        this.A01 = c1517bK;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A00() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A02() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        JZ jz;
        JZ jz2;
        C1399Yn c1399Yn;
        RE re2;
        WeakReference weakReference;
        C1058Lg c1058Lg;
        JZ jz3;
        C1507bA c1507bA;
        View view;
        View view2;
        C1507bA c1507bA2;
        View view3;
        C1507bA c1507bA3;
        View view4;
        C1507bA c1507bA4;
        JS js;
        C1507bA c1507bA5;
        boolean z10;
        C1507bA c1507bA6;
        boolean z11;
        C1507bA c1507bA7;
        boolean z12;
        C1507bA c1507bA8;
        boolean A0p;
        C1507bA c1507bA9;
        AnonymousClass12 anonymousClass12;
        C1507bA c1507bA10;
        boolean z13;
        C1507bA c1507bA11;
        NativeAdLayout nativeAdLayout;
        C1507bA c1507bA12;
        String str;
        C1507bA c1507bA13;
        C1507bA c1507bA14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        RE re3;
        Drawable drawable;
        RE re4;
        JZ jz4;
        RE re5;
        JZ jz5;
        jz = this.A02.A0e;
        jz.A0B();
        if (C0988Ih.A1o(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof QJ) && !((QJ) adContentsView).A02()) {
                    re5 = this.A02.A0R;
                    re5.A0T();
                    jz5 = this.A02.A0e;
                    jz5.A08();
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
                re4 = this.A02.A0R;
                re4.A0T();
                jz4 = this.A02.A0e;
                jz4.A07();
                return;
            }
            V2.A0e(drawable, imageView);
        }
        jz2 = this.A02.A0e;
        c1399Yn = this.A02.A0c;
        jz2.A0C(c1399Yn, this.A01.A0G());
        re2 = this.A02.A0R;
        if (re2 != null) {
            re3 = this.A02.A0R;
            re3.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((RD) weakReference3.get()).A03();
            }
        }
        c1058Lg = this.A02.A0f;
        if (c1058Lg.A07()) {
            jz3 = this.A02.A0e;
            jz3.A04();
            return;
        }
        this.A02.A0b();
        c1507bA = this.A02.A09;
        if (c1507bA != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c1507bA2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1507bA2.A08(view3);
                    c1507bA3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1507bA3.A07(view4);
                    c1507bA4 = this.A02.A09;
                    js = this.A02.A0I;
                    c1507bA4.A0B(js);
                    c1507bA5 = this.A02.A09;
                    z10 = this.A02.A0W;
                    c1507bA5.A0E(z10);
                    c1507bA6 = this.A02.A09;
                    z11 = this.A02.A0Z;
                    c1507bA6.A0I(z11);
                    c1507bA7 = this.A02.A09;
                    z12 = this.A02.A0Y;
                    c1507bA7.A0H(z12);
                    c1507bA8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c1507bA8.A0F(A0p);
                    c1507bA9 = this.A02.A09;
                    anonymousClass12 = this.A02.A08;
                    c1507bA9.A09(anonymousClass12);
                    c1507bA10 = this.A02.A09;
                    z13 = this.A02.A0X;
                    c1507bA10.A0G(z13);
                    c1507bA11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1507bA11.A0A(AbstractC1093Mp.A00(nativeAdLayout));
                    c1507bA12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1507bA12.A0C(str);
                    c1507bA13 = this.A02.A09;
                    c1507bA13.A0J(this.A03);
                    c1507bA14 = this.A02.A09;
                    c1507bA14.A02();
                }
            }
        }
    }
}
