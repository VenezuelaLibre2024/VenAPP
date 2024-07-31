package com.facebook.ads.redexgen.uinode;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sx */
/* loaded from: assets/audience_network.dex */
public final class C1257Sx extends PQ {
    public static byte[] A0k;
    public static String[] A0l = {"b5G1zrconZ3ixGT2ifmSYAvyf5qvuioM", "E7ePxMRKQj8Nsj11XAZX", "RYnvJIfy7H", "sKG7dsg9roBnaoP9H0Iom", "yy1EwMPcWWjeWCkN0IqWpK5f1Ty7r3W9", "FDFB", "dmJ0BH5on1aQmIo20RUb8HXj8gaX6ja3", "K5zlHDBh8uRMDNRgQaLPbhL7f5pOjpiq"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C1P A0D;
    public NJ A0E;
    public NK A0F;
    public U1 A0G;
    public C1144Oo A0H;
    public QM A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AbstractC05560h A0T;
    public final C1399Yn A0U;
    public final JA A0V;
    public final FullScreenAdToolbar A0W;
    public final InterfaceC1159Pd A0X;
    public final SF A0Y;
    public final SA A0Z;
    public final C9I A0a;
    public final AbstractC1176Pu A0b;
    public final AbstractC1174Ps A0c;
    public final AbstractC1143On A0d;
    public final O7 A0e;
    public final NX A0f;
    public final NQ A0g;
    public final C1048Kw A0h;
    public final KP A0i;
    public final Runnable A0j;

    public static String A0M(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A0Y() {
        A0k = new byte[]{-28, -19, -22, -28, -20, -32, -12, -16, -10, -13, -28, -26, -65, -67, -52, -86, -71, -49, -96, -67, -63, -65, -64, -52, -50, -45, -43, -38, -39, -60, -46, -54, -39, -51, -44, -55, 23, 21, 7, 20, 5, 14, 11, 5, 13, 1, 8, 11, 14, 22, 7, 20, 7, 6, 1, -13, -8, -18, -7, 1, 14};
    }

    static {
        A0Y();
        A0m = (int) (LD.A02 * 4.0f);
        A0n = (int) (LD.A02 * 8.0f);
        A0o = AbstractC06152p.A01(-1, 77);
        A0s = (int) (LD.A02 * 26.0f);
        A0t = (int) (LD.A02 * 12.0f);
        A0q = (int) (LD.A02 * 12.0f);
        A0r = (int) (LD.A02 * 44.0f);
        A0p = (int) (LD.A02 * 8.0f);
    }

    public C1257Sx(C1399Yn c1399Yn, J2 j22, FullScreenAdToolbar fullScreenAdToolbar, AbstractC1502b5 abstractC1502b5, C07046c c07046c, InterfaceC1087Mj interfaceC1087Mj, int i10, MC mc2, JA ja2, int i11, boolean z10, boolean z11, InterfaceC1159Pd interfaceC1159Pd) {
        super(c1399Yn, interfaceC1087Mj, j22, abstractC1502b5, i10, z10, z11, mc2);
        C1P A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0j = new PZ(this);
        this.A0L = false;
        this.A0S = false;
        this.A01 = 0.0f;
        A1 a12 = new A1(this);
        this.A0f = a12;
        C07929z c07929z = new O7() { // from class: com.facebook.ads.redexgen.X.9z
            public C07929z() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(O8 o82) {
                if (!((PQ) C1257Sx.this).A08.A07()) {
                    C1257Sx.this.A03();
                }
            }
        };
        this.A0e = c07929z;
        C07919y c07919y = new AbstractC1143On() { // from class: com.facebook.ads.redexgen.X.9y
            public C07919y() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            public final /* bridge */ /* synthetic */ void A03(AnonymousClass98 anonymousClass98) {
            }
        };
        this.A0d = c07919y;
        C07719d c07719d = new NQ() { // from class: com.facebook.ads.redexgen.X.9d
            public C07719d() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(AnonymousClass93 anonymousClass93) {
                float f10;
                SA sa2;
                InterfaceC1159Pd interfaceC1159Pd2;
                C1257Sx.this.A0g(anonymousClass93);
                f10 = C1257Sx.this.A01;
                sa2 = C1257Sx.this.A0Z;
                float duration = (f10 * sa2.getDuration()) + anonymousClass93.A00();
                interfaceC1159Pd2 = C1257Sx.this.A0X;
                interfaceC1159Pd2.ABY(duration);
            }
        };
        this.A0g = c07719d;
        C07699b c07699b = new AbstractC1176Pu() { // from class: com.facebook.ads.redexgen.X.9b
            public C07699b() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(C9H c9h) {
                InterfaceC1159Pd interfaceC1159Pd2;
                SA sa2;
                SA sa3;
                interfaceC1159Pd2 = C1257Sx.this.A0X;
                sa2 = C1257Sx.this.A0Z;
                interfaceC1159Pd2.ABH(sa2.getDuration());
                C1257Sx.A06(C1257Sx.this, 1.0f);
                sa3 = C1257Sx.this.A0Z;
                sa3.A0b(QM.A02, 28);
            }
        };
        this.A0b = c07699b;
        C07689a c07689a = new C07689a(this);
        this.A0c = c07689a;
        this.A0W = fullScreenAdToolbar;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1399Yn.getSystemService(A0M(24, 12, 53));
        this.A0T = C05570i.A01(c1399Yn, j22, abstractC1502b5.A12(), AbstractC1050Ky.A00(abstractC1502b5.A0x().A0F().A05()), new HashMap(), false, true, abstractC1502b5.A0y());
        this.A0U = c1399Yn;
        this.A0V = ja2;
        this.A0h = new C1048Kw(c1399Yn, ja2);
        this.A0i = new KP(c1399Yn);
        this.A0X = interfaceC1159Pd;
        if (i11 == 1) {
            A00 = super.A05.A0w().A01();
        } else {
            A00 = super.A05.A0w().A00();
        }
        this.A0D = A00;
        SA sa2 = new SA(c1399Yn);
        this.A0Z = sa2;
        sa2.getEventBus().A03(a12, c07929z, c07919y, c07719d, c07699b, c07689a);
        C9I c9i = new C9I(c1399Yn, j22, sa2, abstractC1502b5.A12());
        this.A0a = c9i;
        A0V();
        sa2.setVideoURI(c07046c.A0S(super.A05.A0x().A0D().A08()));
        A0S();
        A0P();
        A0O();
        OA.A00(c1399Yn, this, abstractC1502b5.A0x().A0D().A07());
        setupLayoutConfiguration(false);
        A0U();
        A0T();
        postDelayed(new C1258Sy(this), 1000L);
        if (C0988Ih.A1W(c1399Yn)) {
            c1399Yn.A0A().AGv(sa2, super.A05.A12(), true);
        }
        if (C0988Ih.A1X(c1399Yn)) {
            this.A0Y = new SF(c1399Yn, j22, sa2, super.A05.A12(), c9i, null);
        } else {
            this.A0Y = null;
        }
        A0Z(abstractC1502b5.A0x());
    }

    public static /* synthetic */ float A06(C1257Sx c1257Sx, float f10) {
        float f11 = c1257Sx.A01 + f10;
        c1257Sx.A01 = f11;
        return f11;
    }

    public static /* synthetic */ int A08(C1257Sx c1257Sx) {
        int i10 = c1257Sx.A02;
        c1257Sx.A02 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A0A(C1257Sx c1257Sx) {
        int i10 = c1257Sx.A07;
        c1257Sx.A07 = i10 + 1;
        return i10;
    }

    private void A0N() {
        int i10;
        AbstractC1066Lo.A0J(this.A0B);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0B = linearLayout;
        AbstractC1066Lo.A0R(linearLayout, this.A0U);
        if (this.A0J) {
            int i11 = this.A04;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "eARj3wLLoGbDJmJ7QaGG8";
            strArr2[2] = "iGp5YEz0aP";
            i10 = i11 / 4;
        } else {
            i10 = this.A04 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i10);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0O() {
        this.A0i.A06(-1, A0o);
        KP kp = this.A0i;
        int i10 = A0t;
        kp.setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0s);
        layoutParams.addRule(12);
        addView(this.A0i, layoutParams);
    }

    private void A0P() {
        C1048Kw c1048Kw = this.A0h;
        int i10 = A0q;
        c1048Kw.setPadding(i10, i10, i10, i10);
        int i11 = A0r;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.setMargins(0, MB.A00, A0p, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0Z, videoViewParams);
        addView(this.A0h, layoutParams);
    }

    public void A0Q() {
        if (super.A05.A0l() && this.A0L) {
            this.A0L = false;
            A0i(A0M(36, 18, 114));
        }
    }

    private void A0R() {
        if (super.A05.A0l()) {
            boolean z10 = this.A0L;
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0l[1] = "kkPn6UZbIf4yuCbsGSZ";
            if (z10) {
                this.A0L = false;
                Map<String, String> A05 = new C1112Ni().A03(null).A02(null).A05();
                A05.put(A0M(0, 12, 81), A0M(36, 18, 114));
                super.A07.A9W(super.A05.A12(), A05);
            }
        }
    }

    private void A0S() {
        postDelayed(new T0(this), C0988Ih.A0L(this.A0U));
    }

    private void A0T() {
        AbstractC1066Lo.A0J(this.A0A);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0A = linearLayout;
        linearLayout.setOrientation(1);
        AbstractC1066Lo.A0K(this.A0A);
        A0W();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0U() {
        View view = this.A0Z;
        if (super.A05.A0l()) {
            view.setOnClickListener(new ViewOnClickListenerC1157Pb(this));
        }
        AbstractC1066Lo.A0J(view);
        AbstractC1066Lo.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        TextView textView = new TextView(this.A0U);
        this.A0C = textView;
        AbstractC1066Lo.A0K(textView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A05(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i10 = A0n;
        layoutParams.setMargins(i10, i10 / 2, i10, A0s);
        View mMediaView = this.A0C;
        addView(mMediaView, layoutParams);
        View mMediaView2 = this.A0C;
        AbstractC1066Lo.A0K(mMediaView2);
        C1144Oo c1144Oo = new C1144Oo(this.A0U, super.A05, super.A07, super.A09, super.A0B, super.A08, getColors(), new T3(this));
        this.A0H = c1144Oo;
        AbstractC1066Lo.A0G(AdError.NO_FILL_ERROR_CODE, c1144Oo);
        View mMediaView3 = this.A0H;
        addView(mMediaView3);
        A0X();
        A0N();
        if (C0988Ih.A0y(this.A0U)) {
            this.A0B.setOnClickListener(new PT(this));
            View mMediaView4 = this.A0W;
            if (mMediaView4 != null) {
                this.A0W.setCTAClickListener(new PU(this));
            }
        }
    }

    private void A0V() {
        this.A0Z.A0c(this.A0i);
        this.A0Z.A0c(this.A0h);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C7R c7r = new C7R(this.A0U);
            this.A0Z.A0c(c7r);
            c7r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0Z.A0c(new C7H(this.A0U));
    }

    public void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            int i10 = this.A05;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "KzfN";
            layoutParams.setMargins(0, i10 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        this.A0A.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0X() {
        int i10;
        if (this.A0J) {
            i10 = this.A04 / 4;
        } else {
            int i11 = this.A04;
            String[] strArr = A0l;
            if (strArr[7].charAt(25) != strArr[0].charAt(25)) {
                throw new RuntimeException();
            }
            A0l[5] = "tQDw";
            i10 = i11 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i10);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Z(C1G c1g) {
        double A00 = OI.A00(c1g);
        String A05 = c1g.A0E().A05();
        if (A05 == null || A05.trim().length() == 0) {
            AbstractC1066Lo.A0N(this.A0B, 8);
            if (C0988Ih.A0y(this.A0U)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A05);
            if (C0988Ih.A0y(this.A0U)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    public void A0g(AnonymousClass93 anonymousClass93) {
        if (this.A0Z.getState() == RB.A02 && C0988Ih.A1D(this.A0U)) {
            postDelayed(new C1259Sz(this, anonymousClass93), 5000L);
        }
    }

    public void A0h(String str) {
        U1 u12;
        AbstractC1066Lo.A0J(this.A0G);
        T2 t22 = new T2(this);
        if (this.A0U.A0D() == null) {
            this.A0U.A0E().A8e();
        }
        if (AbstractC0989Ii.A02(this.A0U) || this.A0U.A0D() == null) {
            u12 = new U1(this.A0U, t22);
        } else {
            C1399Yn c1399Yn = this.A0U;
            u12 = new U1(c1399Yn, c1399Yn.A0D(), t22);
        }
        this.A0G = u12;
        u12.setOnTouchListener(new PV(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0i(String str) {
        Map<String, String> A05 = new C1112Ni().A03(null).A02(null).A05();
        A05.put(A0M(0, 12, 81), str);
        this.A0V.A04(J9.A0J, A05);
        super.A09.A43(super.A05.A0L());
        super.A07.A9j(super.A05.A12(), A05);
        if (C0988Ih.A20(this.A0U)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1532bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1532bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1532bZ.A05, Boolean.TRUE.toString());
            super.A07.A9s(super.A05.A12(), hashMap);
        }
    }

    public void A0j(String str) {
        if (super.A05.A0u() > 0) {
            if (super.A05.A19() && this.A0M) {
                return;
            }
            this.A0M = true;
            A0i(str);
            return;
        }
        if (super.A05.A0k()) {
            A0Q();
        }
    }

    public void A0k(boolean z10) {
        this.A0K = z10;
        ObjectAnimator objectAnimator = null;
        if (!z10) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String A0M = A0M(60, 1, 101);
        if (z10) {
            C1144Oo c1144Oo = this.A0H;
            objectAnimator = ObjectAnimator.ofFloat(c1144Oo, A0M, c1144Oo.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        fArr[1] = i10;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0M, fArr);
        ofFloat.setDuration(500L);
        SA sa2 = this.A0Z;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(sa2, A0M, sa2.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A0Z.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        iArr[1] = i11;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new PX(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new PY(this, z10));
        animatorSet.start();
    }

    private void A0l(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        AbstractC1066Lo.A0J(this.A0Z);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0T();
        }
        this.A0Z.setTranslationY(0.0f);
        addView(this.A0Z, 1, layoutParams);
        A0N();
        A0X();
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final void A0z() {
        A0R();
        if (C0988Ih.A1W(this.A0U)) {
            this.A0U.A0A().AGk(this.A0Z);
        }
        SF sf2 = this.A0Y;
        if (sf2 != null) {
            sf2.A0C();
        }
        SA sa2 = this.A0Z;
        if (sa2 != null) {
            C07608r<AbstractC07618s, C07598q> eventBus = sa2.getEventBus();
            AbstractC07618s[] abstractC07618sArr = new AbstractC07618s[6];
            abstractC07618sArr[0] = this.A0f;
            abstractC07618sArr[1] = this.A0e;
            abstractC07618sArr[2] = this.A0d;
            NQ nq = this.A0g;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "F6CS";
            abstractC07618sArr[3] = nq;
            abstractC07618sArr[4] = this.A0b;
            abstractC07618sArr[5] = this.A0c;
            eventBus.A04(abstractC07618sArr);
            AbstractC1066Lo.A0H(this.A0Z);
            this.A0Z.A0V();
        }
        this.A0a.A0i();
        AbstractC1066Lo.A0a(this.A0Z, this.A0i, this.A0h);
        super.A0B.A0V();
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final void A10() {
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final void A11() {
        this.A0Z.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0Z.A0b(QM.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final void A12(boolean z10) {
        if (this.A0Z.A0i()) {
            return;
        }
        this.A0I = this.A0Z.getVideoStartReason();
        this.A0R = z10;
        this.A0Z.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final void A13(boolean z10) {
        QM qm;
        if (this.A0Z.getState() == RB.A06 || (qm = this.A0I) == null) {
            return;
        }
        if (!this.A0R || z10) {
            this.A0Z.A0b(qm, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final boolean A14() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public final boolean A15() {
        return false;
    }

    public C1P getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public C1158Pc getFullScreenAdStyle() {
        return new C1158Pc(true, C1158Pc.A06, super.A05.A0w().A01(), ViewOnClickListenerC1271Tl.A08(super.A05), super.A05.A0w().A01().A07(true), super.A05.A0x().A0D().A07());
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ
    public C1058Lg getTouchDataRecorder() {
        return super.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.PQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0l(A0m());
        setupLayoutConfiguration(A0m());
        A0W();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A13(false);
        } else {
            A12(false);
        }
    }

    private void setUpBrowserControls(U1 u12) {
        AbstractC1066Lo.A0J(this.A0E);
        NJ nj2 = new NJ(this.A0U, u12);
        this.A0E = nj2;
        u12.setBrowserNavigationListener(nj2.getBrowserNavigationListener());
        AbstractC1066Lo.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new T1(this));
        this.A0E.setOnTouchListener(new PW(this));
        this.A0A.addView(this.A0E, layoutParams);
        AbstractC1066Lo.A0J(this.A0F);
        this.A0F = new NK(this.A0U, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0U.getSystemService(A0M(54, 6, 90));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Integer num = (Integer) Display.class.getMethod(A0M(12, 12, 40), new Class[0]).invoke(defaultDisplay, new Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
