package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e1 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f11366a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11367b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f11368c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11369d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(r0 r0Var, String str, Object[] objArr) {
        char charAt;
        this.f11366a = r0Var;
        this.f11367b = str;
        this.f11368c = objArr;
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
        this.f11369d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public boolean a() {
        return (this.f11369d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public r0 b() {
        return this.f11366a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public b1 c() {
        return (this.f11369d & 1) == 1 ? b1.PROTO2 : b1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f11368c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f11367b;
    }
}
