package p397v7;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p363t8.C11137a;
import p363t8.C11146e0;

/* renamed from: v7.t */
/* loaded from: classes.dex */
final class C11729t implements InterfaceC10827j {

    /* renamed from: a */
    private final InterfaceC10827j f30877a;

    /* renamed from: b */
    private final int f30878b;

    /* renamed from: c */
    private final a f30879c;

    /* renamed from: d */
    private final byte[] f30880d;

    /* renamed from: e */
    private int f30881e;

    /* renamed from: v7.t$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo36969a(C11146e0 c11146e0);
    }

    public C11729t(InterfaceC10827j interfaceC10827j, int i10, a aVar) {
        C11137a.m34599a(i10 > 0);
        this.f30877a = interfaceC10827j;
        this.f30878b = i10;
        this.f30879c = aVar;
        this.f30880d = new byte[1];
        this.f30881e = i10;
    }

    /* renamed from: h */
    private boolean m37024h() {
        if (this.f30877a.read(this.f30880d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f30880d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f30877a.read(bArr, i12, i11);
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
            this.f30879c.mo36969a(new C11146e0(bArr, i10));
        }
        return true;
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: e */
    public Map<String, List<String>> mo159e() {
        return this.f30877a.mo159e();
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f30877a.getUri();
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: l */
    public void mo161l(InterfaceC10834m0 interfaceC10834m0) {
        C11137a.m34603e(interfaceC10834m0);
        this.f30877a.mo161l(interfaceC10834m0);
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        throw new UnsupportedOperationException();
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f30881e == 0) {
            if (!m37024h()) {
                return -1;
            }
            this.f30881e = this.f30878b;
        }
        int read = this.f30877a.read(bArr, i10, Math.min(this.f30881e, i11));
        if (read != -1) {
            this.f30881e -= read;
        }
        return read;
    }
}
