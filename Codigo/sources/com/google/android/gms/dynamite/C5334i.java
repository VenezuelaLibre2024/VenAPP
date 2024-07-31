package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
/* loaded from: classes.dex */
final class C5334i implements DynamiteModule.InterfaceC5325b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5325b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC5325b.b mo13428a(Context context, String str, DynamiteModule.InterfaceC5325b.a aVar) {
        DynamiteModule.InterfaceC5325b.b bVar = new DynamiteModule.InterfaceC5325b.b();
        bVar.f10851a = aVar.mo13430b(context, str);
        int mo13429a = aVar.mo13429a(context, str, true);
        bVar.f10852b = mo13429a;
        int i10 = bVar.f10851a;
        if (i10 == 0) {
            i10 = 0;
            if (mo13429a == 0) {
                bVar.f10853c = 0;
                return bVar;
            }
        }
        if (mo13429a >= i10) {
            bVar.f10853c = 1;
        } else {
            bVar.f10853c = -1;
        }
        return bVar;
    }
}
