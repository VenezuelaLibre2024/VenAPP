package ca;

import java.util.Arrays;

/* loaded from: classes.dex */
final class z extends y {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7005b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7005b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ca.y
    public final byte[] h2() {
        return this.f7005b;
    }
}
