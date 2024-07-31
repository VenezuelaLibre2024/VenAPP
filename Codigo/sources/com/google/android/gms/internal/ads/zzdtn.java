package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.v;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzdtn extends FrameLayout {
    private final v zza;

    public zzdtn(Context context, View view, v vVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = vVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt != null && (childAt instanceof zzcjk)) {
                arrayList.add((zzcjk) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((zzcjk) arrayList.get(i11)).destroy();
        }
    }
}
