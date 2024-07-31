package p401vd;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0888a;
import de.AbstractC6896i;
import de.C6888a;
import de.C6891d;
import java.util.Map;
import p382ud.C11543l;
import p382ud.C11544m;

/* renamed from: vd.c */
/* loaded from: classes.dex */
public abstract class AbstractC11875c {

    /* renamed from: a */
    protected final AbstractC6896i f31390a;

    /* renamed from: b */
    final C11543l f31391b;

    /* renamed from: c */
    final LayoutInflater f31392c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11875c(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        this.f31391b = c11543l;
        this.f31392c = layoutInflater;
        this.f31390a = abstractC6896i;
    }

    /* renamed from: i */
    public static void m37976i(Button button, String str) {
        try {
            Drawable m4545i = C0888a.m4545i(button.getBackground());
            C0888a.m4542f(m4545i, Color.parseColor(str));
            button.setBackground(m4545i);
        } catch (IllegalArgumentException e10) {
            C11544m.m36186e("Error parsing background color: " + e10.toString());
        }
    }

    /* renamed from: k */
    public static void m37977k(Button button, C6891d c6891d) {
        String m19956b = c6891d.m19897c().m19956b();
        m37976i(button, c6891d.m19896b());
        button.setText(c6891d.m19897c().m19957c());
        button.setTextColor(Color.parseColor(m19956b));
    }

    /* renamed from: a */
    public boolean mo37966a() {
        return false;
    }

    /* renamed from: b */
    public C11543l mo37967b() {
        return this.f31391b;
    }

    /* renamed from: c */
    public abstract View mo37968c();

    /* renamed from: d */
    public View.OnClickListener mo37969d() {
        return null;
    }

    /* renamed from: e */
    public abstract ImageView mo37970e();

    /* renamed from: f */
    public abstract ViewGroup mo37971f();

    /* renamed from: g */
    public abstract ViewTreeObserver.OnGlobalLayoutListener mo37972g(Map<C6888a, View.OnClickListener> map, View.OnClickListener onClickListener);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m37978h(Button button, View.OnClickListener onClickListener) {
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void m37979j(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            C11544m.m36186e("Error parsing background color: " + e10.toString() + " color: " + str);
        }
    }
}
