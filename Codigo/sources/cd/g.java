package cd;

import org.json.JSONObject;
import vc.w;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final w f7069a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(w wVar) {
        this.f7069a = wVar;
    }

    private static h a(int i10) {
        if (i10 == 3) {
            return new l();
        }
        sc.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f7069a, jSONObject);
    }
}
