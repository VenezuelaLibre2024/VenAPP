package b5;

import com.facebook.ads.AdError;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import x4.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0105a f6146d = new C0105a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f6147a;

    /* renamed from: b, reason: collision with root package name */
    private String f6148b;

    /* renamed from: c, reason: collision with root package name */
    private Long f6149c;

    /* renamed from: b5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105a {
        private C0105a() {
        }

        public /* synthetic */ C0105a(g gVar) {
            this();
        }
    }

    public a(File file) {
        n.e(file, "file");
        String name = file.getName();
        n.d(name, "file.name");
        this.f6147a = name;
        JSONObject r10 = k.r(name, true);
        if (r10 != null) {
            this.f6149c = Long.valueOf(r10.optLong(Constants.TIMESTAMP, 0L));
            this.f6148b = r10.optString("error_message", null);
        }
    }

    public a(String str) {
        this.f6149c = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        this.f6148b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f6149c;
        if (l10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        n.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f6147a = stringBuffer2;
    }

    public final void a() {
        k kVar = k.f30398a;
        k.d(this.f6147a);
    }

    public final int b(a data) {
        n.e(data, "data");
        Long l10 = this.f6149c;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f6149c;
        if (l11 == null) {
            return 1;
        }
        return n.g(l11.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f6149c;
            if (l10 != null) {
                jSONObject.put(Constants.TIMESTAMP, l10);
            }
            jSONObject.put("error_message", this.f6148b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.f6148b == null || this.f6149c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            k kVar = k.f30398a;
            k.t(this.f6147a, toString());
        }
    }

    public String toString() {
        JSONObject c10 = c();
        if (c10 == null) {
            return super.toString();
        }
        String jSONObject = c10.toString();
        n.d(jSONObject, "params.toString()");
        return jSONObject;
    }
}
