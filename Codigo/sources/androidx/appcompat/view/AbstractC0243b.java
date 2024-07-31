package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.appcompat.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0243b {

    /* renamed from: a */
    private Object f1071a;

    /* renamed from: b */
    private boolean f1072b;

    /* renamed from: androidx.appcompat.view.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo1037a(AbstractC0243b abstractC0243b);

        /* renamed from: b */
        boolean mo1038b(AbstractC0243b abstractC0243b, Menu menu);

        /* renamed from: c */
        boolean mo1039c(AbstractC0243b abstractC0243b, MenuItem menuItem);

        /* renamed from: d */
        boolean mo1040d(AbstractC0243b abstractC0243b, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo1155c();

    /* renamed from: d */
    public abstract View mo1156d();

    /* renamed from: e */
    public abstract Menu mo1157e();

    /* renamed from: f */
    public abstract MenuInflater mo1158f();

    /* renamed from: g */
    public abstract CharSequence mo1159g();

    /* renamed from: h */
    public Object m1178h() {
        return this.f1071a;
    }

    /* renamed from: i */
    public abstract CharSequence mo1160i();

    /* renamed from: j */
    public boolean m1179j() {
        return this.f1072b;
    }

    /* renamed from: k */
    public abstract void mo1161k();

    /* renamed from: l */
    public abstract boolean mo1162l();

    /* renamed from: m */
    public abstract void mo1163m(View view);

    /* renamed from: n */
    public abstract void mo1164n(int i10);

    /* renamed from: o */
    public abstract void mo1165o(CharSequence charSequence);

    /* renamed from: p */
    public void m1180p(Object obj) {
        this.f1071a = obj;
    }

    /* renamed from: q */
    public abstract void mo1166q(int i10);

    /* renamed from: r */
    public abstract void mo1167r(CharSequence charSequence);

    /* renamed from: s */
    public void mo1168s(boolean z10) {
        this.f1072b = z10;
    }
}
