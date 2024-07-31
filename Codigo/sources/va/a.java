package va;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.List;
import java.util.Map;
import wa.u;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final zzdf f28736a;

    /* renamed from: va.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0462a extends u {
    }

    public a(zzdf zzdfVar) {
        this.f28736a = zzdfVar;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzdf.zza(context, str, str2, str3, bundle).zzb();
    }

    public void a(String str) {
        this.f28736a.zzb(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f28736a.zza(str, str2, bundle);
    }

    public void c(String str) {
        this.f28736a.zzc(str);
    }

    public long d() {
        return this.f28736a.zza();
    }

    public String e() {
        return this.f28736a.zzd();
    }

    public String f() {
        return this.f28736a.zzf();
    }

    public List<Bundle> g(String str, String str2) {
        return this.f28736a.zza(str, str2);
    }

    public String h() {
        return this.f28736a.zzg();
    }

    public String i() {
        return this.f28736a.zzh();
    }

    public String j() {
        return this.f28736a.zzi();
    }

    public int l(String str) {
        return this.f28736a.zza(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z10) {
        return this.f28736a.zza(str, str2, z10);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f28736a.zzb(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f28736a.zza(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f28736a.zza(bundle, true);
    }

    public void q(InterfaceC0462a interfaceC0462a) {
        this.f28736a.zza(interfaceC0462a);
    }

    public void r(Bundle bundle) {
        this.f28736a.zza(bundle);
    }

    public void s(Bundle bundle) {
        this.f28736a.zzb(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.f28736a.zza(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.f28736a.zza(str, str2, obj, true);
    }

    public final void v(boolean z10) {
        this.f28736a.zza(z10);
    }
}
