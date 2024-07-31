package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class p extends Fragment {

    /* renamed from: a */
    private final com.bumptech.glide.manager.a f7488a;

    /* renamed from: b */
    private final r f7489b;

    /* renamed from: c */
    private final Set<p> f7490c;

    /* renamed from: d */
    private com.bumptech.glide.k f7491d;

    /* renamed from: e */
    private p f7492e;

    /* renamed from: f */
    private Fragment f7493f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements r {
        a() {
        }

        @Override // com.bumptech.glide.manager.r
        public Set<com.bumptech.glide.k> a() {
            Set<p> b10 = p.this.b();
            HashSet hashSet = new HashSet(b10.size());
            for (p pVar : b10) {
                if (pVar.e() != null) {
                    hashSet.add(pVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + p.this + "}";
        }
    }

    public p() {
        this(new com.bumptech.glide.manager.a());
    }

    p(com.bumptech.glide.manager.a aVar) {
        this.f7489b = new a();
        this.f7490c = new HashSet();
        this.f7488a = aVar;
    }

    private void a(p pVar) {
        this.f7490c.add(pVar);
    }

    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f7493f;
    }

    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        p i10 = com.bumptech.glide.b.d(activity).l().i(activity);
        this.f7492e = i10;
        if (equals(i10)) {
            return;
        }
        this.f7492e.a(this);
    }

    private void i(p pVar) {
        this.f7490c.remove(pVar);
    }

    private void l() {
        p pVar = this.f7492e;
        if (pVar != null) {
            pVar.i(this);
            this.f7492e = null;
        }
    }

    Set<p> b() {
        if (equals(this.f7492e)) {
            return Collections.unmodifiableSet(this.f7490c);
        }
        if (this.f7492e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (p pVar : this.f7492e.b()) {
            if (g(pVar.getParentFragment())) {
                hashSet.add(pVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public com.bumptech.glide.manager.a c() {
        return this.f7488a;
    }

    public com.bumptech.glide.k e() {
        return this.f7491d;
    }

    public r f() {
        return this.f7489b;
    }

    public void j(Fragment fragment) {
        this.f7493f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(com.bumptech.glide.k kVar) {
        this.f7491d = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7488a.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f7488a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f7488a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }
}
