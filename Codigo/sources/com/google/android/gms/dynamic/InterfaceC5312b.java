package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.dynamic.b */
/* loaded from: classes.dex */
public interface InterfaceC5312b extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements InterfaceC5312b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: f2 */
        public static InterfaceC5312b m13410f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC5312b ? (InterfaceC5312b) queryLocalInterface : new C5323m(iBinder);
        }
    }
}
