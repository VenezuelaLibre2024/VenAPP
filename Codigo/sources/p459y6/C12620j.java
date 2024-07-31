package p459y6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import p351s8.InterfaceC10823h;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p459y6.InterfaceC12609b0;

/* renamed from: y6.j */
/* loaded from: classes.dex */
public final class C12620j implements InterfaceC12609b0 {

    /* renamed from: a */
    private final byte[] f34301a = new byte[RecognitionOptions.AZTEC];

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: b */
    public void mo331b(long j10, int i10, int i11, int i12, InterfaceC12609b0.a aVar) {
    }

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: c */
    public void mo332c(C11108u1 c11108u1) {
    }

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: d */
    public void mo333d(C11146e0 c11146e0, int i10, int i11) {
        c11146e0.m34678V(i10);
    }

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: e */
    public int mo334e(InterfaceC10823h interfaceC10823h, int i10, boolean z10, int i11) {
        int read = interfaceC10823h.read(this.f34301a, 0, Math.min(this.f34301a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
