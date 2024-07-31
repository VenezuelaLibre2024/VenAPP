package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0731a;
import androidx.core.content.C0854a;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.u */
/* loaded from: classes.dex */
class C6189u {

    /* renamed from: a */
    final SharedPreferences f13135a;

    /* renamed from: b */
    final Context f13136b;

    /* renamed from: c */
    private final Map<String, Long> f13137c = new C0731a();

    /* renamed from: com.google.firebase.iid.u$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: d */
        private static final long f13138d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f13139a;

        /* renamed from: b */
        final String f13140b;

        /* renamed from: c */
        final long f13141c;

        private a(String str, String str2, long j10) {
            this.f13139a = str;
            this.f13140b = str2;
            this.f13141c = j10;
        }

        /* renamed from: a */
        static String m16787a(String str, String str2, long j10) {
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
        /* renamed from: b */
        public static String m16788b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f13139a;
        }

        /* renamed from: d */
        static a m16789d(String str) {
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
        /* renamed from: c */
        public boolean m16790c(String str) {
            return System.currentTimeMillis() > this.f13141c + f13138d || !str.equals(this.f13140b);
        }
    }

    public C6189u(Context context) {
        this.f13136b = context;
        this.f13135a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m16776a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m16776a(String str) {
        File file = new File(C0854a.getNoBackupFilesDir(this.f13136b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m16784h()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            m16781d();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: b */
    static String m16777b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
        sb2.append(str);
        sb2.append("|S|cre");
        return sb2.toString();
    }

    /* renamed from: c */
    private String m16778c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: f */
    private long m16779f(String str) {
        String string = this.f13135a.getString(m16777b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: k */
    private long m16780k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f13135a.contains(m16777b(str, "cre"))) {
            return m16779f(str);
        }
        SharedPreferences.Editor edit = this.f13135a.edit();
        edit.putString(m16777b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    /* renamed from: d */
    public synchronized void m16781d() {
        this.f13137c.clear();
        this.f13135a.edit().clear().commit();
    }

    /* renamed from: e */
    public synchronized void m16782e(String str, String str2, String str3) {
        String m16778c = m16778c(str, str2, str3);
        SharedPreferences.Editor edit = this.f13135a.edit();
        edit.remove(m16778c);
        edit.commit();
    }

    /* renamed from: g */
    public synchronized a m16783g(String str, String str2, String str3) {
        return a.m16789d(this.f13135a.getString(m16778c(str, str2, str3), null));
    }

    /* renamed from: h */
    public synchronized boolean m16784h() {
        return this.f13135a.getAll().isEmpty();
    }

    /* renamed from: i */
    public synchronized void m16785i(String str, String str2, String str3, String str4, String str5) {
        String m16787a = a.m16787a(str4, str5, System.currentTimeMillis());
        if (m16787a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f13135a.edit();
        edit.putString(m16778c(str, str2, str3), m16787a);
        edit.commit();
    }

    /* renamed from: j */
    public synchronized long m16786j(String str) {
        long m16780k;
        m16780k = m16780k(str);
        this.f13137c.put(str, Long.valueOf(m16780k));
        return m16780k;
    }
}
