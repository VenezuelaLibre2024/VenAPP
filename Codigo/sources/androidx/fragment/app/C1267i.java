package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0984h;
import androidx.lifecycle.InterfaceC1311k0;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public class C1267i {

    /* renamed from: a */
    private final AbstractC1269k<?> f5406a;

    private C1267i(AbstractC1269k<?> abstractC1269k) {
        this.f5406a = abstractC1269k;
    }

    /* renamed from: b */
    public static C1267i m6941b(AbstractC1269k<?> abstractC1269k) {
        return new C1267i((AbstractC1269k) C0984h.m4834l(abstractC1269k, "callbacks == null"));
    }

    /* renamed from: a */
    public void m6942a(Fragment fragment) {
        AbstractC1269k<?> abstractC1269k = this.f5406a;
        abstractC1269k.f5412e.m7087k(abstractC1269k, abstractC1269k, fragment);
    }

    /* renamed from: c */
    public void m6943c() {
        this.f5406a.f5412e.m7110y();
    }

    /* renamed from: d */
    public void m6944d(Configuration configuration) {
        this.f5406a.f5412e.m7026A(configuration);
    }

    /* renamed from: e */
    public boolean m6945e(MenuItem menuItem) {
        return this.f5406a.f5412e.m7028B(menuItem);
    }

    /* renamed from: f */
    public void m6946f() {
        this.f5406a.f5412e.m7030C();
    }

    /* renamed from: g */
    public boolean m6947g(Menu menu, MenuInflater menuInflater) {
        return this.f5406a.f5412e.m7032D(menu, menuInflater);
    }

    /* renamed from: h */
    public void m6948h() {
        this.f5406a.f5412e.m7034E();
    }

    /* renamed from: i */
    public void m6949i() {
        this.f5406a.f5412e.m7036G();
    }

    /* renamed from: j */
    public void m6950j(boolean z10) {
        this.f5406a.f5412e.m7038H(z10);
    }

    /* renamed from: k */
    public boolean m6951k(MenuItem menuItem) {
        return this.f5406a.f5412e.m7042J(menuItem);
    }

    /* renamed from: l */
    public void m6952l(Menu menu) {
        this.f5406a.f5412e.m7044K(menu);
    }

    /* renamed from: m */
    public void m6953m() {
        this.f5406a.f5412e.m7047M();
    }

    /* renamed from: n */
    public void m6954n(boolean z10) {
        this.f5406a.f5412e.m7049N(z10);
    }

    /* renamed from: o */
    public boolean m6955o(Menu menu) {
        return this.f5406a.f5412e.m7050O(menu);
    }

    /* renamed from: p */
    public void m6956p() {
        this.f5406a.f5412e.m7054Q();
    }

    /* renamed from: q */
    public void m6957q() {
        this.f5406a.f5412e.m7056R();
    }

    /* renamed from: r */
    public void m6958r() {
        this.f5406a.f5412e.m7059T();
    }

    /* renamed from: s */
    public boolean m6959s() {
        return this.f5406a.f5412e.m7068a0(true);
    }

    /* renamed from: t */
    public AbstractC1272n m6960t() {
        return this.f5406a.f5412e;
    }

    /* renamed from: u */
    public void m6961u() {
        this.f5406a.f5412e.m7058S0();
    }

    /* renamed from: v */
    public View m6962v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f5406a.f5412e.m7103t0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m6963w(Parcelable parcelable) {
        AbstractC1269k<?> abstractC1269k = this.f5406a;
        if (!(abstractC1269k instanceof InterfaceC1311k0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC1269k.f5412e.m7079g1(parcelable);
    }

    /* renamed from: x */
    public Parcelable m6964x() {
        return this.f5406a.f5412e.m7084i1();
    }
}
