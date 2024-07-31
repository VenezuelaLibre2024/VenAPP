package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.e1 */
/* loaded from: classes.dex */
public final class C1160e1 implements InterfaceC1192p0 {

    /* renamed from: a */
    private final InterfaceC1198r0 f4821a;

    /* renamed from: b */
    private final String f4822b;

    /* renamed from: c */
    private final Object[] f4823c;

    /* renamed from: d */
    private final int f4824d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1160e1(InterfaceC1198r0 interfaceC1198r0, String str, Object[] objArr) {
        char charAt;
        this.f4821a = interfaceC1198r0;
        this.f4822b = str;
        this.f4823c = objArr;
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
        this.f4824d = charAt2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1192p0
    /* renamed from: a */
    public boolean mo5764a() {
        return (this.f4824d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1192p0
    /* renamed from: b */
    public InterfaceC1198r0 mo5765b() {
        return this.f4821a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1192p0
    /* renamed from: c */
    public EnumC1151b1 mo5766c() {
        return (this.f4824d & 1) == 1 ? EnumC1151b1.PROTO2 : EnumC1151b1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] m5767d() {
        return this.f4823c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m5768e() {
        return this.f4822b;
    }
}
