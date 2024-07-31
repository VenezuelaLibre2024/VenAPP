package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfij;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f8877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(s sVar) {
        this.f8877a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        s sVar = this.f8877a;
        h0Var = sVar.f8910r;
        if (h0Var != null) {
            try {
                h0Var2 = sVar.f8910r;
                h0Var2.zzf(zzfij.zzd(1, null, null));
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        s sVar2 = this.f8877a;
        h0Var3 = sVar2.f8910r;
        if (h0Var3 != null) {
            try {
                h0Var4 = sVar2.f8910r;
                h0Var4.zze(0);
            } catch (RemoteException e11) {
                zzcec.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        h0 h0Var5;
        h0 h0Var6;
        h0 h0Var7;
        h0 h0Var8;
        h0 h0Var9;
        h0 h0Var10;
        h0 h0Var11;
        h0 h0Var12;
        h0 h0Var13;
        if (str.startsWith(this.f8877a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            s sVar = this.f8877a;
            h0Var10 = sVar.f8910r;
            if (h0Var10 != null) {
                try {
                    h0Var11 = sVar.f8910r;
                    h0Var11.zzf(zzfij.zzd(3, null, null));
                } catch (RemoteException e10) {
                    zzcec.zzl("#007 Could not call remote method.", e10);
                }
            }
            s sVar2 = this.f8877a;
            h0Var12 = sVar2.f8910r;
            if (h0Var12 != null) {
                try {
                    h0Var13 = sVar2.f8910r;
                    h0Var13.zze(3);
                } catch (RemoteException e11) {
                    zzcec.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.f8877a.f2(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.f8877a;
            h0Var6 = sVar3.f8910r;
            if (h0Var6 != null) {
                try {
                    h0Var7 = sVar3.f8910r;
                    h0Var7.zzf(zzfij.zzd(1, null, null));
                } catch (RemoteException e12) {
                    zzcec.zzl("#007 Could not call remote method.", e12);
                }
            }
            s sVar4 = this.f8877a;
            h0Var8 = sVar4.f8910r;
            if (h0Var8 != null) {
                try {
                    h0Var9 = sVar4.f8910r;
                    h0Var9.zze(0);
                } catch (RemoteException e13) {
                    zzcec.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.f8877a.f2(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.f8877a;
            h0Var4 = sVar5.f8910r;
            if (h0Var4 != null) {
                try {
                    h0Var5 = sVar5.f8910r;
                    h0Var5.zzi();
                } catch (RemoteException e14) {
                    zzcec.zzl("#007 Could not call remote method.", e14);
                }
            }
            this.f8877a.f2(this.f8877a.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        s sVar6 = this.f8877a;
        h0Var = sVar6.f8910r;
        if (h0Var != null) {
            try {
                h0Var2 = sVar6.f8910r;
                h0Var2.zzc();
                h0Var3 = this.f8877a.f8910r;
                h0Var3.zzh();
            } catch (RemoteException e15) {
                zzcec.zzl("#007 Could not call remote method.", e15);
            }
        }
        s.o2(this.f8877a, s.l2(this.f8877a, str));
        return true;
    }
}
