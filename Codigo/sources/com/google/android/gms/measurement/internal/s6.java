package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class s6 implements Callable<List<jb>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10623a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f10624b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6(a6 a6Var, String str) {
        this.f10624b = a6Var;
        this.f10623a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jb> call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10624b.f9953a;
        vaVar.j0();
        vaVar2 = this.f10624b.f9953a;
        return vaVar2.Z().H0(this.f10623a);
    }
}
