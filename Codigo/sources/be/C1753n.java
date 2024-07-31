package be;

import android.app.Application;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6879a;
import p487zd.C12972s;

/* renamed from: be.n */
/* loaded from: classes.dex */
public class C1753n {

    /* renamed from: a */
    private final Application f7382a;

    public C1753n(Application application) {
        this.f7382a = application;
    }

    /* renamed from: a */
    public C12972s m9427a(@InterfaceC6879a Executor executor) {
        return new C12972s(executor);
    }

    /* renamed from: b */
    public Application m9428b() {
        return this.f7382a;
    }
}
