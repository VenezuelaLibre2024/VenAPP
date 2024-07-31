package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.util.o;

/* loaded from: classes.dex */
class i {

    /* renamed from: e, reason: collision with root package name */
    private static final re.a f12347e = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f12348a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityManager f12349b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f12350c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12351d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    i(Runtime runtime, Context context) {
        this.f12348a = runtime;
        this.f12351d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f12349b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f12350c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public int a() {
        return o.c(com.google.firebase.perf.util.k.BYTES.b(this.f12350c.totalMem));
    }

    public int b() {
        return o.c(com.google.firebase.perf.util.k.BYTES.b(this.f12348a.maxMemory()));
    }

    public int c() {
        return o.c(com.google.firebase.perf.util.k.MEGABYTES.b(this.f12349b.getMemoryClass()));
    }
}
