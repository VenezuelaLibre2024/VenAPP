package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.manager.p */
/* loaded from: classes.dex */
public class FragmentC2159p extends Fragment {

    /* renamed from: a */
    private final C2144a f8455a;

    /* renamed from: b */
    private final InterfaceC2161r f8456b;

    /* renamed from: c */
    private final Set<FragmentC2159p> f8457c;

    /* renamed from: d */
    private ComponentCallbacks2C2125k f8458d;

    /* renamed from: e */
    private FragmentC2159p f8459e;

    /* renamed from: f */
    private Fragment f8460f;

    /* renamed from: com.bumptech.glide.manager.p$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC2161r {
        a() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC2161r
        /* renamed from: a */
        public Set<ComponentCallbacks2C2125k> mo10806a() {
            Set<FragmentC2159p> m10816b = FragmentC2159p.this.m10816b();
            HashSet hashSet = new HashSet(m10816b.size());
            for (FragmentC2159p fragmentC2159p : m10816b) {
                if (fragmentC2159p.m10818e() != null) {
                    hashSet.add(fragmentC2159p.m10818e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC2159p.this + "}";
        }
    }

    public FragmentC2159p() {
        this(new C2144a());
    }

    FragmentC2159p(C2144a c2144a) {
        this.f8456b = new a();
        this.f8457c = new HashSet();
        this.f8455a = c2144a;
    }

    /* renamed from: a */
    private void m10810a(FragmentC2159p fragmentC2159p) {
        this.f8457c.add(fragmentC2159p);
    }

    /* renamed from: d */
    private Fragment m10811d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f8460f;
    }

    /* renamed from: g */
    private boolean m10812g(Fragment fragment) {
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

    /* renamed from: h */
    private void m10813h(Activity activity) {
        m10815l();
        FragmentC2159p m10835i = ComponentCallbacks2C2116b.m10641d(activity).m10656l().m10835i(activity);
        this.f8459e = m10835i;
        if (equals(m10835i)) {
            return;
        }
        this.f8459e.m10810a(this);
    }

    /* renamed from: i */
    private void m10814i(FragmentC2159p fragmentC2159p) {
        this.f8457c.remove(fragmentC2159p);
    }

    /* renamed from: l */
    private void m10815l() {
        FragmentC2159p fragmentC2159p = this.f8459e;
        if (fragmentC2159p != null) {
            fragmentC2159p.m10814i(this);
            this.f8459e = null;
        }
    }

    /* renamed from: b */
    Set<FragmentC2159p> m10816b() {
        if (equals(this.f8459e)) {
            return Collections.unmodifiableSet(this.f8457c);
        }
        if (this.f8459e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (FragmentC2159p fragmentC2159p : this.f8459e.m10816b()) {
            if (m10812g(fragmentC2159p.getParentFragment())) {
                hashSet.add(fragmentC2159p);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C2144a m10817c() {
        return this.f8455a;
    }

    /* renamed from: e */
    public ComponentCallbacks2C2125k m10818e() {
        return this.f8458d;
    }

    /* renamed from: f */
    public InterfaceC2161r m10819f() {
        return this.f8456b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m10820j(Fragment fragment) {
        this.f8460f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m10813h(fragment.getActivity());
    }

    /* renamed from: k */
    public void m10821k(ComponentCallbacks2C2125k componentCallbacks2C2125k) {
        this.f8458d = componentCallbacks2C2125k;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m10813h(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8455a.m10799c();
        m10815l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m10815l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8455a.m10800d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8455a.m10801e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m10811d() + "}";
    }
}
