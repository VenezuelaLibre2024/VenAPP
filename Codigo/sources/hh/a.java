package hh;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.security.crypto.a;
import androidx.security.crypto.c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.it_nomads.fluttersecurestorage.ciphers.i;
import com.it_nomads.fluttersecurestorage.ciphers.m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private final Context f16786c;

    /* renamed from: e, reason: collision with root package name */
    protected Map<String, Object> f16788e;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences f16790g;

    /* renamed from: h, reason: collision with root package name */
    private i f16791h;

    /* renamed from: i, reason: collision with root package name */
    private m f16792i;

    /* renamed from: a, reason: collision with root package name */
    private final String f16784a = "SecureStorageAndroid";

    /* renamed from: d, reason: collision with root package name */
    protected String f16787d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* renamed from: f, reason: collision with root package name */
    private String f16789f = "FlutterSecureStorage";

    /* renamed from: j, reason: collision with root package name */
    private Boolean f16793j = Boolean.FALSE;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f16785b = StandardCharsets.UTF_8;

    public a(Context context, Map<String, Object> map) {
        this.f16788e = map;
        this.f16786c = context.getApplicationContext();
    }

    private void b(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f16787d)) {
                    sharedPreferences2.edit().putString(key, d((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f16792i.d(edit);
            edit.apply();
        } catch (Exception e10) {
            Log.e("SecureStorageAndroid", "Data migration failed", e10);
        }
    }

    private String d(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f16791h.b(Base64.decode(str, 0)), this.f16785b);
    }

    private void g() {
        h();
        SharedPreferences sharedPreferences = this.f16786c.getSharedPreferences(this.f16789f, 0);
        if (this.f16791h == null) {
            try {
                k(sharedPreferences);
            } catch (Exception e10) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e10);
            }
        }
        if (!j()) {
            this.f16790g = sharedPreferences;
            return;
        }
        try {
            SharedPreferences l10 = l(this.f16786c);
            this.f16790g = l10;
            b(sharedPreferences, l10);
        } catch (Exception e11) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e11);
            this.f16790g = sharedPreferences;
            this.f16793j = Boolean.TRUE;
        }
    }

    private boolean j() {
        return !this.f16793j.booleanValue() && this.f16788e.containsKey("encryptedSharedPreferences") && this.f16788e.get("encryptedSharedPreferences").equals("true");
    }

    private void k(SharedPreferences sharedPreferences) {
        i a10;
        this.f16792i = new m(sharedPreferences, this.f16788e);
        if (j()) {
            a10 = this.f16792i.c(this.f16786c);
        } else {
            if (this.f16792i.e()) {
                m(this.f16792i, sharedPreferences);
                return;
            }
            a10 = this.f16792i.a(this.f16786c);
        }
        this.f16791h = a10;
    }

    private SharedPreferences l(Context context) {
        return androidx.security.crypto.a.a(context, this.f16789f, new c.a(context).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(RecognitionOptions.QR_CODE).build()).a(), a.d.AES256_SIV, a.e.AES256_GCM);
    }

    private void m(m mVar, SharedPreferences sharedPreferences) {
        try {
            this.f16791h = mVar.c(this.f16786c);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f16787d)) {
                    hashMap.put(key, d((String) value));
                }
            }
            this.f16791h = mVar.a(this.f16786c);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(this.f16791h.a(((String) entry2.getValue()).getBytes(this.f16785b)), 0));
            }
            mVar.f(edit);
            edit.apply();
        } catch (Exception e10) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e10);
            this.f16791h = mVar.c(this.f16786c);
        }
    }

    public String a(String str) {
        return this.f16787d + "_" + str;
    }

    public boolean c(String str) {
        g();
        return this.f16790g.contains(str);
    }

    public void e(String str) {
        g();
        SharedPreferences.Editor edit = this.f16790g.edit();
        edit.remove(str);
        edit.apply();
    }

    public void f() {
        g();
        SharedPreferences.Editor edit = this.f16790g.edit();
        edit.clear();
        if (!j()) {
            this.f16792i.f(edit);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        if (this.f16788e.containsKey("sharedPreferencesName") && !((String) this.f16788e.get("sharedPreferencesName")).isEmpty()) {
            this.f16789f = (String) this.f16788e.get("sharedPreferencesName");
        }
        if (!this.f16788e.containsKey("preferencesKeyPrefix") || ((String) this.f16788e.get("preferencesKeyPrefix")).isEmpty()) {
            return;
        }
        this.f16787d = (String) this.f16788e.get("preferencesKeyPrefix");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f16788e.containsKey("resetOnError") && this.f16788e.get("resetOnError").equals("true");
    }

    public String n(String str) {
        g();
        String string = this.f16790g.getString(str, null);
        return j() ? string : d(string);
    }

    public Map<String, String> o() {
        g();
        Map<String, ?> all = this.f16790g.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f16787d)) {
                String replaceFirst = entry.getKey().replaceFirst(this.f16787d + '_', "");
                boolean j10 = j();
                String str = (String) entry.getValue();
                if (!j10) {
                    str = d(str);
                }
                hashMap.put(replaceFirst, str);
            }
        }
        return hashMap;
    }

    public void p(String str, String str2) {
        g();
        SharedPreferences.Editor edit = this.f16790g.edit();
        if (!j()) {
            str2 = Base64.encodeToString(this.f16791h.a(str2.getBytes(this.f16785b)), 0);
        }
        edit.putString(str, str2);
        edit.apply();
    }
}
