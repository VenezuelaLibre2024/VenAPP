package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Sb */
/* loaded from: assets/audience_network.dex */
public class C3957Sb extends AbstractC25354t {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    public InterfaceC3723Op A02;
    public C3872RE A04;
    public List<C3785Pp> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C4399Zo A0C;
    public final AbstractC254351 A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC3727Ot A0F = new C3960Se(this);
    public InterfaceC3725Or A03 = new C3959Sd(this);
    public final InterfaceC3726Os A0E = new C3958Sc(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, 29, 4, 7, 16, 17, 18, 29, 20, 7, 2, 3, 13, 29, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public C3957Sb(C24723r c24723r, int i10, List<C3785Pp> list, C3872RE c3872re, Bundle bundle) {
        this.A0C = c24723r.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = c3872re;
        this.A0D = new C4398Zn(c24723r.getContext());
        this.A0B = c24723r.getContext();
        c24723r.A1f(this);
        A0D(bundle);
    }

    private AbstractC4010TS A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private AbstractC4010TS A04(int i10, int i11, boolean z10) {
        AbstractC4010TS abstractC4010TS = null;
        while (i10 <= i11) {
            AbstractC4010TS abstractC4010TS2 = (AbstractC4010TS) this.A0C.A1m(i10);
            if (abstractC4010TS2 == null || abstractC4010TS2.A17()) {
                return null;
            }
            boolean A0a = A0a(abstractC4010TS2);
            int i12 = A0I[2].length();
            if (i12 != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (abstractC4010TS == null && abstractC4010TS2.A18() && A0a && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(abstractC4010TS2, this.A0A))) {
                abstractC4010TS = abstractC4010TS2;
            }
            if (abstractC4010TS2.A18() && !A0a) {
                A0C(i10, false);
            }
            i10++;
        }
        return abstractC4010TS;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        AbstractC4010TS A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A15();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A23 = this.A0C.A23();
        if (A23 != -1) {
            int curPos = this.A05.size();
            if (A23 < curPos - 1) {
                int curPos2 = A23 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        AbstractC4010TS A04 = A04(i10 + 1, this.A0C.A25(), false);
        if (A04 != null) {
            A04.A15();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC3693OL abstractC3693OL, int i10) {
        int allowedAreaMaxX;
        int furthestX;
        if (i10 != 2) {
            allowedAreaMaxX = (int) (((abstractC3693OL.getWidth() + AbstractC3499LD.A03.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i11 = AbstractC3499LD.A03.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            allowedAreaMaxX = i11 - 1;
        }
        if (i10 == 2) {
            furthestX = 1;
        } else {
            int i12 = AbstractC3499LD.A03.widthPixels;
            int allowedAreaMinX = abstractC3693OL.getWidth();
            furthestX = (int) (((i12 - allowedAreaMinX) * 0.7f) / 2.0f);
        }
        float x10 = abstractC3693OL.getX();
        int allowedAreaMinX2 = abstractC3693OL.getWidth();
        return ((int) (x10 + ((float) allowedAreaMinX2))) <= allowedAreaMaxX && abstractC3693OL.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC4010TS abstractC4010TS) {
        if (!this.A08 || !abstractC4010TS.A18()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25354t
    public void A0L(C3100Eb c3100Eb, int i10) {
        super.A0L(c3100Eb, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25354t
    public void A0M(C3100Eb c3100Eb, int i10, int i11) {
        super.A0M(c3100Eb, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i10);
    }

    public final InterfaceC3725Or A0N() {
        return this.A03;
    }

    public final InterfaceC3726Os A0O() {
        return this.A0E;
    }

    public final InterfaceC3727Ot A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int i10 = this.A0C.A25();
        for (int A24 = this.A0C.A24(); A24 <= i10 && A24 >= 0; A24++) {
            AbstractC4010TS abstractC4010TS = (AbstractC4010TS) this.A0C.A1m(A24);
            if (abstractC4010TS != null && abstractC4010TS.A17()) {
                this.A01 = A24;
                abstractC4010TS.A14();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC4010TS abstractC4010TS = (AbstractC4010TS) this.A0C.A1m(this.A01);
        if (abstractC4010TS != null && this.A01 >= 0) {
            abstractC4010TS.A15();
        }
    }

    public final void A0S(int i10) {
        AbstractC4010TS abstractC4010TS = (AbstractC4010TS) this.A0C.A1m(i10);
        if (abstractC4010TS == null || A0a(abstractC4010TS)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0Z(abstractC4010TS, false);
    }

    public final void A0T(int i10) {
        List<C3785Pp> list;
        AbstractC4010TS abstractC4010TS = (AbstractC4010TS) this.A0C.A1m(i10);
        if (abstractC4010TS == null) {
            return;
        }
        if (A0a(abstractC4010TS)) {
            A0Z(abstractC4010TS, true);
        }
        if (A0J(abstractC4010TS) && (list = this.A05) != null) {
            this.A0F.setVolume(list.get(((Integer) abstractC4010TS.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AGp(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC3723Op interfaceC3723Op) {
        this.A02 = interfaceC3723Op;
    }

    public void A0Z(AbstractC4010TS abstractC4010TS, boolean z10) {
        if (A0H()) {
            A0X(abstractC4010TS, z10);
        }
        if (z10) {
            return;
        }
        boolean A17 = abstractC4010TS.A17();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (A17) {
            abstractC4010TS.A14();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
