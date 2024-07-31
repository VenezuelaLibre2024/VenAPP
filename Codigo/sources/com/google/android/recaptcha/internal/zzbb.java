package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import ck.o;
import ck.v;
import dk.z;
import gk.Continuation;
import hk.d;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbb extends l implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzbc zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(String[] strArr, zzbc zzbcVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zza = strArr;
        this.zzb = zzbcVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzbb(this.zza, this.zzb, this.zzc, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((k0) obj, (Continuation) obj2)).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        String M;
        d.c();
        o.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        webView = this.zzb.zza;
        String str2 = this.zzc;
        M = z.M(arrayList, ",", null, null, 0, null, null, 62, null);
        webView.evaluateJavascript(str2 + "(" + M + ")", null);
        return v.f7137a;
    }
}
