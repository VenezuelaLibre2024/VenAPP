package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9P extends UL {
    public static byte[] A0F;
    public static String[] A0G = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC1502b5 A03;
    public C07046c A04;
    public C06433r A05;
    public O2 A06;
    public C1235Sb A07;
    public RD A08;
    public RE A09;
    public String A0A;
    public List<C1171Pp> A0B;
    public boolean A0C;
    public final C1399Yn A0D;
    public final C1058Lg A0E;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0G;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A0B() {
        A0F = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114, 117, 98, 112, 102, 117, 99, 98, 99, 81, 110, 99, 98, 104, 70, 99, 67, 102, 115, 102, 69, 114, 105, 99, 107, 98};
    }

    static {
        A0B();
        A0H = (int) (LD.A02 * 48.0f);
        A0I = (int) (LD.A02 * 8.0f);
        A0J = (int) (LD.A02 * 8.0f);
        A0L = (int) (LD.A02 * 56.0f);
        A0K = (int) (LD.A02 * 12.0f);
    }

    public C9P(C1399Yn c1399Yn, J2 j22, C07046c c07046c, MC mc2, FS fs) {
        super(c1399Yn, j22, mc2, fs);
        this.A0E = new C1058Lg();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new Q7(c1399Yn, new U8(), super.A0A.A0T(), mc2);
        this.A04 = c07046c;
        this.A0D = c1399Yn;
    }

    public C9P(C1399Yn c1399Yn, J2 j22, C07046c c07046c, MC mc2, FU fu) {
        super(c1399Yn, j22, mc2, fu);
        this.A0E = new C1058Lg();
        this.A0C = false;
        this.A04 = c07046c;
        this.A0D = c1399Yn;
    }

    private AbstractC1502b5 A00(Intent intent) {
        if (super.A07) {
            return (AbstractC1502b5) intent.getSerializableExtra(A09(14, 25, 77));
        }
        return (AbstractC1502b5) intent.getSerializableExtra(A09(0, 14, 93));
    }

    private final void A0C() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C06433r c06433r = this.A05;
        if (c06433r != null) {
            c06433r.removeAllViews();
            this.A05.A1Q();
            this.A05 = null;
        }
        O2 o22 = this.A06;
        if (o22 != null) {
            o22.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x012e, code lost:
    
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
    
        r24.A0D.A0A().AGv(r24.A05, r24.A0A.A12(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0141, code lost:
    
        A0U(r24.A02, false, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014e, code lost:
    
        if (r6 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0D(int r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C9P.A0D(int, android.os.Bundle):void");
    }

    private void A0E(AbstractC1502b5 abstractC1502b5) {
        this.A03 = abstractC1502b5;
        this.A0A = abstractC1502b5.A12();
        this.A00 = this.A03.A0C();
        this.A01 = this.A03.A0D();
        List<C1G> A14 = this.A03.A14();
        List<AdInfo> adInfoList = new ArrayList<>(A14.size());
        this.A0B = adInfoList;
        int i10 = 0;
        while (true) {
            int size = A14.size();
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[4];
            int i11 = str.charAt(16);
            if (i11 == str2.charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "1AHb04hcylshFNuVFPVd0IA840Fx90m0";
            if (i10 < size) {
                C1G c1g = A14.get(i10);
                List<C1171Pp> list = this.A0B;
                int i12 = A14.size();
                list.add(new C1171Pp(i10, i12, c1g));
                i10++;
            } else {
                return;
            }
        }
    }

    private void A0F(C1235Sb c1235Sb) {
        new C0883Ec().A0G(this.A05);
        c1235Sb.A0Y(new SR(this));
        this.A06 = new O2(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.UL
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        AbstractC1502b5 dataBundle = A00(intent);
        A0V(c5v);
        A0E(dataBundle);
        A0D(c5v.A0J().getResources().getConfiguration().orientation, bundle);
        c5v.A0N(new SQ(this, c5v));
        AbstractC1502b5 dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A0x().A0D().A03();
        if (super.A07) {
            AbstractC1502b5 dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A0x().A0D().A02();
        }
        if (unskippableSec > 0) {
            A0T(unskippableSec);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.UL, com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z10) {
        super.ACW(z10);
        C1235Sb c1235Sb = this.A07;
        if (c1235Sb != null) {
            c1235Sb.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.UL, com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z10) {
        super.ACu(z10);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
        C1235Sb c1235Sb = this.A07;
        if (c1235Sb != null) {
            c1235Sb.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.UL
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AFT(bundle);
        A0C();
        A0D(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.uinode.UL, com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        super.onDestroy();
        if (C0988Ih.A1W(this.A0D)) {
            this.A0D.A0A().AGk(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9X(this.A0A, new C1112Ni().A03(this.A09).A02(this.A0E).A05());
        }
        A0C();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}