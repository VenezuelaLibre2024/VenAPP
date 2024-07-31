package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0202q;
import androidx.appcompat.view.AbstractC0243b;
import androidx.appcompat.widget.C0382w1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0777b;
import androidx.core.app.C0784c2;
import androidx.core.app.C0812m;
import androidx.core.os.C0949h;
import androidx.fragment.app.ActivityC1263e;
import androidx.lifecycle.C1313l0;
import androidx.lifecycle.C1315m0;
import androidx.savedstate.C1418a;
import p070e.InterfaceC7085b;
import p371u1.C11301e;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class ActivityC0221d extends ActivityC1263e implements InterfaceC0222e, C0784c2.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0224g mDelegate;
    private Resources mResources;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    public class a implements C1418a.c {
        a() {
        }

        @Override // androidx.savedstate.C1418a.c
        /* renamed from: a */
        public Bundle mo804a() {
            Bundle bundle = new Bundle();
            ActivityC0221d.this.getDelegate().mo932C(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC7085b {
        b() {
        }

        @Override // p070e.InterfaceC7085b
        /* renamed from: a */
        public void mo805a(Context context) {
            AbstractC0224g delegate = ActivityC0221d.this.getDelegate();
            delegate.mo953t();
            delegate.mo956y(ActivityC0221d.this.getSavedStateRegistry().m8116b(ActivityC0221d.DELEGATE_TAG));
        }
    }

    public ActivityC0221d() {
        initDelegate();
    }

    public ActivityC0221d(int i10) {
        super(i10);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m8121h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        C1313l0.m7366a(getWindow().getDecorView(), this);
        C1315m0.m7367a(getWindow().getDecorView(), this);
        C11301e.m35303a(getWindow().getDecorView(), this);
        C0202q.m814a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo944e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo946g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0218a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo878f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0803j, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0218a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo889q(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().mo947j(i10);
    }

    public AbstractC0224g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0224g.m922h(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0219b getDrawerToggleDelegate() {
        return getDelegate().mo949n();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo951q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C0382w1.m2040d()) {
            this.mResources = new C0382w1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0218a getSupportActionBar() {
        return getDelegate().mo952s();
    }

    @Override // androidx.core.app.C0784c2.a
    public Intent getSupportParentActivityIntent() {
        return C0812m.m4060a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo954u();
    }

    @Override // androidx.fragment.app.ActivityC1263e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo955x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C0784c2 c0784c2) {
        c0784c2.m3944d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1263e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo957z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onLocalesChanged(C0949h c0949h) {
    }

    @Override // androidx.fragment.app.ActivityC1263e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC0218a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo881i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNightModeChanged(int i10) {
    }

    @Override // androidx.fragment.app.ActivityC1263e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo930A(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1263e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo931B();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0784c2 c0784c2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1263e, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo933D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1263e, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo934E();
    }

    @Override // androidx.appcompat.app.InterfaceC0222e
    public void onSupportActionModeFinished(AbstractC0243b abstractC0243b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0222e
    public void onSupportActionModeStarted(AbstractC0243b abstractC0243b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C0784c2 m3942h = C0784c2.m3942h(this);
        onCreateSupportNavigateUpTaskStack(m3942h);
        onPrepareSupportNavigateUpTaskStack(m3942h);
        m3942h.m3946k();
        try {
            C0777b.m3911b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().mo942P(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0222e
    public AbstractC0243b onWindowStartingSupportActionMode(AbstractC0243b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0218a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo890r()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().mo936J(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo937K(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo938L(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo940N(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().mo941O(i10);
    }

    public AbstractC0243b startSupportActionMode(AbstractC0243b.a aVar) {
        return getDelegate().mo943Q(aVar);
    }

    @Override // androidx.fragment.app.ActivityC1263e
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo954u();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0812m.m4064e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().mo935H(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0812m.m4065f(this, intent);
    }
}
