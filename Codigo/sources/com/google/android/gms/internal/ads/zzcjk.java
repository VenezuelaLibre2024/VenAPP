package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.l;
import g9.u;
import la.q;

/* loaded from: classes2.dex */
public interface zzcjk extends com.google.android.gms.ads.internal.client.a, zzdiu, zzcjb, zzbqa, zzckj, zzckn, zzbqn, zzayq, zzckq, l, zzckt, zzcku, zzcgl, zzckv {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzckn, com.google.android.gms.internal.ads.zzcgl
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    @Override // com.google.android.gms.ads.internal.client.a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcgl
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcgl
    void zzC(zzcki zzckiVar);

    @Override // com.google.android.gms.internal.ads.zzcjb
    zzfgm zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzckv
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzckt
    zzavi zzI();

    zzbad zzJ();

    zzbja zzK();

    u zzL();

    u zzM();

    zzcky zzN();

    @Override // com.google.android.gms.internal.ads.zzcks
    zzcla zzO();

    @Override // com.google.android.gms.internal.ads.zzckj
    zzfgp zzP();

    zzfhl zzQ();

    zzfod zzR();

    com.google.common.util.concurrent.f zzS();

    String zzT();

    void zzU(zzfgm zzfgmVar, zzfgp zzfgpVar);

    void zzV();

    void zzW();

    void zzX(int i10);

    void zzY();

    void zzZ();

    boolean zzaA(boolean z10, int i10);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa(boolean z10);

    void zzab();

    void zzac(String str, String str2, String str3);

    void zzad();

    void zzae(String str, zzbng zzbngVar);

    void zzaf();

    void zzag(u uVar);

    void zzah(zzcla zzclaVar);

    void zzai(zzbad zzbadVar);

    void zzaj(boolean z10);

    void zzak();

    void zzal(Context context);

    void zzam(boolean z10);

    void zzan(zzbiy zzbiyVar);

    void zzao(boolean z10);

    void zzap(zzbja zzbjaVar);

    void zzaq(zzfod zzfodVar);

    void zzar(int i10);

    void zzas(boolean z10);

    void zzat(u uVar);

    void zzau(boolean z10);

    void zzav(boolean z10);

    void zzaw(String str, zzbng zzbngVar);

    void zzax(String str, q qVar);

    boolean zzay();

    boolean zzaz();

    @Override // com.google.android.gms.ads.internal.l
    /* synthetic */ void zzbp();

    @Override // com.google.android.gms.ads.internal.l
    /* synthetic */ void zzbq();

    @Override // com.google.android.gms.internal.ads.zzckn, com.google.android.gms.internal.ads.zzcgl
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcgl
    com.google.android.gms.ads.internal.a zzj();

    @Override // com.google.android.gms.internal.ads.zzcgl
    zzbgs zzm();

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcgl
    zzcei zzn();

    @Override // com.google.android.gms.internal.ads.zzcgl
    zzcki zzq();

    @Override // com.google.android.gms.internal.ads.zzcgl
    void zzt(String str, zzchw zzchwVar);
}
