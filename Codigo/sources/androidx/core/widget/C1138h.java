package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public class C1138h extends AbstractViewOnTouchListenerC1131a {

    /* renamed from: D */
    private final ListView f4782D;

    public C1138h(ListView listView) {
        super(listView);
        this.f4782D = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC1131a
    /* renamed from: a */
    public boolean mo5507a(int i10) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC1131a
    /* renamed from: b */
    public boolean mo5508b(int i10) {
        ListView listView = this.f4782D;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC1131a
    /* renamed from: j */
    public void mo5510j(int i10, int i11) {
        C1139i.m5568b(this.f4782D, i11);
    }
}
