package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e1 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f13178a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13179b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f13180c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13181d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(r0 r0Var, String str, Object[] objArr) {
        char charAt;
        this.f13178a = r0Var;
        this.f13179b = str;
        this.f13180c = objArr;
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
        this.f13181d = charAt2;
    }

    @Override // com.google.protobuf.p0
    public boolean a() {
        return (this.f13181d & 2) == 2;
    }

    @Override // com.google.protobuf.p0
    public r0 b() {
        return this.f13178a;
    }

    @Override // com.google.protobuf.p0
    public b1 c() {
        return (this.f13181d & 1) == 1 ? b1.PROTO2 : b1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f13180c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f13179b;
    }
}
