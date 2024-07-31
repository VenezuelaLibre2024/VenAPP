package o2;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.login.e0;
import com.facebook.login.t;
import i4.i0;
import i4.m;
import i4.n0;
import i4.r0;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final e0 f22142a;

    /* renamed from: b */
    o2.b f22143b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.a$a */
    /* loaded from: classes.dex */
    public class C0365a implements r0 {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f22144a;

        C0365a(MethodChannel.Result result) {
            this.f22144a = result;
        }

        @Override // i4.r0
        public void a() {
            this.f22144a.error("CANCELLED", "User has cancelled login with facebook", null);
        }

        @Override // i4.r0
        public void b(i4.a aVar) {
            this.f22144a.success(a.b(aVar));
        }

        @Override // i4.r0
        public void c(Exception exc) {
            this.f22144a.error("FAILED", exc.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements i0.d {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f22146a;

        b(MethodChannel.Result result) {
            this.f22146a = result;
        }

        @Override // i4.i0.d
        public void a(JSONObject jSONObject, n0 n0Var) {
            try {
                this.f22146a.success(jSONObject.toString());
            } catch (Exception e10) {
                this.f22146a.error("FAILED", e10.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends HashMap<String, Object> {

        /* renamed from: a */
        final /* synthetic */ i4.a f22148a;

        c(i4.a aVar) {
            this.f22148a = aVar;
            put(Constants.TOKEN, aVar.m());
            put(io.flutter.plugins.firebase.analytics.Constants.USER_ID, aVar.n());
            put("expires", Long.valueOf(aVar.h().getTime()));
            put("applicationId", aVar.c());
            put("lastRefresh", Long.valueOf(aVar.j().getTime()));
            put("isExpired", Boolean.valueOf(aVar.o()));
            put("grantedPermissions", new ArrayList(aVar.k()));
            put("declinedPermissions", new ArrayList(aVar.f()));
            put("dataAccessExpirationTime", Long.valueOf(aVar.e().getTime()));
        }
    }

    public a() {
        e0 j10 = e0.j();
        this.f22142a = j10;
        m a10 = m.a.a();
        o2.b bVar = new o2.b(a10);
        this.f22143b = bVar;
        j10.s(a10, bVar);
    }

    public static HashMap<String, Object> b(i4.a aVar) {
        return new c(aVar);
    }

    public void a(Activity activity, MethodChannel.Result result) {
        e0.j().w(activity, new C0365a(result));
    }

    public void c(MethodChannel.Result result) {
        i4.a d10 = i4.a.d();
        result.success(d10 != null && !d10.o() ? b(i4.a.d()) : null);
    }

    public void d(String str, MethodChannel.Result result) {
        i0 B = i0.B(i4.a.d(), new b(result));
        Bundle bundle = new Bundle();
        bundle.putString("fields", str);
        B.H(bundle);
        B.l();
    }

    public void e(MethodChannel.Result result) {
        if (i4.a.d() != null) {
            this.f22142a.o();
        }
        result.success(null);
    }

    public void f(Activity activity, List<String> list, MethodChannel.Result result) {
        if (i4.a.d() != null) {
            this.f22142a.o();
        }
        if (this.f22143b.e(result)) {
            this.f22142a.n(activity, list);
        }
    }

    public void g(String str) {
        t tVar;
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
                tVar = t.DIALOG_ONLY;
                break;
            case 1:
                tVar = t.NATIVE_ONLY;
                break;
            case 2:
                tVar = t.WEB_ONLY;
                break;
            case 3:
                tVar = t.DEVICE_AUTH;
                break;
            case 4:
                tVar = t.KATANA_ONLY;
                break;
            default:
                tVar = t.NATIVE_WITH_FALLBACK;
                break;
        }
        this.f22142a.A(tVar);
    }
}
