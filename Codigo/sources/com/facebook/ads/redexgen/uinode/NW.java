package com.facebook.ads.redexgen.uinode;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class NW extends RelativeLayout {
    public static MC A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public ZY A00;
    public C1399Yn A01;
    public AnonymousClass38 A02;
    public C1285Tz A03;
    public O2 A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        int i10 = (int) (LD.A02 * 8.0f);
        A09 = i10;
        A08 = i10 * 10;
        A0A = (int) (LD.A02 * 15.0f);
        A05 = new C1284Ty();
    }

    public NW(C1399Yn c1399Yn) {
        super(c1399Yn);
        this.A01 = c1399Yn;
        AnonymousClass38 anonymousClass38 = new AnonymousClass38(c1399Yn);
        this.A02 = anonymousClass38;
        AbstractC1066Lo.A0K(anonymousClass38);
        C0883Ec c0883Ec = new C0883Ec();
        this.A00 = c0883Ec;
        c0883Ec.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1171Pp> A01(AbstractC1502b5 abstractC1502b5) {
        if (abstractC1502b5 == null) {
            return new ArrayList<>();
        }
        List<C1G> A14 = abstractC1502b5.A14();
        ArrayList<C1171Pp> arrayList = new ArrayList<>(A14.size());
        for (int i10 = 0; i10 < A14.size(); i10++) {
            arrayList.add(new C1171Pp(i10, A14.size(), A14.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(V2 v22, int i10) {
        ArrayList<C1171Pp> A01 = A01(v22.A0z());
        this.A02.setCardsInfo(A01);
        C1285Tz c1285Tz = new C1285Tz(this.A01, A01, v22.A0z(), this.A01.A01().A09(), v22, A05, v22.A0z().A12(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A03 = c1285Tz;
        this.A02.setAdapter(c1285Tz);
        this.A03.A0F(i10 - A08, 16, 0);
        this.A03.A06();
        setupDotsLayout(v22, A01);
    }

    public final void A06(RE re2) {
        C1285Tz c1285Tz = this.A03;
        if (c1285Tz != null) {
            c1285Tz.A0G(re2);
        } else {
            this.A01.A07().A9a(A00(51, 7, 29), C8A.A1v, new C8B(A00(0, 51, 45)));
        }
        this.A02.A1y(re2);
    }

    public static MC getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C1285Tz c1285Tz;
        if (z10 && (c1285Tz = this.A03) != null) {
            c1285Tz.A0F((i12 - i10) - A08, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        O2 o22 = this.A04;
        if (o22 != null) {
            o22.A00(i10);
        }
    }

    private void setupDotsLayout(V2 v22, ArrayList<C1171Pp> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1283Tx(this));
        O2 o22 = new O2(this.A01, v22.A0z().A0w().A01(), arrayList.size());
        this.A04 = o22;
        AbstractC1066Lo.A0K(o22);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
