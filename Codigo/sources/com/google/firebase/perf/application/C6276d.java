package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.C0806k;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.util.C6333g;
import java.util.HashMap;
import java.util.Map;
import re.C10696a;
import se.C10907f;

/* renamed from: com.google.firebase.perf.application.d */
/* loaded from: classes.dex */
public class C6276d {

    /* renamed from: e */
    private static final C10696a f13460e = C10696a.m32565e();

    /* renamed from: a */
    private final Activity f13461a;

    /* renamed from: b */
    private final C0806k f13462b;

    /* renamed from: c */
    private final Map<Fragment, C10907f.a> f13463c;

    /* renamed from: d */
    private boolean f13464d;

    public C6276d(Activity activity) {
        this(activity, new C0806k(), new HashMap());
    }

    C6276d(Activity activity, C0806k c0806k, Map<Fragment, C10907f.a> map) {
        this.f13464d = false;
        this.f13461a = activity;
        this.f13462b = c0806k;
        this.f13463c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m17245a() {
        return true;
    }

    /* renamed from: b */
    private C6333g<C10907f.a> m17246b() {
        if (!this.f13464d) {
            f13460e.m32566a("No recording has been started.");
            return C6333g.m17519a();
        }
        SparseIntArray[] m4048b = this.f13462b.m4048b();
        if (m4048b == null) {
            f13460e.m32566a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return C6333g.m17519a();
        }
        if (m4048b[0] != null) {
            return C6333g.m17521e(C10907f.m33277a(m4048b));
        }
        f13460e.m32566a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return C6333g.m17519a();
    }

    /* renamed from: c */
    public void m17247c() {
        if (this.f13464d) {
            f13460e.m32567b("FrameMetricsAggregator is already recording %s", this.f13461a.getClass().getSimpleName());
        } else {
            this.f13462b.m4047a(this.f13461a);
            this.f13464d = true;
        }
    }

    /* renamed from: d */
    public void m17248d(Fragment fragment) {
        if (!this.f13464d) {
            f13460e.m32566a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f13463c.containsKey(fragment)) {
            f13460e.m32567b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        C6333g<C10907f.a> m17246b = m17246b();
        if (m17246b.m17523d()) {
            this.f13463c.put(fragment, m17246b.m17522c());
        } else {
            f13460e.m32567b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    /* renamed from: e */
    public C6333g<C10907f.a> m17249e() {
        if (!this.f13464d) {
            f13460e.m32566a("Cannot stop because no recording was started");
            return C6333g.m17519a();
        }
        if (!this.f13463c.isEmpty()) {
            f13460e.m32566a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f13463c.clear();
        }
        C6333g<C10907f.a> m17246b = m17246b();
        try {
            this.f13462b.m4049c(this.f13461a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f13460e.m32575k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            m17246b = C6333g.m17519a();
        }
        this.f13462b.m4050d();
        this.f13464d = false;
        return m17246b;
    }

    /* renamed from: f */
    public C6333g<C10907f.a> m17250f(Fragment fragment) {
        if (!this.f13464d) {
            f13460e.m32566a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return C6333g.m17519a();
        }
        if (!this.f13463c.containsKey(fragment)) {
            f13460e.m32567b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return C6333g.m17519a();
        }
        C10907f.a remove = this.f13463c.remove(fragment);
        C6333g<C10907f.a> m17246b = m17246b();
        if (m17246b.m17523d()) {
            return C6333g.m17521e(m17246b.m17522c().m33278a(remove));
        }
        f13460e.m32567b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return C6333g.m17519a();
    }
}
