package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.AbstractC0210c;
import androidx.fragment.app.Fragment;
import ck.C2037v;
import com.facebook.internal.C4622h0;
import com.facebook.internal.C4634n0;
import com.facebook.login.AbstractC4664f0;
import com.facebook.login.C4689u;
import dk.C7042z;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.C7803g0;
import p152i4.C7824r;
import p152i4.C7830u;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC4674k0 extends AbstractC4664f0 {

    /* renamed from: d */
    private final EnumC7804h f8938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4674k0(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
        this.f8938d = EnumC7804h.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4674k0(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8938d = EnumC7804h.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m11572A(AbstractC4674k0 this$0, C4689u.e request, Bundle extras) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(request, "$request");
        C9322n.m27781e(extras, "$extras");
        try {
            this$0.m11583x(request, this$0.m11559k(request, extras));
        } catch (C7803g0 e10) {
            C7830u m23916c = e10.m23916c();
            this$0.m11582w(request, m23916c.m24101d(), m23916c.m24100c(), String.valueOf(m23916c.m24099b()));
        } catch (C7824r e11) {
            this$0.m11582w(request, null, e11.getMessage(), null);
        }
    }

    /* renamed from: r */
    private final void m11574r(C4689u.f fVar) {
        if (fVar != null) {
            m11555d().m11695g(fVar);
        } else {
            m11555d().m11688B();
        }
    }

    /* renamed from: y */
    private final boolean m11575y(Intent intent) {
        C9322n.m27780d(C7799e0.m23860l().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    /* renamed from: z */
    private final void m11576z(final C4689u.e eVar, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            C4634n0 c4634n0 = C4634n0.f8760a;
            if (!C4634n0.m11300d0(bundle.getString("code"))) {
                C7799e0.m23868t().execute(new Runnable() { // from class: com.facebook.login.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4674k0.m11572A(AbstractC4674k0.this, eVar, bundle);
                    }
                });
                return;
            }
        }
        m11583x(eVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public boolean m11577B(Intent intent, int i10) {
        AbstractC0210c<Intent> m11768i;
        if (intent == null || !m11575y(intent)) {
            return false;
        }
        Fragment m11698k = m11555d().m11698k();
        C2037v c2037v = null;
        C4693y c4693y = m11698k instanceof C4693y ? (C4693y) m11698k : null;
        if (c4693y != null && (m11768i = c4693y.m11768i()) != null) {
            m11768i.m836a(intent);
            c2037v = C2037v.f8089a;
        }
        return c2037v != null;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: j */
    public boolean mo11496j(int i10, int i11, Intent intent) {
        C4689u.f m11748d;
        C4689u.e m11701o = m11555d().m11701o();
        if (intent != null) {
            if (i11 == 0) {
                m11581v(m11701o, intent);
            } else if (i11 != -1) {
                m11748d = C4689u.f.c.m11748d(C4689u.f.f9032t, m11701o, "Unexpected resultCode from authorization.", null, null, 8, null);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    m11574r(C4689u.f.c.m11748d(C4689u.f.f9032t, m11701o, "Unexpected null from returned authorization data.", null, null, 8, null));
                    return true;
                }
                String m11578s = m11578s(extras);
                Object obj = extras.get("error_code");
                String obj2 = obj == null ? null : obj.toString();
                String m11579t = m11579t(extras);
                String string = extras.getString("e2e");
                if (!C4634n0.m11300d0(string)) {
                    m11557h(string);
                }
                if (m11578s == null && obj2 == null && m11579t == null && m11701o != null) {
                    m11576z(m11701o, extras);
                } else {
                    m11582w(m11701o, m11578s, m11579t, obj2);
                }
            }
            return true;
        }
        m11748d = C4689u.f.f9032t.m11749a(m11701o, "Operation canceled");
        m11574r(m11748d);
        return true;
    }

    /* renamed from: s */
    protected String m11578s(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_type");
    }

    /* renamed from: t */
    protected String m11579t(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    /* renamed from: u */
    public EnumC7804h mo11580u() {
        return this.f8938d;
    }

    /* renamed from: v */
    protected void m11581v(C4689u.e eVar, Intent data) {
        Object obj;
        C9322n.m27781e(data, "data");
        Bundle extras = data.getExtras();
        String m11578s = m11578s(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        m11574r(C9322n.m27777a(C4622h0.m11212c(), str) ? C4689u.f.f9032t.m11751c(eVar, m11578s, m11579t(extras), str) : C4689u.f.f9032t.m11749a(eVar, m11578s));
    }

    /* renamed from: w */
    protected void m11582w(C4689u.e eVar, String str, String str2, String str3) {
        boolean m20638x;
        boolean m20638x2;
        if (str == null || !C9322n.m27777a(str, "logged_out")) {
            m20638x = C7042z.m20638x(C4622h0.m11213d(), str);
            if (!m20638x) {
                m20638x2 = C7042z.m20638x(C4622h0.m11214e(), str);
                m11574r(m20638x2 ? C4689u.f.f9032t.m11749a(eVar, null) : C4689u.f.f9032t.m11751c(eVar, str, str2, str3));
                return;
            }
        } else {
            C4657c.f8879w = true;
        }
        m11574r(null);
    }

    /* renamed from: x */
    protected void m11583x(C4689u.e request, Bundle extras) {
        C9322n.m27781e(request, "request");
        C9322n.m27781e(extras, "extras");
        try {
            AbstractC4664f0.a aVar = AbstractC4664f0.f8911c;
            m11574r(C4689u.f.f9032t.m11750b(request, aVar.m11563b(request.m11730n(), extras, mo11580u(), request.m11717a()), aVar.m11565d(extras, request.m11729m())));
        } catch (C7824r e10) {
            m11574r(C4689u.f.c.m11748d(C4689u.f.f9032t, request, null, e10.getMessage(), null, 8, null));
        }
    }
}
