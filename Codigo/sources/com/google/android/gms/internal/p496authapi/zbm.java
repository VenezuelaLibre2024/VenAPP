package com.google.android.gms.internal.p496authapi;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5123d;
import p352s9.C10849a;

/* loaded from: classes2.dex */
abstract class zbm extends AbstractC5123d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbm(AbstractC5106f abstractC5106f) {
        super(C10849a.f27519b, abstractC5106f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC5123d
    protected final /* bridge */ /* synthetic */ void doExecute(C5101a.b bVar) {
        zbo zboVar = (zbo) bVar;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5123d, com.google.android.gms.common.api.internal.InterfaceC5127e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zbm) obj);
    }

    protected abstract void zba(Context context, zbt zbtVar);
}
