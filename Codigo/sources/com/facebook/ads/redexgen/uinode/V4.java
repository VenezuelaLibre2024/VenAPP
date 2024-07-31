package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class V4 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC07237b {
    public static byte[] A02;
    public final C1399Yn A00;
    public final /* synthetic */ V2 A01;

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

    public V4(V2 v22, C1399Yn c1399Yn) {
        this.A01 = v22;
        this.A00 = c1399Yn;
    }

    public /* synthetic */ V4(V2 v22, C1399Yn c1399Yn, VD vd2) {
        this(v22, c1399Yn);
    }

    private Map<String, String> A01() {
        RE re2;
        C1058Lg c1058Lg;
        JS js;
        boolean z10;
        boolean z11;
        JS js2;
        C1112Ni c1112Ni = new C1112Ni();
        re2 = this.A01.A0R;
        C1112Ni A03 = c1112Ni.A03(re2);
        c1058Lg = this.A01.A0f;
        Map<String, String> A05 = A03.A02(c1058Lg).A05();
        js = this.A01.A0I;
        if (js != null) {
            js2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(js2.A04()));
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07237b
    public final C1399Yn A5t() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1058Lg c1058Lg;
        C1399Yn c1399Yn;
        C1058Lg c1058Lg2;
        C1399Yn c1399Yn2;
        C1058Lg c1058Lg3;
        C1058Lg c1058Lg4;
        if (KL.A02(this)) {
            return;
        }
        try {
            c1058Lg = this.A01.A0f;
            boolean A08 = c1058Lg.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1399Yn = this.A01.A0c;
            int minimumElapsedTime = C0988Ih.A0G(c1399Yn);
            if (minimumElapsedTime >= 0) {
                c1058Lg3 = this.A01.A0f;
                if (c1058Lg3.A03() < minimumElapsedTime) {
                    c1058Lg4 = this.A01.A0f;
                    if (!c1058Lg4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            c1058Lg2 = this.A01.A0f;
            c1399Yn2 = this.A01.A0c;
            if (c1058Lg2.A09(c1399Yn2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C1110Ng c1110Ng;
        C1110Ng c1110Ng2;
        View view3;
        View view4;
        C1110Ng c1110Ng3;
        C1110Ng c1110Ng4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c1110Ng = this.A01.A0L;
            if (c1110Ng != null) {
                c1110Ng2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c1110Ng2.setBounds(0, 0, width, view4.getHeight());
                c1110Ng3 = this.A01.A0L;
                c1110Ng4 = this.A01.A0L;
                c1110Ng3.A0D(!c1110Ng4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1058Lg c1058Lg;
        C1399Yn c1399Yn;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c1058Lg = this.A01.A0f;
        c1399Yn = this.A01.A0c;
        view2 = this.A01.A04;
        c1058Lg.A06(c1399Yn, motionEvent, view2, view);
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
