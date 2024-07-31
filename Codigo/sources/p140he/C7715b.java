package p140he;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import io.flutter.plugins.firebase.auth.Constants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p485zb.C12867g;

/* renamed from: he.b */
/* loaded from: classes.dex */
public class C7715b {

    /* renamed from: c */
    private static final String[] f18378c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f18379a;

    /* renamed from: b */
    private final String f18380b;

    public C7715b(C12867g c12867g) {
        this.f18379a = c12867g.m42630m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f18380b = m23514b(c12867g);
    }

    /* renamed from: a */
    private String m23513a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m23514b(C12867g c12867g) {
        String m42647f = c12867g.m42632r().m42647f();
        if (m42647f != null) {
            return m42647f;
        }
        String m42644c = c12867g.m42632r().m42644c();
        if (!m42644c.startsWith("1:") && !m42644c.startsWith("2:")) {
            return m42644c;
        }
        String[] split = m42644c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m23515c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m23516d(String str) {
        try {
            return new JSONObject(str).getString(Constants.TOKEN);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m23517e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    /* renamed from: g */
    private String m23518g() {
        String string;
        synchronized (this.f18379a) {
            string = this.f18379a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m23519h() {
        synchronized (this.f18379a) {
            String string = this.f18379a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m23517e = m23517e(string);
            if (m23517e == null) {
                return null;
            }
            return m23515c(m23517e);
        }
    }

    /* renamed from: f */
    public String m23520f() {
        synchronized (this.f18379a) {
            String m23518g = m23518g();
            if (m23518g != null) {
                return m23518g;
            }
            return m23519h();
        }
    }

    /* renamed from: i */
    public String m23521i() {
        synchronized (this.f18379a) {
            for (String str : f18378c) {
                String string = this.f18379a.getString(m23513a(this.f18380b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m23516d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
