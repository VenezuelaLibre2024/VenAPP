package p487zd;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p029bk.InterfaceC1806a;
import p043ce.InterfaceC1956a;
import p464yb.C12660b;
import p485zb.C12867g;
import pf.C10164b;
import pf.C10165c;
import pf.C10166d;
import pf.C10167e;

/* renamed from: zd.d */
/* loaded from: classes.dex */
public class C12897d {

    /* renamed from: a */
    private final InterfaceC1806a<C12938l0> f35121a;

    /* renamed from: b */
    private final C12867g f35122b;

    /* renamed from: c */
    private final Application f35123c;

    /* renamed from: d */
    private final InterfaceC1956a f35124d;

    /* renamed from: e */
    private final C12987v2 f35125e;

    public C12897d(InterfaceC1806a<C12938l0> interfaceC1806a, C12867g c12867g, Application application, InterfaceC1956a interfaceC1956a, C12987v2 c12987v2) {
        this.f35121a = interfaceC1806a;
        this.f35122b = c12867g;
        this.f35123c = application;
        this.f35124d = interfaceC1956a;
        this.f35125e = c12987v2;
    }

    /* renamed from: a */
    private C10165c m42701a(AbstractC12935k2 abstractC12935k2) {
        return C10165c.m30399f0().m30405K(this.f35122b.m42632r().m42644c()).m30403I(abstractC12935k2.mo42706b()).m30404J(abstractC12935k2.mo42707c().mo16814b()).build();
    }

    /* renamed from: b */
    private C12660b m42702b() {
        C12660b.a m41654L = C12660b.m41646g0().m41653K(String.valueOf(Build.VERSION.SDK_INT)).m41652J(Locale.getDefault().toString()).m41654L(TimeZone.getDefault().getID());
        String m42703d = m42703d();
        if (!TextUtils.isEmpty(m42703d)) {
            m41654L.m41651I(m42703d);
        }
        return m41654L.build();
    }

    /* renamed from: d */
    private String m42703d() {
        try {
            return this.f35123c.getPackageManager().getPackageInfo(this.f35123c.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            C12940l2.m42841b("Error finding versionName : " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    private C10167e m42704e(C10167e c10167e) {
        return (c10167e.m30428e0() < this.f35124d.mo10198a() + TimeUnit.MINUTES.toMillis(1L) || c10167e.m30428e0() > this.f35124d.mo10198a() + TimeUnit.DAYS.toMillis(3L)) ? c10167e.mo19032a().m30430I(this.f35124d.mo10198a() + TimeUnit.DAYS.toMillis(1L)).build() : c10167e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C10167e m42705c(AbstractC12935k2 abstractC12935k2, C10164b c10164b) {
        C12940l2.m42842c("Fetching campaigns from service.");
        this.f35125e.m42952a();
        return m42704e(this.f35121a.get().m42839a(C10166d.m30414j0().m30420K(this.f35122b.m42632r().m42647f()).m30418I(c10164b.m30393f0()).m30419J(m42702b()).m30421L(m42701a(abstractC12935k2)).build()));
    }
}
