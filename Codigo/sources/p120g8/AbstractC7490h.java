package p120g8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import p363t8.C11137a;
import p414w6.AbstractC12085j;

/* renamed from: g8.h */
/* loaded from: classes.dex */
public abstract class AbstractC7490h extends AbstractC12085j<C7496n, AbstractC7497o, C7493k> implements InterfaceC7492j {

    /* renamed from: n */
    private final String f17702n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.h$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC7497o {
        a() {
        }

        @Override // p414w6.AbstractC12083h
        /* renamed from: x */
        public void mo22797x() {
            AbstractC7490h.this.m38824r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7490h(String str) {
        super(new C7496n[2], new AbstractC7497o[2]);
        this.f17702n = str;
        m38825u(RecognitionOptions.UPC_E);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p414w6.AbstractC12085j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C7493k mo22807j(C7496n c7496n, AbstractC7497o abstractC7497o, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C11137a.m34603e(c7496n.f32142c);
            abstractC7497o.m22819y(c7496n.f32144e, mo22811z(byteBuffer.array(), byteBuffer.limit(), z10), c7496n.f17716t);
            abstractC7497o.m38790o(Integer.MIN_VALUE);
            return null;
        } catch (C7493k e10) {
            return e10;
        }
    }

    @Override // p120g8.InterfaceC7492j
    /* renamed from: a */
    public void mo22790a(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p414w6.AbstractC12085j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C7496n mo22804g() {
        return new C7496n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p414w6.AbstractC12085j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final AbstractC7497o mo22805h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p414w6.AbstractC12085j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C7493k mo22806i(Throwable th2) {
        return new C7493k("Unexpected decode error", th2);
    }

    /* renamed from: z */
    protected abstract InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10);
}
