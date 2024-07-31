package cd;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import vc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements k {

    /* renamed from: a, reason: collision with root package name */
    private final String f7043a;

    /* renamed from: b, reason: collision with root package name */
    private final zc.b f7044b;

    /* renamed from: c, reason: collision with root package name */
    private final sc.g f7045c;

    public c(String str, zc.b bVar) {
        this(str, bVar, sc.g.f());
    }

    c(String str, zc.b bVar, sc.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f7045c = gVar;
        this.f7044b = bVar;
        this.f7043a = str;
    }

    private zc.a b(zc.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f7070a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", r.l());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f7071b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f7072c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f7073d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f7074e.a().c());
        return aVar;
    }

    private void c(zc.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f7045c.l("Failed to parse settings JSON from " + this.f7043a, e10);
            this.f7045c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f7077h);
        hashMap.put("display_version", jVar.f7076g);
        hashMap.put("source", Integer.toString(jVar.f7078i));
        String str = jVar.f7075f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // cd.k
    public JSONObject a(j jVar, boolean z10) {
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> f10 = f(jVar);
            zc.a b10 = b(d(f10), jVar);
            this.f7045c.b("Requesting settings from " + this.f7043a);
            this.f7045c.i("Settings query params were: " + f10);
            return g(b10.c());
        } catch (IOException e10) {
            this.f7045c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected zc.a d(Map<String, String> map) {
        return this.f7044b.a(this.f7043a, map).d("User-Agent", "Crashlytics Android SDK/" + r.l()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(zc.c cVar) {
        int b10 = cVar.b();
        this.f7045c.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        this.f7045c.d("Settings request failed; (status: " + b10 + ") from " + this.f7043a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }
}
