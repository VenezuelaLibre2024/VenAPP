package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.C4589o;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import p007a5.C0033a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.C7830u;
import p152i4.EnumC7823q0;
import p191k1.C9109a;
import p194k4.C9156d;
import p194k4.C9159g;

/* renamed from: com.facebook.appevents.m */
/* loaded from: classes.dex */
public final class C4587m {

    /* renamed from: f */
    private static ScheduledFuture<?> f8631f;

    /* renamed from: a */
    public static final C4587m f8626a = new C4587m();

    /* renamed from: b */
    private static final String f8627b = C4587m.class.getName();

    /* renamed from: c */
    private static final int f8628c = 100;

    /* renamed from: d */
    private static volatile C4571e f8629d = new C4571e();

    /* renamed from: e */
    private static final ScheduledExecutorService f8630e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g */
    private static final Runnable f8632g = new Runnable() { // from class: com.facebook.appevents.h
        @Override // java.lang.Runnable
        public final void run() {
            C4587m.m11039o();
        }
    };

    private C4587m() {
    }

    /* renamed from: g */
    public static final void m11031g(final C4563a accessTokenAppId, final C4569d appEvent) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(accessTokenAppId, "accessTokenAppId");
            C9322n.m27781e(appEvent, "appEvent");
            f8630e.execute(new Runnable() { // from class: com.facebook.appevents.g
                @Override // java.lang.Runnable
                public final void run() {
                    C4587m.m11032h(C4563a.this, appEvent);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m11032h(C4563a accessTokenAppId, C4569d appEvent) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(accessTokenAppId, "$accessTokenAppId");
            C9322n.m27781e(appEvent, "$appEvent");
            f8629d.m10980a(accessTokenAppId, appEvent);
            if (C4589o.f8635b.m11052c() != C4589o.b.EXPLICIT_ONLY && f8629d.m10983d() > f8628c) {
                m11038n(EnumC4572e0.EVENT_THRESHOLD);
            } else if (f8631f == null) {
                f8631f = f8630e.schedule(f8632g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* renamed from: i */
    public static final C7807i0 m11033i(final C4563a accessTokenAppId, final C4582j0 appEvents, boolean z10, final C4576g0 flushState) {
        if (C0033a.m107d(C4587m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(accessTokenAppId, "accessTokenAppId");
            C9322n.m27781e(appEvents, "appEvents");
            C9322n.m27781e(flushState, "flushState");
            String m10934b = accessTokenAppId.m10934b();
            C4641r m11457q = C4648v.m11457q(m10934b, false);
            C7807i0.c cVar = C7807i0.f18658n;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{m10934b}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            final C7807i0 m23987A = cVar.m23987A(null, format, null, null);
            m23987A.m23944E(true);
            Bundle m23956u = m23987A.m23956u();
            if (m23956u == null) {
                m23956u = new Bundle();
            }
            m23956u.putString("access_token", accessTokenAppId.m10933a());
            String m11006d = C4578h0.f8597b.m11006d();
            if (m11006d != null) {
                m23956u.putString("device_token", m11006d);
            }
            String m11091k = C4592r.f8640c.m11091k();
            if (m11091k != null) {
                m23956u.putString("install_referrer", m11091k);
            }
            m23987A.m23947H(m23956u);
            int m11015e = appEvents.m11015e(m23987A, C7799e0.m23860l(), m11457q != null ? m11457q.m11391q() : false, z10);
            if (m11015e == 0) {
                return null;
            }
            flushState.m10991c(flushState.m10989a() + m11015e);
            m23987A.m23943D(new C7807i0.b() { // from class: com.facebook.appevents.i
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C4587m.m11034j(C4563a.this, m23987A, appEvents, flushState, c7817n0);
                }
            });
            return m23987A;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m11034j(C4563a accessTokenAppId, C7807i0 postRequest, C4582j0 appEvents, C4576g0 flushState, C7817n0 response) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(accessTokenAppId, "$accessTokenAppId");
            C9322n.m27781e(postRequest, "$postRequest");
            C9322n.m27781e(appEvents, "$appEvents");
            C9322n.m27781e(flushState, "$flushState");
            C9322n.m27781e(response, "response");
            m11041q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* renamed from: k */
    public static final List<C7807i0> m11035k(C4571e appEventCollection, C4576g0 flushResults) {
        if (C0033a.m107d(C4587m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(appEventCollection, "appEventCollection");
            C9322n.m27781e(flushResults, "flushResults");
            boolean m23874z = C7799e0.m23874z(C7799e0.m23860l());
            ArrayList arrayList = new ArrayList();
            for (C4563a c4563a : appEventCollection.m10984f()) {
                C4582j0 m10982c = appEventCollection.m10982c(c4563a);
                if (m10982c == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                C7807i0 m11033i = m11033i(c4563a, m10982c, m23874z, flushResults);
                if (m11033i != null) {
                    arrayList.add(m11033i);
                    if (C9156d.f22104a.m27021f()) {
                        C9159g.m27048l(m11033i);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final void m11036l(final EnumC4572e0 reason) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(reason, "reason");
            f8630e.execute(new Runnable() { // from class: com.facebook.appevents.j
                @Override // java.lang.Runnable
                public final void run() {
                    C4587m.m11037m(EnumC4572e0.this);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m11037m(EnumC4572e0 reason) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(reason, "$reason");
            m11038n(reason);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* renamed from: n */
    public static final void m11038n(EnumC4572e0 reason) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(reason, "reason");
            f8629d.m10981b(C4573f.m10986a());
            try {
                C4576g0 m11045u = m11045u(reason, f8629d);
                if (m11045u != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", m11045u.m10989a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", m11045u.m10990b());
                    C9109a.m26825b(C7799e0.m23860l()).m26828d(intent);
                }
            } catch (Exception e10) {
                Log.w(f8627b, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m11039o() {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            f8631f = null;
            if (C4589o.f8635b.m11052c() != C4589o.b.EXPLICIT_ONLY) {
                m11038n(EnumC4572e0.TIMER);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* renamed from: p */
    public static final Set<C4563a> m11040p() {
        if (C0033a.m107d(C4587m.class)) {
            return null;
        }
        try {
            return f8629d.m10984f();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
            return null;
        }
    }

    /* renamed from: q */
    public static final void m11041q(final C4563a accessTokenAppId, C7807i0 request, C7817n0 response, final C4582j0 appEvents, C4576g0 flushState) {
        String str;
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(accessTokenAppId, "accessTokenAppId");
            C9322n.m27781e(request, "request");
            C9322n.m27781e(response, "response");
            C9322n.m27781e(appEvents, "appEvents");
            C9322n.m27781e(flushState, "flushState");
            C7830u m24061b = response.m24061b();
            String str2 = "Success";
            EnumC4574f0 enumC4574f0 = EnumC4574f0.SUCCESS;
            boolean z10 = true;
            if (m24061b != null) {
                if (m24061b.m24099b() == -1) {
                    str2 = "Failed: No Connectivity";
                    enumC4574f0 = EnumC4574f0.NO_CONNECTIVITY;
                } else {
                    C9308a0 c9308a0 = C9308a0.f22565a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), m24061b.toString()}, 2));
                    C9322n.m27780d(str2, "java.lang.String.format(format, *args)");
                    enumC4574f0 = EnumC4574f0.SERVER_ERROR;
                }
            }
            C7799e0 c7799e0 = C7799e0.f18601a;
            if (C7799e0.m23835H(EnumC7823q0.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) request.m23958w()).toString(2);
                    C9322n.m27780d(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                C4612c0.a aVar = C4612c0.f8694e;
                EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
                String TAG = f8627b;
                C9322n.m27780d(TAG, "TAG");
                aVar.m11139c(enumC7823q0, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.m23953q()), str2, str);
            }
            if (m24061b == null) {
                z10 = false;
            }
            appEvents.m11012b(z10);
            EnumC4574f0 enumC4574f02 = EnumC4574f0.NO_CONNECTIVITY;
            if (enumC4574f0 == enumC4574f02) {
                C7799e0.m23868t().execute(new Runnable() { // from class: com.facebook.appevents.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4587m.m11042r(C4563a.this, appEvents);
                    }
                });
            }
            if (enumC4574f0 == EnumC4574f0.SUCCESS || flushState.m10990b() == enumC4574f02) {
                return;
            }
            flushState.m10992d(enumC4574f0);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m11042r(C4563a accessTokenAppId, C4582j0 appEvents) {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C9322n.m27781e(accessTokenAppId, "$accessTokenAppId");
            C9322n.m27781e(appEvents, "$appEvents");
            C4588n.m11046a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* renamed from: s */
    public static final void m11043s() {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            f8630e.execute(new Runnable() { // from class: com.facebook.appevents.l
                @Override // java.lang.Runnable
                public final void run() {
                    C4587m.m11044t();
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m11044t() {
        if (C0033a.m107d(C4587m.class)) {
            return;
        }
        try {
            C4588n c4588n = C4588n.f8633a;
            C4588n.m11047b(f8629d);
            f8629d = new C4571e();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
        }
    }

    /* renamed from: u */
    public static final C4576g0 m11045u(EnumC4572e0 reason, C4571e appEventCollection) {
        if (C0033a.m107d(C4587m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(reason, "reason");
            C9322n.m27781e(appEventCollection, "appEventCollection");
            C4576g0 c4576g0 = new C4576g0();
            List<C7807i0> m11035k = m11035k(appEventCollection, c4576g0);
            if (!(!m11035k.isEmpty())) {
                return null;
            }
            C4612c0.a aVar = C4612c0.f8694e;
            EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
            String TAG = f8627b;
            C9322n.m27780d(TAG, "TAG");
            aVar.m11139c(enumC7823q0, TAG, "Flushing %d events due to %s.", Integer.valueOf(c4576g0.m10989a()), reason.toString());
            Iterator<C7807i0> it = m11035k.iterator();
            while (it.hasNext()) {
                it.next().m23949k();
            }
            return c4576g0;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4587m.class);
            return null;
        }
    }
}
