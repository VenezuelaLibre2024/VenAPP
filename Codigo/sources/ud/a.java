package ud;

import android.app.Application;
import xd.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Application f27588a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Application application) {
        this.f27588a = application;
    }

    public vd.c a(l lVar, de.i iVar) {
        return wd.c.a().b(new q(iVar, lVar, this.f27588a)).a().c();
    }

    public vd.c b(l lVar, de.i iVar) {
        return wd.c.a().b(new q(iVar, lVar, this.f27588a)).a().b();
    }

    public vd.c c(l lVar, de.i iVar) {
        return wd.c.a().b(new q(iVar, lVar, this.f27588a)).a().a();
    }

    public vd.c d(l lVar, de.i iVar) {
        return wd.c.a().b(new q(iVar, lVar, this.f27588a)).a().d();
    }
}
