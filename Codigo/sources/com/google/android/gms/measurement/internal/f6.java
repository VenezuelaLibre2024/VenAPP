package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class f6 implements Callable<List<jb>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10175a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10176b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10177c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f10178d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f6(a6 a6Var, String str, String str2, String str3) {
        this.f10178d = a6Var;
        this.f10175a = str;
        this.f10176b = str2;
        this.f10177c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jb> call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10178d.f9953a;
        vaVar.j0();
        vaVar2 = this.f10178d.f9953a;
        return vaVar2.Z().t0(this.f10175a, this.f10176b, this.f10177c);
    }
}
