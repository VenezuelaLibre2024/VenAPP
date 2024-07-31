package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.util.C6341o;
import com.google.firebase.perf.util.EnumC6337k;
import re.C10696a;

/* renamed from: com.google.firebase.perf.session.gauges.i */
/* loaded from: classes.dex */
class C6323i {

    /* renamed from: e */
    private static final C10696a f13579e = C10696a.m32565e();

    /* renamed from: a */
    private final Runtime f13580a;

    /* renamed from: b */
    private final ActivityManager f13581b;

    /* renamed from: c */
    private final ActivityManager.MemoryInfo f13582c;

    /* renamed from: d */
    private final Context f13583d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6323i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    C6323i(Runtime runtime, Context context) {
        this.f13580a = runtime;
        this.f13583d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f13581b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f13582c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    /* renamed from: a */
    public int m17493a() {
        return C6341o.m17542c(EnumC6337k.BYTES.m17527b(this.f13582c.totalMem));
    }

    /* renamed from: b */
    public int m17494b() {
        return C6341o.m17542c(EnumC6337k.BYTES.m17527b(this.f13580a.maxMemory()));
    }

    /* renamed from: c */
    public int m17495c() {
        return C6341o.m17542c(EnumC6337k.MEGABYTES.m17527b(this.f13581b.getMemoryClass()));
    }
}
