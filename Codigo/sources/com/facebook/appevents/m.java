package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.o;
import com.facebook.internal.c0;
import i4.i0;
import i4.n0;
import i4.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    private static ScheduledFuture<?> f7656f;

    /* renamed from: a, reason: collision with root package name */
    public static final m f7651a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7652b = m.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private static final int f7653c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static volatile e f7654d = new e();

    /* renamed from: e, reason: collision with root package name */
    private static final ScheduledExecutorService f7655e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g, reason: collision with root package name */
    private static final Runnable f7657g = new Runnable() { // from class: com.facebook.appevents.h
        @Override // java.lang.Runnable
        public final void run() {
            m.o();
        }
    };

    private m() {
    }

    public static final void g(final a accessTokenAppId, final d appEvent) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.n.e(appEvent, "appEvent");
            f7655e.execute(new Runnable() { // from class: com.facebook.appevents.g
                @Override // java.lang.Runnable
                public final void run() {
                    m.h(a.this, appEvent);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a accessTokenAppId, d appEvent) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.n.e(appEvent, "$appEvent");
            f7654d.a(accessTokenAppId, appEvent);
            if (o.f7660b.c() != o.b.EXPLICIT_ONLY && f7654d.d() > f7653c) {
                n(e0.EVENT_THRESHOLD);
            } else if (f7656f == null) {
                f7656f = f7655e.schedule(f7657g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    public static final i4.i0 i(final a accessTokenAppId, final j0 appEvents, boolean z10, final g0 flushState) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.n.e(appEvents, "appEvents");
            kotlin.jvm.internal.n.e(flushState, "flushState");
            String b10 = accessTokenAppId.b();
            com.facebook.internal.r q10 = com.facebook.internal.v.q(b10, false);
            i0.c cVar = i4.i0.f17005n;
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b10}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
            final i4.i0 A = cVar.A(null, format, null, null);
            A.E(true);
            Bundle u10 = A.u();
            if (u10 == null) {
                u10 = new Bundle();
            }
            u10.putString("access_token", accessTokenAppId.a());
            String d10 = h0.f7622b.d();
            if (d10 != null) {
                u10.putString("device_token", d10);
            }
            String k10 = r.f7665c.k();
            if (k10 != null) {
                u10.putString("install_referrer", k10);
            }
            A.H(u10);
            int e10 = appEvents.e(A, i4.e0.l(), q10 != null ? q10.q() : false, z10);
            if (e10 == 0) {
                return null;
            }
            flushState.c(flushState.a() + e10);
            A.D(new i0.b() { // from class: com.facebook.appevents.i
                @Override // i4.i0.b
                public final void b(n0 n0Var) {
                    m.j(a.this, A, appEvents, flushState, n0Var);
                }
            });
            return A;
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a accessTokenAppId, i4.i0 postRequest, j0 appEvents, g0 flushState, n0 response) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.n.e(postRequest, "$postRequest");
            kotlin.jvm.internal.n.e(appEvents, "$appEvents");
            kotlin.jvm.internal.n.e(flushState, "$flushState");
            kotlin.jvm.internal.n.e(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    public static final List<i4.i0> k(e appEventCollection, g0 flushResults) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(appEventCollection, "appEventCollection");
            kotlin.jvm.internal.n.e(flushResults, "flushResults");
            boolean z10 = i4.e0.z(i4.e0.l());
            ArrayList arrayList = new ArrayList();
            for (a aVar : appEventCollection.f()) {
                j0 c10 = appEventCollection.c(aVar);
                if (c10 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                i4.i0 i10 = i(aVar, c10, z10, flushResults);
                if (i10 != null) {
                    arrayList.add(i10);
                    if (k4.d.f20322a.f()) {
                        k4.g.l(i10);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    public static final void l(final e0 reason) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(reason, "reason");
            f7655e.execute(new Runnable() { // from class: com.facebook.appevents.j
                @Override // java.lang.Runnable
                public final void run() {
                    m.m(e0.this);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(e0 reason) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(reason, "$reason");
            n(reason);
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    public static final void n(e0 reason) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(reason, "reason");
            f7654d.b(f.a());
            try {
                g0 u10 = u(reason, f7654d);
                if (u10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", u10.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", u10.b());
                    k1.a.b(i4.e0.l()).d(intent);
                }
            } catch (Exception e10) {
                Log.w(f7652b, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            f7656f = null;
            if (o.f7660b.c() != o.b.EXPLICIT_ONLY) {
                n(e0.TIMER);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    public static final Set<a> p() {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            return f7654d.f();
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    public static final void q(final a accessTokenAppId, i4.i0 request, n0 response, final j0 appEvents, g0 flushState) {
        String str;
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.n.e(request, "request");
            kotlin.jvm.internal.n.e(response, "response");
            kotlin.jvm.internal.n.e(appEvents, "appEvents");
            kotlin.jvm.internal.n.e(flushState, "flushState");
            i4.u b10 = response.b();
            String str2 = "Success";
            f0 f0Var = f0.SUCCESS;
            boolean z10 = true;
            if (b10 != null) {
                if (b10.b() == -1) {
                    str2 = "Failed: No Connectivity";
                    f0Var = f0.NO_CONNECTIVITY;
                } else {
                    kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), b10.toString()}, 2));
                    kotlin.jvm.internal.n.d(str2, "java.lang.String.format(format, *args)");
                    f0Var = f0.SERVER_ERROR;
                }
            }
            i4.e0 e0Var = i4.e0.f16948a;
            if (i4.e0.H(q0.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) request.w()).toString(2);
                    kotlin.jvm.internal.n.d(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                c0.a aVar = com.facebook.internal.c0.f7719e;
                q0 q0Var = q0.APP_EVENTS;
                String TAG = f7652b;
                kotlin.jvm.internal.n.d(TAG, "TAG");
                aVar.c(q0Var, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.q()), str2, str);
            }
            if (b10 == null) {
                z10 = false;
            }
            appEvents.b(z10);
            f0 f0Var2 = f0.NO_CONNECTIVITY;
            if (f0Var == f0Var2) {
                i4.e0.t().execute(new Runnable() { // from class: com.facebook.appevents.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.r(a.this, appEvents);
                    }
                });
            }
            if (f0Var == f0.SUCCESS || flushState.b() == f0Var2) {
                return;
            }
            flushState.d(f0Var);
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a accessTokenAppId, j0 appEvents) {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.n.e(appEvents, "$appEvents");
            n.a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    public static final void s() {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            f7655e.execute(new Runnable() { // from class: com.facebook.appevents.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.t();
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (a5.a.d(m.class)) {
            return;
        }
        try {
            n nVar = n.f7658a;
            n.b(f7654d);
            f7654d = new e();
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
        }
    }

    public static final g0 u(e0 reason, e appEventCollection) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(reason, "reason");
            kotlin.jvm.internal.n.e(appEventCollection, "appEventCollection");
            g0 g0Var = new g0();
            List<i4.i0> k10 = k(appEventCollection, g0Var);
            if (!(!k10.isEmpty())) {
                return null;
            }
            c0.a aVar = com.facebook.internal.c0.f7719e;
            q0 q0Var = q0.APP_EVENTS;
            String TAG = f7652b;
            kotlin.jvm.internal.n.d(TAG, "TAG");
            aVar.c(q0Var, TAG, "Flushing %d events due to %s.", Integer.valueOf(g0Var.a()), reason.toString());
            Iterator<i4.i0> it = k10.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
            return g0Var;
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }
}
