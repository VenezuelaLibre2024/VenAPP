package p143hh;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.security.crypto.C1421c;
import androidx.security.crypto.SharedPreferencesC1419a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.it_nomads.fluttersecurestorage.ciphers.C6647m;
import com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6643i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hh.a */
/* loaded from: classes.dex */
public class C7736a {

    /* renamed from: c */
    private final Context f18436c;

    /* renamed from: e */
    protected Map<String, Object> f18438e;

    /* renamed from: g */
    private SharedPreferences f18440g;

    /* renamed from: h */
    private InterfaceC6643i f18441h;

    /* renamed from: i */
    private C6647m f18442i;

    /* renamed from: a */
    private final String f18434a = "SecureStorageAndroid";

    /* renamed from: d */
    protected String f18437d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* renamed from: f */
    private String f18439f = "FlutterSecureStorage";

    /* renamed from: j */
    private Boolean f18443j = Boolean.FALSE;

    /* renamed from: b */
    private final Charset f18435b = StandardCharsets.UTF_8;

    public C7736a(Context context, Map<String, Object> map) {
        this.f18438e = map;
        this.f18436c = context.getApplicationContext();
    }

    /* renamed from: b */
    private void m23609b(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f18437d)) {
                    sharedPreferences2.edit().putString(key, m23610d((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f18442i.m19384d(edit);
            edit.apply();
        } catch (Exception e10) {
            Log.e("SecureStorageAndroid", "Data migration failed", e10);
        }
    }

    /* renamed from: d */
    private String m23610d(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f18441h.mo19374b(Base64.decode(str, 0)), this.f18435b);
    }

    /* renamed from: g */
    private void m23611g() {
        m23620h();
        SharedPreferences sharedPreferences = this.f18436c.getSharedPreferences(this.f18439f, 0);
        if (this.f18441h == null) {
            try {
                m23613k(sharedPreferences);
            } catch (Exception e10) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e10);
            }
        }
        if (!m23612j()) {
            this.f18440g = sharedPreferences;
            return;
        }
        try {
            SharedPreferences m23614l = m23614l(this.f18436c);
            this.f18440g = m23614l;
            m23609b(sharedPreferences, m23614l);
        } catch (Exception e11) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e11);
            this.f18440g = sharedPreferences;
            this.f18443j = Boolean.TRUE;
        }
    }

    /* renamed from: j */
    private boolean m23612j() {
        return !this.f18443j.booleanValue() && this.f18438e.containsKey("encryptedSharedPreferences") && this.f18438e.get("encryptedSharedPreferences").equals("true");
    }

    /* renamed from: k */
    private void m23613k(SharedPreferences sharedPreferences) {
        InterfaceC6643i m19382a;
        this.f18442i = new C6647m(sharedPreferences, this.f18438e);
        if (m23612j()) {
            m19382a = this.f18442i.m19383c(this.f18436c);
        } else {
            if (this.f18442i.m19385e()) {
                m23615m(this.f18442i, sharedPreferences);
                return;
            }
            m19382a = this.f18442i.m19382a(this.f18436c);
        }
        this.f18441h = m19382a;
    }

    /* renamed from: l */
    private SharedPreferences m23614l(Context context) {
        return SharedPreferencesC1419a.m8123a(context, this.f18439f, new C1421c.a(context).m8144b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(RecognitionOptions.QR_CODE).build()).m8143a(), SharedPreferencesC1419a.d.AES256_SIV, SharedPreferencesC1419a.e.AES256_GCM);
    }

    /* renamed from: m */
    private void m23615m(C6647m c6647m, SharedPreferences sharedPreferences) {
        try {
            this.f18441h = c6647m.m19383c(this.f18436c);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f18437d)) {
                    hashMap.put(key, m23610d((String) value));
                }
            }
            this.f18441h = c6647m.m19382a(this.f18436c);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(this.f18441h.mo19373a(((String) entry2.getValue()).getBytes(this.f18435b)), 0));
            }
            c6647m.m19386f(edit);
            edit.apply();
        } catch (Exception e10) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e10);
            this.f18441h = c6647m.m19383c(this.f18436c);
        }
    }

    /* renamed from: a */
    public String m23616a(String str) {
        return this.f18437d + "_" + str;
    }

    /* renamed from: c */
    public boolean m23617c(String str) {
        m23611g();
        return this.f18440g.contains(str);
    }

    /* renamed from: e */
    public void m23618e(String str) {
        m23611g();
        SharedPreferences.Editor edit = this.f18440g.edit();
        edit.remove(str);
        edit.apply();
    }

    /* renamed from: f */
    public void m23619f() {
        m23611g();
        SharedPreferences.Editor edit = this.f18440g.edit();
        edit.clear();
        if (!m23612j()) {
            this.f18442i.m19386f(edit);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m23620h() {
        if (this.f18438e.containsKey("sharedPreferencesName") && !((String) this.f18438e.get("sharedPreferencesName")).isEmpty()) {
            this.f18439f = (String) this.f18438e.get("sharedPreferencesName");
        }
        if (!this.f18438e.containsKey("preferencesKeyPrefix") || ((String) this.f18438e.get("preferencesKeyPrefix")).isEmpty()) {
            return;
        }
        this.f18437d = (String) this.f18438e.get("preferencesKeyPrefix");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m23621i() {
        return this.f18438e.containsKey("resetOnError") && this.f18438e.get("resetOnError").equals("true");
    }

    /* renamed from: n */
    public String m23622n(String str) {
        m23611g();
        String string = this.f18440g.getString(str, null);
        return m23612j() ? string : m23610d(string);
    }

    /* renamed from: o */
    public Map<String, String> m23623o() {
        m23611g();
        Map<String, ?> all = this.f18440g.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f18437d)) {
                String replaceFirst = entry.getKey().replaceFirst(this.f18437d + '_', "");
                boolean m23612j = m23612j();
                String str = (String) entry.getValue();
                if (!m23612j) {
                    str = m23610d(str);
                }
                hashMap.put(replaceFirst, str);
            }
        }
        return hashMap;
    }

    /* renamed from: p */
    public void m23624p(String str, String str2) {
        m23611g();
        SharedPreferences.Editor edit = this.f18440g.edit();
        if (!m23612j()) {
            str2 = Base64.encodeToString(this.f18441h.mo19373a(str2.getBytes(this.f18435b)), 0);
        }
        edit.putString(str, str2);
        edit.apply();
    }
}
