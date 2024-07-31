package p065df;

import p219ld.InterfaceC9503f;

/* renamed from: df.s */
/* loaded from: classes2.dex */
public enum EnumC6932s implements InterfaceC9503f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    EnumC6932s(int i10) {
        this.number = i10;
    }

    @Override // p219ld.InterfaceC9503f
    /* renamed from: a */
    public int mo19997a() {
        return this.number;
    }
}
