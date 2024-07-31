package p477z2;

import android.content.Context;
import androidx.core.content.C0854a;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;

/* renamed from: z2.n */
/* loaded from: classes.dex */
public class C12782n {
    /* renamed from: a */
    public EnumC12783o m42411a(Context context, InterfaceC12583a interfaceC12583a) {
        if (C0854a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return EnumC12783o.precise;
        }
        if (C0854a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return EnumC12783o.reduced;
        }
        interfaceC12583a.mo10589a(EnumC12584b.permissionDenied);
        return null;
    }
}
