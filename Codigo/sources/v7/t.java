package v7;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t implements s8.j {

    /* renamed from: a, reason: collision with root package name */
    private final s8.j f28463a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28464b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28465c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f28466d;

    /* renamed from: e, reason: collision with root package name */
    private int f28467e;

    /* loaded from: classes.dex */
    public interface a {
        void a(t8.e0 e0Var);
    }

    public t(s8.j jVar, int i10, a aVar) {
        t8.a.a(i10 > 0);
        this.f28463a = jVar;
        this.f28464b = i10;
        this.f28465c = aVar;
        this.f28466d = new byte[1];
        this.f28467e = i10;
    }

    private boolean h() {
        if (this.f28463a.read(this.f28466d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f28466d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f28463a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f28465c.a(new t8.e0(bArr, i10));
        }
        return true;
    }

    @Override // s8.j
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // s8.j
    public Map<String, List<String>> e() {
        return this.f28463a.e();
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f28463a.getUri();
    }

    @Override // s8.j
    public void l(s8.m0 m0Var) {
        t8.a.e(m0Var);
        this.f28463a.l(m0Var);
    }

    @Override // s8.j
    public long o(s8.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f28467e == 0) {
            if (!h()) {
                return -1;
            }
            this.f28467e = this.f28464b;
        }
        int read = this.f28463a.read(bArr, i10, Math.min(this.f28467e, i11));
        if (read != -1) {
            this.f28467e -= read;
        }
        return read;
    }
}
