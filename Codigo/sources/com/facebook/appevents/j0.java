package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.internal.n0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.h;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f */
    public static final a f7633f = new a(null);

    /* renamed from: g */
    private static final String f7634g = j0.class.getSimpleName();

    /* renamed from: h */
    private static final int f7635h = AdError.NETWORK_ERROR_CODE;

    /* renamed from: a */
    private final com.facebook.internal.a f7636a;

    /* renamed from: b */
    private final String f7637b;

    /* renamed from: c */
    private List<d> f7638c;

    /* renamed from: d */
    private final List<d> f7639d;

    /* renamed from: e */
    private int f7640e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public j0(com.facebook.internal.a attributionIdentifiers, String anonymousAppDeviceGUID) {
        kotlin.jvm.internal.n.e(attributionIdentifiers, "attributionIdentifiers");
        kotlin.jvm.internal.n.e(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f7636a = attributionIdentifiers;
        this.f7637b = anonymousAppDeviceGUID;
        this.f7638c = new ArrayList();
        this.f7639d = new ArrayList();
    }

    private final void f(i4.i0 i0Var, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                q4.h hVar = q4.h.f23522a;
                jSONObject = q4.h.a(h.a.CUSTOM_APP_EVENTS, this.f7636a, this.f7637b, z10, context);
                if (this.f7640e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            i0Var.F(jSONObject);
            Bundle u10 = i0Var.u();
            String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.n.d(jSONArray2, "events.toString()");
            u10.putString("custom_events", jSONArray2);
            i0Var.I(jSONArray2);
            i0Var.H(u10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final synchronized void a(d event) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(event, "event");
            if (this.f7638c.size() + this.f7639d.size() >= f7635h) {
                this.f7640e++;
            } else {
                this.f7638c.add(event);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final synchronized void b(boolean z10) {
        if (a5.a.d(this)) {
            return;
        }
        if (z10) {
            try {
                this.f7638c.addAll(this.f7639d);
            } catch (Throwable th2) {
                a5.a.b(th2, this);
                return;
            }
        }
        this.f7639d.clear();
        this.f7640e = 0;
    }

    public final synchronized int c() {
        if (a5.a.d(this)) {
            return 0;
        }
        try {
            return this.f7638c.size();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return 0;
        }
    }

    public final synchronized List<d> d() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            List<d> list = this.f7638c;
            this.f7638c = new ArrayList();
            return list;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final int e(i4.i0 request, Context applicationContext, boolean z10, boolean z11) {
        if (a5.a.d(this)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.n.e(request, "request");
            kotlin.jvm.internal.n.e(applicationContext, "applicationContext");
            synchronized (this) {
                int i10 = this.f7640e;
                n4.a aVar = n4.a.f21794a;
                n4.a.d(this.f7638c);
                this.f7639d.addAll(this.f7638c);
                this.f7638c.clear();
                JSONArray jSONArray = new JSONArray();
                for (d dVar : this.f7639d) {
                    if (!dVar.g()) {
                        n0 n0Var = n0.f7780a;
                        n0.k0(f7634g, kotlin.jvm.internal.n.k("Event with invalid checksum: ", dVar));
                    } else if (z10 || !dVar.h()) {
                        jSONArray.put(dVar.e());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                ck.v vVar = ck.v.f7137a;
                f(request, applicationContext, i10, jSONArray, z11);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return 0;
        }
    }
}
