package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.V4 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC4109V4 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC26897b {
    public static byte[] A02;
    public final C4337Yn A00;
    public final /* synthetic */ C4107V2 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{43, 14, 74, 9, 11, 4, 4, 5, 30, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, 24, 15, 74, 3, 30, 74, 3, 25, 74, 28, 3, 15, 29, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public ViewOnClickListenerC4109V4(C4107V2 c4107v2, C4337Yn c4337Yn) {
        this.A01 = c4107v2;
        this.A00 = c4337Yn;
    }

    public /* synthetic */ ViewOnClickListenerC4109V4(C4107V2 c4107v2, C4337Yn c4337Yn, C4118VD c4118vd) {
        this(c4107v2, c4337Yn);
    }

    private Map<String, String> A01() {
        C3872RE c3872re;
        C3528Lg c3528Lg;
        EnumC3395JS enumC3395JS;
        boolean z10;
        boolean z11;
        EnumC3395JS enumC3395JS2;
        C3654Ni c3654Ni = new C3654Ni();
        c3872re = this.A01.A0R;
        C3654Ni A03 = c3654Ni.A03(c3872re);
        c3528Lg = this.A01.A0f;
        Map<String, String> A05 = A03.A02(c3528Lg).A05();
        enumC3395JS = this.A01.A0I;
        if (enumC3395JS != null) {
            enumC3395JS2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(enumC3395JS2.A04()));
        }
        z10 = this.A01.A0W;
        if (z10) {
            z11 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z11));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26897b
    public final C4337Yn A5t() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3528Lg c3528Lg;
        C4337Yn c4337Yn;
        C3528Lg c3528Lg2;
        C4337Yn c4337Yn2;
        C3528Lg c3528Lg3;
        C3528Lg c3528Lg4;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            c3528Lg = this.A01.A0f;
            boolean A08 = c3528Lg.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c4337Yn = this.A01.A0c;
            int minimumElapsedTime = C3348Ih.A0G(c4337Yn);
            if (minimumElapsedTime >= 0) {
                c3528Lg3 = this.A01.A0f;
                if (c3528Lg3.A03() < minimumElapsedTime) {
                    c3528Lg4 = this.A01.A0f;
                    if (!c3528Lg4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            c3528Lg2 = this.A01.A0f;
            c4337Yn2 = this.A01.A0c;
            if (c3528Lg2.A09(c4337Yn2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C3652Ng c3652Ng;
        C3652Ng c3652Ng2;
        View view3;
        View view4;
        C3652Ng c3652Ng3;
        C3652Ng c3652Ng4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c3652Ng = this.A01.A0L;
            if (c3652Ng != null) {
                c3652Ng2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c3652Ng2.setBounds(0, 0, width, view4.getHeight());
                c3652Ng3 = this.A01.A0L;
                c3652Ng4 = this.A01.A0L;
                c3652Ng3.A0D(!c3652Ng4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C3528Lg c3528Lg;
        C4337Yn c4337Yn;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c3528Lg = this.A01.A0f;
        c4337Yn = this.A01.A0c;
        view2 = this.A01.A04;
        c3528Lg.A06(c4337Yn, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
