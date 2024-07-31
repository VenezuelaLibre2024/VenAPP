package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bN */
/* loaded from: assets/audience_network.dex */
public final class C4494bN<NativeViewabilityLogger> implements InterfaceC22860p {
    public static byte[] A0I;
    public static String[] A0J = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0K;
    public InterfaceC22940x A00;
    public C22950y A01;
    public C4482bB A02;
    public C3154FV A03;
    public C3089EQ A04;
    public InterfaceC3369J2 A05;
    public InterfaceC3647Nb A07;
    public C4036Ts A08;
    public C2898B0 A09;
    public AbstractC3871RD A0A;
    public C3872RE A0B;
    public String A0D;
    public final String A0H = UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public C3528Lg A06 = new C3528Lg();
    public Boolean A0C = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 19);
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0I = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, Byte.MAX_VALUE};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0F(C27438T c27438t, JSONObject jSONObject) {
        this.A0F = false;
        C4484bD A00 = C4484bD.A00(this.A04, jSONObject);
        this.A0D = A00.A6T();
        if (AbstractC22830l.A06(this.A04, A00, this.A05)) {
            this.A04.A0E().A4K();
            if (A0J[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[5] = "gZR2JDZ5mWWs6r6NI6wXuGixksRp1MVw";
            strArr[4] = "FWucwUozmNtfNObopNjSpGj6qBSknBll";
            this.A00.ABw(this, C3403Jb.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new C3161Fc(this, A00);
        C4036Ts c4036Ts = new C4036Ts(this.A04, (WeakReference<InterfaceC3647Nb>) new WeakReference(this.A07), c27438t.A04(), A6T());
        this.A08 = c4036Ts;
        c4036Ts.A0G(c27438t.A07(), c27438t.A08());
        C4495bO c4495bO = new C4495bO(this);
        C3089EQ c3089eq = this.A04;
        InterfaceC3369J2 interfaceC3369J2 = this.A05;
        C4036Ts c4036Ts2 = this.A08;
        C4482bB c4482bB = new C4482bB(c3089eq, interfaceC3369J2, c4036Ts2, c4036Ts2.getViewabilityChecker(), c4495bO);
        this.A02 = c4482bB;
        c4482bB.A08(A00);
        this.A08.loadDataWithBaseURL(AbstractC3650Ne.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0E = true;
        A0A();
    }

    static {
        A0B();
        A0K = C4494bN.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        C3154FV c3154fv;
        if (this.A00 != null && this.A09 != null && (c3154fv = this.A03) != null && c3154fv.A0m()) {
            this.A00.AAy(this, this.A09);
        }
        InterfaceC22940x interfaceC22940x = this.A00;
        if (interfaceC22940x != null && this.A0E) {
            boolean z10 = this.A0F;
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            A0J[2] = "DQYu3GBVfiN4Ml";
            if (z10 || !this.A0G) {
                interfaceC22940x.AAy(this, this.A08);
            }
        }
        this.A04.A0E().A3i(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i10, C27438T c27438t) {
        this.A09 = new C2898B0(this.A04, this.A05, new C4497bQ(this), this.A03, A08(0, 31, 110), 2, this.A06);
        this.A0A = new C4496bP(this);
        C3872RE c3872re = new C3872RE(this.A09, c27438t.A04(), c27438t.A09(), true, new WeakReference(this.A0A), this.A04);
        this.A0B = c3872re;
        c3872re.A0W(this.A03.A0C());
        this.A0B.A0X(this.A03.A0D());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A09.AGY();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC3405Je enumC3405Je, C27438T c27438t) {
        if (this.A03 == null || this.A05 == null) {
            return;
        }
        int A02 = (int) (enumC3405Je.A02() * Resources.getSystem().getDisplayMetrics().density);
        int bannerHeight = (C3348Ih.A1n(this.A04) && C260662.A0A(this.A03.A0V())) ? 1 : 0;
        if (bannerHeight == 0) {
            A0C(A02, c27438t);
        } else {
            new C260662(new C26416c(this.A04), this.A03.A0V(), this.A03.A0P(), this.A03.A0S(), true, new C4499bS(this, A02, c27438t, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0J(C3089EQ c3089eq, InterfaceC3369J2 interfaceC3369J2, EnumC3405Je enumC3405Je, InterfaceC22940x interfaceC22940x, JSONObject jSONObject, C27438T c27438t) {
        c3089eq.A0E().A3h();
        this.A04 = c3089eq;
        this.A05 = interfaceC3369J2;
        this.A00 = interfaceC22940x;
        this.A0G = C3348Ih.A1M(c3089eq.getApplicationContext());
        C3154FV A02 = C3154FV.A02(jSONObject, this.A04);
        this.A03 = A02;
        if (A02.A0m()) {
            A0G(enumC3405Je, c27438t);
        } else {
            A0F(c27438t, jSONObject);
        }
        C22950y c22950y = new C22950y(this.A04, this.A0H, this, interfaceC22940x);
        this.A01 = c22950y;
        c22950y.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22860p
    public final String A6T() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22860p
    public final AdPlacementType A7e() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22860p
    public final boolean AGd() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22860p
    public final void onDestroy() {
        this.A04.A0E().A3f(this.A08 != null);
        C4036Ts c4036Ts = this.A08;
        if (c4036Ts != null) {
            c4036Ts.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        C22950y c22950y = this.A01;
        if (c22950y != null) {
            c22950y.A03();
        }
    }
}
