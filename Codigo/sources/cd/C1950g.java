package cd;

import org.json.JSONObject;
import sc.C10889g;
import vc.InterfaceC11867w;

/* renamed from: cd.g */
/* loaded from: classes.dex */
public class C1950g {

    /* renamed from: a */
    private final InterfaceC11867w f8021a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1950g(InterfaceC11867w interfaceC11867w) {
        this.f8021a = interfaceC11867w;
    }

    /* renamed from: a */
    private static InterfaceC1951h m10193a(int i10) {
        if (i10 == 3) {
            return new C1955l();
        }
        C10889g.m33216f().m33219d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new C1945b();
    }

    /* renamed from: b */
    public C1947d m10194b(JSONObject jSONObject) {
        return m10193a(jSONObject.getInt("settings_version")).mo10164a(this.f8021a, jSONObject);
    }
}
