package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final k<?> f4668a;

    private i(k<?> kVar) {
        this.f4668a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) androidx.core.util.h.l(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f4668a;
        kVar.f4674e.k(kVar, kVar, fragment);
    }

    public void c() {
        this.f4668a.f4674e.y();
    }

    public void d(Configuration configuration) {
        this.f4668a.f4674e.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f4668a.f4674e.B(menuItem);
    }

    public void f() {
        this.f4668a.f4674e.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f4668a.f4674e.D(menu, menuInflater);
    }

    public void h() {
        this.f4668a.f4674e.E();
    }

    public void i() {
        this.f4668a.f4674e.G();
    }

    public void j(boolean z10) {
        this.f4668a.f4674e.H(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f4668a.f4674e.J(menuItem);
    }

    public void l(Menu menu) {
        this.f4668a.f4674e.K(menu);
    }

    public void m() {
        this.f4668a.f4674e.M();
    }

    public void n(boolean z10) {
        this.f4668a.f4674e.N(z10);
    }

    public boolean o(Menu menu) {
        return this.f4668a.f4674e.O(menu);
    }

    public void p() {
        this.f4668a.f4674e.Q();
    }

    public void q() {
        this.f4668a.f4674e.R();
    }

    public void r() {
        this.f4668a.f4674e.T();
    }

    public boolean s() {
        return this.f4668a.f4674e.a0(true);
    }

    public n t() {
        return this.f4668a.f4674e;
    }

    public void u() {
        this.f4668a.f4674e.S0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4668a.f4674e.t0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f4668a;
        if (!(kVar instanceof k0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f4674e.g1(parcelable);
    }

    public Parcelable x() {
        return this.f4668a.f4674e.i1();
    }
}
