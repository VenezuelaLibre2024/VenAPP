package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.QJ */
/* loaded from: assets/audience_network.dex */
public final class C3815QJ extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    public C26817R A00;
    public WeakReference<InterfaceC3814QI> A01;
    public final InterfaceC3867R9 A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C3815QJ(C4337Yn c4337Yn, InterfaceC3867R9 interfaceC3867R9) {
        super(c4337Yn);
        this.A02 = interfaceC3867R9;
        AbstractC3536Lo.A0J((View) interfaceC3867R9);
        addView(interfaceC3867R9.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(AbstractC3822QQ abstractC3822QQ) {
        addView(abstractC3822QQ, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C26817R) abstractC3822QQ;
    }

    public final void A01(AbstractC3822QQ abstractC3822QQ) {
        AbstractC3536Lo.A0J(abstractC3822QQ);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8c();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C26817R c26817r = this.A00;
        if (c26817r != null) {
            c26817r.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r6 > r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        r5 = (r4 * r7) / r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (r6 > r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r6 == Integer.MIN_VALUE) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r4 <= r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r6 == Integer.MIN_VALUE) goto L43;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3815QJ.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(InterfaceC3814QI interfaceC3814QI) {
        this.A01 = new WeakReference<>(interfaceC3814QI);
    }
}
