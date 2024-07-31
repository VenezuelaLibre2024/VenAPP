package yd;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f31823a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnClickListener f31824b;

    public a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f31823a = viewGroup;
        this.f31824b = onClickListener;
    }

    public Boolean a(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f31824b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f31823a);
        return Boolean.TRUE;
    }
}
