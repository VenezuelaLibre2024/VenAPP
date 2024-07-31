package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0151b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0151b c0151b = new DynamiteModule.b.C0151b();
        int a10 = aVar.a(context, str, true);
        c0151b.f9737b = a10;
        if (a10 != 0) {
            c0151b.f9738c = 1;
        } else {
            int b10 = aVar.b(context, str);
            c0151b.f9736a = b10;
            if (b10 != 0) {
                c0151b.f9738c = -1;
            }
        }
        return c0151b;
    }
}
