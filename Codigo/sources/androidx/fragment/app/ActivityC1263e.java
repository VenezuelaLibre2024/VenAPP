package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0199n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0211d;
import androidx.core.app.AbstractC0780b2;
import androidx.core.app.C0777b;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.C1309j0;
import androidx.lifecycle.C1312l;
import androidx.lifecycle.InterfaceC1311k0;
import androidx.loader.app.AbstractC1329a;
import androidx.savedstate.C1418a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p070e.InterfaceC7085b;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class ActivityC1263e extends ComponentActivity implements C0777b.f {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C1312l mFragmentLifecycleRegistry;
    final C1267i mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes.dex */
    public class a implements C1418a.c {
        a() {
        }

        @Override // androidx.savedstate.C1418a.c
        /* renamed from: a */
        public Bundle mo804a() {
            Bundle bundle = new Bundle();
            ActivityC1263e.this.markFragmentsCreated();
            ActivityC1263e.this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_STOP);
            Parcelable m6964x = ActivityC1263e.this.mFragments.m6964x();
            if (m6964x != null) {
                bundle.putParcelable(ActivityC1263e.FRAGMENTS_TAG, m6964x);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC7085b {
        b() {
        }

        @Override // p070e.InterfaceC7085b
        /* renamed from: a */
        public void mo805a(Context context) {
            ActivityC1263e.this.mFragments.m6942a(null);
            Bundle m8116b = ActivityC1263e.this.getSavedStateRegistry().m8116b(ActivityC1263e.FRAGMENTS_TAG);
            if (m8116b != null) {
                ActivityC1263e.this.mFragments.m6963w(m8116b.getParcelable(ActivityC1263e.FRAGMENTS_TAG));
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: classes.dex */
    class c extends AbstractC1269k<ActivityC1263e> implements InterfaceC1311k0, InterfaceC0199n, InterfaceC0211d, InterfaceC1276r {
        public c() {
            super(ActivityC1263e.this);
        }

        @Override // androidx.fragment.app.InterfaceC1276r
        /* renamed from: a */
        public void mo6928a(AbstractC1272n abstractC1272n, Fragment fragment) {
            ActivityC1263e.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC1269k, androidx.fragment.app.AbstractC1265g
        /* renamed from: c */
        public View mo6828c(int i10) {
            return ActivityC1263e.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC1269k, androidx.fragment.app.AbstractC1265g
        /* renamed from: d */
        public boolean mo6829d() {
            Window window = ActivityC1263e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.InterfaceC0211d
        public ActivityResultRegistry getActivityResultRegistry() {
            return ActivityC1263e.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1310k
        public AbstractC1300f getLifecycle() {
            return ActivityC1263e.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0199n
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC1263e.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.InterfaceC1311k0
        public C1309j0 getViewModelStore() {
            return ActivityC1263e.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1269k
        /* renamed from: i */
        public LayoutInflater mo6930i() {
            return ActivityC1263e.this.getLayoutInflater().cloneInContext(ActivityC1263e.this);
        }

        @Override // androidx.fragment.app.AbstractC1269k
        /* renamed from: k */
        public boolean mo6931k(Fragment fragment) {
            return !ActivityC1263e.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC1269k
        /* renamed from: l */
        public boolean mo6932l(String str) {
            return C0777b.m3919j(ActivityC1263e.this, str);
        }

        @Override // androidx.fragment.app.AbstractC1269k
        /* renamed from: o */
        public void mo6933o() {
            ActivityC1263e.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC1269k
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public ActivityC1263e mo6929h() {
            return ActivityC1263e.this;
        }
    }

    public ActivityC1263e() {
        this.mFragments = C1267i.m6941b(new c());
        this.mFragmentLifecycleRegistry = new C1312l(this);
        this.mStopped = true;
        init();
    }

    public ActivityC1263e(int i10) {
        super(i10);
        this.mFragments = C1267i.m6941b(new c());
        this.mFragmentLifecycleRegistry = new C1312l(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m8121h(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(AbstractC1272n abstractC1272n, AbstractC1300f.b bVar) {
        boolean z10 = false;
        for (Fragment fragment : abstractC1272n.m7100r0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), bVar);
                }
                C1284z c1284z = fragment.mViewLifecycleOwner;
                if (c1284z != null && c1284z.getLifecycle().mo7315b().m7325h(AbstractC1300f.b.STARTED)) {
                    fragment.mViewLifecycleOwner.m7272f(bVar);
                    z10 = true;
                }
                if (fragment.mLifecycleRegistry.mo7315b().m7325h(AbstractC1300f.b.STARTED)) {
                    fragment.mLifecycleRegistry.m7362n(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m6962v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC1329a.m7411b(this).mo7412a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m6960t().m7064W(str, fileDescriptor, printWriter, strArr);
    }

    public AbstractC1272n getSupportFragmentManager() {
        return this.mFragments.m6960t();
    }

    @Deprecated
    public AbstractC1329a getSupportLoaderManager() {
        return AbstractC1329a.m7411b(this);
    }

    void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), AbstractC1300f.b.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m6961u();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.m6961u();
        super.onConfigurationChanged(configuration);
        this.mFragments.m6944d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0803j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_CREATE);
        this.mFragments.m6946f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.mFragments.m6947g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m6948h();
        this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m6949i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mFragments.m6951k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.mFragments.m6945e(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.mFragments.m6950j(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.mFragments.m6961u();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.mFragments.m6952l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m6953m();
        this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.mFragments.m6954n(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.m6955o(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m6961u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m6961u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m6959s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_RESUME);
        this.mFragments.m6956p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m6961u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m6943c();
        }
        this.mFragments.m6959s();
        this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_START);
        this.mFragments.m6957q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m6961u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m6958r();
        this.mFragmentLifecycleRegistry.m7360h(AbstractC1300f.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC0780b2 abstractC0780b2) {
        C0777b.m3917h(this, abstractC0780b2);
    }

    public void setExitSharedElementCallback(AbstractC0780b2 abstractC0780b2) {
        C0777b.m3918i(this, abstractC0780b2);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            C0777b.m3920k(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            C0777b.m3921l(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C0777b.m3912c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0777b.m3914e(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0777b.m3922m(this);
    }

    @Override // androidx.core.app.C0777b.f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
