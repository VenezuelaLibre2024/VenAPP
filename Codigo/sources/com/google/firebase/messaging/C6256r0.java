package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0731a;
import com.google.firebase.messaging.C6217d;
import java.util.Map;
import p081ea.AbstractC7138a;

/* renamed from: com.google.firebase.messaging.r0 */
/* loaded from: classes.dex */
public final class C6256r0 extends AbstractC7138a {
    public static final Parcelable.Creator<C6256r0> CREATOR = new C6258s0();

    /* renamed from: a */
    Bundle f13371a;

    /* renamed from: b */
    private Map<String, String> f13372b;

    /* renamed from: c */
    private c f13373c;

    /* renamed from: com.google.firebase.messaging.r0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Bundle f13374a;

        /* renamed from: b */
        private final Map<String, String> f13375b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f13374a = bundle;
            this.f13375b = new C0731a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        /* renamed from: a */
        public C6256r0 m17164a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f13375b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f13374a);
            this.f13374a.remove("from");
            return new C6256r0(bundle);
        }

        /* renamed from: b */
        public b m17165b(String str) {
            this.f13374a.putString("collapse_key", str);
            return this;
        }

        /* renamed from: c */
        public b m17166c(Map<String, String> map) {
            this.f13375b.clear();
            this.f13375b.putAll(map);
            return this;
        }

        /* renamed from: d */
        public b m17167d(String str) {
            this.f13374a.putString("google.message_id", str);
            return this;
        }

        /* renamed from: e */
        public b m17168e(String str) {
            this.f13374a.putString("message_type", str);
            return this;
        }

        /* renamed from: f */
        public b m17169f(int i10) {
            this.f13374a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* renamed from: com.google.firebase.messaging.r0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final String f13376a;

        /* renamed from: b */
        private final String f13377b;

        /* renamed from: c */
        private final String[] f13378c;

        /* renamed from: d */
        private final String f13379d;

        /* renamed from: e */
        private final String f13380e;

        /* renamed from: f */
        private final String[] f13381f;

        /* renamed from: g */
        private final String f13382g;

        /* renamed from: h */
        private final String f13383h;

        /* renamed from: i */
        private final String f13384i;

        /* renamed from: j */
        private final String f13385j;

        /* renamed from: k */
        private final String f13386k;

        /* renamed from: l */
        private final String f13387l;

        /* renamed from: m */
        private final String f13388m;

        /* renamed from: n */
        private final Uri f13389n;

        /* renamed from: o */
        private final String f13390o;

        /* renamed from: p */
        private final Integer f13391p;

        /* renamed from: q */
        private final Integer f13392q;

        /* renamed from: r */
        private final Integer f13393r;

        /* renamed from: s */
        private final int[] f13394s;

        /* renamed from: t */
        private final Long f13395t;

        /* renamed from: u */
        private final boolean f13396u;

        /* renamed from: v */
        private final boolean f13397v;

        /* renamed from: w */
        private final boolean f13398w;

        /* renamed from: x */
        private final boolean f13399x;

        /* renamed from: y */
        private final boolean f13400y;

        /* renamed from: z */
        private final long[] f13401z;

        private c(C6239k0 c6239k0) {
            this.f13376a = c6239k0.m17101p("gcm.n.title");
            this.f13377b = c6239k0.m17093h("gcm.n.title");
            this.f13378c = m17170j(c6239k0, "gcm.n.title");
            this.f13379d = c6239k0.m17101p("gcm.n.body");
            this.f13380e = c6239k0.m17093h("gcm.n.body");
            this.f13381f = m17170j(c6239k0, "gcm.n.body");
            this.f13382g = c6239k0.m17101p("gcm.n.icon");
            this.f13384i = c6239k0.m17100o();
            this.f13385j = c6239k0.m17101p("gcm.n.tag");
            this.f13386k = c6239k0.m17101p("gcm.n.color");
            this.f13387l = c6239k0.m17101p("gcm.n.click_action");
            this.f13388m = c6239k0.m17101p("gcm.n.android_channel_id");
            this.f13389n = c6239k0.m17091f();
            this.f13383h = c6239k0.m17101p("gcm.n.image");
            this.f13390o = c6239k0.m17101p("gcm.n.ticker");
            this.f13391p = c6239k0.m17088b("gcm.n.notification_priority");
            this.f13392q = c6239k0.m17088b("gcm.n.visibility");
            this.f13393r = c6239k0.m17088b("gcm.n.notification_count");
            this.f13396u = c6239k0.m17087a("gcm.n.sticky");
            this.f13397v = c6239k0.m17087a("gcm.n.local_only");
            this.f13398w = c6239k0.m17087a("gcm.n.default_sound");
            this.f13399x = c6239k0.m17087a("gcm.n.default_vibrate_timings");
            this.f13400y = c6239k0.m17087a("gcm.n.default_light_settings");
            this.f13395t = c6239k0.m17095j("gcm.n.event_time");
            this.f13394s = c6239k0.m17090e();
            this.f13401z = c6239k0.m17102q();
        }

        /* renamed from: j */
        private static String[] m17170j(C6239k0 c6239k0, String str) {
            Object[] m17092g = c6239k0.m17092g(str);
            if (m17092g == null) {
                return null;
            }
            String[] strArr = new String[m17092g.length];
            for (int i10 = 0; i10 < m17092g.length; i10++) {
                strArr[i10] = String.valueOf(m17092g[i10]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m17171a() {
            return this.f13379d;
        }

        /* renamed from: b */
        public String[] m17172b() {
            return this.f13381f;
        }

        /* renamed from: c */
        public String m17173c() {
            return this.f13380e;
        }

        /* renamed from: d */
        public String m17174d() {
            return this.f13388m;
        }

        /* renamed from: e */
        public String m17175e() {
            return this.f13387l;
        }

        /* renamed from: f */
        public String m17176f() {
            return this.f13386k;
        }

        /* renamed from: g */
        public String m17177g() {
            return this.f13382g;
        }

        /* renamed from: h */
        public Uri m17178h() {
            String str = this.f13383h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        /* renamed from: i */
        public Uri m17179i() {
            return this.f13389n;
        }

        /* renamed from: k */
        public Integer m17180k() {
            return this.f13393r;
        }

        /* renamed from: l */
        public Integer m17181l() {
            return this.f13391p;
        }

        /* renamed from: m */
        public String m17182m() {
            return this.f13384i;
        }

        /* renamed from: n */
        public String m17183n() {
            return this.f13385j;
        }

        /* renamed from: o */
        public String m17184o() {
            return this.f13390o;
        }

        /* renamed from: p */
        public String m17185p() {
            return this.f13376a;
        }

        /* renamed from: q */
        public String[] m17186q() {
            return this.f13378c;
        }

        /* renamed from: r */
        public String m17187r() {
            return this.f13377b;
        }

        /* renamed from: s */
        public Integer m17188s() {
            return this.f13392q;
        }
    }

    public C6256r0(Bundle bundle) {
        this.f13371a = bundle;
    }

    /* renamed from: y1 */
    private int m17152y1(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: A1 */
    public c m17153A1() {
        if (this.f13373c == null && C6239k0.m17082t(this.f13371a)) {
            this.f13373c = new c(new C6239k0(this.f13371a));
        }
        return this.f13373c;
    }

    /* renamed from: B1 */
    public int m17154B1() {
        String string = this.f13371a.getString("google.original_priority");
        if (string == null) {
            string = this.f13371a.getString("google.priority");
        }
        return m17152y1(string);
    }

    /* renamed from: C1 */
    public long m17155C1() {
        Object obj = this.f13371a.get("google.sent_time");
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

    /* renamed from: D1 */
    public String m17156D1() {
        return this.f13371a.getString("google.to");
    }

    /* renamed from: E1 */
    public int m17157E1() {
        Object obj = this.f13371a.get("google.ttl");
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
    /* renamed from: F1 */
    public void m17158F1(Intent intent) {
        intent.putExtras(this.f13371a);
    }

    /* renamed from: u1 */
    public String m17159u1() {
        return this.f13371a.getString("collapse_key");
    }

    /* renamed from: v1 */
    public Map<String, String> m17160v1() {
        if (this.f13372b == null) {
            this.f13372b = C6217d.a.m16971a(this.f13371a);
        }
        return this.f13372b;
    }

    /* renamed from: w1 */
    public String m17161w1() {
        return this.f13371a.getString("from");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C6258s0.m17190c(this, parcel, i10);
    }

    /* renamed from: x1 */
    public String m17162x1() {
        String string = this.f13371a.getString("google.message_id");
        return string == null ? this.f13371a.getString("message_id") : string;
    }

    /* renamed from: z1 */
    public String m17163z1() {
        return this.f13371a.getString("message_type");
    }
}
