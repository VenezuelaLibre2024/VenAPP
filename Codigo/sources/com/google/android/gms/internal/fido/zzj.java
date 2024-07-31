package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;

/* loaded from: classes2.dex */
public final class zzj extends a.AbstractC0146a {
    @Override // com.google.android.gms.common.api.a.AbstractC0146a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, e eVar, Object obj, f.a aVar, f.b bVar) {
        return new zzk(context, looper, eVar, aVar, bVar);
    }
}
