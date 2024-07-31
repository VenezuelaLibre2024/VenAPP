package p425wi;

import dm.C7056b;
import dm.C7061e;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import p425wi.C12209j;
import p448xi.C12491d;
import p448xi.C12496i;
import p448xi.EnumC12488a;
import p448xi.InterfaceC12490c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wi.b */
/* loaded from: classes3.dex */
public final class C12201b implements InterfaceC12490c {

    /* renamed from: d */
    private static final Logger f32499d = Logger.getLogger(C12208i.class.getName());

    /* renamed from: a */
    private final a f32500a;

    /* renamed from: b */
    private final InterfaceC12490c f32501b;

    /* renamed from: c */
    private final C12209j f32502c = new C12209j(Level.FINE, (Class<?>) C12208i.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.b$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: h */
        void mo39177h(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12201b(a aVar, InterfaceC12490c interfaceC12490c) {
        this.f32500a = (a) C7159o.m21313p(aVar, "transportExceptionHandler");
        this.f32501b = (InterfaceC12490c) C7159o.m21313p(interfaceC12490c, "frameWriter");
    }

    /* renamed from: a */
    static Level m39169a(Throwable th2) {
        return th2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: F */
    public void mo39170F(int i10, EnumC12488a enumC12488a, byte[] bArr) {
        this.f32502c.m39293c(C12209j.a.OUTBOUND, i10, enumC12488a, C7061e.m20754u(bArr));
        try {
            this.f32501b.mo39170F(i10, enumC12488a, bArr);
            this.f32501b.flush();
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: G */
    public void mo39171G() {
        try {
            this.f32501b.mo39171G();
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: P0 */
    public void mo39172P0(C12496i c12496i) {
        this.f32502c.m39299i(C12209j.a.OUTBOUND, c12496i);
        try {
            this.f32501b.mo39172P0(c12496i);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: X0 */
    public void mo39173X0(boolean z10, int i10, C7056b c7056b, int i11) {
        this.f32502c.m39292b(C12209j.a.OUTBOUND, i10, c7056b.m20712a(), i11, z10);
        try {
            this.f32501b.mo39173X0(z10, i10, c7056b, i11);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f32501b.close();
        } catch (IOException e10) {
            f32499d.log(m39169a(e10), "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: d */
    public void mo39174d(int i10, long j10) {
        this.f32502c.m39301k(C12209j.a.OUTBOUND, i10, j10);
        try {
            this.f32501b.mo39174d(i10, j10);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    public void flush() {
        try {
            this.f32501b.flush();
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: h */
    public void mo39166h(boolean z10, int i10, int i11) {
        C12209j c12209j = this.f32502c;
        C12209j.a aVar = C12209j.a.OUTBOUND;
        long j10 = (KeyboardMap.kValueMask & i11) | (i10 << 32);
        if (z10) {
            c12209j.m39296f(aVar, j10);
        } else {
            c12209j.m39295e(aVar, j10);
        }
        try {
            this.f32501b.mo39166h(z10, i10, i11);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: o1 */
    public void mo39167o1(C12496i c12496i) {
        this.f32502c.m39300j(C12209j.a.OUTBOUND);
        try {
            this.f32501b.mo39167o1(c12496i);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: p0 */
    public int mo39175p0() {
        return this.f32501b.mo39175p0();
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: r1 */
    public void mo39176r1(boolean z10, boolean z11, int i10, int i11, List<C12491d> list) {
        try {
            this.f32501b.mo39176r1(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: s */
    public void mo39168s(int i10, EnumC12488a enumC12488a) {
        this.f32502c.m39298h(C12209j.a.OUTBOUND, i10, enumC12488a);
        try {
            this.f32501b.mo39168s(i10, enumC12488a);
        } catch (IOException e10) {
            this.f32500a.mo39177h(e10);
        }
    }
}
