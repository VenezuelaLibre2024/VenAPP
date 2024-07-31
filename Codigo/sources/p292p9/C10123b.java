package p292p9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C4808d3;
import com.google.android.gms.internal.ads.zzcec;
import p438x8.AbstractC12359e;
import p438x8.C12367i;

/* renamed from: p9.b */
/* loaded from: classes.dex */
public final class C10123b extends ViewGroup {

    /* renamed from: a */
    private final C4808d3 f24859a;

    public AbstractC12359e getAdListener() {
        return this.f24859a.m12378d();
    }

    public C12367i getAdSize() {
        return this.f24859a.m12379e();
    }

    public String getAdUnitId() {
        return this.f24859a.m12386m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        C12367i c12367i;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                c12367i = getAdSize();
            } catch (NullPointerException e10) {
                zzcec.zzh("Unable to retrieve ad size.", e10);
                c12367i = null;
            }
            if (c12367i != null) {
                Context context = getContext();
                int m40003k = c12367i.m40003k(context);
                i12 = c12367i.m40001d(context);
                i13 = m40003k;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(AbstractC12359e abstractC12359e) {
        this.f24859a.m12393t(abstractC12359e);
    }

    public void setAdSize(C12367i c12367i) {
        this.f24859a.m12394u(c12367i);
    }

    public void setAdUnitId(String str) {
        this.f24859a.m12396w(str);
    }
}
