package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.SN */
/* loaded from: assets/audience_network.dex */
public final class C3943SN extends AbstractC254856 implements InterfaceC3567MJ {
    public static String[] A0B = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    public C23271U A00;
    public AbstractC3871RD A01;
    public C3872RE A02;
    public C3872RE A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C4337Yn A09;
    public final AbstractC2902B4 A0A;

    public C3943SN(AbstractC2902B4 abstractC2902B4, SparseBooleanArray sparseBooleanArray, C3872RE c3872re, int i10, int i11, int i12, int i13, C4337Yn c4337Yn, C23271U c23271u) {
        super(abstractC2902B4);
        this.A09 = c4337Yn;
        this.A0A = abstractC2902B4;
        this.A08 = sparseBooleanArray;
        this.A02 = c3872re;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = c23271u;
    }

    private void A0A(InterfaceC3369J2 interfaceC3369J2, C3528Lg c3528Lg, String str, C3785Pp c3785Pp) {
        if (this.A08.get(c3785Pp.A02())) {
            return;
        }
        C3872RE c3872re = this.A03;
        if (c3872re != null) {
            c3872re.A0V();
            if (A0B[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0B[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A03 = null;
        }
        this.A01 = new C3945SP(this, str, c3785Pp, interfaceC3369J2, c3785Pp.A04(), c3528Lg);
        C3872RE c3872re2 = new C3872RE(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03 = c3872re2;
        c3872re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C3944SO(this, c3785Pp));
    }

    public final void A0j(C3785Pp c3785Pp, InterfaceC3369J2 interfaceC3369J2, C26416c c26416c, C3528Lg c3528Lg, String str) {
        int A02 = c3785Pp.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c3785Pp.A03().A0D().A07();
        String A08 = c3785Pp.A03().A0D().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c26416c.A0S(A08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c3785Pp.A03().A0E().A06(), c3785Pp.A03().A0E().A01());
        this.A0A.setCTAInfo(c3785Pp.A03().A0F(), c3785Pp.A04());
        this.A0A.A1A(c3785Pp.A04());
        A0A(interfaceC3369J2, c3528Lg, str, c3785Pp);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3567MJ
    public final void AFr() {
        this.A0A.A13();
    }
}
