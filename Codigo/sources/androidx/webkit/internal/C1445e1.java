package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* renamed from: androidx.webkit.internal.e1 */
/* loaded from: classes.dex */
public class C1445e1 implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a */
    private final int f6389a;

    /* renamed from: b */
    private final String f6390b;

    /* renamed from: c */
    private final byte[] f6391c;

    public C1445e1(String str) {
        this.f6389a = 0;
        this.f6390b = str;
        this.f6391c = null;
    }

    public C1445e1(byte[] bArr) {
        this.f6389a = 1;
        this.f6390b = null;
        this.f6391c = bArr;
    }

    /* renamed from: a */
    private void m8313a(int i10) {
        if (this.f6389a == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + i10 + ", but type is " + this.f6389a);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        m8313a(1);
        byte[] bArr = this.f6391c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        m8313a(0);
        return this.f6390b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f6389a;
    }
}
