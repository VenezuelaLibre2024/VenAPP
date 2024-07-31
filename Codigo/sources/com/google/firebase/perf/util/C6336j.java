package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;
import re.C10696a;
import se.C10907f;

/* renamed from: com.google.firebase.perf.util.j */
/* loaded from: classes.dex */
public class C6336j {

    /* renamed from: a */
    private static final C10696a f13611a = C10696a.m32565e();

    /* renamed from: a */
    public static Trace m17526a(Trace trace, C10907f.a aVar) {
        if (aVar.m33281d() > 0) {
            trace.putMetric(EnumC6328b.FRAMES_TOTAL.toString(), aVar.m33281d());
        }
        if (aVar.m33280c() > 0) {
            trace.putMetric(EnumC6328b.FRAMES_SLOW.toString(), aVar.m33280c());
        }
        if (aVar.m33279b() > 0) {
            trace.putMetric(EnumC6328b.FRAMES_FROZEN.toString(), aVar.m33279b());
        }
        f13611a.m32566a("Screen trace: " + trace.m17389f() + " _fr_tot:" + aVar.m33281d() + " _fr_slo:" + aVar.m33280c() + " _fr_fzn:" + aVar.m33279b());
        return trace;
    }
}
