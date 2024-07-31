package za;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5234e;
import p013ab.C0082a;

/* renamed from: za.b */
/* loaded from: classes2.dex */
final class C12855b extends C5101a.a {
    @Override // com.google.android.gms.common.api.C5101a.a
    public final /* bridge */ /* synthetic */ C5101a.f buildClient(Context context, Looper looper, C5234e c5234e, Object obj, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        return new C0082a(context, looper, true, c5234e, C0082a.m376c(c5234e), aVar, bVar);
    }
}
