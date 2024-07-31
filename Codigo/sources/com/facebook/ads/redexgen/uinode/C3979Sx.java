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
public final class C3979Sx extends AbstractC3760PQ {
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
    public C23221P A0D;
    public C3629NJ A0E;
    public C3630NK A0F;
    public C4045U1 A0G;
    public C3722Oo A0H;
    public EnumC3818QM A0I;
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
    public final AbstractC22790h A0T;
    public final C4337Yn A0U;
    public final C3377JA A0V;
    public final FullScreenAdToolbar A0W;
    public final InterfaceC3773Pd A0X;
    public final C3935SF A0Y;
    public final C3930SA A0Z;
    public final C27939I A0a;
    public final AbstractC3790Pu A0b;
    public final AbstractC3788Ps A0c;
    public final AbstractC3721On A0d;
    public final AbstractC3679O7 A0e;
    public final AbstractC3643NX A0f;
    public final AbstractC3636NQ A0g;
    public final C3482Kw A0h;
    public final C3451KP A0i;
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
        A0m = (int) (AbstractC3499LD.A02 * 4.0f);
        A0n = (int) (AbstractC3499LD.A02 * 8.0f);
        A0o = AbstractC24102p.A01(-1, 77);
        A0s = (int) (AbstractC3499LD.A02 * 26.0f);
        A0t = (int) (AbstractC3499LD.A02 * 12.0f);
        A0q = (int) (AbstractC3499LD.A02 * 12.0f);
        A0r = (int) (AbstractC3499LD.A02 * 44.0f);
        A0p = (int) (AbstractC3499LD.A02 * 8.0f);
    }

    public C3979Sx(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, FullScreenAdToolbar fullScreenAdToolbar, AbstractC4476b5 abstractC4476b5, C26416c c26416c, InterfaceC3593Mj interfaceC3593Mj, int i10, InterfaceC3560MC interfaceC3560MC, C3377JA c3377ja, int i11, boolean z10, boolean z11, InterfaceC3773Pd interfaceC3773Pd) {
        super(c4337Yn, interfaceC3593Mj, interfaceC3369J2, abstractC4476b5, i10, z10, z11, interfaceC3560MC);
        C23221P A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0j = new RunnableC3769PZ(this);
        this.A0L = false;
        this.A0S = false;
        this.A01 = 0.0f;
        C2837A1 c2837a1 = new C2837A1(this);
        this.A0f = c2837a1;
        AbstractC3679O7 abstractC3679O7 = new AbstractC3679O7() { // from class: com.facebook.ads.redexgen.X.9z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3680O8 c3680o8) {
                if (!((AbstractC3760PQ) C3979Sx.this).A08.A07()) {
                    C3979Sx.this.A03();
                }
            }
        };
        this.A0e = abstractC3679O7;
        AbstractC3721On abstractC3721On = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.9y
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            public final /* bridge */ /* synthetic */ void A03(C278398 c278398) {
            }
        };
        this.A0d = abstractC3721On;
        AbstractC3636NQ abstractC3636NQ = new AbstractC3636NQ() { // from class: com.facebook.ads.redexgen.X.9d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C277893 c277893) {
                float f10;
                C3930SA c3930sa;
                InterfaceC3773Pd interfaceC3773Pd2;
                C3979Sx.this.A0g(c277893);
                f10 = C3979Sx.this.A01;
                c3930sa = C3979Sx.this.A0Z;
                float duration = (f10 * c3930sa.getDuration()) + c277893.A00();
                interfaceC3773Pd2 = C3979Sx.this.A0X;
                interfaceC3773Pd2.ABY(duration);
            }
        };
        this.A0g = abstractC3636NQ;
        AbstractC3790Pu abstractC3790Pu = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.9b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27929H c27929h) {
                InterfaceC3773Pd interfaceC3773Pd2;
                C3930SA c3930sa;
                C3930SA c3930sa2;
                interfaceC3773Pd2 = C3979Sx.this.A0X;
                c3930sa = C3979Sx.this.A0Z;
                interfaceC3773Pd2.ABH(c3930sa.getDuration());
                C3979Sx.A06(C3979Sx.this, 1.0f);
                c3930sa2 = C3979Sx.this.A0Z;
                c3930sa2.A0b(EnumC3818QM.A02, 28);
            }
        };
        this.A0b = abstractC3790Pu;
        C28119a c28119a = new C28119a(this);
        this.A0c = c28119a;
        this.A0W = fullScreenAdToolbar;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c4337Yn.getSystemService(A0M(24, 12, 53));
        this.A0T = C22800i.A01(c4337Yn, interfaceC3369J2, abstractC4476b5.A12(), AbstractC3484Ky.A00(abstractC4476b5.A0x().A0F().A05()), new HashMap(), false, true, abstractC4476b5.A0y());
        this.A0U = c4337Yn;
        this.A0V = c3377ja;
        this.A0h = new C3482Kw(c4337Yn, c3377ja);
        this.A0i = new C3451KP(c4337Yn);
        this.A0X = interfaceC3773Pd;
        if (i11 == 1) {
            A00 = super.A05.A0w().A01();
        } else {
            A00 = super.A05.A0w().A00();
        }
        this.A0D = A00;
        C3930SA c3930sa = new C3930SA(c4337Yn);
        this.A0Z = c3930sa;
        c3930sa.getEventBus().A03(c2837a1, abstractC3679O7, abstractC3721On, abstractC3636NQ, abstractC3790Pu, c28119a);
        C27939I c27939i = new C27939I(c4337Yn, interfaceC3369J2, c3930sa, abstractC4476b5.A12());
        this.A0a = c27939i;
        A0V();
        c3930sa.setVideoURI(c26416c.A0S(super.A05.A0x().A0D().A08()));
        A0S();
        A0P();
        A0O();
        AbstractC3682OA.A00(c4337Yn, this, abstractC4476b5.A0x().A0D().A07());
        setupLayoutConfiguration(false);
        A0U();
        A0T();
        postDelayed(new C3980Sy(this), 1000L);
        if (C3348Ih.A1W(c4337Yn)) {
            c4337Yn.A0A().AGv(c3930sa, super.A05.A12(), true);
        }
        if (C3348Ih.A1X(c4337Yn)) {
            this.A0Y = new C3935SF(c4337Yn, interfaceC3369J2, c3930sa, super.A05.A12(), c27939i, null);
        } else {
            this.A0Y = null;
        }
        A0Z(abstractC4476b5.A0x());
    }

    public static /* synthetic */ float A06(C3979Sx c3979Sx, float f10) {
        float f11 = c3979Sx.A01 + f10;
        c3979Sx.A01 = f11;
        return f11;
    }

    public static /* synthetic */ int A08(C3979Sx c3979Sx) {
        int i10 = c3979Sx.A02;
        c3979Sx.A02 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A0A(C3979Sx c3979Sx) {
        int i10 = c3979Sx.A07;
        c3979Sx.A07 = i10 + 1;
        return i10;
    }

    private void A0N() {
        int i10;
        AbstractC3536Lo.A0J(this.A0B);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0B = linearLayout;
        AbstractC3536Lo.A0R(linearLayout, this.A0U);
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
        C3451KP c3451kp = this.A0i;
        int i10 = A0t;
        c3451kp.setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0s);
        layoutParams.addRule(12);
        addView(this.A0i, layoutParams);
    }

    private void A0P() {
        C3482Kw c3482Kw = this.A0h;
        int i10 = A0q;
        c3482Kw.setPadding(i10, i10, i10, i10);
        int i11 = A0r;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.setMargins(0, AbstractC3559MB.A00, A0p, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0Z, videoViewParams);
        addView(this.A0h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
                Map<String, String> A05 = new C3654Ni().A03(null).A02(null).A05();
                A05.put(A0M(0, 12, 81), A0M(36, 18, 114));
                super.A07.A9W(super.A05.A12(), A05);
            }
        }
    }

    private void A0S() {
        postDelayed(new C3982T0(this), C3348Ih.A0L(this.A0U));
    }

    private void A0T() {
        AbstractC3536Lo.A0J(this.A0A);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0A = linearLayout;
        linearLayout.setOrientation(1);
        AbstractC3536Lo.A0K(this.A0A);
        A0W();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0U() {
        View view = this.A0Z;
        if (super.A05.A0l()) {
            view.setOnClickListener(new ViewOnClickListenerC3771Pb(this));
        }
        AbstractC3536Lo.A0J(view);
        AbstractC3536Lo.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        TextView textView = new TextView(this.A0U);
        this.A0C = textView;
        AbstractC3536Lo.A0K(textView);
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
        AbstractC3536Lo.A0K(mMediaView2);
        C3722Oo c3722Oo = new C3722Oo(this.A0U, super.A05, super.A07, super.A09, super.A0B, super.A08, getColors(), new C3985T3(this));
        this.A0H = c3722Oo;
        AbstractC3536Lo.A0G(AdError.NO_FILL_ERROR_CODE, c3722Oo);
        View mMediaView3 = this.A0H;
        addView(mMediaView3);
        A0X();
        A0N();
        if (C3348Ih.A0y(this.A0U)) {
            this.A0B.setOnClickListener(new ViewOnClickListenerC3763PT(this));
            View mMediaView4 = this.A0W;
            if (mMediaView4 != null) {
                this.A0W.setCTAClickListener(new ViewOnClickListenerC3764PU(this));
            }
        }
    }

    private void A0V() {
        this.A0Z.A0c(this.A0i);
        this.A0Z.A0c(this.A0h);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C26817R c26817r = new C26817R(this.A0U);
            this.A0Z.A0c(c26817r);
            c26817r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0Z.A0c(new C26747H(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    private void A0Z(C23131G c23131g) {
        double A00 = AbstractC3690OI.A00(c23131g);
        String A05 = c23131g.A0E().A05();
        if (A05 == null || A05.trim().length() == 0) {
            AbstractC3536Lo.A0N(this.A0B, 8);
            if (C3348Ih.A0y(this.A0U)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A05);
            if (C3348Ih.A0y(this.A0U)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(C277893 c277893) {
        if (this.A0Z.getState() == EnumC3869RB.A02 && C3348Ih.A1D(this.A0U)) {
            postDelayed(new C3981Sz(this, c277893), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        C4045U1 c4045u1;
        AbstractC3536Lo.A0J(this.A0G);
        C3984T2 c3984t2 = new C3984T2(this);
        if (this.A0U.A0D() == null) {
            this.A0U.A0E().A8e();
        }
        if (AbstractC3349Ii.A02(this.A0U) || this.A0U.A0D() == null) {
            c4045u1 = new C4045U1(this.A0U, c3984t2);
        } else {
            C4337Yn c4337Yn = this.A0U;
            c4045u1 = new C4045U1(c4337Yn, c4337Yn.A0D(), c3984t2);
        }
        this.A0G = c4045u1;
        c4045u1.setOnTouchListener(new ViewOnTouchListenerC3765PV(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0i(String str) {
        Map<String, String> A05 = new C3654Ni().A03(null).A02(null).A05();
        A05.put(A0M(0, 12, 81), str);
        this.A0V.A04(EnumC3376J9.A0J, A05);
        super.A09.A43(super.A05.A0L());
        super.A07.A9j(super.A05.A12(), A05);
        if (C3348Ih.A20(this.A0U)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC4506bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC4506bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC4506bZ.A05, Boolean.TRUE.toString());
            super.A07.A9s(super.A05.A12(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
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
            C3722Oo c3722Oo = this.A0H;
            objectAnimator = ObjectAnimator.ofFloat(c3722Oo, A0M, c3722Oo.getY(), this.A05 / 5);
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
        C3930SA c3930sa = this.A0Z;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(c3930sa, A0M, c3930sa.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A0Z.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        iArr[1] = i11;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new C3767PX(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new C3768PY(this, z10));
        animatorSet.start();
    }

    private void A0l(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        AbstractC3536Lo.A0J(this.A0Z);
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

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A0z() {
        A0R();
        if (C3348Ih.A1W(this.A0U)) {
            this.A0U.A0A().AGk(this.A0Z);
        }
        C3935SF c3935sf = this.A0Y;
        if (c3935sf != null) {
            c3935sf.A0C();
        }
        C3930SA c3930sa = this.A0Z;
        if (c3930sa != null) {
            C27668r<AbstractC27678s, C27658q> eventBus = c3930sa.getEventBus();
            AbstractC27678s[] abstractC27678sArr = new AbstractC27678s[6];
            abstractC27678sArr[0] = this.A0f;
            abstractC27678sArr[1] = this.A0e;
            abstractC27678sArr[2] = this.A0d;
            AbstractC3636NQ abstractC3636NQ = this.A0g;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "F6CS";
            abstractC27678sArr[3] = abstractC3636NQ;
            abstractC27678sArr[4] = this.A0b;
            abstractC27678sArr[5] = this.A0c;
            eventBus.A04(abstractC27678sArr);
            AbstractC3536Lo.A0H(this.A0Z);
            this.A0Z.A0V();
        }
        this.A0a.A0i();
        AbstractC3536Lo.A0a(this.A0Z, this.A0i, this.A0h);
        super.A0B.A0V();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A10() {
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A11() {
        this.A0Z.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0Z.A0b(EnumC3818QM.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A12(boolean z10) {
        if (this.A0Z.A0i()) {
            return;
        }
        this.A0I = this.A0Z.getVideoStartReason();
        this.A0R = z10;
        this.A0Z.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A13(boolean z10) {
        EnumC3818QM enumC3818QM;
        if (this.A0Z.getState() == EnumC3869RB.A06 || (enumC3818QM = this.A0I) == null) {
            return;
        }
        if (!this.A0R || z10) {
            this.A0Z.A0b(enumC3818QM, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final boolean A14() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final boolean A15() {
        return false;
    }

    public C23221P getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public C3772Pc getFullScreenAdStyle() {
        return new C3772Pc(true, C3772Pc.A06, super.A05.A0w().A01(), ViewOnClickListenerC4029Tl.A08(super.A05), super.A05.A0w().A01().A07(true), super.A05.A0x().A0D().A07());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public C3528Lg getTouchDataRecorder() {
        return super.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ, android.view.View
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

    private void setUpBrowserControls(C4045U1 c4045u1) {
        AbstractC3536Lo.A0J(this.A0E);
        C3629NJ c3629nj = new C3629NJ(this.A0U, c4045u1);
        this.A0E = c3629nj;
        c4045u1.setBrowserNavigationListener(c3629nj.getBrowserNavigationListener());
        AbstractC3536Lo.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new C3983T1(this));
        this.A0E.setOnTouchListener(new ViewOnTouchListenerC3766PW(this));
        this.A0A.addView(this.A0E, layoutParams);
        AbstractC3536Lo.A0J(this.A0F);
        this.A0F = new C3630NK(this.A0U, null, R.attr.progressBarStyleHorizontal);
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
