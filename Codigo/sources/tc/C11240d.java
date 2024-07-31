package tc;

import android.os.Bundle;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p381uc.InterfaceC11529a;
import p381uc.InterfaceC11530b;
import sc.C10889g;

/* renamed from: tc.d */
/* loaded from: classes.dex */
public class C11240d implements InterfaceC11238b, InterfaceC11530b {

    /* renamed from: a */
    private InterfaceC11529a f29166a;

    /* renamed from: b */
    private static String m35121b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(Constants.PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    @Override // p381uc.InterfaceC11530b
    /* renamed from: a */
    public void mo32541a(InterfaceC11529a interfaceC11529a) {
        this.f29166a = interfaceC11529a;
        C10889g.m33216f().m33217b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // tc.InterfaceC11238b
    /* renamed from: c */
    public void mo35120c(String str, Bundle bundle) {
        InterfaceC11529a interfaceC11529a = this.f29166a;
        if (interfaceC11529a != null) {
            try {
                interfaceC11529a.mo36089a("$A$:" + m35121b(str, bundle));
            } catch (JSONException unused) {
                C10889g.m33216f().m33225k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
