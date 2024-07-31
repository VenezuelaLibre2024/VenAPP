package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
final class C5329d implements DynamiteModule.InterfaceC5325b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5325b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC5325b.b mo13428a(Context context, String str, DynamiteModule.InterfaceC5325b.a aVar) {
        DynamiteModule.InterfaceC5325b.b bVar = new DynamiteModule.InterfaceC5325b.b();
        int mo13429a = aVar.mo13429a(context, str, true);
        bVar.f10852b = mo13429a;
        if (mo13429a != 0) {
            bVar.f10853c = 1;
        } else {
            int mo13430b = aVar.mo13430b(context, str);
            bVar.f10851a = mo13430b;
            if (mo13430b != 0) {
                bVar.f10853c = -1;
            }
        }
        return bVar;
    }
}
