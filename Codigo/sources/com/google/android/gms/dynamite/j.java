package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class j implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0151b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0151b c0151b = new DynamiteModule.b.C0151b();
        int b10 = aVar.b(context, str);
        c0151b.f9736a = b10;
        int i10 = 0;
        int a10 = b10 != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0151b.f9737b = a10;
        int i11 = c0151b.f9736a;
        if (i11 != 0) {
            i10 = i11;
        } else if (a10 == 0) {
            c0151b.f9738c = 0;
            return c0151b;
        }
        if (a10 >= i10) {
            c0151b.f9738c = 1;
        } else {
            c0151b.f9738c = -1;
        }
        return c0151b;
    }
}
