package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class FiamRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private yd.a f11947a;

    public FiamRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean a10 = this.f11947a.a(keyEvent);
        return a10 != null ? a10.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f11947a = new yd.a(this, onClickListener);
    }
}
