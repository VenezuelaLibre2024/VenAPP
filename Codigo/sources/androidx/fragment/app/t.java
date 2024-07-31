package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.x0;
import androidx.fragment.app.b0;
import androidx.lifecycle.f;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a */
    private final m f4760a;

    /* renamed from: b */
    private final u f4761b;

    /* renamed from: c */
    private final Fragment f4762c;

    /* renamed from: d */
    private boolean f4763d = false;

    /* renamed from: e */
    private int f4764e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f4765a;

        a(View view) {
            this.f4765a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4765a.removeOnAttachStateChangeListener(this);
            x0.T(this.f4765a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4767a;

        static {
            int[] iArr = new int[f.b.values().length];
            f4767a = iArr;
            try {
                iArr[f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4767a[f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4767a[f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4767a[f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public t(m mVar, u uVar, Fragment fragment) {
        this.f4760a = mVar;
        this.f4761b = uVar;
        this.f4762c = fragment;
    }

    public t(m mVar, u uVar, Fragment fragment, s sVar) {
        this.f4760a = mVar;
        this.f4761b = uVar;
        this.f4762c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = sVar.f4759x;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public t(m mVar, u uVar, ClassLoader classLoader, j jVar, s sVar) {
        this.f4760a = mVar;
        this.f4761b = uVar;
        Fragment a10 = jVar.a(classLoader, sVar.f4747a);
        this.f4762c = a10;
        Bundle bundle = sVar.f4756u;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.setArguments(sVar.f4756u);
        a10.mWho = sVar.f4748b;
        a10.mFromLayout = sVar.f4749c;
        a10.mRestored = true;
        a10.mFragmentId = sVar.f4750d;
        a10.mContainerId = sVar.f4751e;
        a10.mTag = sVar.f4752f;
        a10.mRetainInstance = sVar.f4753r;
        a10.mRemoving = sVar.f4754s;
        a10.mDetached = sVar.f4755t;
        a10.mHidden = sVar.f4757v;
        a10.mMaxState = f.b.values()[sVar.f4758w];
        Bundle bundle2 = sVar.f4759x;
        a10.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (n.E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    private boolean l(View view) {
        if (view == this.f4762c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4762c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f4762c.performSaveInstanceState(bundle);
        this.f4760a.j(this.f4762c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4762c.mView != null) {
            s();
        }
        if (this.f4762c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4762c.mSavedViewState);
        }
        if (this.f4762c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4762c.mSavedViewRegistryState);
        }
        if (!this.f4762c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4762c.mUserVisibleHint);
        }
        return bundle;
    }

    public void a() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4762c);
        }
        Fragment fragment = this.f4762c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        m mVar = this.f4760a;
        Fragment fragment2 = this.f4762c;
        mVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int j10 = this.f4761b.j(this.f4762c);
        Fragment fragment = this.f4762c;
        fragment.mContainer.addView(fragment.mView, j10);
    }

    public void c() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4762c);
        }
        Fragment fragment = this.f4762c;
        Fragment fragment2 = fragment.mTarget;
        t tVar = null;
        if (fragment2 != null) {
            t m10 = this.f4761b.m(fragment2.mWho);
            if (m10 == null) {
                throw new IllegalStateException("Fragment " + this.f4762c + " declared target fragment " + this.f4762c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f4762c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            tVar = m10;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (tVar = this.f4761b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4762c + " declared target fragment " + this.f4762c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (tVar != null && (n.P || tVar.k().mState < 1)) {
            tVar.m();
        }
        Fragment fragment4 = this.f4762c;
        fragment4.mHost = fragment4.mFragmentManager.s0();
        Fragment fragment5 = this.f4762c;
        fragment5.mParentFragment = fragment5.mFragmentManager.v0();
        this.f4760a.g(this.f4762c, false);
        this.f4762c.performAttach();
        this.f4760a.b(this.f4762c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f4762c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i10 = this.f4764e;
        int i11 = b.f4767a[fragment2.mMaxState.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment3 = this.f4762c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i10 = Math.max(this.f4764e, 2);
                View view = this.f4762c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f4764e < 4 ? Math.min(i10, fragment3.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f4762c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        b0.e.b l10 = (!n.P || (viewGroup = (fragment = this.f4762c).mContainer) == null) ? null : b0.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        if (l10 == b0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (l10 == b0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f4762c;
            if (fragment4.mRemoving) {
                i10 = fragment4.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f4762c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f4762c);
        }
        return i10;
    }

    public void e() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4762c);
        }
        Fragment fragment = this.f4762c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f4762c.mState = 1;
            return;
        }
        this.f4760a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f4762c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        m mVar = this.f4760a;
        Fragment fragment3 = this.f4762c;
        mVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() {
        String str;
        if (this.f4762c.mFromLayout) {
            return;
        }
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4762c);
        }
        Fragment fragment = this.f4762c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f4762c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i10 = fragment2.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4762c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.n0().c(this.f4762c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f4762c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f4762c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4762c.mContainerId) + " (" + str + ") for fragment " + this.f4762c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f4762c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f4762c.mView;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4762c;
            fragment5.mView.setTag(d1.b.f13692a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f4762c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (x0.G(this.f4762c.mView)) {
                x0.T(this.f4762c.mView);
            } else {
                View view2 = this.f4762c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f4762c.performViewCreated();
            m mVar = this.f4760a;
            Fragment fragment7 = this.f4762c;
            mVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f4762c.mView.getVisibility();
            float alpha = this.f4762c.mView.getAlpha();
            if (n.P) {
                this.f4762c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f4762c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.f4762c.setFocusedView(findFocus);
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4762c);
                        }
                    }
                    this.f4762c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f4762c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z10 = true;
                }
                fragment9.mIsNewlyAdded = z10;
            }
        }
        this.f4762c.mState = 2;
    }

    public void g() {
        Fragment f10;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4762c);
        }
        Fragment fragment = this.f4762c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z11 || this.f4761b.o().p(this.f4762c))) {
            String str = this.f4762c.mTargetWho;
            if (str != null && (f10 = this.f4761b.f(str)) != null && f10.mRetainInstance) {
                this.f4762c.mTarget = f10;
            }
            this.f4762c.mState = 0;
            return;
        }
        k<?> kVar = this.f4762c.mHost;
        if (kVar instanceof k0) {
            z10 = this.f4761b.o().m();
        } else if (kVar.f() instanceof Activity) {
            z10 = true ^ ((Activity) kVar.f()).isChangingConfigurations();
        }
        if (z11 || z10) {
            this.f4761b.o().g(this.f4762c);
        }
        this.f4762c.performDestroy();
        this.f4760a.d(this.f4762c, false);
        for (t tVar : this.f4761b.k()) {
            if (tVar != null) {
                Fragment k10 = tVar.k();
                if (this.f4762c.mWho.equals(k10.mTargetWho)) {
                    k10.mTarget = this.f4762c;
                    k10.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f4762c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f4761b.f(str2);
        }
        this.f4761b.q(this);
    }

    public void h() {
        View view;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4762c);
        }
        Fragment fragment = this.f4762c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4762c.performDestroyView();
        this.f4760a.n(this.f4762c, false);
        Fragment fragment2 = this.f4762c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f4762c.mInLayout = false;
    }

    public void i() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4762c);
        }
        this.f4762c.performDetach();
        boolean z10 = false;
        this.f4760a.e(this.f4762c, false);
        Fragment fragment = this.f4762c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f4761b.o().p(this.f4762c)) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4762c);
            }
            this.f4762c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.f4762c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4762c);
            }
            Fragment fragment2 = this.f4762c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f4762c.mSavedFragmentState);
            View view = this.f4762c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4762c;
                fragment3.mView.setTag(d1.b.f13692a, fragment3);
                Fragment fragment4 = this.f4762c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4762c.performViewCreated();
                m mVar = this.f4760a;
                Fragment fragment5 = this.f4762c;
                mVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4762c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.f4762c;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4763d) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f4763d = true;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f4762c;
                int i10 = fragment.mState;
                if (d10 == i10) {
                    if (n.P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            b0 n10 = b0.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f4762c.mHidden) {
                                n10.c(this);
                            } else {
                                n10.e(this);
                            }
                        }
                        Fragment fragment2 = this.f4762c;
                        n nVar = fragment2.mFragmentManager;
                        if (nVar != null) {
                            nVar.C0(fragment2);
                        }
                        Fragment fragment3 = this.f4762c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (d10 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f4762c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (n.E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4762c);
                            }
                            Fragment fragment4 = this.f4762c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment5 = this.f4762c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                b0.n(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.f4762c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                b0.n(viewGroup2, fragment.getParentFragmentManager()).b(b0.e.c.h(this.f4762c.mView.getVisibility()), this);
                            }
                            this.f4762c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.f4763d = false;
        }
    }

    public void n() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4762c);
        }
        this.f4762c.performPause();
        this.f4760a.f(this.f4762c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f4762c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4762c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4762c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4762c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f4762c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4762c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f4762c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4762c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4762c);
        }
        View focusedView = this.f4762c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (n.E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4762c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4762c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4762c.setFocusedView(null);
        this.f4762c.performResume();
        this.f4760a.i(this.f4762c, false);
        Fragment fragment = this.f4762c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public s r() {
        s sVar = new s(this.f4762c);
        Fragment fragment = this.f4762c;
        if (fragment.mState <= -1 || sVar.f4759x != null) {
            sVar.f4759x = fragment.mSavedFragmentState;
        } else {
            Bundle q10 = q();
            sVar.f4759x = q10;
            if (this.f4762c.mTargetWho != null) {
                if (q10 == null) {
                    sVar.f4759x = new Bundle();
                }
                sVar.f4759x.putString("android:target_state", this.f4762c.mTargetWho);
                int i10 = this.f4762c.mTargetRequestCode;
                if (i10 != 0) {
                    sVar.f4759x.putInt("android:target_req_state", i10);
                }
            }
        }
        return sVar;
    }

    public void s() {
        if (this.f4762c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4762c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4762c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4762c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4762c.mSavedViewRegistryState = bundle;
    }

    public void t(int i10) {
        this.f4764e = i10;
    }

    public void u() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4762c);
        }
        this.f4762c.performStart();
        this.f4760a.k(this.f4762c, false);
    }

    public void v() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4762c);
        }
        this.f4762c.performStop();
        this.f4760a.l(this.f4762c, false);
    }
}
