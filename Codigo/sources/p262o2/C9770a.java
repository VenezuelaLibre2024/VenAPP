package p262o2;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.login.C4662e0;
import com.facebook.login.EnumC4688t;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p152i4.C7787a;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.InterfaceC7814m;
import p152i4.InterfaceC7825r0;

/* renamed from: o2.a */
/* loaded from: classes.dex */
public class C9770a {

    /* renamed from: a */
    private final C4662e0 f24075a;

    /* renamed from: b */
    C9771b f24076b;

    /* renamed from: o2.a$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC7825r0 {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f24077a;

        a(MethodChannel.Result result) {
            this.f24077a = result;
        }

        @Override // p152i4.InterfaceC7825r0
        /* renamed from: a */
        public void mo24085a() {
            this.f24077a.error("CANCELLED", "User has cancelled login with facebook", null);
        }

        @Override // p152i4.InterfaceC7825r0
        /* renamed from: b */
        public void mo24086b(C7787a c7787a) {
            this.f24077a.success(C9770a.m29310b(c7787a));
        }

        @Override // p152i4.InterfaceC7825r0
        /* renamed from: c */
        public void mo24087c(Exception exc) {
            this.f24077a.error("FAILED", exc.getMessage(), null);
        }
    }

    /* renamed from: o2.a$b */
    /* loaded from: classes.dex */
    class b implements C7807i0.d {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f24079a;

        b(MethodChannel.Result result) {
            this.f24079a = result;
        }

        @Override // p152i4.C7807i0.d
        /* renamed from: a */
        public void mo24003a(JSONObject jSONObject, C7817n0 c7817n0) {
            try {
                this.f24079a.success(jSONObject.toString());
            } catch (Exception e10) {
                this.f24079a.error("FAILED", e10.getMessage(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.a$c */
    /* loaded from: classes.dex */
    public class c extends HashMap<String, Object> {

        /* renamed from: a */
        final /* synthetic */ C7787a f24081a;

        c(C7787a c7787a) {
            this.f24081a = c7787a;
            put(Constants.TOKEN, c7787a.m23770m());
            put(io.flutter.plugins.firebase.analytics.Constants.USER_ID, c7787a.m23771n());
            put("expires", Long.valueOf(c7787a.m23765h().getTime()));
            put("applicationId", c7787a.m23761c());
            put("lastRefresh", Long.valueOf(c7787a.m23767j().getTime()));
            put("isExpired", Boolean.valueOf(c7787a.m23772o()));
            put("grantedPermissions", new ArrayList(c7787a.m23768k()));
            put("declinedPermissions", new ArrayList(c7787a.m23763f()));
            put("dataAccessExpirationTime", Long.valueOf(c7787a.m23762e().getTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9770a() {
        C4662e0 m11523j = C4662e0.m11523j();
        this.f24075a = m11523j;
        InterfaceC7814m m24035a = InterfaceC7814m.a.m24035a();
        C9771b c9771b = new C9771b(m24035a);
        this.f24076b = c9771b;
        m11523j.m11540s(m24035a, c9771b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static HashMap<String, Object> m29310b(C7787a c7787a) {
        return new c(c7787a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m29311a(Activity activity, MethodChannel.Result result) {
        C4662e0.m11523j().m11542w(activity, new a(result));
    }

    /* renamed from: c */
    public void m29312c(MethodChannel.Result result) {
        C7787a m23759d = C7787a.m23759d();
        result.success(m23759d != null && !m23759d.m23772o() ? m29310b(C7787a.m23759d()) : null);
    }

    /* renamed from: d */
    public void m29313d(String str, MethodChannel.Result result) {
        C7807i0 m23925B = C7807i0.m23925B(C7787a.m23759d(), new b(result));
        Bundle bundle = new Bundle();
        bundle.putString("fields", str);
        m23925B.m23947H(bundle);
        m23925B.m23950l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m29314e(MethodChannel.Result result) {
        if (C7787a.m23759d() != null) {
            this.f24075a.m11538o();
        }
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m29315f(Activity activity, List<String> list, MethodChannel.Result result) {
        if (C7787a.m23759d() != null) {
            this.f24075a.m11538o();
        }
        if (this.f24076b.m29320e(result)) {
            this.f24075a.m11537n(activity, list);
        }
    }

    /* renamed from: g */
    public void m29316g(String str) {
        EnumC4688t enumC4688t;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2088866749:
                if (str.equals("DIALOG_ONLY")) {
                    c10 = 0;
                    break;
                }
                break;
            case -361463084:
                if (str.equals("NATIVE_ONLY")) {
                    c10 = 1;
                    break;
                }
                break;
            case 93577687:
                if (str.equals("WEB_ONLY")) {
                    c10 = 2;
                    break;
                }
                break;
            case 639074801:
                if (str.equals("DEVICE_AUTH")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1052231445:
                if (str.equals("KATANA_ONLY")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                enumC4688t = EnumC4688t.DIALOG_ONLY;
                break;
            case 1:
                enumC4688t = EnumC4688t.NATIVE_ONLY;
                break;
            case 2:
                enumC4688t = EnumC4688t.WEB_ONLY;
                break;
            case 3:
                enumC4688t = EnumC4688t.DEVICE_AUTH;
                break;
            case 4:
                enumC4688t = EnumC4688t.KATANA_ONLY;
                break;
            default:
                enumC4688t = EnumC4688t.NATIVE_WITH_FALLBACK;
                break;
        }
        this.f24075a.m11533A(enumC4688t);
    }
}
