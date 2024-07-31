package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.login.f0;
import com.facebook.login.u;

/* loaded from: classes.dex */
public abstract class k0 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    private final i4.h f7958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
        this.f7958d = i4.h.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f7958d = i4.h.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(k0 this$0, u.e request, Bundle extras) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(request, "$request");
        kotlin.jvm.internal.n.e(extras, "$extras");
        try {
            this$0.x(request, this$0.k(request, extras));
        } catch (i4.g0 e10) {
            i4.u c10 = e10.c();
            this$0.w(request, c10.d(), c10.c(), String.valueOf(c10.b()));
        } catch (i4.r e11) {
            this$0.w(request, null, e11.getMessage(), null);
        }
    }

    private final void r(u.f fVar) {
        if (fVar != null) {
            d().g(fVar);
        } else {
            d().B();
        }
    }

    private final boolean y(Intent intent) {
        kotlin.jvm.internal.n.d(i4.e0.l().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    private final void z(final u.e eVar, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
            if (!com.facebook.internal.n0.d0(bundle.getString("code"))) {
                i4.e0.t().execute(new Runnable() { // from class: com.facebook.login.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0.A(k0.this, eVar, bundle);
                    }
                });
                return;
            }
        }
        x(eVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean B(Intent intent, int i10) {
        androidx.activity.result.c<Intent> i11;
        if (intent == null || !y(intent)) {
            return false;
        }
        Fragment k10 = d().k();
        ck.v vVar = null;
        y yVar = k10 instanceof y ? (y) k10 : null;
        if (yVar != null && (i11 = yVar.i()) != null) {
            i11.a(intent);
            vVar = ck.v.f7137a;
        }
        return vVar != null;
    }

    @Override // com.facebook.login.f0
    public boolean j(int i10, int i11, Intent intent) {
        u.f d10;
        u.e o10 = d().o();
        if (intent != null) {
            if (i11 == 0) {
                v(o10, intent);
            } else if (i11 != -1) {
                d10 = u.f.c.d(u.f.f8033t, o10, "Unexpected resultCode from authorization.", null, null, 8, null);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    r(u.f.c.d(u.f.f8033t, o10, "Unexpected null from returned authorization data.", null, null, 8, null));
                    return true;
                }
                String s10 = s(extras);
                Object obj = extras.get("error_code");
                String obj2 = obj == null ? null : obj.toString();
                String t10 = t(extras);
                String string = extras.getString("e2e");
                if (!com.facebook.internal.n0.d0(string)) {
                    h(string);
                }
                if (s10 == null && obj2 == null && t10 == null && o10 != null) {
                    z(o10, extras);
                } else {
                    w(o10, s10, t10, obj2);
                }
            }
            return true;
        }
        d10 = u.f.f8033t.a(o10, "Operation canceled");
        r(d10);
        return true;
    }

    protected String s(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_type");
    }

    protected String t(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    public i4.h u() {
        return this.f7958d;
    }

    protected void v(u.e eVar, Intent data) {
        Object obj;
        kotlin.jvm.internal.n.e(data, "data");
        Bundle extras = data.getExtras();
        String s10 = s(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        r(kotlin.jvm.internal.n.a(com.facebook.internal.h0.c(), str) ? u.f.f8033t.c(eVar, s10, t(extras), str) : u.f.f8033t.a(eVar, s10));
    }

    protected void w(u.e eVar, String str, String str2, String str3) {
        boolean x10;
        boolean x11;
        if (str == null || !kotlin.jvm.internal.n.a(str, "logged_out")) {
            x10 = dk.z.x(com.facebook.internal.h0.d(), str);
            if (!x10) {
                x11 = dk.z.x(com.facebook.internal.h0.e(), str);
                r(x11 ? u.f.f8033t.a(eVar, null) : u.f.f8033t.c(eVar, str, str2, str3));
                return;
            }
        } else {
            c.f7899w = true;
        }
        r(null);
    }

    protected void x(u.e request, Bundle extras) {
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(extras, "extras");
        try {
            f0.a aVar = f0.f7931c;
            r(u.f.f8033t.b(request, aVar.b(request.n(), extras, u(), request.a()), aVar.d(extras, request.m())));
        } catch (i4.r e10) {
            r(u.f.c.d(u.f.f8033t, request, null, e10.getMessage(), null, 8, null));
        }
    }
}
