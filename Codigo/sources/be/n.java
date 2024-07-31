package be;

import android.app.Application;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Application f6460a;

    public n(Application application) {
        this.f6460a = application;
    }

    public zd.s a(@dc.a Executor executor) {
        return new zd.s(executor);
    }

    public Application b() {
        return this.f6460a;
    }
}
