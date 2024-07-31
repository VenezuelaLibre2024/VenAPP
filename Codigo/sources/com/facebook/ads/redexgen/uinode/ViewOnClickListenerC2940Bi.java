package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bi */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC2940Bi extends C4072UT implements View.OnClickListener, View.OnTouchListener {
    public static int A09;
    public static int A0A;
    public static int A0B;
    public static int A0C;
    public static int A0D;
    public static byte[] A0E;
    public static String[] A0F = {"vfTLnFhfSR04yeCwpvXggcuo0R5", "ZWqkUfXAT4shJrSnLwE7AR", "uDvCFU1cpeIDU20c5XpSWP5NsJK", "LZCc6xsCgIvsqlWtLYm2xpoo9wVjlUK6", "XWtwisYBczvYKAmZU1o9rLXCsVE6mj6U", "L5HF9ROWNN8fhzCl", "opMnHAf4pzNwIHSRqseTLBuOcV2JnA3E", "J4YnYXEx7z1RD4kZFuYo5ZRCwoH6qkZ0"};
    public int A00;
    public int A01;
    public C3377JA A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final InputMethodManager A06;
    public final Runnable A07;
    public final String A08;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 39);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{18, 29, 24, 18, 26, 46, 2, 30, 4, 3, 18, 20, 50, 62, 60, Byte.MAX_VALUE, 55, 48, 50, 52, 51, 62, 62, 58, Byte.MAX_VALUE, 48, 53, 34, Byte.MAX_VALUE, 51, 48, 63, 63, 52, 35, Byte.MAX_VALUE, 50, 61, 56, 50, 58, 52, 53, 46, 34, 32, 99, 43, 44, 46, 40, 47, 34, 34, 38, 99, 44, 41, 62, 99, 36, 35, 57, 40, 63, 62, 57, 36, 57, 36, 44, 33, 99, 46, 33, 36, 46, 38, 40, 41, 91, 87, 85, 22, 94, 89, 91, 93, 90, 87, 87, 83, 22, 89, 92, 75, 22, 86, 89, 76, 81, 78, 93, 22, 89, 92, 103, 91, 84, 81, 91, 83, 88, 95, 65, 68, 69, 110, 92, 84, 69, 89, 94, 85, 4, 2, 20, 3, 46, 19, 4, 23, 23, 20, 3, 20, 21, 46, 18, 29, 24, 18, 26, 46, 24, 16, 19, 46, 18, 29, 24, 18, 26, 2, 20, 18, 4, 19, 62, 3, 20, 7, 7, 4, 19, 4, 5, 62, 2, 13, 8, 2, 10, 62, 8, 0, 3, 62, 21, 24, 17, 8, 15, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.C4072UT
    public final void A0F() {
        AbstractC3536Lo.A0M(this, 1610612736);
        setPadding(getResources().getConfiguration().orientation);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i10 = A0A;
        gradientDrawable.setCornerRadii(new float[]{i10, i10, i10, i10, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(-1);
        this.A0B.setBackground(gradientDrawable);
        this.A0B.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.ME
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ViewOnClickListenerC2940Bi.A0B(view, motionEvent);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(this.A0B, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0B.getId());
        layoutParams2.addRule(12);
        this.A0E.setBackgroundColor(-1);
        addView(this.A0E, layoutParams2);
        this.A0E.setOnTouchListener(this);
        setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (AbstractC3499LD.A02 * 2.0f));
        layoutParams3.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        addView(this.A0C, layoutParams3);
        A06();
        this.A0A.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    static {
        A09();
        A0B = 450;
        A09 = 500;
        A0A = 50;
        A0D = 450;
        A0C = 150;
    }

    public ViewOnClickListenerC2940Bi(C25735V c25735v, C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, String str, int i10) {
        super(c25735v, c4337Yn, interfaceC3369J2, interfaceC3560MC);
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A07 = new RunnableC3563MF(this);
        this.A08 = str;
        this.A05 = new Handler(Looper.getMainLooper());
        this.A06 = (InputMethodManager) c4337Yn.getSystemService(A05(112, 12, 22));
        this.A04 = i10;
    }

    public static /* synthetic */ int A02(ViewOnClickListenerC2940Bi viewOnClickListenerC2940Bi) {
        int i10 = viewOnClickListenerC2940Bi.A00;
        viewOnClickListenerC2940Bi.A00 = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        AbstractC3536Lo.A0M(this, 1610612736);
    }

    private void A07() {
        if (this.A08 == null) {
            return;
        }
        if (AdPlacementType.BANNER.name().equals(this.A08)) {
            super.A07.A0P(A05(12, 31, 118), null);
            return;
        }
        if (AdPlacementType.NATIVE.name().equals(this.A08)) {
            super.A07.A0P(A05(80, 32, 31), null);
            return;
        }
        String name = AdPlacementType.INTERSTITIAL.name();
        String str = this.A08;
        if (A0F[4].charAt(16) == 's') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "8IzRIUJb9efYPKAtJhwGPycbwOZ";
        strArr[0] = "TYtUym7r2NCZhHy5XAtvyYbKtYz";
        if (name.equals(str)) {
            super.A07.A0P(A05(43, 37, 106), null);
            return;
        }
        AdPlacementType adPlacementType = AdPlacementType.REWARDED_VIDEO;
        if (A0F[1].length() != 22) {
            A0F[4] = "SFf1ftnlqD0kN47UujIaTMcIpRdH9pNa";
            if (!adPlacementType.name().equals(this.A08)) {
                return;
            }
        } else {
            A0F[5] = "xl3LAAZMJtlBjKhfgYaNvWZdB";
            if (!adPlacementType.name().equals(this.A08)) {
                return;
            }
        }
        super.A07.A0P(EnumC3821QP.A04.A02(), null);
    }

    private void A08() {
        AbstractC3536Lo.A0M(this, 0);
    }

    public static /* synthetic */ boolean A0B(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4072UT
    public final InterfaceC3638NS A0E() {
        return new C4076UX(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4072UT
    public final void A0G() {
        A08();
        super.A07.A0J().overridePendingTransition(0, 0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels);
        translateAnimation.setDuration(A09);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC3565MH(this));
        startAnimation(translateAnimation);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4072UT
    public final void A0H(String str) {
        if (this.A04 > 0 && !this.A03) {
            this.A03 = true;
            this.A05.removeCallbacksAndMessages(null);
            Map<String, String> A05 = new C3654Ni().A03(null).A02(null).A05();
            A05.put(A05(0, 12, 86), str);
            C3377JA c3377ja = this.A02;
            if (c3377ja != null) {
                c3377ja.A04(EnumC3376J9.A0J, A05);
            }
            A07();
            this.A09.A9j(super.A04, A05);
            if (C3348Ih.A20(super.A08)) {
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC4506bZ.A03, Boolean.TRUE.toString());
                hashMap.put(AbstractC4506bZ.A04, Boolean.TRUE.toString());
                hashMap.put(AbstractC4506bZ.A05, Boolean.TRUE.toString());
                this.A09.A9s(super.A04, hashMap);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4072UT, com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void A9Q(Intent intent, Bundle bundle, C25735V c25735v) {
        super.A9Q(intent, bundle, c25735v);
        this.A02 = new C3377JA(super.A04, this.A09);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A08();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(A0B);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC3564MG(this));
        startAnimation(translateAnimation);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            A0G();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPadding(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4072UT, com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        super.onDestroy();
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                InputMethodManager inputMethodManager = this.A06;
                if (A0F[3].charAt(27) != 'j') {
                    A0F[3] = "Hgev4doSvbcbElmdNlOVsn7Rf5RjbGzx";
                    if (inputMethodManager == null) {
                        return false;
                    }
                } else {
                    String[] strArr = A0F;
                    strArr[2] = "qGqyMKbBFDFRjfgCXxgALDISrIL";
                    strArr[0] = "EN7i1IUPYbUCnP9fW5N1h9YqXh6";
                    if (inputMethodManager == null) {
                        return false;
                    }
                }
                boolean isAcceptingText = inputMethodManager.isAcceptingText();
                if (A0F[1].length() != 22) {
                    throw new RuntimeException();
                }
                A0F[4] = "madM7u7tjAexKCWlkxQmLTMOJOLS0YZT";
                if (!isAcceptingText) {
                    return false;
                }
                A0H(A05(154, 30, 70));
                return false;
            case 1:
                int i10 = this.A01;
                String[] strArr2 = A0F;
                if (strArr2[7].charAt(9) != strArr2[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[4] = "Huh8TFUZudwEPF459QqvFaUogfM154L9";
                int i11 = i10 + 1;
                this.A01 = i11;
                if (i11 < 5) {
                    return false;
                }
                A0H(A05(124, 30, 86));
                return false;
            default:
                return false;
        }
    }

    private void setPadding(int i10) {
        if (i10 == 2) {
            setPadding(0, A0C, 0, 0);
        } else {
            setPadding(0, A0D, 0, 0);
        }
    }
}
