package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.e;

/* loaded from: classes2.dex */
final class zzv extends a.AbstractC0146a {
    @Override // com.google.android.gms.common.api.a.AbstractC0146a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, e eVar, Object obj, f fVar, n nVar) {
        return new zzi(context, looper, eVar, fVar, nVar);
    }
}