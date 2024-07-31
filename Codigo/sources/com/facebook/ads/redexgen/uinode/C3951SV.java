package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.SV */
/* loaded from: assets/audience_network.dex */
public final class C3951SV extends AbstractC254856 implements InterfaceC3567MJ {
    public C23271U A00;
    public AbstractC3871RD A01;
    public C3872RE A02;
    public C3872RE A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C4337Yn A06;
    public final C2918BK A07;

    public C3951SV(C2918BK c2918bk, SparseBooleanArray sparseBooleanArray, C3872RE c3872re, int i10, C4337Yn c4337Yn, C23271U c23271u) {
        super(c2918bk);
        this.A06 = c4337Yn;
        this.A07 = c2918bk;
        this.A05 = sparseBooleanArray;
        this.A02 = c3872re;
        this.A04 = i10;
        this.A00 = c23271u;
    }

    private void A0A(InterfaceC3369J2 interfaceC3369J2, C3528Lg c3528Lg, String str, C3785Pp c3785Pp) {
        if (this.A05.get(c3785Pp.A02())) {
            return;
        }
        C3872RE c3872re = this.A03;
        if (c3872re != null) {
            c3872re.A0V();
            this.A03 = null;
        }
        this.A01 = new C3953SX(this, str, c3785Pp, interfaceC3369J2, c3785Pp.A04(), c3528Lg);
        C3872RE c3872re2 = new C3872RE(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03 = c3872re2;
        c3872re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C3952SW(this, c3785Pp));
    }

    public final void A0j(C3785Pp c3785Pp, InterfaceC3369J2 interfaceC3369J2, C26416c c26416c, C3528Lg c3528Lg, String str, int i10, int i11, int i12) {
        int leftMargin = c3785Pp.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A07.setupNativeCtaExtension(c3785Pp);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int i13 = leftMargin == 0 ? i12 : i11;
        if (leftMargin < this.A04 - 1) {
            i12 = i11;
        }
        marginLayoutParams.setMargins(i13, 0, i12, 0);
        String A07 = c3785Pp.A03().A0D().A07();
        String A08 = c3785Pp.A03().A0D().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c26416c.A0S(A08));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c3785Pp.A03().A0F(), c3785Pp.A04());
        this.A07.A19(c3785Pp.A04());
        A0A(interfaceC3369J2, c3528Lg, str, c3785Pp);
    }

    public final void A0k(C3872RE c3872re) {
        this.A02 = c3872re;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3567MJ
    public final void AFr() {
        this.A07.A13();
    }
}
