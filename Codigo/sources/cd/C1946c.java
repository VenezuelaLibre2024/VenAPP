package cd;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p486zc.C12879a;
import p486zc.C12880b;
import p486zc.C12881c;
import sc.C10889g;
import vc.C11857r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cd.c */
/* loaded from: classes.dex */
public class C1946c implements InterfaceC1954k {

    /* renamed from: a */
    private final String f7995a;

    /* renamed from: b */
    private final C12880b f7996b;

    /* renamed from: c */
    private final C10889g f7997c;

    public C1946c(String str, C12880b c12880b) {
        this(str, c12880b, C10889g.m33216f());
    }

    C1946c(String str, C12880b c12880b, C10889g c10889g) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f7997c = c10889g;
        this.f7996b = c12880b;
        this.f7995a = str;
    }

    /* renamed from: b */
    private C12879a m10165b(C12879a c12879a, C1953j c1953j) {
        m10166c(c12879a, "X-CRASHLYTICS-GOOGLE-APP-ID", c1953j.f8022a);
        m10166c(c12879a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m10166c(c12879a, "X-CRASHLYTICS-API-CLIENT-VERSION", C11857r.m37873l());
        m10166c(c12879a, "Accept", "application/json");
        m10166c(c12879a, "X-CRASHLYTICS-DEVICE-MODEL", c1953j.f8023b);
        m10166c(c12879a, "X-CRASHLYTICS-OS-BUILD-VERSION", c1953j.f8024c);
        m10166c(c12879a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c1953j.f8025d);
        m10166c(c12879a, "X-CRASHLYTICS-INSTALLATION-ID", c1953j.f8026e.mo37682a().mo37689c());
        return c12879a;
    }

    /* renamed from: c */
    private void m10166c(C12879a c12879a, String str, String str2) {
        if (str2 != null) {
            c12879a.m42664d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m10167e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f7997c.m33226l("Failed to parse settings JSON from " + this.f7995a, e10);
            this.f7997c.m33225k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m10168f(C1953j c1953j) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c1953j.f8029h);
        hashMap.put("display_version", c1953j.f8028g);
        hashMap.put("source", Integer.toString(c1953j.f8030i));
        String str = c1953j.f8027f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // cd.InterfaceC1954k
    /* renamed from: a */
    public JSONObject mo10169a(C1953j c1953j, boolean z10) {
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> m10168f = m10168f(c1953j);
            C12879a m10165b = m10165b(m10170d(m10168f), c1953j);
            this.f7997c.m33217b("Requesting settings from " + this.f7995a);
            this.f7997c.m33223i("Settings query params were: " + m10168f);
            return m10171g(m10165b.m42663c());
        } catch (IOException e10) {
            this.f7997c.m33220e("Settings request failed.", e10);
            return null;
        }
    }

    /* renamed from: d */
    protected C12879a m10170d(Map<String, String> map) {
        return this.f7996b.m42665a(this.f7995a, map).m42664d("User-Agent", "Crashlytics Android SDK/" + C11857r.m37873l()).m42664d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: g */
    JSONObject m10171g(C12881c c12881c) {
        int m42667b = c12881c.m42667b();
        this.f7997c.m33223i("Settings response code was: " + m42667b);
        if (m10172h(m42667b)) {
            return m10167e(c12881c.m42666a());
        }
        this.f7997c.m33219d("Settings request failed; (status: " + m42667b + ") from " + this.f7995a);
        return null;
    }

    /* renamed from: h */
    boolean m10172h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }
}
