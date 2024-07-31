package oc;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: d */
    private static long f22409d = 3600000;

    /* renamed from: e */
    private static final zzap<String> f22410e = zzap.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", Constants.TIMESTAMP);

    /* renamed from: f */
    private static final m0 f22411f = new m0();

    /* renamed from: a */
    private Task<com.google.firebase.auth.i> f22412a;

    /* renamed from: b */
    private Task<String> f22413b;

    /* renamed from: c */
    private long f22414c = 0;

    private m0() {
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.v1());
        edit.putString("statusMessage", status.w1());
        edit.putLong(Constants.TIMESTAMP, la.i.d().a());
        edit.commit();
    }

    public static void c(Context context, zzagt zzagtVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", ea.e.f(zzagtVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(Constants.TIMESTAMP, la.i.d().a());
        edit.commit();
    }

    public static void d(Context context, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.j(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.i().q());
        edit.commit();
    }

    public static void e(Context context, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.j(firebaseAuth);
        com.google.android.gms.common.internal.s.j(a0Var);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.i().q());
        edit.putString("firebaseUserUid", a0Var.l());
        edit.commit();
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(Constants.TIMESTAMP, la.i.d().a());
        edit.commit();
    }

    private static void g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzap<String> zzapVar = f22410e;
        int size = zzapVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzapVar.get(i10);
            i10++;
            edit.remove(str);
        }
        edit.commit();
    }

    public static m0 j() {
        return f22411f;
    }

    public final void a(Context context) {
        com.google.android.gms.common.internal.s.j(context);
        g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f22412a = null;
        this.f22414c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.m0.h(com.google.firebase.auth.FirebaseAuth):void");
    }

    public final Task<String> i() {
        if (la.i.d().a() - this.f22414c < f22409d) {
            return this.f22413b;
        }
        return null;
    }
}
