package l3;

import java.io.File;
import l3.a;

/* loaded from: classes.dex */
public class d implements a.InterfaceC0327a {

    /* renamed from: a, reason: collision with root package name */
    private final long f20888a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20889b;

    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f20888a = j10;
        this.f20889b = aVar;
    }

    @Override // l3.a.InterfaceC0327a
    public l3.a build() {
        File a10 = this.f20889b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return e.c(a10, this.f20888a);
        }
        return null;
    }
}
