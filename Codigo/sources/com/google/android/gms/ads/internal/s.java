package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.ads.internal.client.z4;
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

/* loaded from: classes.dex */
public final class s extends t0 {

    /* renamed from: a */
    private final zzcei f8904a;

    /* renamed from: b */
    private final z4 f8905b;

    /* renamed from: c */
    private final Future f8906c = zzcep.zza.zzb(new o(this));

    /* renamed from: d */
    private final Context f8907d;

    /* renamed from: e */
    private final r f8908e;

    /* renamed from: f */
    private WebView f8909f;

    /* renamed from: r */
    private h0 f8910r;

    /* renamed from: s */
    private zzavi f8911s;

    /* renamed from: t */
    private AsyncTask f8912t;

    public s(Context context, z4 z4Var, String str, zzcei zzceiVar) {
        this.f8907d = context;
        this.f8904a = zzceiVar;
        this.f8905b = z4Var;
        this.f8909f = new WebView(context);
        this.f8908e = new r(context, str);
        f2(0);
        this.f8909f.setVerticalScrollBarEnabled(false);
        this.f8909f.getSettings().setJavaScriptEnabled(true);
        this.f8909f.setWebViewClient(new m(this));
        this.f8909f.setOnTouchListener(new n(this));
    }

    public static /* bridge */ /* synthetic */ String l2(s sVar, String str) {
        if (sVar.f8911s == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = sVar.f8911s.zza(parse, sVar.f8907d, null, null);
        } catch (zzavj e10) {
            zzcec.zzk("Unable to process ad data", e10);
        }
        return parse.toString();
    }

    public static /* bridge */ /* synthetic */ void o2(s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f8907d.startActivity(intent);
    }

    public final void f2(int i10) {
        if (this.f8909f == null) {
            return;
        }
        this.f8909f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzB() {
        com.google.android.gms.common.internal.s.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzC(e0 e0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzD(h0 h0Var) {
        this.f8910r = h0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzE(y0 y0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzF(z4 z4Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzG(c1 c1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzH(zzbam zzbamVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzI(f5 f5Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzJ(j1 j1Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzK(w2 w2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzM(zzbxc zzbxcVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzO(zzbha zzbhaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzP(i2 i2Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzQ(zzbxf zzbxfVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzS(zzcaa zzcaaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzU(n4 n4Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzW(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzaa(u4 u4Var) {
        com.google.android.gms.common.internal.s.k(this.f8909f, "This Search Ad has already been torn down");
        this.f8908e.f(u4Var, this.f8904a);
        this.f8912t = new q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzab(g1 g1Var) {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            x.b();
            return zzcdv.zzx(this.f8907d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final z4 zzg() {
        return this.f8905b;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final h0 zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final c1 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final p2 zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final s2 zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final com.google.android.gms.dynamic.b zzn() {
        com.google.android.gms.common.internal.s.e("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.d.h2(this.f8909f);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbho.zzd.zze());
        builder.appendQueryParameter("query", this.f8908e.d());
        builder.appendQueryParameter("pubId", this.f8908e.c());
        builder.appendQueryParameter("mappver", this.f8908e.a());
        Map e10 = this.f8908e.e();
        for (String str : e10.keySet()) {
            builder.appendQueryParameter(str, (String) e10.get(str));
        }
        Uri build = builder.build();
        zzavi zzaviVar = this.f8911s;
        if (zzaviVar != null) {
            try {
                build = zzaviVar.zzb(build, this.f8907d);
            } catch (zzavj e11) {
                zzcec.zzk("Unable to process ad data", e11);
            }
        }
        return zzq() + "#" + build.getEncodedQuery();
    }

    public final String zzq() {
        String b10 = this.f8908e.b();
        if (true == TextUtils.isEmpty(b10)) {
            b10 = "www.google.com";
        }
        return "https://" + b10 + ((String) zzbho.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzx() {
        com.google.android.gms.common.internal.s.e("destroy must be called on the main UI thread.");
        this.f8912t.cancel(true);
        this.f8906c.cancel(true);
        this.f8909f.destroy();
        this.f8909f = null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzz() {
        com.google.android.gms.common.internal.s.e("pause must be called on the main UI thread.");
    }
}
