package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class VE extends C06765a implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1399Yn A01;
    public JK A02;
    public C0819Ba A04;
    public C7R A05;
    public C7I A06;
    public RD A07;
    public RE A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final QI A0C = new VK(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public JU A03 = JU.A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 60, 43, 32, 42, 43, 60, 43, 60, 110, 45, 38, 39, 34, 42, 110, 45, 33, 32, 40, 39, 41, 96, 14, 38, 39, 42, 34, 21, 42, 38, 52, 21, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, 16, 43, 36, 39, 41, 32, 101, 49, 42, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, 101, 38, 45, 44, 41, 33, 107};
    }

    static {
        A0E();
        A0H = VE.class.getSimpleName();
    }

    private VJ A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new VJ(this, mediaViewVideoRendererApi);
    }

    private VI A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new VI(this, mediaViewVideoRendererApi);
    }

    private VG A02() {
        return new VG(this);
    }

    private RE A05() {
        return new RE(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        C0819Ba c0819Ba = this.A04;
        if (c0819Ba != null) {
            QJ qj2 = (QJ) c0819Ba.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            qj2.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        C0819Ba c0819Ba = this.A04;
        if (c0819Ba != null) {
            c0819Ba.getVideoView().setOnTouchListener(new JJ(this));
        }
    }

    private void A0B() {
        C0819Ba c0819Ba = this.A04;
        if (c0819Ba != null) {
            QJ qj2 = (QJ) c0819Ba.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            qj2.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        C0819Ba c0819Ba = this.A04;
        if (c0819Ba != null && c0819Ba.getState() == RB.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = JU.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(V2 v22, JK jk2) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = jk2;
        A09();
        C7R c7r = this.A05;
        if (v22 != null) {
            JP adCoverImage = v22.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                str = v22.getAdCoverImage().getUrl();
                c7r.setImage(str, new VH(this));
                this.A03 = v22.A18();
                this.A06.setPlayAccessibilityLabel(v22.A1E());
                this.A06.setPauseAccessibilityLabel(v22.A1D());
                this.A08.A0U();
            }
        }
        str = null;
        c7r.setImage(str, new VH(this));
        this.A03 = v22.A18();
        this.A06.setPlayAccessibilityLabel(v22.A1E());
        this.A06.setPauseAccessibilityLabel(v22.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(QM qm) {
        C0819Ba c0819Ba = this.A04;
        if (c0819Ba != null) {
            c0819Ba.A0b(qm, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        C0819Ba c0819Ba = this.A04;
        if (c0819Ba == null || c0819Ba.getState() == RB.A06) {
            return false;
        }
        return this.A03 == JU.A05 || this.A03 == JU.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        JM A01;
        ((C06765a) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i10) {
            case 0:
                A01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C06835h) mediaViewVideoRendererApi).A06(A01);
        this.A01 = C06785c.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C7R(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = LD.A02;
        int i11 = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C7I(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(i11, smallPadding, smallPadding, i11);
        this.A06.setLayoutParams(layoutParams);
        int i12 = 0;
        while (true) {
            if (i12 < this.A00.getChildCount()) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C0819Ba) {
                    C0819Ba c0819Ba = (C0819Ba) childAt;
                    String[] strArr = A0G;
                    if (strArr[4].length() != strArr[1].length()) {
                        A0G[3] = "bzrDqpY4LpZuK9aeaZZijHYv";
                        this.A04 = c0819Ba;
                    }
                } else {
                    i12++;
                }
            }
        }
        C0819Ba c0819Ba2 = this.A04;
        String[] strArr2 = A0G;
        if (strArr2[2].length() == strArr2[0].length()) {
            String[] strArr3 = A0G;
            strArr3[6] = "2aK7TrzSKlLOXQMMYyslcv3rZKnIT";
            strArr3[5] = "rJ0uIs3irNdkufru0tgAA9z3l7YlJ";
            if (c0819Ba2 == null) {
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0H, A06(72, 36, 58));
                }
            } else {
                c0819Ba2.A0c(this.A05);
                C0819Ba c0819Ba3 = this.A04;
                String[] strArr4 = A0G;
                if (strArr4[6].length() != strArr4[5].length()) {
                    throw new RuntimeException();
                }
                A0G[3] = "N5wNlZvELtjdUjcESL7VUEU7";
                c0819Ba3.A0c(this.A06);
            }
            this.A08.A0W(0);
            this.A08.A0X(250);
            A01.AG3();
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.uinode.C06765a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.C06765a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0n = C0988Ih.A0n(this.A01);
        this.A00.setOnTouchListener(new JI(this, A0n));
        if (!A0n) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C06765a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.C06765a, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
