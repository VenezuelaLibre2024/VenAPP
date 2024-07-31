package gd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public class d extends com.google.android.gms.common.api.e<a.d.c> {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g<e> f16208a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0146a<e, a.d.c> f16209b;

    /* renamed from: c, reason: collision with root package name */
    static final com.google.android.gms.common.api.a<a.d.c> f16210c;

    /* loaded from: classes.dex */
    class a extends a.AbstractC0146a<e, a.d.c> {
        a() {
        }

        @Override // com.google.android.gms.common.api.a.AbstractC0146a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, a.d.c cVar, f.a aVar, f.b bVar) {
            return new e(context, looper, eVar, aVar, bVar);
        }
    }

    static {
        a.g<e> gVar = new a.g<>();
        f16208a = gVar;
        a aVar = new a();
        f16209b = aVar;
        f16210c = new com.google.android.gms.common.api.a<>("DynamicLinks.API", aVar, gVar);
    }

    public d(Context context) {
        super(context, f16210c, a.d.f9307l, e.a.f9309c);
    }
}
