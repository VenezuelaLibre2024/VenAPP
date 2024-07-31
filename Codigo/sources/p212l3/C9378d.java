package p212l3;

import java.io.File;
import p212l3.InterfaceC9375a;

/* renamed from: l3.d */
/* loaded from: classes.dex */
public class C9378d implements InterfaceC9375a.a {

    /* renamed from: a */
    private final long f22710a;

    /* renamed from: b */
    private final a f22711b;

    /* renamed from: l3.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        File mo27898a();
    }

    public C9378d(a aVar, long j10) {
        this.f22710a = j10;
        this.f22711b = aVar;
    }

    @Override // p212l3.InterfaceC9375a.a
    public InterfaceC9375a build() {
        File mo27898a = this.f22711b.mo27898a();
        if (mo27898a == null) {
            return null;
        }
        if (mo27898a.isDirectory() || mo27898a.mkdirs()) {
            return C9379e.m27899c(mo27898a, this.f22710a);
        }
        return null;
    }
}
