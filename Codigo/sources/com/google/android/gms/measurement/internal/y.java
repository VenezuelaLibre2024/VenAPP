package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class y extends u6 {

    /* renamed from: c */
    private long f10827c;

    /* renamed from: d */
    private String f10828d;

    /* renamed from: e */
    private AccountManager f10829e;

    /* renamed from: f */
    private Boolean f10830f;

    /* renamed from: g */
    private long f10831g;

    public y(w5 w5Var) {
        super(w5Var);
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean n() {
        Calendar calendar = Calendar.getInstance();
        this.f10827c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f10828d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long p() {
        i();
        return this.f10831g;
    }

    public final long q() {
        j();
        return this.f10827c;
    }

    public final String r() {
        j();
        return this.f10828d;
    }

    public final void s() {
        i();
        this.f10830f = null;
        this.f10831g = 0L;
    }

    public final boolean t() {
        i();
        long a10 = zzb().a();
        if (a10 - this.f10831g > 86400000) {
            this.f10830f = null;
        }
        Boolean bool = this.f10830f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.a.checkSelfPermission(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            zzj().I().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f10829e == null) {
                this.f10829e = AccountManager.get(zza());
            }
            try {
                Account[] result = this.f10829e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f10830f = Boolean.TRUE;
                    this.f10831g = a10;
                    return true;
                }
                Account[] result2 = this.f10829e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f10830f = Boolean.TRUE;
                    this.f10831g = a10;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                zzj().D().b("Exception checking account types", e10);
            }
        }
        this.f10831g = a10;
        this.f10830f = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
