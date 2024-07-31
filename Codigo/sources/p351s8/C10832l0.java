package p351s8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p363t8.C11137a;

/* renamed from: s8.l0 */
/* loaded from: classes.dex */
public final class C10832l0 implements InterfaceC10827j {

    /* renamed from: a */
    private final InterfaceC10827j f27403a;

    /* renamed from: b */
    private long f27404b;

    /* renamed from: c */
    private Uri f27405c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f27406d = Collections.emptyMap();

    public C10832l0(InterfaceC10827j interfaceC10827j) {
        this.f27403a = (InterfaceC10827j) C11137a.m34603e(interfaceC10827j);
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f27403a.close();
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: e */
    public Map<String, List<String>> mo159e() {
        return this.f27403a.mo159e();
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f27403a.getUri();
    }

    /* renamed from: h */
    public long m33015h() {
        return this.f27404b;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: l */
    public void mo161l(InterfaceC10834m0 interfaceC10834m0) {
        C11137a.m34603e(interfaceC10834m0);
        this.f27403a.mo161l(interfaceC10834m0);
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        this.f27405c = c10835n.f27407a;
        this.f27406d = Collections.emptyMap();
        long mo162o = this.f27403a.mo162o(c10835n);
        this.f27405c = (Uri) C11137a.m34603e(getUri());
        this.f27406d = mo159e();
        return mo162o;
    }

    /* renamed from: r */
    public Uri m33016r() {
        return this.f27405c;
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f27403a.read(bArr, i10, i11);
        if (read != -1) {
            this.f27404b += read;
        }
        return read;
    }

    /* renamed from: s */
    public Map<String, List<String>> m33017s() {
        return this.f27406d;
    }

    /* renamed from: t */
    public void m33018t() {
        this.f27404b = 0L;
    }
}
