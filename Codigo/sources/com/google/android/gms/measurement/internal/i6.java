package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class i6 implements Callable<List<jb>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10275a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10276b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10277c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f10278d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i6(a6 a6Var, String str, String str2, String str3) {
        this.f10278d = a6Var;
        this.f10275a = str;
        this.f10276b = str2;
        this.f10277c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jb> call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10278d.f9953a;
        vaVar.j0();
        vaVar2 = this.f10278d.f9953a;
        return vaVar2.Z().t0(this.f10275a, this.f10276b, this.f10277c);
    }
}
