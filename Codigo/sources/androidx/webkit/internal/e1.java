package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public class e1 implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final int f5564a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5565b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5566c;

    public e1(String str) {
        this.f5564a = 0;
        this.f5565b = str;
        this.f5566c = null;
    }

    public e1(byte[] bArr) {
        this.f5564a = 1;
        this.f5565b = null;
        this.f5566c = bArr;
    }

    private void a(int i10) {
        if (this.f5564a == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + i10 + ", but type is " + this.f5564a);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f5566c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        a(0);
        return this.f5565b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f5564a;
    }
}
