package io.flutter.plugins.firebase.dynamiclinks;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Utils {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> getMapFromPendingDynamicLinkData(fd.c cVar) {
        if (cVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Uri b10 = cVar.b();
        hashMap.put("link", b10 != null ? b10.toString() : null);
        HashMap hashMap2 = new HashMap();
        for (String str : cVar.d().keySet()) {
            hashMap2.put(str, cVar.d().get(str).toString());
        }
        hashMap.put("utmParameters", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("clickTimestamp", Long.valueOf(cVar.a()));
        hashMap3.put("minimumVersion", Integer.valueOf(cVar.c()));
        hashMap.put("android", hashMap3);
        return hashMap;
    }
}
