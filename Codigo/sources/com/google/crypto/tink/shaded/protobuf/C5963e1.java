package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.e1 */
/* loaded from: classes2.dex */
public final class C5963e1 implements InterfaceC5995p0 {

    /* renamed from: a */
    private final InterfaceC6001r0 f12581a;

    /* renamed from: b */
    private final String f12582b;

    /* renamed from: c */
    private final Object[] f12583c;

    /* renamed from: d */
    private final int f12584d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5963e1(InterfaceC6001r0 interfaceC6001r0, String str, Object[] objArr) {
        char charAt;
        this.f12581a = interfaceC6001r0;
        this.f12582b = str;
        this.f12583c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 13;
            int i12 = 1;
            while (true) {
                int i13 = i12 + 1;
                charAt = str.charAt(i12);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
            charAt2 = i10 | (charAt << i11);
        }
        this.f12584d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5995p0
    /* renamed from: a */
    public boolean mo15400a() {
        return (this.f12584d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5995p0
    /* renamed from: b */
    public InterfaceC6001r0 mo15401b() {
        return this.f12581a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5995p0
    /* renamed from: c */
    public EnumC5954b1 mo15402c() {
        return (this.f12584d & 1) == 1 ? EnumC5954b1.PROTO2 : EnumC5954b1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] m15403d() {
        return this.f12583c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m15404e() {
        return this.f12582b;
    }
}
