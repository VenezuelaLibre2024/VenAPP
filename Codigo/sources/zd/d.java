package zd;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import yb.b;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final bk.a<l0> f32570a;

    /* renamed from: b */
    private final zb.g f32571b;

    /* renamed from: c */
    private final Application f32572c;

    /* renamed from: d */
    private final ce.a f32573d;

    /* renamed from: e */
    private final v2 f32574e;

    public d(bk.a<l0> aVar, zb.g gVar, Application application, ce.a aVar2, v2 v2Var) {
        this.f32570a = aVar;
        this.f32571b = gVar;
        this.f32572c = application;
        this.f32573d = aVar2;
        this.f32574e = v2Var;
    }

    private pf.c a(k2 k2Var) {
        return pf.c.f0().K(this.f32571b.r().c()).I(k2Var.b()).J(k2Var.c().b()).build();
    }

    private yb.b b() {
        b.a L = yb.b.g0().K(String.valueOf(Build.VERSION.SDK_INT)).J(Locale.getDefault().toString()).L(TimeZone.getDefault().getID());
        String d10 = d();
        if (!TextUtils.isEmpty(d10)) {
            L.I(d10);
        }
        return L.build();
    }

    private String d() {
        try {
            return this.f32572c.getPackageManager().getPackageInfo(this.f32572c.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            l2.b("Error finding versionName : " + e10.getMessage());
            return null;
        }
    }

    private pf.e e(pf.e eVar) {
        return (eVar.e0() < this.f32573d.a() + TimeUnit.MINUTES.toMillis(1L) || eVar.e0() > this.f32573d.a() + TimeUnit.DAYS.toMillis(3L)) ? eVar.a().I(this.f32573d.a() + TimeUnit.DAYS.toMillis(1L)).build() : eVar;
    }

    public pf.e c(k2 k2Var, pf.b bVar) {
        l2.c("Fetching campaigns from service.");
        this.f32574e.a();
        return e(this.f32570a.get().a(pf.d.j0().K(this.f32571b.r().f()).I(bVar.f0()).J(b()).L(a(k2Var)).build()));
    }
}
