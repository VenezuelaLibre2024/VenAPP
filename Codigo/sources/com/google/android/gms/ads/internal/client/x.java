package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Random;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: f */
    private static final x f8787f = new x();

    /* renamed from: a */
    private final zzcdv f8788a;

    /* renamed from: b */
    private final v f8789b;

    /* renamed from: c */
    private final String f8790c;

    /* renamed from: d */
    private final zzcei f8791d;

    /* renamed from: e */
    private final Random f8792e;

    protected x() {
        zzcdv zzcdvVar = new zzcdv();
        v vVar = new v(new t4(), new r4(), new t3(), new zzbll(), new zzcaz(), new zzbwq(), new zzblm());
        String zzd = zzcdv.zzd();
        zzcei zzceiVar = new zzcei(0, 240304000, true, false, false);
        Random random = new Random();
        this.f8788a = zzcdvVar;
        this.f8789b = vVar;
        this.f8790c = zzd;
        this.f8791d = zzceiVar;
        this.f8792e = random;
    }

    public static v a() {
        return f8787f.f8789b;
    }

    public static zzcdv b() {
        return f8787f.f8788a;
    }

    public static zzcei c() {
        return f8787f.f8791d;
    }

    public static String d() {
        return f8787f.f8790c;
    }

    public static Random e() {
        return f8787f.f8792e;
    }
}
