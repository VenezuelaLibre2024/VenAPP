package ca;

import java.util.Arrays;

/* renamed from: ca.z */
/* loaded from: classes.dex */
final class BinderC1931z extends AbstractBinderC1930y {

    /* renamed from: b */
    private final byte[] f7957b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1931z(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7957b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ca.AbstractBinderC1930y
    /* renamed from: h2 */
    public final byte[] mo10047h2() {
        return this.f7957b;
    }
}
