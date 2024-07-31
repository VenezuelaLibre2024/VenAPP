package bd;

import android.content.Context;
import cd.i;
import com.google.android.gms.tasks.Task;
import f6.g;
import h6.u;
import java.nio.charset.Charset;
import vc.g0;
import xc.f0;
import yc.j;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f6396c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f6397d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f6398e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final f6.e<f0, byte[]> f6399f = new f6.e() { // from class: bd.a
        @Override // f6.e
        public final Object apply(Object obj) {
            byte[] d10;
            d10 = b.d((f0) obj);
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final e f6400a;

    /* renamed from: b, reason: collision with root package name */
    private final f6.e<f0, byte[]> f6401b;

    b(e eVar, f6.e<f0, byte[]> eVar2) {
        this.f6400a = eVar;
        this.f6401b = eVar2;
    }

    public static b b(Context context, i iVar, g0 g0Var) {
        u.f(context);
        g g10 = u.c().g(new com.google.android.datatransport.cct.a(f6397d, f6398e));
        f6.b b10 = f6.b.b("json");
        f6.e<f0, byte[]> eVar = f6399f;
        return new b(new e(g10.b("FIREBASE_CRASHLYTICS_REPORT", f0.class, b10, eVar), iVar.b(), g0Var), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(f0 f0Var) {
        return f6396c.M(f0Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public Task<vc.u> c(vc.u uVar, boolean z10) {
        return this.f6400a.i(uVar, z10).getTask();
    }
}
