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
import androidx.core.view.C1116x0;
import androidx.fragment.app.AbstractC1258b0;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.InterfaceC1311k0;
import p052d1.C6816b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public class C1278t {

    /* renamed from: a */
    private final C1271m f5514a;

    /* renamed from: b */
    private final C1279u f5515b;

    /* renamed from: c */
    private final Fragment f5516c;

    /* renamed from: d */
    private boolean f5517d = false;

    /* renamed from: e */
    private int f5518e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.t$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f5519a;

        a(View view) {
            this.f5519a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f5519a.removeOnAttachStateChangeListener(this);
            C1116x0.m5255T(this.f5519a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.t$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5521a;

        static {
            int[] iArr = new int[AbstractC1300f.b.values().length];
            f5521a = iArr;
            try {
                iArr[AbstractC1300f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5521a[AbstractC1300f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5521a[AbstractC1300f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5521a[AbstractC1300f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1278t(C1271m c1271m, C1279u c1279u, Fragment fragment) {
        this.f5514a = c1271m;
        this.f5515b = c1279u;
        this.f5516c = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1278t(C1271m c1271m, C1279u c1279u, Fragment fragment, C1277s c1277s) {
        this.f5514a = c1271m;
        this.f5515b = c1279u;
        this.f5516c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = c1277s.f5513x;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1278t(C1271m c1271m, C1279u c1279u, ClassLoader classLoader, C1268j c1268j, C1277s c1277s) {
        this.f5514a = c1271m;
        this.f5515b = c1279u;
        Fragment mo6968a = c1268j.mo6968a(classLoader, c1277s.f5501a);
        this.f5516c = mo6968a;
        Bundle bundle = c1277s.f5510u;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo6968a.setArguments(c1277s.f5510u);
        mo6968a.mWho = c1277s.f5502b;
        mo6968a.mFromLayout = c1277s.f5503c;
        mo6968a.mRestored = true;
        mo6968a.mFragmentId = c1277s.f5504d;
        mo6968a.mContainerId = c1277s.f5505e;
        mo6968a.mTag = c1277s.f5506f;
        mo6968a.mRetainInstance = c1277s.f5507r;
        mo6968a.mRemoving = c1277s.f5508s;
        mo6968a.mDetached = c1277s.f5509t;
        mo6968a.mHidden = c1277s.f5511v;
        mo6968a.mMaxState = AbstractC1300f.b.values()[c1277s.f5512w];
        Bundle bundle2 = c1277s.f5513x;
        mo6968a.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo6968a);
        }
    }

    /* renamed from: l */
    private boolean m7158l(View view) {
        if (view == this.f5516c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f5516c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m7159q() {
        Bundle bundle = new Bundle();
        this.f5516c.performSaveInstanceState(bundle);
        this.f5514a.m6984j(this.f5516c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f5516c.mView != null) {
            m7176s();
        }
        if (this.f5516c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f5516c.mSavedViewState);
        }
        if (this.f5516c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f5516c.mSavedViewRegistryState);
        }
        if (!this.f5516c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f5516c.mUserVisibleHint);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7160a() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f5516c);
        }
        Fragment fragment = this.f5516c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C1271m c1271m = this.f5514a;
        Fragment fragment2 = this.f5516c;
        c1271m.m6975a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7161b() {
        int m7189j = this.f5515b.m7189j(this.f5516c);
        Fragment fragment = this.f5516c;
        fragment.mContainer.addView(fragment.mView, m7189j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m7162c() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f5516c);
        }
        Fragment fragment = this.f5516c;
        Fragment fragment2 = fragment.mTarget;
        C1278t c1278t = null;
        if (fragment2 != null) {
            C1278t m7192m = this.f5515b.m7192m(fragment2.mWho);
            if (m7192m == null) {
                throw new IllegalStateException("Fragment " + this.f5516c + " declared target fragment " + this.f5516c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f5516c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c1278t = m7192m;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c1278t = this.f5515b.m7192m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f5516c + " declared target fragment " + this.f5516c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c1278t != null && (AbstractC1272n.f5421P || c1278t.m7170k().mState < 1)) {
            c1278t.m7171m();
        }
        Fragment fragment4 = this.f5516c;
        fragment4.mHost = fragment4.mFragmentManager.m7101s0();
        Fragment fragment5 = this.f5516c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m7106v0();
        this.f5514a.m6981g(this.f5516c, false);
        this.f5516c.performAttach();
        this.f5514a.m6976b(this.f5516c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m7163d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f5516c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i10 = this.f5518e;
        int i11 = b.f5521a[fragment2.mMaxState.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment3 = this.f5516c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i10 = Math.max(this.f5518e, 2);
                View view = this.f5516c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f5518e < 4 ? Math.min(i10, fragment3.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f5516c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        AbstractC1258b0.e.b m6877l = (!AbstractC1272n.f5421P || (viewGroup = (fragment = this.f5516c).mContainer) == null) ? null : AbstractC1258b0.m6866n(viewGroup, fragment.getParentFragmentManager()).m6877l(this);
        if (m6877l == AbstractC1258b0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (m6877l == AbstractC1258b0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f5516c;
            if (fragment4.mRemoving) {
                i10 = fragment4.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f5516c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f5516c);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7164e() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f5516c);
        }
        Fragment fragment = this.f5516c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f5516c.mState = 1;
            return;
        }
        this.f5514a.m6982h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f5516c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C1271m c1271m = this.f5514a;
        Fragment fragment3 = this.f5516c;
        c1271m.m6977c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m7165f() {
        String str;
        if (this.f5516c.mFromLayout) {
            return;
        }
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f5516c);
        }
        Fragment fragment = this.f5516c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f5516c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i10 = fragment2.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f5516c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m7094n0().mo6828c(this.f5516c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f5516c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f5516c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f5516c.mContainerId) + " (" + str + ") for fragment " + this.f5516c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f5516c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f5516c.mView;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f5516c;
            fragment5.mView.setTag(C6816b.f15046a, fragment5);
            if (viewGroup != null) {
                m7161b();
            }
            Fragment fragment6 = this.f5516c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C1116x0.m5242G(this.f5516c.mView)) {
                C1116x0.m5255T(this.f5516c.mView);
            } else {
                View view2 = this.f5516c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f5516c.performViewCreated();
            C1271m c1271m = this.f5514a;
            Fragment fragment7 = this.f5516c;
            c1271m.m6987m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f5516c.mView.getVisibility();
            float alpha = this.f5516c.mView.getAlpha();
            if (AbstractC1272n.f5421P) {
                this.f5516c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f5516c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.f5516c.setFocusedView(findFocus);
                        if (AbstractC1272n.m6991E0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f5516c);
                        }
                    }
                    this.f5516c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f5516c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z10 = true;
                }
                fragment9.mIsNewlyAdded = z10;
            }
        }
        this.f5516c.mState = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m7166g() {
        Fragment m7185f;
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f5516c);
        }
        Fragment fragment = this.f5516c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z11 || this.f5515b.m7194o().m7154p(this.f5516c))) {
            String str = this.f5516c.mTargetWho;
            if (str != null && (m7185f = this.f5515b.m7185f(str)) != null && m7185f.mRetainInstance) {
                this.f5516c.mTarget = m7185f;
            }
            this.f5516c.mState = 0;
            return;
        }
        AbstractC1269k<?> abstractC1269k = this.f5516c.mHost;
        if (abstractC1269k instanceof InterfaceC1311k0) {
            z10 = this.f5515b.m7194o().m7151m();
        } else if (abstractC1269k.m6970f() instanceof Activity) {
            z10 = true ^ ((Activity) abstractC1269k.m6970f()).isChangingConfigurations();
        }
        if (z11 || z10) {
            this.f5515b.m7194o().m7146g(this.f5516c);
        }
        this.f5516c.performDestroy();
        this.f5514a.m6978d(this.f5516c, false);
        for (C1278t c1278t : this.f5515b.m7190k()) {
            if (c1278t != null) {
                Fragment m7170k = c1278t.m7170k();
                if (this.f5516c.mWho.equals(m7170k.mTargetWho)) {
                    m7170k.mTarget = this.f5516c;
                    m7170k.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f5516c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f5515b.m7185f(str2);
        }
        this.f5515b.m7196q(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m7167h() {
        View view;
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f5516c);
        }
        Fragment fragment = this.f5516c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f5516c.performDestroyView();
        this.f5514a.m6988n(this.f5516c, false);
        Fragment fragment2 = this.f5516c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f5516c.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7168i() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f5516c);
        }
        this.f5516c.performDetach();
        boolean z10 = false;
        this.f5514a.m6979e(this.f5516c, false);
        Fragment fragment = this.f5516c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f5515b.m7194o().m7154p(this.f5516c)) {
            if (AbstractC1272n.m6991E0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f5516c);
            }
            this.f5516c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m7169j() {
        Fragment fragment = this.f5516c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (AbstractC1272n.m6991E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f5516c);
            }
            Fragment fragment2 = this.f5516c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f5516c.mSavedFragmentState);
            View view = this.f5516c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f5516c;
                fragment3.mView.setTag(C6816b.f15046a, fragment3);
                Fragment fragment4 = this.f5516c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f5516c.performViewCreated();
                C1271m c1271m = this.f5514a;
                Fragment fragment5 = this.f5516c;
                c1271m.m6987m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f5516c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment m7170k() {
        return this.f5516c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m7171m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f5517d) {
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m7170k());
                return;
            }
            return;
        }
        try {
            this.f5517d = true;
            while (true) {
                int m7163d = m7163d();
                Fragment fragment = this.f5516c;
                int i10 = fragment.mState;
                if (m7163d == i10) {
                    if (AbstractC1272n.f5421P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            AbstractC1258b0 m6866n = AbstractC1258b0.m6866n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f5516c.mHidden) {
                                m6866n.m6870c(this);
                            } else {
                                m6866n.m6872e(this);
                            }
                        }
                        Fragment fragment2 = this.f5516c;
                        AbstractC1272n abstractC1272n = fragment2.mFragmentManager;
                        if (abstractC1272n != null) {
                            abstractC1272n.m7031C0(fragment2);
                        }
                        Fragment fragment3 = this.f5516c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (m7163d <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            m7168i();
                            break;
                        case 0:
                            m7166g();
                            break;
                        case 1:
                            m7167h();
                            this.f5516c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (AbstractC1272n.m6991E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f5516c);
                            }
                            Fragment fragment4 = this.f5516c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                m7176s();
                            }
                            Fragment fragment5 = this.f5516c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                AbstractC1258b0.m6866n(viewGroup3, fragment5.getParentFragmentManager()).m6871d(this);
                            }
                            this.f5516c.mState = 3;
                            break;
                        case 4:
                            m7179v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m7172n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            m7162c();
                            break;
                        case 1:
                            m7164e();
                            break;
                        case 2:
                            m7169j();
                            m7165f();
                            break;
                        case 3:
                            m7160a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                AbstractC1258b0.m6866n(viewGroup2, fragment.getParentFragmentManager()).m6869b(AbstractC1258b0.e.c.m6893h(this.f5516c.mView.getVisibility()), this);
                            }
                            this.f5516c.mState = 4;
                            break;
                        case 5:
                            m7178u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m7174p();
                            break;
                    }
                }
            }
        } finally {
            this.f5517d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m7172n() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f5516c);
        }
        this.f5516c.performPause();
        this.f5514a.m6980f(this.f5516c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m7173o(ClassLoader classLoader) {
        Bundle bundle = this.f5516c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f5516c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f5516c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f5516c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f5516c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f5516c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f5516c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f5516c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m7174p() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f5516c);
        }
        View focusedView = this.f5516c.getFocusedView();
        if (focusedView != null && m7158l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (AbstractC1272n.m6991E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f5516c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f5516c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f5516c.setFocusedView(null);
        this.f5516c.performResume();
        this.f5514a.m6983i(this.f5516c, false);
        Fragment fragment = this.f5516c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C1277s m7175r() {
        C1277s c1277s = new C1277s(this.f5516c);
        Fragment fragment = this.f5516c;
        if (fragment.mState <= -1 || c1277s.f5513x != null) {
            c1277s.f5513x = fragment.mSavedFragmentState;
        } else {
            Bundle m7159q = m7159q();
            c1277s.f5513x = m7159q;
            if (this.f5516c.mTargetWho != null) {
                if (m7159q == null) {
                    c1277s.f5513x = new Bundle();
                }
                c1277s.f5513x.putString("android:target_state", this.f5516c.mTargetWho);
                int i10 = this.f5516c.mTargetRequestCode;
                if (i10 != 0) {
                    c1277s.f5513x.putInt("android:target_req_state", i10);
                }
            }
        }
        return c1277s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m7176s() {
        if (this.f5516c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f5516c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f5516c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f5516c.mViewLifecycleOwner.m7271e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f5516c.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m7177t(int i10) {
        this.f5518e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m7178u() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f5516c);
        }
        this.f5516c.performStart();
        this.f5514a.m6985k(this.f5516c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m7179v() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f5516c);
        }
        this.f5516c.performStop();
        this.f5514a.m6986l(this.f5516c, false);
    }
}
