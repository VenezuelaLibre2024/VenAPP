package wl;

import kotlin.jvm.internal.n;
import ql.d0;
import ql.w;

/* loaded from: classes3.dex */
public final class h extends d0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f30215b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30216c;

    /* renamed from: d, reason: collision with root package name */
    private final dm.d f30217d;

    public h(String str, long j10, dm.d source) {
        n.e(source, "source");
        this.f30215b = str;
        this.f30216c = j10;
        this.f30217d = source;
    }

    @Override // ql.d0
    public long b() {
        return this.f30216c;
    }

    @Override // ql.d0
    public w e() {
        String str = this.f30215b;
        if (str == null) {
            return null;
        }
        return w.f24382e.b(str);
    }

    @Override // ql.d0
    public dm.d f() {
        return this.f30217d;
    }
}
