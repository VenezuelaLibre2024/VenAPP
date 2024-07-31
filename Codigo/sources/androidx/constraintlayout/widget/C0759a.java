package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p243n0.C9618a;
import p243n0.C9622e;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0759a extends AbstractC0761c {

    /* renamed from: u */
    private int f3485u;

    /* renamed from: v */
    private int f3486v;

    /* renamed from: w */
    private C9618a f3487w;

    public C0759a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000f, code lost:
    
        if (r6 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r6 == 6) goto L6;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3833t(p243n0.C9622e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f3486v = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f3485u
            if (r6 != r2) goto Lf
        Lc:
            r3.f3486v = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f3485u
            if (r6 != r2) goto L19
        L16:
            r3.f3486v = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof p243n0.C9618a
            if (r5 == 0) goto L27
            n0.a r4 = (p243n0.C9618a) r4
            int r5 = r3.f3486v
            r4.m28636x1(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0759a.m3833t(n0.e, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f3487w.m28630r1();
    }

    public int getMargin() {
        return this.f3487w.m28632t1();
    }

    public int getType() {
        return this.f3485u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0761c
    /* renamed from: m */
    public void mo3773m(AttributeSet attributeSet) {
        super.mo3773m(attributeSet);
        this.f3487w = new C9618a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0769k.f4003n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f4084w1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0769k.f4075v1) {
                    this.f3487w.m28635w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0769k.f4093x1) {
                    this.f3487w.m28637y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3500d = this.f3487w;
        m3855s();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761c
    /* renamed from: n */
    public void mo3834n(C9622e c9622e, boolean z10) {
        m3833t(c9622e, this.f3485u, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f3487w.m28635w1(z10);
    }

    public void setDpMargin(int i10) {
        this.f3487w.m28637y1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f3487w.m28637y1(i10);
    }

    public void setType(int i10) {
        this.f3485u = i10;
    }
}
