package y5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b6.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private Activity f31655a;

    /* renamed from: b */
    private Application f31656b;

    /* renamed from: c */
    private boolean f31657c;

    /* renamed from: d */
    private final a f31658d = a.f31653b.a();

    /* renamed from: e */
    private final List<String> f31659e = new ArrayList();

    /* renamed from: f */
    private final List<String> f31660f = new ArrayList();

    /* renamed from: g */
    private final List<String> f31661g = new ArrayList();

    /* renamed from: h */
    private b f31662h;

    private final void i() {
        if (!this.f31660f.isEmpty()) {
            this.f31660f.clear();
        }
        if (!this.f31659e.isEmpty()) {
            this.f31659e.clear();
        }
    }

    public final c a(int i10, String[] permissions, int[] grantResults) {
        List<String> list;
        String str;
        n.e(permissions, "permissions");
        n.e(grantResults, "grantResults");
        if (i10 == 3001 || i10 == 3002) {
            int length = permissions.length;
            for (int i11 = 0; i11 < length; i11++) {
                b6.a.d("Returned permissions: " + permissions[i11]);
                int i12 = grantResults[i11];
                if (i12 == -1) {
                    list = this.f31660f;
                    str = permissions[i11];
                } else if (i12 == 0) {
                    list = this.f31661g;
                    str = permissions[i11];
                }
                list.add(str);
            }
            b6.a.a("dealResult: ");
            b6.a.a("  permissions: " + permissions);
            b6.a.a("  grantResults: " + grantResults);
            b6.a.a("  deniedPermissionsList: " + this.f31660f);
            b6.a.a("  grantedPermissionsList: " + this.f31661g);
            if (this.f31658d.k()) {
                a aVar = this.f31658d;
                Application application = this.f31656b;
                n.b(application);
                aVar.d(this, application, permissions, grantResults, this.f31659e, this.f31660f, this.f31661g, i10);
            } else if (!this.f31660f.isEmpty()) {
                b bVar = this.f31662h;
                n.b(bVar);
                bVar.b(this.f31660f, this.f31661g, this.f31659e);
            } else {
                b bVar2 = this.f31662h;
                n.b(bVar2);
                bVar2.a(this.f31659e);
            }
        }
        i();
        this.f31657c = false;
        return this;
    }

    public final Activity b() {
        return this.f31655a;
    }

    public final void c(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        n.b(context);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public final v5.c d(int i10, boolean z10) {
        a aVar = this.f31658d;
        Application application = this.f31656b;
        n.b(application);
        return aVar.a(application, i10, z10);
    }

    public final b e() {
        return this.f31662h;
    }

    public final boolean f(Context applicationContext) {
        n.e(applicationContext, "applicationContext");
        return this.f31658d.f(applicationContext);
    }

    public final void g(int i10, e resultHandler) {
        n.e(resultHandler, "resultHandler");
        a aVar = this.f31658d;
        Application application = this.f31656b;
        n.b(application);
        aVar.l(this, application, i10, resultHandler);
    }

    public final c h(Context applicationContext, int i10, boolean z10) {
        n.e(applicationContext, "applicationContext");
        this.f31658d.m(this, applicationContext, i10, z10);
        return this;
    }

    public final c j(b bVar) {
        this.f31662h = bVar;
        return this;
    }

    public final void k(List<String> permission) {
        n.e(permission, "permission");
        this.f31659e.clear();
        this.f31659e.addAll(permission);
    }

    public final void l(b bVar) {
        this.f31662h = bVar;
    }

    public final c m(Activity activity) {
        this.f31655a = activity;
        this.f31656b = activity != null ? activity.getApplication() : null;
        return this;
    }
}
