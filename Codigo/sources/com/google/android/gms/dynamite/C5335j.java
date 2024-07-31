package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
/* loaded from: classes.dex */
final class C5335j implements DynamiteModule.InterfaceC5325b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5325b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC5325b.b mo13428a(Context context, String str, DynamiteModule.InterfaceC5325b.a aVar) {
        DynamiteModule.InterfaceC5325b.b bVar = new DynamiteModule.InterfaceC5325b.b();
        int mo13430b = aVar.mo13430b(context, str);
        bVar.f10851a = mo13430b;
        int i10 = 0;
        int mo13429a = mo13430b != 0 ? aVar.mo13429a(context, str, false) : aVar.mo13429a(context, str, true);
        bVar.f10852b = mo13429a;
        int i11 = bVar.f10851a;
        if (i11 != 0) {
            i10 = i11;
        } else if (mo13429a == 0) {
            bVar.f10853c = 0;
            return bVar;
        }
        if (mo13429a >= i10) {
            bVar.f10853c = 1;
        } else {
            bVar.f10853c = -1;
        }
        return bVar;
    }
}
