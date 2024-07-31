package za;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public static final a.g f32501a;

    /* renamed from: b */
    public static final a.g f32502b;

    /* renamed from: c */
    public static final a.AbstractC0146a f32503c;

    /* renamed from: d */
    static final a.AbstractC0146a f32504d;

    /* renamed from: e */
    public static final Scope f32505e;

    /* renamed from: f */
    public static final Scope f32506f;

    /* renamed from: g */
    public static final com.google.android.gms.common.api.a f32507g;

    /* renamed from: h */
    public static final com.google.android.gms.common.api.a f32508h;

    static {
        a.g gVar = new a.g();
        f32501a = gVar;
        a.g gVar2 = new a.g();
        f32502b = gVar2;
        b bVar = new b();
        f32503c = bVar;
        c cVar = new c();
        f32504d = cVar;
        f32505e = new Scope("profile");
        f32506f = new Scope(Constants.EMAIL);
        f32507g = new com.google.android.gms.common.api.a("SignIn.API", bVar, gVar);
        f32508h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
