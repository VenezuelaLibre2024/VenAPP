package wi;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wi.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b implements xi.c {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f30030d = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final a f30031a;

    /* renamed from: b, reason: collision with root package name */
    private final xi.c f30032b;

    /* renamed from: c, reason: collision with root package name */
    private final j f30033c = new j(Level.FINE, (Class<?>) i.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a {
        void h(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, xi.c cVar) {
        this.f30031a = (a) eb.o.p(aVar, "transportExceptionHandler");
        this.f30032b = (xi.c) eb.o.p(cVar, "frameWriter");
    }

    static Level a(Throwable th2) {
        return th2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // xi.c
    public void F(int i10, xi.a aVar, byte[] bArr) {
        this.f30033c.c(j.a.OUTBOUND, i10, aVar, dm.e.u(bArr));
        try {
            this.f30032b.F(i10, aVar, bArr);
            this.f30032b.flush();
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void G() {
        try {
            this.f30032b.G();
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void P0(xi.i iVar) {
        this.f30033c.i(j.a.OUTBOUND, iVar);
        try {
            this.f30032b.P0(iVar);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void X0(boolean z10, int i10, dm.b bVar, int i11) {
        this.f30033c.b(j.a.OUTBOUND, i10, bVar.a(), i11, z10);
        try {
            this.f30032b.X0(z10, i10, bVar, i11);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f30032b.close();
        } catch (IOException e10) {
            f30030d.log(a(e10), "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // xi.c
    public void d(int i10, long j10) {
        this.f30033c.k(j.a.OUTBOUND, i10, j10);
        try {
            this.f30032b.d(i10, j10);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void flush() {
        try {
            this.f30032b.flush();
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void h(boolean z10, int i10, int i11) {
        j jVar = this.f30033c;
        j.a aVar = j.a.OUTBOUND;
        long j10 = (KeyboardMap.kValueMask & i11) | (i10 << 32);
        if (z10) {
            jVar.f(aVar, j10);
        } else {
            jVar.e(aVar, j10);
        }
        try {
            this.f30032b.h(z10, i10, i11);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void o1(xi.i iVar) {
        this.f30033c.j(j.a.OUTBOUND);
        try {
            this.f30032b.o1(iVar);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public int p0() {
        return this.f30032b.p0();
    }

    @Override // xi.c
    public void r1(boolean z10, boolean z11, int i10, int i11, List<xi.d> list) {
        try {
            this.f30032b.r1(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }

    @Override // xi.c
    public void s(int i10, xi.a aVar) {
        this.f30033c.h(j.a.OUTBOUND, i10, aVar);
        try {
            this.f30032b.s(i10, aVar);
        } catch (IOException e10) {
            this.f30031a.h(e10);
        }
    }
}
