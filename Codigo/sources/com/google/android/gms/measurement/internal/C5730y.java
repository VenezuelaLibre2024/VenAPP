package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import androidx.core.content.C0854a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.y */
/* loaded from: classes2.dex */
public final class C5730y extends AbstractC5688u6 {

    /* renamed from: c */
    private long f12042c;

    /* renamed from: d */
    private String f12043d;

    /* renamed from: e */
    private AccountManager f12044e;

    /* renamed from: f */
    private Boolean f12045f;

    /* renamed from: g */
    private long f12046g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5730y(C5712w5 c5712w5) {
        super(c5712w5);
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: n */
    protected final boolean mo14040n() {
        Calendar calendar = Calendar.getInstance();
        this.f12042c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f12043d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final long m14540p() {
        mo13687i();
        return this.f12046g;
    }

    /* renamed from: q */
    public final long m14541q() {
        m14356j();
        return this.f12042c;
    }

    /* renamed from: r */
    public final String m14542r() {
        m14356j();
        return this.f12043d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m14543s() {
        mo13687i();
        this.f12045f = null;
        this.f12046g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m14544t() {
        mo13687i();
        long mo28130a = zzb().mo28130a();
        if (mo28130a - this.f12046g > 86400000) {
            this.f12045f = null;
        }
        Boolean bool = this.f12045f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0854a.checkSelfPermission(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            zzj().m14189I().m14218a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f12044e == null) {
                this.f12044e = AccountManager.get(zza());
            }
            try {
                Account[] result = this.f12044e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f12045f = Boolean.TRUE;
                    this.f12046g = mo28130a;
                    return true;
                }
                Account[] result2 = this.f12044e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f12045f = Boolean.TRUE;
                    this.f12046g = mo28130a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                zzj().m14184D().m14219b("Exception checking account types", e10);
            }
        }
        this.f12046g = mo28130a;
        this.f12045f = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
