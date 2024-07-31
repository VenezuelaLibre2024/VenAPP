package vd;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Map;
import ud.l;
import ud.m;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    protected final de.i f28956a;

    /* renamed from: b */
    final l f28957b;

    /* renamed from: c */
    final LayoutInflater f28958c;

    public c(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        this.f28957b = lVar;
        this.f28958c = layoutInflater;
        this.f28956a = iVar;
    }

    public static void i(Button button, String str) {
        try {
            Drawable i10 = androidx.core.graphics.drawable.a.i(button.getBackground());
            androidx.core.graphics.drawable.a.f(i10, Color.parseColor(str));
            button.setBackground(i10);
        } catch (IllegalArgumentException e10) {
            m.e("Error parsing background color: " + e10.toString());
        }
    }

    public static void k(Button button, de.d dVar) {
        String b10 = dVar.c().b();
        i(button, dVar.b());
        button.setText(dVar.c().c());
        button.setTextColor(Color.parseColor(b10));
    }

    public boolean a() {
        return false;
    }

    public l b() {
        return this.f28957b;
    }

    public abstract View c();

    public View.OnClickListener d() {
        return null;
    }

    public abstract ImageView e();

    public abstract ViewGroup f();

    public abstract ViewTreeObserver.OnGlobalLayoutListener g(Map<de.a, View.OnClickListener> map, View.OnClickListener onClickListener);

    public void h(Button button, View.OnClickListener onClickListener) {
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public void j(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            m.e("Error parsing background color: " + e10.toString() + " color: " + str);
        }
    }
}
