package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdiu;
import ea.c;
import g9.b;
import g9.j;
import g9.w;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();
    public final zzblw A;
    public final String B;
    public final String C;
    public final String D;
    public final zzdbk E;
    public final zzdiu F;
    public final zzbwm G;
    public final boolean H;

    /* renamed from: a */
    public final j f8882a;

    /* renamed from: b */
    public final com.google.android.gms.ads.internal.client.a f8883b;

    /* renamed from: c */
    public final w f8884c;

    /* renamed from: d */
    public final zzcjk f8885d;

    /* renamed from: e */
    public final zzbly f8886e;

    /* renamed from: f */
    public final String f8887f;

    /* renamed from: r */
    public final boolean f8888r;

    /* renamed from: s */
    public final String f8889s;

    /* renamed from: t */
    public final b f8890t;

    /* renamed from: u */
    public final int f8891u;

    /* renamed from: v */
    public final int f8892v;

    /* renamed from: w */
    public final String f8893w;

    /* renamed from: x */
    public final zzcei f8894x;

    /* renamed from: y */
    public final String f8895y;

    /* renamed from: z */
    public final com.google.android.gms.ads.internal.j f8896z;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, w wVar, zzblw zzblwVar, zzbly zzblyVar, b bVar, zzcjk zzcjkVar, boolean z10, int i10, String str, zzcei zzceiVar, zzdiu zzdiuVar, zzbwm zzbwmVar, boolean z11) {
        this.f8882a = null;
        this.f8883b = aVar;
        this.f8884c = wVar;
        this.f8885d = zzcjkVar;
        this.A = zzblwVar;
        this.f8886e = zzblyVar;
        this.f8887f = null;
        this.f8888r = z10;
        this.f8889s = null;
        this.f8890t = bVar;
        this.f8891u = i10;
        this.f8892v = 3;
        this.f8893w = str;
        this.f8894x = zzceiVar;
        this.f8895y = null;
        this.f8896z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdiuVar;
        this.G = zzbwmVar;
        this.H = z11;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, w wVar, zzblw zzblwVar, zzbly zzblyVar, b bVar, zzcjk zzcjkVar, boolean z10, int i10, String str, String str2, zzcei zzceiVar, zzdiu zzdiuVar, zzbwm zzbwmVar) {
        this.f8882a = null;
        this.f8883b = aVar;
        this.f8884c = wVar;
        this.f8885d = zzcjkVar;
        this.A = zzblwVar;
        this.f8886e = zzblyVar;
        this.f8887f = str2;
        this.f8888r = z10;
        this.f8889s = str;
        this.f8890t = bVar;
        this.f8891u = i10;
        this.f8892v = 3;
        this.f8893w = null;
        this.f8894x = zzceiVar;
        this.f8895y = null;
        this.f8896z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdiuVar;
        this.G = zzbwmVar;
        this.H = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, w wVar, b bVar, zzcjk zzcjkVar, int i10, zzcei zzceiVar, String str, com.google.android.gms.ads.internal.j jVar, String str2, String str3, String str4, zzdbk zzdbkVar, zzbwm zzbwmVar) {
        this.f8882a = null;
        this.f8883b = null;
        this.f8884c = wVar;
        this.f8885d = zzcjkVar;
        this.A = null;
        this.f8886e = null;
        this.f8888r = false;
        if (((Boolean) a0.c().zza(zzbgc.zzaI)).booleanValue()) {
            this.f8887f = null;
            this.f8889s = null;
        } else {
            this.f8887f = str2;
            this.f8889s = str3;
        }
        this.f8890t = null;
        this.f8891u = i10;
        this.f8892v = 1;
        this.f8893w = null;
        this.f8894x = zzceiVar;
        this.f8895y = str;
        this.f8896z = jVar;
        this.B = null;
        this.C = null;
        this.D = str4;
        this.E = zzdbkVar;
        this.F = null;
        this.G = zzbwmVar;
        this.H = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, w wVar, b bVar, zzcjk zzcjkVar, boolean z10, int i10, zzcei zzceiVar, zzdiu zzdiuVar, zzbwm zzbwmVar) {
        this.f8882a = null;
        this.f8883b = aVar;
        this.f8884c = wVar;
        this.f8885d = zzcjkVar;
        this.A = null;
        this.f8886e = null;
        this.f8887f = null;
        this.f8888r = z10;
        this.f8889s = null;
        this.f8890t = bVar;
        this.f8891u = i10;
        this.f8892v = 2;
        this.f8893w = null;
        this.f8894x = zzceiVar;
        this.f8895y = null;
        this.f8896z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdiuVar;
        this.G = zzbwmVar;
        this.H = false;
    }

    public AdOverlayInfoParcel(zzcjk zzcjkVar, zzcei zzceiVar, String str, String str2, int i10, zzbwm zzbwmVar) {
        this.f8882a = null;
        this.f8883b = null;
        this.f8884c = null;
        this.f8885d = zzcjkVar;
        this.A = null;
        this.f8886e = null;
        this.f8887f = null;
        this.f8888r = false;
        this.f8889s = null;
        this.f8890t = null;
        this.f8891u = 14;
        this.f8892v = 5;
        this.f8893w = null;
        this.f8894x = zzceiVar;
        this.f8895y = null;
        this.f8896z = null;
        this.B = str;
        this.C = str2;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = zzbwmVar;
        this.H = false;
    }

    public AdOverlayInfoParcel(j jVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, zzcei zzceiVar, String str4, com.google.android.gms.ads.internal.j jVar2, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z11) {
        this.f8882a = jVar;
        this.f8883b = (com.google.android.gms.ads.internal.client.a) d.g2(b.a.f2(iBinder));
        this.f8884c = (w) d.g2(b.a.f2(iBinder2));
        this.f8885d = (zzcjk) d.g2(b.a.f2(iBinder3));
        this.A = (zzblw) d.g2(b.a.f2(iBinder6));
        this.f8886e = (zzbly) d.g2(b.a.f2(iBinder4));
        this.f8887f = str;
        this.f8888r = z10;
        this.f8889s = str2;
        this.f8890t = (g9.b) d.g2(b.a.f2(iBinder5));
        this.f8891u = i10;
        this.f8892v = i11;
        this.f8893w = str3;
        this.f8894x = zzceiVar;
        this.f8895y = str4;
        this.f8896z = jVar2;
        this.B = str5;
        this.C = str6;
        this.D = str7;
        this.E = (zzdbk) d.g2(b.a.f2(iBinder7));
        this.F = (zzdiu) d.g2(b.a.f2(iBinder8));
        this.G = (zzbwm) d.g2(b.a.f2(iBinder9));
        this.H = z11;
    }

    public AdOverlayInfoParcel(j jVar, com.google.android.gms.ads.internal.client.a aVar, w wVar, g9.b bVar, zzcei zzceiVar, zzcjk zzcjkVar, zzdiu zzdiuVar) {
        this.f8882a = jVar;
        this.f8883b = aVar;
        this.f8884c = wVar;
        this.f8885d = zzcjkVar;
        this.A = null;
        this.f8886e = null;
        this.f8887f = null;
        this.f8888r = false;
        this.f8889s = null;
        this.f8890t = bVar;
        this.f8891u = -1;
        this.f8892v = 4;
        this.f8893w = null;
        this.f8894x = zzceiVar;
        this.f8895y = null;
        this.f8896z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdiuVar;
        this.G = null;
        this.H = false;
    }

    public AdOverlayInfoParcel(w wVar, zzcjk zzcjkVar, int i10, zzcei zzceiVar) {
        this.f8884c = wVar;
        this.f8885d = zzcjkVar;
        this.f8891u = 1;
        this.f8894x = zzceiVar;
        this.f8882a = null;
        this.f8883b = null;
        this.A = null;
        this.f8886e = null;
        this.f8887f = null;
        this.f8888r = false;
        this.f8889s = null;
        this.f8890t = null;
        this.f8892v = 1;
        this.f8893w = null;
        this.f8895y = null;
        this.f8896z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = false;
    }

    public static AdOverlayInfoParcel u1(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j jVar = this.f8882a;
        int a10 = c.a(parcel);
        c.E(parcel, 2, jVar, i10, false);
        c.t(parcel, 3, d.h2(this.f8883b).asBinder(), false);
        c.t(parcel, 4, d.h2(this.f8884c).asBinder(), false);
        c.t(parcel, 5, d.h2(this.f8885d).asBinder(), false);
        c.t(parcel, 6, d.h2(this.f8886e).asBinder(), false);
        c.G(parcel, 7, this.f8887f, false);
        c.g(parcel, 8, this.f8888r);
        c.G(parcel, 9, this.f8889s, false);
        c.t(parcel, 10, d.h2(this.f8890t).asBinder(), false);
        c.u(parcel, 11, this.f8891u);
        c.u(parcel, 12, this.f8892v);
        c.G(parcel, 13, this.f8893w, false);
        c.E(parcel, 14, this.f8894x, i10, false);
        c.G(parcel, 16, this.f8895y, false);
        c.E(parcel, 17, this.f8896z, i10, false);
        c.t(parcel, 18, d.h2(this.A).asBinder(), false);
        c.G(parcel, 19, this.B, false);
        c.G(parcel, 24, this.C, false);
        c.G(parcel, 25, this.D, false);
        c.t(parcel, 26, d.h2(this.E).asBinder(), false);
        c.t(parcel, 27, d.h2(this.F).asBinder(), false);
        c.t(parcel, 28, d.h2(this.G).asBinder(), false);
        c.g(parcel, 29, this.H);
        c.b(parcel, a10);
    }
}
