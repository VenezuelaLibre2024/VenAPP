package ca;

import java.lang.ref.WeakReference;

/* renamed from: ca.a0 */
/* loaded from: classes.dex */
abstract class AbstractBinderC1893a0 extends AbstractBinderC1930y {

    /* renamed from: c */
    private static final WeakReference f7888c = new WeakReference(null);

    /* renamed from: b */
    private WeakReference f7889b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC1893a0(byte[] bArr) {
        super(bArr);
        this.f7889b = f7888c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ca.AbstractBinderC1930y
    /* renamed from: h2 */
    public final byte[] mo10047h2() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f7889b.get();
            if (bArr == null) {
                bArr = mo10048i2();
                this.f7889b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: i2 */
    protected abstract byte[] mo10048i2();
}
