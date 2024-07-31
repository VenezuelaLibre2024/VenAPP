package p023b5;

import com.facebook.ads.AdError;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p434x4.C12284k;

/* renamed from: b5.a */
/* loaded from: classes.dex */
public final class C1657a {

    /* renamed from: d */
    public static final a f7041d = new a(null);

    /* renamed from: a */
    private String f7042a;

    /* renamed from: b */
    private String f7043b;

    /* renamed from: c */
    private Long f7044c;

    /* renamed from: b5.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C1657a(File file) {
        C9322n.m27781e(file, "file");
        String name = file.getName();
        C9322n.m27780d(name, "file.name");
        this.f7042a = name;
        JSONObject m39564r = C12284k.m39564r(name, true);
        if (m39564r != null) {
            this.f7044c = Long.valueOf(m39564r.optLong(Constants.TIMESTAMP, 0L));
            this.f7043b = m39564r.optString("error_message", null);
        }
    }

    public C1657a(String str) {
        this.f7044c = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        this.f7043b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f7044c;
        if (l10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9322n.m27780d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f7042a = stringBuffer2;
    }

    /* renamed from: a */
    public final void m9116a() {
        C12284k c12284k = C12284k.f32910a;
        C12284k.m39550d(this.f7042a);
    }

    /* renamed from: b */
    public final int m9117b(C1657a data) {
        C9322n.m27781e(data, "data");
        Long l10 = this.f7044c;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f7044c;
        if (l11 == null) {
            return 1;
        }
        return C9322n.m27783g(l11.longValue(), longValue);
    }

    /* renamed from: c */
    public final JSONObject m9118c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f7044c;
            if (l10 != null) {
                jSONObject.put(Constants.TIMESTAMP, l10);
            }
            jSONObject.put("error_message", this.f7043b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m9119d() {
        return (this.f7043b == null || this.f7044c == null) ? false : true;
    }

    /* renamed from: e */
    public final void m9120e() {
        if (m9119d()) {
            C12284k c12284k = C12284k.f32910a;
            C12284k.m39566t(this.f7042a, toString());
        }
    }

    public String toString() {
        JSONObject m9118c = m9118c();
        if (m9118c == null) {
            return super.toString();
        }
        String jSONObject = m9118c.toString();
        C9322n.m27780d(jSONObject, "params.toString()");
        return jSONObject;
    }
}
