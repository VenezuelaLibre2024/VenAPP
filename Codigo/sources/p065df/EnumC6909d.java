package p065df;

import p219ld.InterfaceC9503f;

/* renamed from: df.d */
/* loaded from: classes2.dex */
public enum EnumC6909d implements InterfaceC9503f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    EnumC6909d(int i10) {
        this.number = i10;
    }

    @Override // p219ld.InterfaceC9503f
    /* renamed from: a */
    public int mo19997a() {
        return this.number;
    }
}
