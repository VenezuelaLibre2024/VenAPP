package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f11920a;

    /* renamed from: b, reason: collision with root package name */
    final Context f11921b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f11922c = new androidx.collection.a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f11923d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f11924a;

        /* renamed from: b, reason: collision with root package name */
        final String f11925b;

        /* renamed from: c, reason: collision with root package name */
        final long f11926c;

        private a(String str, String str2, long j10) {
            this.f11924a = str;
            this.f11925b = str2;
            this.f11926c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f11924a;
        }

        static a d(String str) {
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
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(String str) {
            return System.currentTimeMillis() > this.f11926c + f11923d || !str.equals(this.f11925b);
        }
    }

    public u(Context context) {
        this.f11921b = context;
        this.f11920a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    private void a(String str) {
        File file = new File(androidx.core.content.a.getNoBackupFilesDir(this.f11921b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || h()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            d();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
        sb2.append(str);
        sb2.append("|S|cre");
        return sb2.toString();
    }

    private String c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        return sb2.toString();
    }

    private long f(String str) {
        String string = this.f11920a.getString(b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private long k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f11920a.contains(b(str, "cre"))) {
            return f(str);
        }
        SharedPreferences.Editor edit = this.f11920a.edit();
        edit.putString(b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    public synchronized void d() {
        this.f11922c.clear();
        this.f11920a.edit().clear().commit();
    }

    public synchronized void e(String str, String str2, String str3) {
        String c10 = c(str, str2, str3);
        SharedPreferences.Editor edit = this.f11920a.edit();
        edit.remove(c10);
        edit.commit();
    }

    public synchronized a g(String str, String str2, String str3) {
        return a.d(this.f11920a.getString(c(str, str2, str3), null));
    }

    public synchronized boolean h() {
        return this.f11920a.getAll().isEmpty();
    }

    public synchronized void i(String str, String str2, String str3, String str4, String str5) {
        String a10 = a.a(str4, str5, System.currentTimeMillis());
        if (a10 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f11920a.edit();
        edit.putString(c(str, str2, str3), a10);
        edit.commit();
    }

    public synchronized long j(String str) {
        long k10;
        k10 = k(str);
        this.f11922c.put(str, Long.valueOf(k10));
        return k10;
    }
}
