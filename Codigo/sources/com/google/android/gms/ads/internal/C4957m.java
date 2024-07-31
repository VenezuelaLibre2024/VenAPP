package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.InterfaceC4833h0;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfij;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.m */
/* loaded from: classes.dex */
public final class C4957m extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ BinderC4964s f9964a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4957m(BinderC4964s binderC4964s) {
        this.f9964a = binderC4964s;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        InterfaceC4833h0 interfaceC4833h0;
        InterfaceC4833h0 interfaceC4833h02;
        InterfaceC4833h0 interfaceC4833h03;
        InterfaceC4833h0 interfaceC4833h04;
        BinderC4964s binderC4964s = this.f9964a;
        interfaceC4833h0 = binderC4964s.f10005r;
        if (interfaceC4833h0 != null) {
            try {
                interfaceC4833h02 = binderC4964s.f10005r;
                interfaceC4833h02.zzf(zzfij.zzd(1, null, null));
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        BinderC4964s binderC4964s2 = this.f9964a;
        interfaceC4833h03 = binderC4964s2.f10005r;
        if (interfaceC4833h03 != null) {
            try {
                interfaceC4833h04 = binderC4964s2.f10005r;
                interfaceC4833h04.zze(0);
            } catch (RemoteException e11) {
                zzcec.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC4833h0 interfaceC4833h0;
        InterfaceC4833h0 interfaceC4833h02;
        InterfaceC4833h0 interfaceC4833h03;
        InterfaceC4833h0 interfaceC4833h04;
        InterfaceC4833h0 interfaceC4833h05;
        InterfaceC4833h0 interfaceC4833h06;
        InterfaceC4833h0 interfaceC4833h07;
        InterfaceC4833h0 interfaceC4833h08;
        InterfaceC4833h0 interfaceC4833h09;
        InterfaceC4833h0 interfaceC4833h010;
        InterfaceC4833h0 interfaceC4833h011;
        InterfaceC4833h0 interfaceC4833h012;
        InterfaceC4833h0 interfaceC4833h013;
        if (str.startsWith(this.f9964a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            BinderC4964s binderC4964s = this.f9964a;
            interfaceC4833h010 = binderC4964s.f10005r;
            if (interfaceC4833h010 != null) {
                try {
                    interfaceC4833h011 = binderC4964s.f10005r;
                    interfaceC4833h011.zzf(zzfij.zzd(3, null, null));
                } catch (RemoteException e10) {
                    zzcec.zzl("#007 Could not call remote method.", e10);
                }
            }
            BinderC4964s binderC4964s2 = this.f9964a;
            interfaceC4833h012 = binderC4964s2.f10005r;
            if (interfaceC4833h012 != null) {
                try {
                    interfaceC4833h013 = binderC4964s2.f10005r;
                    interfaceC4833h013.zze(3);
                } catch (RemoteException e11) {
                    zzcec.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.f9964a.m12561f2(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            BinderC4964s binderC4964s3 = this.f9964a;
            interfaceC4833h06 = binderC4964s3.f10005r;
            if (interfaceC4833h06 != null) {
                try {
                    interfaceC4833h07 = binderC4964s3.f10005r;
                    interfaceC4833h07.zzf(zzfij.zzd(1, null, null));
                } catch (RemoteException e12) {
                    zzcec.zzl("#007 Could not call remote method.", e12);
                }
            }
            BinderC4964s binderC4964s4 = this.f9964a;
            interfaceC4833h08 = binderC4964s4.f10005r;
            if (interfaceC4833h08 != null) {
                try {
                    interfaceC4833h09 = binderC4964s4.f10005r;
                    interfaceC4833h09.zze(0);
                } catch (RemoteException e13) {
                    zzcec.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.f9964a.m12561f2(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            BinderC4964s binderC4964s5 = this.f9964a;
            interfaceC4833h04 = binderC4964s5.f10005r;
            if (interfaceC4833h04 != null) {
                try {
                    interfaceC4833h05 = binderC4964s5.f10005r;
                    interfaceC4833h05.zzi();
                } catch (RemoteException e14) {
                    zzcec.zzl("#007 Could not call remote method.", e14);
                }
            }
            this.f9964a.m12561f2(this.f9964a.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        BinderC4964s binderC4964s6 = this.f9964a;
        interfaceC4833h0 = binderC4964s6.f10005r;
        if (interfaceC4833h0 != null) {
            try {
                interfaceC4833h02 = binderC4964s6.f10005r;
                interfaceC4833h02.zzc();
                interfaceC4833h03 = this.f9964a.f10005r;
                interfaceC4833h03.zzh();
            } catch (RemoteException e15) {
                zzcec.zzl("#007 Could not call remote method.", e15);
            }
        }
        BinderC4964s.m12560o2(this.f9964a, BinderC4964s.m12557l2(this.f9964a, str));
        return true;
    }
}
