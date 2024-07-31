package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public class FiamCardView extends CardView {

    /* renamed from: u, reason: collision with root package name */
    private yd.a f11945u;

    public FiamCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean a10 = this.f11945u.a(keyEvent);
        return a10 != null ? a10.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f11945u = new yd.a(this, onClickListener);
    }
}
