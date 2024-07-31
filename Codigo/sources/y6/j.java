package y6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import t6.u1;
import y6.b0;

/* loaded from: classes.dex */
public final class j implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31765a = new byte[RecognitionOptions.AZTEC];

    @Override // y6.b0
    public void b(long j10, int i10, int i11, int i12, b0.a aVar) {
    }

    @Override // y6.b0
    public void c(u1 u1Var) {
    }

    @Override // y6.b0
    public void d(t8.e0 e0Var, int i10, int i11) {
        e0Var.V(i10);
    }

    @Override // y6.b0
    public int e(s8.h hVar, int i10, boolean z10, int i11) {
        int read = hVar.read(this.f31765a, 0, Math.min(this.f31765a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
