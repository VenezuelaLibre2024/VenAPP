package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AbstractBinderC4907t0;
import com.google.android.gms.ads.internal.client.C4824f5;
import com.google.android.gms.ads.internal.client.C4827g1;
import com.google.android.gms.ads.internal.client.C4875n4;
import com.google.android.gms.ads.internal.client.C4917u4;
import com.google.android.gms.ads.internal.client.C4927w2;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.ads.internal.client.C4947z4;
import com.google.android.gms.ads.internal.client.InterfaceC4799c1;
import com.google.android.gms.ads.internal.client.InterfaceC4812e0;
import com.google.android.gms.ads.internal.client.InterfaceC4833h0;
import com.google.android.gms.ads.internal.client.InterfaceC4842i2;
import com.google.android.gms.ads.internal.client.InterfaceC4848j1;
import com.google.android.gms.ads.internal.client.InterfaceC4853k0;
import com.google.android.gms.ads.internal.client.InterfaceC4885p2;
import com.google.android.gms.ads.internal.client.InterfaceC4903s2;
import com.google.android.gms.ads.internal.client.InterfaceC4937y0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcep;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.ads.internal.s */
/* loaded from: classes.dex */
public final class BinderC4964s extends AbstractBinderC4907t0 {

    /* renamed from: a */
    private final zzcei f9999a;

    /* renamed from: b */
    private final C4947z4 f10000b;

    /* renamed from: c */
    private final Future f10001c = zzcep.zza.zzb(new CallableC4959o(this));

    /* renamed from: d */
    private final Context f10002d;

    /* renamed from: e */
    private final C4963r f10003e;

    /* renamed from: f */
    private WebView f10004f;

    /* renamed from: r */
    private InterfaceC4833h0 f10005r;

    /* renamed from: s */
    private zzavi f10006s;

    /* renamed from: t */
    private AsyncTask f10007t;

    public BinderC4964s(Context context, C4947z4 c4947z4, String str, zzcei zzceiVar) {
        this.f10002d = context;
        this.f9999a = zzceiVar;
        this.f10000b = c4947z4;
        this.f10004f = new WebView(context);
        this.f10003e = new C4963r(context, str);
        m12561f2(0);
        this.f10004f.setVerticalScrollBarEnabled(false);
        this.f10004f.getSettings().setJavaScriptEnabled(true);
        this.f10004f.setWebViewClient(new C4957m(this));
        this.f10004f.setOnTouchListener(new ViewOnTouchListenerC4958n(this));
    }

    /* renamed from: l2 */
    public static /* bridge */ /* synthetic */ String m12557l2(BinderC4964s binderC4964s, String str) {
        if (binderC4964s.f10006s == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = binderC4964s.f10006s.zza(parse, binderC4964s.f10002d, null, null);
        } catch (zzavj e10) {
            zzcec.zzk("Unable to process ad data", e10);
        }
        return parse.toString();
    }

    /* renamed from: o2 */
    public static /* bridge */ /* synthetic */ void m12560o2(BinderC4964s binderC4964s, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        binderC4964s.f10002d.startActivity(intent);
    }

    /* renamed from: f2 */
    public final void m12561f2(int i10) {
        if (this.f10004f == null) {
            return;
        }
        this.f10004f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzB() {
        C5276s.m13319e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzC(InterfaceC4812e0 interfaceC4812e0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzD(InterfaceC4833h0 interfaceC4833h0) {
        this.f10005r = interfaceC4833h0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzE(InterfaceC4937y0 interfaceC4937y0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzF(C4947z4 c4947z4) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzG(InterfaceC4799c1 interfaceC4799c1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzH(zzbam zzbamVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzI(C4824f5 c4824f5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzJ(InterfaceC4848j1 interfaceC4848j1) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzK(C4927w2 c4927w2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzM(zzbxc zzbxcVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzO(zzbha zzbhaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzP(InterfaceC4842i2 interfaceC4842i2) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzQ(zzbxf zzbxfVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzS(zzcaa zzcaaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzU(C4875n4 c4875n4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzW(InterfaceC5312b interfaceC5312b) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final boolean zzaa(C4917u4 c4917u4) {
        C5276s.m13325k(this.f10004f, "This Search Ad has already been torn down");
        this.f10003e.m12551f(c4917u4, this.f9999a);
        this.f10007t = new AsyncTaskC4962q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzab(C4827g1 c4827g1) {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C4930x.m12474b();
            return zzcdv.zzx(this.f10002d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final C4947z4 zzg() {
        return this.f10000b;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4833h0 zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4799c1 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4885p2 zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4903s2 zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC5312b zzn() {
        C5276s.m13319e("getAdFrame must be called on the main UI thread.");
        return BinderC5314d.m13412h2(this.f10004f);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbho.zzd.zze());
        builder.appendQueryParameter("query", this.f10003e.m12549d());
        builder.appendQueryParameter("pubId", this.f10003e.m12548c());
        builder.appendQueryParameter("mappver", this.f10003e.m12546a());
        Map m12550e = this.f10003e.m12550e();
        for (String str : m12550e.keySet()) {
            builder.appendQueryParameter(str, (String) m12550e.get(str));
        }
        Uri build = builder.build();
        zzavi zzaviVar = this.f10006s;
        if (zzaviVar != null) {
            try {
                build = zzaviVar.zzb(build, this.f10002d);
            } catch (zzavj e10) {
                zzcec.zzk("Unable to process ad data", e10);
            }
        }
        return zzq() + "#" + build.getEncodedQuery();
    }

    public final String zzq() {
        String m12547b = this.f10003e.m12547b();
        if (true == TextUtils.isEmpty(m12547b)) {
            m12547b = "www.google.com";
        }
        return "https://" + m12547b + ((String) zzbho.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzx() {
        C5276s.m13319e("destroy must be called on the main UI thread.");
        this.f10007t.cancel(true);
        this.f10001c.cancel(true);
        this.f10004f.destroy();
        this.f10004f = null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzy(C4917u4 c4917u4, InterfaceC4853k0 interfaceC4853k0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzz() {
        C5276s.m13319e("pause must be called on the main UI thread.");
    }
}
