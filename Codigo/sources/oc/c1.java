package oc;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f22353a;

    static {
        HashMap hashMap = new HashMap();
        f22353a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(Intent intent) {
        com.google.android.gms.common.internal.s.j(intent);
        com.google.android.gms.common.internal.s.a(d(intent));
        return (Status) ea.e.b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(Constants.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = f22353a;
                if (map.containsKey(string)) {
                    return q.a(map.get(string) + ":" + string2);
                }
            }
            return q.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return q.a("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }

    public static void c(Intent intent, Status status) {
        ea.e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean d(Intent intent) {
        com.google.android.gms.common.internal.s.j(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}