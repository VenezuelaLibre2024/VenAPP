package p272oc;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import com.google.android.gms.internal.p498firebaseauthapi.zzap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC6076i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import la.C9464i;
import p081ea.C7142e;

/* renamed from: oc.m0 */
/* loaded from: classes.dex */
public final class C9870m0 {

    /* renamed from: d */
    private static long f24342d = 3600000;

    /* renamed from: e */
    private static final zzap<String> f24343e = zzap.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", Constants.TIMESTAMP);

    /* renamed from: f */
    private static final C9870m0 f24344f = new C9870m0();

    /* renamed from: a */
    private Task<InterfaceC6076i> f24345a;

    /* renamed from: b */
    private Task<String> f24346b;

    /* renamed from: c */
    private long f24347c = 0;

    private C9870m0() {
    }

    /* renamed from: b */
    public static void m29555b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.m12969v1());
        edit.putString("statusMessage", status.m12970w1());
        edit.putLong(Constants.TIMESTAMP, C9464i.m28142d().mo28130a());
        edit.commit();
    }

    /* renamed from: c */
    public static void m29556c(Context context, zzagt zzagtVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", C7142e.m21240f(zzagtVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(Constants.TIMESTAMP, C9464i.m28142d().mo28130a());
        edit.commit();
    }

    /* renamed from: d */
    public static void m29557d(Context context, FirebaseAuth firebaseAuth) {
        C5276s.m13324j(context);
        C5276s.m13324j(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.m16396i().m42631q());
        edit.commit();
    }

    /* renamed from: e */
    public static void m29558e(Context context, FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0) {
        C5276s.m13324j(context);
        C5276s.m13324j(firebaseAuth);
        C5276s.m13324j(abstractC6045a0);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.m16396i().m42631q());
        edit.putString("firebaseUserUid", abstractC6045a0.mo16454l());
        edit.commit();
    }

    /* renamed from: f */
    public static void m29559f(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(Constants.TIMESTAMP, C9464i.m28142d().mo28130a());
        edit.commit();
    }

    /* renamed from: g */
    private static void m29560g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzap<String> zzapVar = f24343e;
        int size = zzapVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzapVar.get(i10);
            i10++;
            edit.remove(str);
        }
        edit.commit();
    }

    /* renamed from: j */
    public static C9870m0 m29561j() {
        return f24344f;
    }

    /* renamed from: a */
    public final void m29562a(Context context) {
        C5276s.m13324j(context);
        m29560g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f24345a = null;
        this.f24347c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L12;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29563h(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p272oc.C9870m0.m29563h(com.google.firebase.auth.FirebaseAuth):void");
    }

    /* renamed from: i */
    public final Task<String> m29564i() {
        if (C9464i.m28142d().mo28130a() - this.f24347c < f24342d) {
            return this.f24346b;
        }
        return null;
    }
}
