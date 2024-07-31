package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: u */
    private int f3081u;

    /* renamed from: v */
    private int f3082v;

    /* renamed from: w */
    private n0.a f3083w;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000f, code lost:
    
        if (r6 == 6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r6 == 6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void t(n0.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f3082v = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f3081u
            if (r6 != r2) goto Lf
        Lc:
            r3.f3082v = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f3081u
            if (r6 != r2) goto L19
        L16:
            r3.f3082v = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof n0.a
            if (r5 == 0) goto L27
            n0.a r4 = (n0.a) r4
            int r5 = r3.f3082v
            r4.x1(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.t(n0.e, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f3083w.r1();
    }

    public int getMargin() {
        return this.f3083w.t1();
    }

    public int getType() {
        return this.f3081u;
    }

    @Override // androidx.constraintlayout.widget.c
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f3083w = new n0.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f3352n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f3433w1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.f3424v1) {
                    this.f3083w.w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.f3442x1) {
                    this.f3083w.y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3096d = this.f3083w;
        s();
    }

    @Override // androidx.constraintlayout.widget.c
    public void n(n0.e eVar, boolean z10) {
        t(eVar, this.f3081u, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f3083w.w1(z10);
    }

    public void setDpMargin(int i10) {
        this.f3083w.y1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f3083w.y1(i10);
    }

    public void setType(int i10) {
        this.f3081u = i10;
    }
}
