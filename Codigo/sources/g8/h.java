package g8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class h extends w6.j<n, o, k> implements j {

    /* renamed from: n, reason: collision with root package name */
    private final String f16088n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends o {
        a() {
        }

        @Override // w6.h
        public void x() {
            h.this.r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(String str) {
        super(new n[2], new o[2]);
        this.f16088n = str;
        u(RecognitionOptions.UPC_E);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w6.j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final k j(n nVar, o oVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) t8.a.e(nVar.f29679c);
            oVar.y(nVar.f29681e, z(byteBuffer.array(), byteBuffer.limit(), z10), nVar.f16102t);
            oVar.o(Integer.MIN_VALUE);
            return null;
        } catch (k e10) {
            return e10;
        }
    }

    @Override // g8.j
    public void a(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w6.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final n g() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w6.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final o h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w6.j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final k i(Throwable th2) {
        return new k("Unexpected decode error", th2);
    }

    protected abstract i z(byte[] bArr, int i10, boolean z10);
}
