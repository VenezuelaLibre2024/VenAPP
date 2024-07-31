package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.d;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0 extends ea.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f12156a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f12157b;

    /* renamed from: c, reason: collision with root package name */
    private c f12158c;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f12159a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, String> f12160b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f12159a = bundle;
            this.f12160b = new androidx.collection.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public r0 a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f12160b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f12159a);
            this.f12159a.remove("from");
            return new r0(bundle);
        }

        public b b(String str) {
            this.f12159a.putString("collapse_key", str);
            return this;
        }

        public b c(Map<String, String> map) {
            this.f12160b.clear();
            this.f12160b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.f12159a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f12159a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f12159a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f12161a;

        /* renamed from: b, reason: collision with root package name */
        private final String f12162b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f12163c;

        /* renamed from: d, reason: collision with root package name */
        private final String f12164d;

        /* renamed from: e, reason: collision with root package name */
        private final String f12165e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f12166f;

        /* renamed from: g, reason: collision with root package name */
        private final String f12167g;

        /* renamed from: h, reason: collision with root package name */
        private final String f12168h;

        /* renamed from: i, reason: collision with root package name */
        private final String f12169i;

        /* renamed from: j, reason: collision with root package name */
        private final String f12170j;

        /* renamed from: k, reason: collision with root package name */
        private final String f12171k;

        /* renamed from: l, reason: collision with root package name */
        private final String f12172l;

        /* renamed from: m, reason: collision with root package name */
        private final String f12173m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f12174n;

        /* renamed from: o, reason: collision with root package name */
        private final String f12175o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f12176p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f12177q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f12178r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f12179s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f12180t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f12181u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f12182v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f12183w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f12184x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f12185y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f12186z;

        private c(k0 k0Var) {
            this.f12161a = k0Var.p("gcm.n.title");
            this.f12162b = k0Var.h("gcm.n.title");
            this.f12163c = j(k0Var, "gcm.n.title");
            this.f12164d = k0Var.p("gcm.n.body");
            this.f12165e = k0Var.h("gcm.n.body");
            this.f12166f = j(k0Var, "gcm.n.body");
            this.f12167g = k0Var.p("gcm.n.icon");
            this.f12169i = k0Var.o();
            this.f12170j = k0Var.p("gcm.n.tag");
            this.f12171k = k0Var.p("gcm.n.color");
            this.f12172l = k0Var.p("gcm.n.click_action");
            this.f12173m = k0Var.p("gcm.n.android_channel_id");
            this.f12174n = k0Var.f();
            this.f12168h = k0Var.p("gcm.n.image");
            this.f12175o = k0Var.p("gcm.n.ticker");
            this.f12176p = k0Var.b("gcm.n.notification_priority");
            this.f12177q = k0Var.b("gcm.n.visibility");
            this.f12178r = k0Var.b("gcm.n.notification_count");
            this.f12181u = k0Var.a("gcm.n.sticky");
            this.f12182v = k0Var.a("gcm.n.local_only");
            this.f12183w = k0Var.a("gcm.n.default_sound");
            this.f12184x = k0Var.a("gcm.n.default_vibrate_timings");
            this.f12185y = k0Var.a("gcm.n.default_light_settings");
            this.f12180t = k0Var.j("gcm.n.event_time");
            this.f12179s = k0Var.e();
            this.f12186z = k0Var.q();
        }

        private static String[] j(k0 k0Var, String str) {
            Object[] g10 = k0Var.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f12164d;
        }

        public String[] b() {
            return this.f12166f;
        }

        public String c() {
            return this.f12165e;
        }

        public String d() {
            return this.f12173m;
        }

        public String e() {
            return this.f12172l;
        }

        public String f() {
            return this.f12171k;
        }

        public String g() {
            return this.f12167g;
        }

        public Uri h() {
            String str = this.f12168h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f12174n;
        }

        public Integer k() {
            return this.f12178r;
        }

        public Integer l() {
            return this.f12176p;
        }

        public String m() {
            return this.f12169i;
        }

        public String n() {
            return this.f12170j;
        }

        public String o() {
            return this.f12175o;
        }

        public String p() {
            return this.f12161a;
        }

        public String[] q() {
            return this.f12163c;
        }

        public String r() {
            return this.f12162b;
        }

        public Integer s() {
            return this.f12177q;
        }
    }

    public r0(Bundle bundle) {
        this.f12156a = bundle;
    }

    private int y1(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public c A1() {
        if (this.f12158c == null && k0.t(this.f12156a)) {
            this.f12158c = new c(new k0(this.f12156a));
        }
        return this.f12158c;
    }

    public int B1() {
        String string = this.f12156a.getString("google.original_priority");
        if (string == null) {
            string = this.f12156a.getString("google.priority");
        }
        return y1(string);
    }

    public long C1() {
        Object obj = this.f12156a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String D1() {
        return this.f12156a.getString("google.to");
    }

    public int E1() {
        Object obj = this.f12156a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F1(Intent intent) {
        intent.putExtras(this.f12156a);
    }

    public String u1() {
        return this.f12156a.getString("collapse_key");
    }

    public Map<String, String> v1() {
        if (this.f12157b == null) {
            this.f12157b = d.a.a(this.f12156a);
        }
        return this.f12157b;
    }

    public String w1() {
        return this.f12156a.getString("from");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        s0.c(this, parcel, i10);
    }

    public String x1() {
        String string = this.f12156a.getString("google.message_id");
        return string == null ? this.f12156a.getString("message_id") : string;
    }

    public String z1() {
        return this.f12156a.getString("message_type");
    }
}
