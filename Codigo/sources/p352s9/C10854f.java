package p352s9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.internal.auth.zzbe;

/* renamed from: s9.f */
/* loaded from: classes.dex */
final class C10854f extends C5101a.a {
    @Override // com.google.android.gms.common.api.C5101a.a
    public final /* synthetic */ C5101a.f buildClient(Context context, Looper looper, C5234e c5234e, Object obj, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        return new zzbe(context, looper, c5234e, (C10851c) obj, interfaceC5131f, interfaceC5161n);
    }
}
