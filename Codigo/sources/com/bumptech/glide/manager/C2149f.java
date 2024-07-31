package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0854a;
import com.bumptech.glide.manager.InterfaceC2146c;

/* renamed from: com.bumptech.glide.manager.f */
/* loaded from: classes.dex */
public class C2149f implements InterfaceC2147d {
    @Override // com.bumptech.glide.manager.InterfaceC2147d
    /* renamed from: a */
    public InterfaceC2146c mo10802a(Context context, InterfaceC2146c.a aVar) {
        boolean z10 = C0854a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new C2148e(context, aVar) : new C2158o();
    }
}
