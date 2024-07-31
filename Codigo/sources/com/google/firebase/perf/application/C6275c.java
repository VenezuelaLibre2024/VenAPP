package com.google.firebase.perf.application;

import androidx.fragment.app.AbstractC1272n;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.C6327a;
import com.google.firebase.perf.util.C6333g;
import com.google.firebase.perf.util.C6336j;
import java.util.WeakHashMap;
import p422we.C12178k;
import re.C10696a;
import se.C10907f;

/* renamed from: com.google.firebase.perf.application.c */
/* loaded from: classes.dex */
public class C6275c extends AbstractC1272n.l {

    /* renamed from: f */
    private static final C10696a f13454f = C10696a.m32565e();

    /* renamed from: a */
    private final WeakHashMap<Fragment, Trace> f13455a = new WeakHashMap<>();

    /* renamed from: b */
    private final C6327a f13456b;

    /* renamed from: c */
    private final C12178k f13457c;

    /* renamed from: d */
    private final C6273a f13458d;

    /* renamed from: e */
    private final C6276d f13459e;

    public C6275c(C6327a c6327a, C12178k c12178k, C6273a c6273a, C6276d c6276d) {
        this.f13456b = c6327a;
        this.f13457c = c12178k;
        this.f13458d = c6273a;
        this.f13459e = c6276d;
    }

    @Override // androidx.fragment.app.AbstractC1272n.l
    /* renamed from: f */
    public void mo7127f(AbstractC1272n abstractC1272n, Fragment fragment) {
        super.mo7127f(abstractC1272n, fragment);
        C10696a c10696a = f13454f;
        c10696a.m32567b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f13455a.containsKey(fragment)) {
            c10696a.m32575k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f13455a.get(fragment);
        this.f13455a.remove(fragment);
        C6333g<C10907f.a> m17250f = this.f13459e.m17250f(fragment);
        if (!m17250f.m17523d()) {
            c10696a.m32575k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            C6336j.m17526a(trace, m17250f.m17522c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.AbstractC1272n.l
    /* renamed from: i */
    public void mo7130i(AbstractC1272n abstractC1272n, Fragment fragment) {
        super.mo7130i(abstractC1272n, fragment);
        f13454f.m32567b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(m17244o(fragment), this.f13457c, this.f13456b, this.f13458d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f13455a.put(fragment, trace);
        this.f13459e.m17248d(fragment);
    }

    /* renamed from: o */
    public String m17244o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
