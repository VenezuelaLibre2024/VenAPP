package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import ck.C2037v;
import com.facebook.ads.AdError;
import com.facebook.internal.C4607a;
import com.facebook.internal.C4634n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7807i0;
import p247n4.C9661a;
import p303q4.C10268h;

/* renamed from: com.facebook.appevents.j0 */
/* loaded from: classes.dex */
public final class C4582j0 {

    /* renamed from: f */
    public static final a f8608f = new a(null);

    /* renamed from: g */
    private static final String f8609g = C4582j0.class.getSimpleName();

    /* renamed from: h */
    private static final int f8610h = AdError.NETWORK_ERROR_CODE;

    /* renamed from: a */
    private final C4607a f8611a;

    /* renamed from: b */
    private final String f8612b;

    /* renamed from: c */
    private List<C4569d> f8613c;

    /* renamed from: d */
    private final List<C4569d> f8614d;

    /* renamed from: e */
    private int f8615e;

    /* renamed from: com.facebook.appevents.j0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C4582j0(C4607a attributionIdentifiers, String anonymousAppDeviceGUID) {
        C9322n.m27781e(attributionIdentifiers, "attributionIdentifiers");
        C9322n.m27781e(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f8611a = attributionIdentifiers;
        this.f8612b = anonymousAppDeviceGUID;
        this.f8613c = new ArrayList();
        this.f8614d = new ArrayList();
    }

    /* renamed from: f */
    private final void m11010f(C7807i0 c7807i0, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                C10268h c10268h = C10268h.f25490a;
                jSONObject = C10268h.m30751a(C10268h.a.CUSTOM_APP_EVENTS, this.f8611a, this.f8612b, z10, context);
                if (this.f8615e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            c7807i0.m23945F(jSONObject);
            Bundle m23956u = c7807i0.m23956u();
            String jSONArray2 = jSONArray.toString();
            C9322n.m27780d(jSONArray2, "events.toString()");
            m23956u.putString("custom_events", jSONArray2);
            c7807i0.m23948I(jSONArray2);
            c7807i0.m23947H(m23956u);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: a */
    public final synchronized void m11011a(C4569d event) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(event, "event");
            if (this.f8613c.size() + this.f8614d.size() >= f8610h) {
                this.f8615e++;
            } else {
                this.f8613c.add(event);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: b */
    public final synchronized void m11012b(boolean z10) {
        if (C0033a.m107d(this)) {
            return;
        }
        if (z10) {
            try {
                this.f8613c.addAll(this.f8614d);
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
                return;
            }
        }
        this.f8614d.clear();
        this.f8615e = 0;
    }

    /* renamed from: c */
    public final synchronized int m11013c() {
        if (C0033a.m107d(this)) {
            return 0;
        }
        try {
            return this.f8613c.size();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return 0;
        }
    }

    /* renamed from: d */
    public final synchronized List<C4569d> m11014d() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            List<C4569d> list = this.f8613c;
            this.f8613c = new ArrayList();
            return list;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    public final int m11015e(C7807i0 request, Context applicationContext, boolean z10, boolean z11) {
        if (C0033a.m107d(this)) {
            return 0;
        }
        try {
            C9322n.m27781e(request, "request");
            C9322n.m27781e(applicationContext, "applicationContext");
            synchronized (this) {
                int i10 = this.f8615e;
                C9661a c9661a = C9661a.f23727a;
                C9661a.m28959d(this.f8613c);
                this.f8614d.addAll(this.f8613c);
                this.f8613c.clear();
                JSONArray jSONArray = new JSONArray();
                for (C4569d c4569d : this.f8614d) {
                    if (!c4569d.m10948g()) {
                        C4634n0 c4634n0 = C4634n0.f8760a;
                        C4634n0.m11314k0(f8609g, C9322n.m27787k("Event with invalid checksum: ", c4569d));
                    } else if (z10 || !c4569d.m10949h()) {
                        jSONArray.put(c4569d.m10946e());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                C2037v c2037v = C2037v.f8089a;
                m11010f(request, applicationContext, i10, jSONArray, z11);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return 0;
        }
    }
}
