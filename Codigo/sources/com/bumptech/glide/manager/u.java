package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class u extends Fragment {

    /* renamed from: a */
    private final com.bumptech.glide.manager.a f7523a;

    /* renamed from: b */
    private final r f7524b;

    /* renamed from: c */
    private final Set<u> f7525c;

    /* renamed from: d */
    private u f7526d;

    /* renamed from: e */
    private com.bumptech.glide.k f7527e;

    /* renamed from: f */
    private Fragment f7528f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements r {
        a() {
        }

        @Override // com.bumptech.glide.manager.r
        public Set<com.bumptech.glide.k> a() {
            Set<u> e10 = u.this.e();
            HashSet hashSet = new HashSet(e10.size());
            for (u uVar : e10) {
                if (uVar.h() != null) {
                    hashSet.add(uVar.h());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + u.this + "}";
        }
    }

    public u() {
        this(new com.bumptech.glide.manager.a());
    }

    public u(com.bumptech.glide.manager.a aVar) {
        this.f7524b = new a();
        this.f7525c = new HashSet();
        this.f7523a = aVar;
    }

    private void d(u uVar) {
        this.f7525c.add(uVar);
    }

    private Fragment g() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f7528f;
    }

    private static androidx.fragment.app.n i(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean j(Fragment fragment) {
        Fragment g10 = g();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(g10)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void k(Context context, androidx.fragment.app.n nVar) {
        n();
        u k10 = com.bumptech.glide.b.d(context).l().k(nVar);
        this.f7526d = k10;
        if (equals(k10)) {
            return;
        }
        this.f7526d.d(this);
    }

    private void l(u uVar) {
        this.f7525c.remove(uVar);
    }

    private void n() {
        u uVar = this.f7526d;
        if (uVar != null) {
            uVar.l(this);
            this.f7526d = null;
        }
    }

    Set<u> e() {
        u uVar = this.f7526d;
        if (uVar == null) {
            return Collections.emptySet();
        }
        if (equals(uVar)) {
            return Collections.unmodifiableSet(this.f7525c);
        }
        HashSet hashSet = new HashSet();
        for (u uVar2 : this.f7526d.e()) {
            if (j(uVar2.g())) {
                hashSet.add(uVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public com.bumptech.glide.manager.a f() {
        return this.f7523a;
    }

    public com.bumptech.glide.k h() {
        return this.f7527e;
    }

    public void m(Fragment fragment) {
        androidx.fragment.app.n i10;
        this.f7528f = fragment;
        if (fragment == null || fragment.getContext() == null || (i10 = i(fragment)) == null) {
            return;
        }
        k(fragment.getContext(), i10);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        androidx.fragment.app.n i10 = i(this);
        if (i10 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                k(getContext(), i10);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7523a.c();
        n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f7528f = null;
        n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f7523a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f7523a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + g() + "}";
    }
}
