package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.e1 */
/* loaded from: classes2.dex */
public final class C6576e1 implements InterfaceC6608p0 {

    /* renamed from: a */
    private final InterfaceC6614r0 f14452a;

    /* renamed from: b */
    private final String f14453b;

    /* renamed from: c */
    private final Object[] f14454c;

    /* renamed from: d */
    private final int f14455d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6576e1(InterfaceC6614r0 interfaceC6614r0, String str, Object[] objArr) {
        char charAt;
        this.f14452a = interfaceC6614r0;
        this.f14453b = str;
        this.f14454c = objArr;
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
        this.f14455d = charAt2;
    }

    @Override // com.google.protobuf.InterfaceC6608p0
    /* renamed from: a */
    public boolean mo18449a() {
        return (this.f14455d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC6608p0
    /* renamed from: b */
    public InterfaceC6614r0 mo18450b() {
        return this.f14452a;
    }

    @Override // com.google.protobuf.InterfaceC6608p0
    /* renamed from: c */
    public EnumC6567b1 mo18451c() {
        return (this.f14455d & 1) == 1 ? EnumC6567b1.PROTO2 : EnumC6567b1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] m18452d() {
        return this.f14454c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m18453e() {
        return this.f14453b;
    }
}
