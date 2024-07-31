package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.core.view.n2;

/* loaded from: classes.dex */
public interface o0 {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, m.a aVar);

    boolean e();

    void f();

    void g(Drawable drawable);

    Context getContext();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    boolean i();

    void j(int i10);

    Menu k();

    int l();

    n2 m(int i10, long j10);

    ViewGroup n();

    void o(boolean z10);

    void p();

    void q(boolean z10);

    void r();

    void s(d1 d1Var);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i10);

    void u(m.a aVar, g.a aVar2);

    void v(int i10);

    int w();

    void x();
}
