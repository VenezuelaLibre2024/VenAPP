package p466yd;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: yd.a */
/* loaded from: classes.dex */
public class C12671a {

    /* renamed from: a */
    private ViewGroup f34359a;

    /* renamed from: b */
    private View.OnClickListener f34360b;

    public C12671a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f34359a = viewGroup;
        this.f34360b = onClickListener;
    }

    /* renamed from: a */
    public Boolean m41695a(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f34360b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f34359a);
        return Boolean.TRUE;
    }
}
