package p458y5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p024b6.C1662a;
import p024b6.C1666e;
import p395v5.EnumC11629c;

/* renamed from: y5.c */
/* loaded from: classes.dex */
public final class C12605c {

    /* renamed from: a */
    private Activity f34191a;

    /* renamed from: b */
    private Application f34192b;

    /* renamed from: c */
    private boolean f34193c;

    /* renamed from: d */
    private final AbstractC12603a f34194d = AbstractC12603a.f34189b.m41457a();

    /* renamed from: e */
    private final List<String> f34195e = new ArrayList();

    /* renamed from: f */
    private final List<String> f34196f = new ArrayList();

    /* renamed from: g */
    private final List<String> f34197g = new ArrayList();

    /* renamed from: h */
    private InterfaceC12604b f34198h;

    /* renamed from: i */
    private final void m41458i() {
        if (!this.f34196f.isEmpty()) {
            this.f34196f.clear();
        }
        if (!this.f34195e.isEmpty()) {
            this.f34195e.clear();
        }
    }

    /* renamed from: a */
    public final C12605c m41459a(int i10, String[] permissions, int[] grantResults) {
        List<String> list;
        String str;
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(grantResults, "grantResults");
        if (i10 == 3001 || i10 == 3002) {
            int length = permissions.length;
            for (int i11 = 0; i11 < length; i11++) {
                C1662a.m9135d("Returned permissions: " + permissions[i11]);
                int i12 = grantResults[i11];
                if (i12 == -1) {
                    list = this.f34196f;
                    str = permissions[i11];
                } else if (i12 == 0) {
                    list = this.f34197g;
                    str = permissions[i11];
                }
                list.add(str);
            }
            C1662a.m9132a("dealResult: ");
            C1662a.m9132a("  permissions: " + permissions);
            C1662a.m9132a("  grantResults: " + grantResults);
            C1662a.m9132a("  deniedPermissionsList: " + this.f34196f);
            C1662a.m9132a("  grantedPermissionsList: " + this.f34197g);
            if (this.f34194d.mo41452k()) {
                AbstractC12603a abstractC12603a = this.f34194d;
                Application application = this.f34192b;
                C9322n.m27778b(application);
                abstractC12603a.mo41446d(this, application, permissions, grantResults, this.f34195e, this.f34196f, this.f34197g, i10);
            } else if (!this.f34196f.isEmpty()) {
                InterfaceC12604b interfaceC12604b = this.f34198h;
                C9322n.m27778b(interfaceC12604b);
                interfaceC12604b.mo33610b(this.f34196f, this.f34197g, this.f34195e);
            } else {
                InterfaceC12604b interfaceC12604b2 = this.f34198h;
                C9322n.m27778b(interfaceC12604b2);
                interfaceC12604b2.mo33609a(this.f34195e);
            }
        }
        m41458i();
        this.f34193c = false;
        return this;
    }

    /* renamed from: b */
    public final Activity m41460b() {
        return this.f34191a;
    }

    /* renamed from: c */
    public final void m41461c(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        C9322n.m27778b(context);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    /* renamed from: d */
    public final EnumC11629c m41462d(int i10, boolean z10) {
        AbstractC12603a abstractC12603a = this.f34194d;
        Application application = this.f34192b;
        C9322n.m27778b(application);
        return abstractC12603a.mo41444a(application, i10, z10);
    }

    /* renamed from: e */
    public final InterfaceC12604b m41463e() {
        return this.f34198h;
    }

    /* renamed from: f */
    public final boolean m41464f(Context applicationContext) {
        C9322n.m27781e(applicationContext, "applicationContext");
        return this.f34194d.mo41448f(applicationContext);
    }

    /* renamed from: g */
    public final void m41465g(int i10, C1666e resultHandler) {
        C9322n.m27781e(resultHandler, "resultHandler");
        AbstractC12603a abstractC12603a = this.f34194d;
        Application application = this.f34192b;
        C9322n.m27778b(application);
        abstractC12603a.mo41453l(this, application, i10, resultHandler);
    }

    /* renamed from: h */
    public final C12605c m41466h(Context applicationContext, int i10, boolean z10) {
        C9322n.m27781e(applicationContext, "applicationContext");
        this.f34194d.mo41454m(this, applicationContext, i10, z10);
        return this;
    }

    /* renamed from: j */
    public final C12605c m41467j(InterfaceC12604b interfaceC12604b) {
        this.f34198h = interfaceC12604b;
        return this;
    }

    /* renamed from: k */
    public final void m41468k(List<String> permission) {
        C9322n.m27781e(permission, "permission");
        this.f34195e.clear();
        this.f34195e.addAll(permission);
    }

    /* renamed from: l */
    public final void m41469l(InterfaceC12604b interfaceC12604b) {
        this.f34198h = interfaceC12604b;
    }

    /* renamed from: m */
    public final C12605c m41470m(Activity activity) {
        this.f34191a = activity;
        this.f34192b = activity != null ? activity.getApplication() : null;
        return this;
    }
}
