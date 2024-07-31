package p9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.d3;
import com.google.android.gms.internal.ads.zzcec;
import x8.e;
import x8.i;

/* loaded from: classes.dex */
public final class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final d3 f22926a;

    public e getAdListener() {
        return this.f22926a.d();
    }

    public i getAdSize() {
        return this.f22926a.e();
    }

    public String getAdUnitId() {
        return this.f22926a.m();
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
        i iVar;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                iVar = getAdSize();
            } catch (NullPointerException e10) {
                zzcec.zzh("Unable to retrieve ad size.", e10);
                iVar = null;
            }
            if (iVar != null) {
                Context context = getContext();
                int k10 = iVar.k(context);
                i12 = iVar.d(context);
                i13 = k10;
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

    public void setAdListener(e eVar) {
        this.f22926a.t(eVar);
    }

    public void setAdSize(i iVar) {
        this.f22926a.u(iVar);
    }

    public void setAdUnitId(String str) {
        this.f22926a.w(str);
    }
}
