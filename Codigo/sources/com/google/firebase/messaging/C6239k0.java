package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.k0 */
/* loaded from: classes.dex */
public class C6239k0 {

    /* renamed from: a */
    private final Bundle f13345a;

    public C6239k0(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f13345a = new Bundle(bundle);
    }

    /* renamed from: d */
    private static int m17080d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m17081s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m17082t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m17084v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m17083u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m17084v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m17085w(String str) {
        if (!this.f13345a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m17084v = m17084v(str);
            if (this.f13345a.containsKey(m17084v)) {
                return m17084v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m17086z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m17087a(String str) {
        String m17101p = m17101p(str);
        return "1".equals(m17101p) || Boolean.parseBoolean(m17101p);
    }

    /* renamed from: b */
    public Integer m17088b(String str) {
        String m17101p = m17101p(str);
        if (TextUtils.isEmpty(m17101p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m17101p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m17086z(str) + "(" + m17101p + ") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m17089c(String str) {
        String m17101p = m17101p(str);
        if (TextUtils.isEmpty(m17101p)) {
            return null;
        }
        try {
            return new JSONArray(m17101p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m17086z(str) + ": " + m17101p + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m17090e() {
        String str;
        JSONArray m17089c = m17089c("gcm.n.light_settings");
        if (m17089c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m17089c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m17080d(m17089c.optString(0));
            iArr[1] = m17089c.optInt(1);
            iArr[2] = m17089c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            str = "LightSettings is invalid: " + m17089c + ". " + e10.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + m17089c + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    /* renamed from: f */
    public Uri m17091f() {
        String m17101p = m17101p("gcm.n.link_android");
        if (TextUtils.isEmpty(m17101p)) {
            m17101p = m17101p("gcm.n.link");
        }
        if (TextUtils.isEmpty(m17101p)) {
            return null;
        }
        return Uri.parse(m17101p);
    }

    /* renamed from: g */
    public Object[] m17092g(String str) {
        JSONArray m17089c = m17089c(str + "_loc_args");
        if (m17089c == null) {
            return null;
        }
        int length = m17089c.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = m17089c.optString(i10);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m17093h(String str) {
        return m17101p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m17094i(Resources resources, String str, String str2) {
        String m17093h = m17093h(str2);
        if (TextUtils.isEmpty(m17093h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m17093h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m17086z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] m17092g = m17092g(str2);
        if (m17092g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m17092g);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + m17086z(str2) + ": " + Arrays.toString(m17092g) + " Default value will be used.", e10);
            return null;
        }
    }

    /* renamed from: j */
    public Long m17095j(String str) {
        String m17101p = m17101p(str);
        if (TextUtils.isEmpty(m17101p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m17101p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m17086z(str) + "(" + m17101p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String m17096k() {
        return m17101p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m17097l() {
        Integer m17088b = m17088b("gcm.n.notification_count");
        if (m17088b == null) {
            return null;
        }
        if (m17088b.intValue() >= 0) {
            return m17088b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + m17088b + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m17098m() {
        Integer m17088b = m17088b("gcm.n.notification_priority");
        if (m17088b == null) {
            return null;
        }
        if (m17088b.intValue() >= -2 && m17088b.intValue() <= 2) {
            return m17088b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + m17088b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m17099n(Resources resources, String str, String str2) {
        String m17101p = m17101p(str2);
        return !TextUtils.isEmpty(m17101p) ? m17101p : m17094i(resources, str, str2);
    }

    /* renamed from: o */
    public String m17100o() {
        String m17101p = m17101p("gcm.n.sound2");
        return TextUtils.isEmpty(m17101p) ? m17101p("gcm.n.sound") : m17101p;
    }

    /* renamed from: p */
    public String m17101p(String str) {
        return this.f13345a.getString(m17085w(str));
    }

    /* renamed from: q */
    public long[] m17102q() {
        JSONArray m17089c = m17089c("gcm.n.vibrate_timings");
        if (m17089c == null) {
            return null;
        }
        try {
            if (m17089c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = m17089c.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = m17089c.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m17089c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m17103r() {
        Integer m17088b = m17088b("gcm.n.visibility");
        if (m17088b == null) {
            return null;
        }
        if (m17088b.intValue() >= -1 && m17088b.intValue() <= 1) {
            return m17088b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + m17088b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle m17104x() {
        Bundle bundle = new Bundle(this.f13345a);
        for (String str : this.f13345a.keySet()) {
            if (!m17081s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m17105y() {
        Bundle bundle = new Bundle(this.f13345a);
        for (String str : this.f13345a.keySet()) {
            if (m17083u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
