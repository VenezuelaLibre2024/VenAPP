package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.common.api.C5101a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TE */
/* loaded from: assets/audience_network.dex */
public class C3996TE extends AbstractC3644NY {
    public static byte[] A01;
    public final /* synthetic */ C3745PB A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        float f10 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean z10 = mode != 1073741824;
        boolean z11 = mode2 != 1073741824;
        int i12 = getResources().getDisplayMetrics().widthPixels;
        int i13 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int width = viewGroup.getWidth();
            i13 = C5101a.e.API_PRIORITY_OTHER;
            i12 = width != 0 ? viewGroup.getWidth() : C5101a.e.API_PRIORITY_OTHER;
            if (viewGroup.getHeight() != 0) {
                i13 = viewGroup.getHeight();
            }
        }
        int A012 = A01(dynamicWebViewWidth, i12, i10);
        int A013 = A01(dynamicWebViewHeight, i13, i11);
        if ((z11 || z10) && Math.abs((A012 / A013) - f10) > 1.0E-7d) {
            boolean z12 = false;
            if (z11) {
                A013 = (int) (A012 / f10);
                z12 = true;
            }
            if (!z12 && z10) {
                A012 = (int) (A013 * f10);
            }
        }
        setMeasuredDimension(A012, A013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3996TE(C3745PB c3745pb, C4337Yn c4337Yn) {
        super(c4337Yn);
        this.A00 = c3745pb;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i10, int i11, int i12) {
        int specMode = View.MeasureSpec.getMode(i12);
        int result = View.MeasureSpec.getSize(i12);
        switch (specMode) {
            case Integer.MIN_VALUE:
                return Math.min(Math.min(i10, result), i11);
            case 0:
                return Math.min(i10, i11);
            case 1073741824:
                return result;
            default:
                return i10;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3644NY
    public final WebChromeClient A0D() {
        return new C3740P6(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3644NY
    public final WebViewClient A0E() {
        return new C3741P7(this.A00);
    }

    private int getDynamicWebViewHeight() {
        AbstractC4476b5 abstractC4476b5;
        abstractC4476b5 = this.A00.A09;
        return abstractC4476b5.A0V().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        AbstractC4476b5 abstractC4476b5;
        abstractC4476b5 = this.A00.A09;
        return abstractC4476b5.A0V().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC3734P0 interfaceC3734P0;
        InterfaceC3734P0 interfaceC3734P02;
        interfaceC3734P0 = this.A00.A02;
        if (interfaceC3734P0 != null) {
            interfaceC3734P02 = this.A00.A02;
            interfaceC3734P02.ADL(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
