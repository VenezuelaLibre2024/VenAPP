package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0854a;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.z0 */
/* loaded from: classes.dex */
public class C6272z0 {

    /* renamed from: a */
    final SharedPreferences f13430a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.z0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        private static final long f13431d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f13432a;

        /* renamed from: b */
        final String f13433b;

        /* renamed from: c */
        final long f13434c;

        private a(String str, String str2, long j10) {
            this.f13432a = str;
            this.f13433b = str2;
            this.f13434c = j10;
        }

        /* renamed from: a */
        static String m17221a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        /* renamed from: c */
        static a m17222c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString(Constants.TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m17223b(String str) {
            return System.currentTimeMillis() > this.f13434c + f13431d || !str.equals(this.f13433b);
        }
    }

    public C6272z0(Context context) {
        this.f13430a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m17214a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m17214a(Context context, String str) {
        File file = new File(C0854a.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m17219f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m17216c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    /* renamed from: b */
    private String m17215b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m17216c() {
        this.f13430a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m17217d(String str, String str2) {
        String m17215b = m17215b(str, str2);
        SharedPreferences.Editor edit = this.f13430a.edit();
        edit.remove(m17215b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized a m17218e(String str, String str2) {
        return a.m17222c(this.f13430a.getString(m17215b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m17219f() {
        return this.f13430a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m17220g(String str, String str2, String str3, String str4) {
        String m17221a = a.m17221a(str3, str4, System.currentTimeMillis());
        if (m17221a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f13430a.edit();
        edit.putString(m17215b(str, str2), m17221a);
        edit.commit();
    }
}
