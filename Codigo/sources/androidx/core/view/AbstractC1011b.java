package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC1011b {

    /* renamed from: a */
    private final Context f4608a;

    /* renamed from: b */
    private a f4609b;

    /* renamed from: c */
    private b f4610c;

    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC1011b(Context context) {
        this.f4608a = context;
    }

    /* renamed from: a */
    public boolean mo1378a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1382b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1379c();

    /* renamed from: d */
    public View mo1383d(MenuItem menuItem) {
        return mo1379c();
    }

    /* renamed from: e */
    public boolean mo1380e() {
        return false;
    }

    /* renamed from: f */
    public void mo1381f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1384g() {
        return false;
    }

    /* renamed from: h */
    public void m4940h() {
        this.f4610c = null;
        this.f4609b = null;
    }

    /* renamed from: i */
    public void m4941i(a aVar) {
        this.f4609b = aVar;
    }

    /* renamed from: j */
    public void mo1385j(b bVar) {
        if (this.f4610c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4610c = bVar;
    }
}
