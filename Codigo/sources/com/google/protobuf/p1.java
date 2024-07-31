package com.google.protobuf;

/* loaded from: classes2.dex */
class p1 extends n1<o1, o1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public o1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(o1 o1Var) {
        return o1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(o1 o1Var) {
        return o1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public o1 k(o1 o1Var, o1 o1Var2) {
        return o1.c().equals(o1Var2) ? o1Var : o1.c().equals(o1Var) ? o1.j(o1Var, o1Var2) : o1Var.i(o1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public o1 n() {
        return o1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, o1 o1Var) {
        p(obj, o1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, o1 o1Var) {
        ((x) obj).unknownFields = o1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public o1 r(o1 o1Var) {
        o1Var.h();
        return o1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(o1 o1Var, u1 u1Var) {
        o1Var.p(u1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(o1 o1Var, u1 u1Var) {
        o1Var.r(u1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    public boolean q(f1 f1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(o1 o1Var, int i10, int i11) {
        o1Var.n(t1.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(o1 o1Var, int i10, long j10) {
        o1Var.n(t1.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(o1 o1Var, int i10, o1 o1Var2) {
        o1Var.n(t1.c(i10, 3), o1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(o1 o1Var, int i10, g gVar) {
        o1Var.n(t1.c(i10, 2), gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(o1 o1Var, int i10, long j10) {
        o1Var.n(t1.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public o1 f(Object obj) {
        o1 g10 = g(obj);
        if (g10 != o1.c()) {
            return g10;
        }
        o1 k10 = o1.k();
        p(obj, k10);
        return k10;
    }
}
