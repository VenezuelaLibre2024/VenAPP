package r1;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import v1.j;

/* loaded from: classes.dex */
public final class c0 implements j.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f24519a;

    /* renamed from: b, reason: collision with root package name */
    private final File f24520b;

    /* renamed from: c, reason: collision with root package name */
    private final Callable<InputStream> f24521c;

    /* renamed from: d, reason: collision with root package name */
    private final j.c f24522d;

    public c0(String str, File file, Callable<InputStream> callable, j.c mDelegate) {
        kotlin.jvm.internal.n.e(mDelegate, "mDelegate");
        this.f24519a = str;
        this.f24520b = file;
        this.f24521c = callable;
        this.f24522d = mDelegate;
    }

    @Override // v1.j.c
    public v1.j a(j.b configuration) {
        kotlin.jvm.internal.n.e(configuration, "configuration");
        return new b0(configuration.f27866a, this.f24519a, this.f24520b, this.f24521c, configuration.f27868c.f27864a, this.f24522d.a(configuration));
    }
}
