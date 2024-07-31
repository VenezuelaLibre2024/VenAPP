package p102fa;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.common.internal.C5297z;

/* renamed from: fa.c */
/* loaded from: classes.dex */
final class C7320c extends C5101a.a {
    @Override // com.google.android.gms.common.api.C5101a.a
    public final /* synthetic */ C5101a.f buildClient(Context context, Looper looper, C5234e c5234e, Object obj, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        return new C7322e(context, looper, c5234e, (C5297z) obj, interfaceC5131f, interfaceC5161n);
    }
}
