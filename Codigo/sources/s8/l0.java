package s8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l0 implements j {

    /* renamed from: a */
    private final j f25284a;

    /* renamed from: b */
    private long f25285b;

    /* renamed from: c */
    private Uri f25286c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f25287d = Collections.emptyMap();

    public l0(j jVar) {
        this.f25284a = (j) t8.a.e(jVar);
    }

    @Override // s8.j
    public void close() {
        this.f25284a.close();
    }

    @Override // s8.j
    public Map<String, List<String>> e() {
        return this.f25284a.e();
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f25284a.getUri();
    }

    public long h() {
        return this.f25285b;
    }

    @Override // s8.j
    public void l(m0 m0Var) {
        t8.a.e(m0Var);
        this.f25284a.l(m0Var);
    }

    @Override // s8.j
    public long o(n nVar) {
        this.f25286c = nVar.f25288a;
        this.f25287d = Collections.emptyMap();
        long o10 = this.f25284a.o(nVar);
        this.f25286c = (Uri) t8.a.e(getUri());
        this.f25287d = e();
        return o10;
    }

    public Uri r() {
        return this.f25286c;
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f25284a.read(bArr, i10, i11);
        if (read != -1) {
            this.f25285b += read;
        }
        return read;
    }

    public Map<String, List<String>> s() {
        return this.f25287d;
    }

    public void t() {
        this.f25285b = 0L;
    }
}
