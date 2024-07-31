package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.AbstractC1272n;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.u */
/* loaded from: classes.dex */
public class C2164u extends Fragment {

    /* renamed from: a */
    private final C2144a f8490a;

    /* renamed from: b */
    private final InterfaceC2161r f8491b;

    /* renamed from: c */
    private final Set<C2164u> f8492c;

    /* renamed from: d */
    private C2164u f8493d;

    /* renamed from: e */
    private ComponentCallbacks2C2125k f8494e;

    /* renamed from: f */
    private Fragment f8495f;

    /* renamed from: com.bumptech.glide.manager.u$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC2161r {
        a() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC2161r
        /* renamed from: a */
        public Set<ComponentCallbacks2C2125k> mo10806a() {
            Set<C2164u> m10862e = C2164u.this.m10862e();
            HashSet hashSet = new HashSet(m10862e.size());
            for (C2164u c2164u : m10862e) {
                if (c2164u.m10864h() != null) {
                    hashSet.add(c2164u.m10864h());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C2164u.this + "}";
        }
    }

    public C2164u() {
        this(new C2144a());
    }

    public C2164u(C2144a c2144a) {
        this.f8491b = new a();
        this.f8492c = new HashSet();
        this.f8490a = c2144a;
    }

    /* renamed from: d */
    private void m10855d(C2164u c2164u) {
        this.f8492c.add(c2164u);
    }

    /* renamed from: g */
    private Fragment m10856g() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f8495f;
    }

    /* renamed from: i */
    private static AbstractC1272n m10857i(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: j */
    private boolean m10858j(Fragment fragment) {
        Fragment m10856g = m10856g();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(m10856g)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: k */
    private void m10859k(Context context, AbstractC1272n abstractC1272n) {
        m10861n();
        C2164u m10836k = ComponentCallbacks2C2116b.m10641d(context).m10656l().m10836k(abstractC1272n);
        this.f8493d = m10836k;
        if (equals(m10836k)) {
            return;
        }
        this.f8493d.m10855d(this);
    }

    /* renamed from: l */
    private void m10860l(C2164u c2164u) {
        this.f8492c.remove(c2164u);
    }

    /* renamed from: n */
    private void m10861n() {
        C2164u c2164u = this.f8493d;
        if (c2164u != null) {
            c2164u.m10860l(this);
            this.f8493d = null;
        }
    }

    /* renamed from: e */
    Set<C2164u> m10862e() {
        C2164u c2164u = this.f8493d;
        if (c2164u == null) {
            return Collections.emptySet();
        }
        if (equals(c2164u)) {
            return Collections.unmodifiableSet(this.f8492c);
        }
        HashSet hashSet = new HashSet();
        for (C2164u c2164u2 : this.f8493d.m10862e()) {
            if (m10858j(c2164u2.m10856g())) {
                hashSet.add(c2164u2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C2144a m10863f() {
        return this.f8490a;
    }

    /* renamed from: h */
    public ComponentCallbacks2C2125k m10864h() {
        return this.f8494e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m10865m(Fragment fragment) {
        AbstractC1272n m10857i;
        this.f8495f = fragment;
        if (fragment == null || fragment.getContext() == null || (m10857i = m10857i(fragment)) == null) {
            return;
        }
        m10859k(fragment.getContext(), m10857i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AbstractC1272n m10857i = m10857i(this);
        if (m10857i == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m10859k(getContext(), m10857i);
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
        this.f8490a.m10799c();
        m10861n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f8495f = null;
        m10861n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8490a.m10800d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8490a.m10801e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m10856g() + "}";
    }
}
