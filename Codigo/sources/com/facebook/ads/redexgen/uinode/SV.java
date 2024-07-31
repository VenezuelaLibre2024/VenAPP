package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class SV extends AnonymousClass56 implements MJ {
    public C1U A00;
    public RD A01;
    public RE A02;
    public RE A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1399Yn A06;
    public final BK A07;

    public SV(BK bk2, SparseBooleanArray sparseBooleanArray, RE re2, int i10, C1399Yn c1399Yn, C1U c1u) {
        super(bk2);
        this.A06 = c1399Yn;
        this.A07 = bk2;
        this.A05 = sparseBooleanArray;
        this.A02 = re2;
        this.A04 = i10;
        this.A00 = c1u;
    }

    private void A0A(J2 j22, C1058Lg c1058Lg, String str, C1171Pp c1171Pp) {
        if (this.A05.get(c1171Pp.A02())) {
            return;
        }
        RE re2 = this.A03;
        if (re2 != null) {
            re2.A0V();
            this.A03 = null;
        }
        this.A01 = new SX(this, str, c1171Pp, j22, c1171Pp.A04(), c1058Lg);
        RE re3 = new RE(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03 = re3;
        re3.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new SW(this, c1171Pp));
    }

    public final void A0j(C1171Pp c1171Pp, J2 j22, C07046c c07046c, C1058Lg c1058Lg, String str, int i10, int i11, int i12) {
        int leftMargin = c1171Pp.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A07.setupNativeCtaExtension(c1171Pp);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int i13 = leftMargin == 0 ? i12 : i11;
        if (leftMargin < this.A04 - 1) {
            i12 = i11;
        }
        marginLayoutParams.setMargins(i13, 0, i12, 0);
        String A07 = c1171Pp.A03().A0D().A07();
        String A08 = c1171Pp.A03().A0D().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c07046c.A0S(A08));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1171Pp.A03().A0F(), c1171Pp.A04());
        this.A07.A19(c1171Pp.A04());
        A0A(j22, c1058Lg, str, c1171Pp);
    }

    public final void A0k(RE re2) {
        this.A02 = re2;
    }

    @Override // com.facebook.ads.redexgen.uinode.MJ
    public final void AFr() {
        this.A07.A13();
    }
}
