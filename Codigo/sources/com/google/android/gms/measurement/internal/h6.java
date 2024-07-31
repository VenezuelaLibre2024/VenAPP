package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class h6 implements Callable<List<d>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10223a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10224b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10225c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f10226d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h6(a6 a6Var, String str, String str2, String str3) {
        this.f10226d = a6Var;
        this.f10223a = str;
        this.f10224b = str2;
        this.f10225c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<d> call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10226d.f9953a;
        vaVar.j0();
        vaVar2 = this.f10226d.f9953a;
        return vaVar2.Z().M(this.f10223a, this.f10224b, this.f10225c);
    }
}
