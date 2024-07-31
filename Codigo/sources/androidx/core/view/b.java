package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3916a;

    /* renamed from: b, reason: collision with root package name */
    private a f3917b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0053b f3918c;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0053b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f3916a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f3918c = null;
        this.f3917b = null;
    }

    public void i(a aVar) {
        this.f3917b = aVar;
    }

    public void j(InterfaceC0053b interfaceC0053b) {
        if (this.f3918c != null && interfaceC0053b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3918c = interfaceC0053b;
    }
}
