package za;

import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.Scope;
import io.flutter.plugins.firebase.auth.Constants;

/* renamed from: za.e */
/* loaded from: classes2.dex */
public final class C12858e {

    /* renamed from: a */
    public static final C5101a.g f35052a;

    /* renamed from: b */
    public static final C5101a.g f35053b;

    /* renamed from: c */
    public static final C5101a.a f35054c;

    /* renamed from: d */
    static final C5101a.a f35055d;

    /* renamed from: e */
    public static final Scope f35056e;

    /* renamed from: f */
    public static final Scope f35057f;

    /* renamed from: g */
    public static final C5101a f35058g;

    /* renamed from: h */
    public static final C5101a f35059h;

    static {
        C5101a.g gVar = new C5101a.g();
        f35052a = gVar;
        C5101a.g gVar2 = new C5101a.g();
        f35053b = gVar2;
        C12855b c12855b = new C12855b();
        f35054c = c12855b;
        C12856c c12856c = new C12856c();
        f35055d = c12856c;
        f35056e = new Scope("profile");
        f35057f = new Scope(Constants.EMAIL);
        f35058g = new C5101a("SignIn.API", c12855b, gVar);
        f35059h = new C5101a("SignIn.INTERNAL_API", c12856c, gVar2);
    }
}
