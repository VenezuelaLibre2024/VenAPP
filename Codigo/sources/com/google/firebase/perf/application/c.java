package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import java.util.WeakHashMap;
import se.f;
import we.k;

/* loaded from: classes.dex */
public class c extends n.l {

    /* renamed from: f */
    private static final re.a f12235f = re.a.e();

    /* renamed from: a */
    private final WeakHashMap<Fragment, Trace> f12236a = new WeakHashMap<>();

    /* renamed from: b */
    private final com.google.firebase.perf.util.a f12237b;

    /* renamed from: c */
    private final k f12238c;

    /* renamed from: d */
    private final a f12239d;

    /* renamed from: e */
    private final d f12240e;

    public c(com.google.firebase.perf.util.a aVar, k kVar, a aVar2, d dVar) {
        this.f12237b = aVar;
        this.f12238c = kVar;
        this.f12239d = aVar2;
        this.f12240e = dVar;
    }

    @Override // androidx.fragment.app.n.l
    public void f(n nVar, Fragment fragment) {
        super.f(nVar, fragment);
        re.a aVar = f12235f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f12236a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f12236a.get(fragment);
        this.f12236a.remove(fragment);
        g<f.a> f10 = this.f12240e.f(fragment);
        if (!f10.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j.a(trace, f10.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.n.l
    public void i(n nVar, Fragment fragment) {
        super.i(nVar, fragment);
        f12235f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f12238c, this.f12237b, this.f12239d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f12236a.put(fragment, trace);
        this.f12240e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
