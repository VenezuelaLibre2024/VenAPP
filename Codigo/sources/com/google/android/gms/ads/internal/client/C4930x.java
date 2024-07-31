package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Random;

/* renamed from: com.google.android.gms.ads.internal.client.x */
/* loaded from: classes.dex */
public final class C4930x {

    /* renamed from: f */
    private static final C4930x f9874f = new C4930x();

    /* renamed from: a */
    private final zzcdv f9875a;

    /* renamed from: b */
    private final C4918v f9876b;

    /* renamed from: c */
    private final String f9877c;

    /* renamed from: d */
    private final zzcei f9878d;

    /* renamed from: e */
    private final Random f9879e;

    protected C4930x() {
        zzcdv zzcdvVar = new zzcdv();
        C4918v c4918v = new C4918v(new C4911t4(), new C4899r4(), new C4910t3(), new zzbll(), new zzcaz(), new zzbwq(), new zzblm());
        String zzd = zzcdv.zzd();
        zzcei zzceiVar = new zzcei(0, 240304000, true, false, false);
        Random random = new Random();
        this.f9875a = zzcdvVar;
        this.f9876b = c4918v;
        this.f9877c = zzd;
        this.f9878d = zzceiVar;
        this.f9879e = random;
    }

    /* renamed from: a */
    public static C4918v m12473a() {
        return f9874f.f9876b;
    }

    /* renamed from: b */
    public static zzcdv m12474b() {
        return f9874f.f9875a;
    }

    /* renamed from: c */
    public static zzcei m12475c() {
        return f9874f.f9878d;
    }

    /* renamed from: d */
    public static String m12476d() {
        return f9874f.f9877c;
    }

    /* renamed from: e */
    public static Random m12477e() {
        return f9874f.f9879e;
    }
}
