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

/* renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1520bN<NativeViewabilityLogger> implements InterfaceC05630p {
    public static byte[] A0I;
    public static String[] A0J = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0K;
    public InterfaceC05710x A00;
    public C05720y A01;
    public C1508bB A02;
    public FV A03;
    public EQ A04;
    public J2 A05;
    public InterfaceC1105Nb A07;
    public C1278Ts A08;
    public B0 A09;
    public RD A0A;
    public RE A0B;
    public String A0D;
    public final String A0H = UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public C1058Lg A06 = new C1058Lg();
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
    private void A0F(C8T c8t, JSONObject jSONObject) {
        this.A0F = false;
        C1510bD A00 = C1510bD.A00(this.A04, jSONObject);
        this.A0D = A00.A6T();
        if (AbstractC05600l.A06(this.A04, A00, this.A05)) {
            this.A04.A0E().A4K();
            if (A0J[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[5] = "gZR2JDZ5mWWs6r6NI6wXuGixksRp1MVw";
            strArr[4] = "FWucwUozmNtfNObopNjSpGj6qBSknBll";
            this.A00.ABw(this, C1005Jb.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new C0909Fc(this, A00);
        C1278Ts c1278Ts = new C1278Ts(this.A04, (WeakReference<InterfaceC1105Nb>) new WeakReference(this.A07), c8t.A04(), A6T());
        this.A08 = c1278Ts;
        c1278Ts.A0G(c8t.A07(), c8t.A08());
        C1521bO c1521bO = new C1521bO(this);
        EQ eq = this.A04;
        J2 j22 = this.A05;
        C1278Ts c1278Ts2 = this.A08;
        C1508bB c1508bB = new C1508bB(eq, j22, c1278Ts2, c1278Ts2.getViewabilityChecker(), c1521bO);
        this.A02 = c1508bB;
        c1508bB.A08(A00);
        this.A08.loadDataWithBaseURL(AbstractC1108Ne.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0E = true;
        A0A();
    }

    static {
        A0B();
        A0K = C1520bN.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        FV fv;
        if (this.A00 != null && this.A09 != null && (fv = this.A03) != null && fv.A0m()) {
            this.A00.AAy(this, this.A09);
        }
        InterfaceC05710x interfaceC05710x = this.A00;
        if (interfaceC05710x != null && this.A0E) {
            boolean z10 = this.A0F;
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            A0J[2] = "DQYu3GBVfiN4Ml";
            if (z10 || !this.A0G) {
                interfaceC05710x.AAy(this, this.A08);
            }
        }
        this.A04.A0E().A3i(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i10, C8T c8t) {
        this.A09 = new B0(this.A04, this.A05, new C1523bQ(this), this.A03, A08(0, 31, 110), 2, this.A06);
        this.A0A = new C1522bP(this);
        RE re2 = new RE(this.A09, c8t.A04(), c8t.A09(), true, new WeakReference(this.A0A), this.A04);
        this.A0B = re2;
        re2.A0W(this.A03.A0C());
        this.A0B.A0X(this.A03.A0D());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A09.AGY();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC1007Je enumC1007Je, C8T c8t) {
        if (this.A03 == null || this.A05 == null) {
            return;
        }
        int A02 = (int) (enumC1007Je.A02() * Resources.getSystem().getDisplayMetrics().density);
        int bannerHeight = (C0988Ih.A1n(this.A04) && AnonymousClass62.A0A(this.A03.A0V())) ? 1 : 0;
        if (bannerHeight == 0) {
            A0C(A02, c8t);
        } else {
            new AnonymousClass62(new C07046c(this.A04), this.A03.A0V(), this.A03.A0P(), this.A03.A0S(), true, new C1525bS(this, A02, c8t, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0J(EQ eq, J2 j22, EnumC1007Je enumC1007Je, InterfaceC05710x interfaceC05710x, JSONObject jSONObject, C8T c8t) {
        eq.A0E().A3h();
        this.A04 = eq;
        this.A05 = j22;
        this.A00 = interfaceC05710x;
        this.A0G = C0988Ih.A1M(eq.getApplicationContext());
        FV A02 = FV.A02(jSONObject, this.A04);
        this.A03 = A02;
        if (A02.A0m()) {
            A0G(enumC1007Je, c8t);
        } else {
            A0F(c8t, jSONObject);
        }
        C05720y c05720y = new C05720y(this.A04, this.A0H, this, interfaceC05710x);
        this.A01 = c05720y;
        c05720y.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final String A6T() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final AdPlacementType A7e() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final boolean AGd() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final void onDestroy() {
        this.A04.A0E().A3f(this.A08 != null);
        C1278Ts c1278Ts = this.A08;
        if (c1278Ts != null) {
            c1278Ts.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        C05720y c05720y = this.A01;
        if (c05720y != null) {
            c05720y.A03();
        }
    }
}
