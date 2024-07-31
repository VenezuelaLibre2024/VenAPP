package p272oc;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.C7142e;

/* renamed from: oc.c1 */
/* loaded from: classes.dex */
public final class C9841c1 {

    /* renamed from: a */
    private static final Map<String, String> f24286a;

    static {
        HashMap hashMap = new HashMap();
        f24286a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m29504a(Intent intent) {
        C5276s.m13324j(intent);
        C5276s.m13315a(m29507d(intent));
        return (Status) C7142e.m21236b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    /* renamed from: b */
    public static Status m29505b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(Constants.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = f24286a;
                if (map.containsKey(string)) {
                    return C9881q.m29583a(map.get(string) + ":" + string2);
                }
            }
            return C9881q.m29583a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return C9881q.m29583a("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }

    /* renamed from: c */
    public static void m29506c(Intent intent, Status status) {
        C7142e.m21239e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: d */
    public static boolean m29507d(Intent intent) {
        C5276s.m13324j(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
