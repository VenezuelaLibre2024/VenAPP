package gd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5234e;

/* renamed from: gd.d */
/* loaded from: classes.dex */
public class C7548d extends AbstractC5105e<C5101a.d.c> {

    /* renamed from: a */
    private static final C5101a.g<C7549e> f17845a;

    /* renamed from: b */
    private static final C5101a.a<C7549e, C5101a.d.c> f17846b;

    /* renamed from: c */
    static final C5101a<C5101a.d.c> f17847c;

    /* renamed from: gd.d$a */
    /* loaded from: classes.dex */
    class a extends C5101a.a<C7549e, C5101a.d.c> {
        a() {
        }

        @Override // com.google.android.gms.common.api.C5101a.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7549e buildClient(Context context, Looper looper, C5234e c5234e, C5101a.d.c cVar, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
            return new C7549e(context, looper, c5234e, aVar, bVar);
        }
    }

    static {
        C5101a.g<C7549e> gVar = new C5101a.g<>();
        f17845a = gVar;
        a aVar = new a();
        f17846b = aVar;
        f17847c = new C5101a<>("DynamicLinks.API", aVar, gVar);
    }

    public C7548d(Context context) {
        super(context, f17847c, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }
}
