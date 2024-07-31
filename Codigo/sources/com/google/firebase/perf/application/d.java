package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.k;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.util.g;
import java.util.HashMap;
import java.util.Map;
import se.f;

/* loaded from: classes.dex */
public class d {

    /* renamed from: e */
    private static final re.a f12241e = re.a.e();

    /* renamed from: a */
    private final Activity f12242a;

    /* renamed from: b */
    private final k f12243b;

    /* renamed from: c */
    private final Map<Fragment, f.a> f12244c;

    /* renamed from: d */
    private boolean f12245d;

    public d(Activity activity) {
        this(activity, new k(), new HashMap());
    }

    d(Activity activity, k kVar, Map<Fragment, f.a> map) {
        this.f12245d = false;
        this.f12242a = activity;
        this.f12243b = kVar;
        this.f12244c = map;
    }

    public static boolean a() {
        return true;
    }

    private g<f.a> b() {
        if (!this.f12245d) {
            f12241e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] b10 = this.f12243b.b();
        if (b10 == null) {
            f12241e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (b10[0] != null) {
            return g.e(f.a(b10));
        }
        f12241e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f12245d) {
            f12241e.b("FrameMetricsAggregator is already recording %s", this.f12242a.getClass().getSimpleName());
        } else {
            this.f12243b.a(this.f12242a);
            this.f12245d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f12245d) {
            f12241e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f12244c.containsKey(fragment)) {
            f12241e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g<f.a> b10 = b();
        if (b10.d()) {
            this.f12244c.put(fragment, b10.c());
        } else {
            f12241e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public g<f.a> e() {
        if (!this.f12245d) {
            f12241e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f12244c.isEmpty()) {
            f12241e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f12244c.clear();
        }
        g<f.a> b10 = b();
        try {
            this.f12243b.c(this.f12242a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f12241e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            b10 = g.a();
        }
        this.f12243b.d();
        this.f12245d = false;
        return b10;
    }

    public g<f.a> f(Fragment fragment) {
        if (!this.f12245d) {
            f12241e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f12244c.containsKey(fragment)) {
            f12241e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        f.a remove = this.f12244c.remove(fragment);
        g<f.a> b10 = b();
        if (b10.d()) {
            return g.e(b10.c().a(remove));
        }
        f12241e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return g.a();
    }
}
