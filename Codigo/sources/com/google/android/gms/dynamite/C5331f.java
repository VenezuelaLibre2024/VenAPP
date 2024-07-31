package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes.dex */
final class C5331f implements DynamiteModule.InterfaceC5325b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5325b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC5325b.b mo13428a(Context context, String str, DynamiteModule.InterfaceC5325b.a aVar) {
        DynamiteModule.InterfaceC5325b.b bVar = new DynamiteModule.InterfaceC5325b.b();
        int mo13429a = aVar.mo13429a(context, str, false);
        bVar.f10852b = mo13429a;
        if (mo13429a == 0) {
            bVar.f10853c = 0;
        } else {
            bVar.f10853c = 1;
        }
        return bVar;
    }
}
