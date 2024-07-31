package ca;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class a0 extends y {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference f6939c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f6940b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(byte[] bArr) {
        super(bArr);
        this.f6940b = f6939c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ca.y
    public final byte[] h2() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6940b.get();
            if (bArr == null) {
                bArr = i2();
                this.f6940b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] i2();
}
