package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class k6 implements Callable<List<d>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10331a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10332b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10333c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f10334d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k6(a6 a6Var, String str, String str2, String str3) {
        this.f10334d = a6Var;
        this.f10331a = str;
        this.f10332b = str2;
        this.f10333c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<d> call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10334d.f9953a;
        vaVar.j0();
        vaVar2 = this.f10334d.f9953a;
        return vaVar2.Z().M(this.f10331a, this.f10332b, this.f10333c);
    }
}
