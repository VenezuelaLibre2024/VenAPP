package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzgey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.util.v */
/* loaded from: classes.dex */
public final class C5048v {

    /* renamed from: a */
    private final Context f10159a;

    /* renamed from: b */
    private final zzdzd f10160b;

    /* renamed from: c */
    private String f10161c;

    /* renamed from: d */
    private String f10162d;

    /* renamed from: e */
    private String f10163e;

    /* renamed from: f */
    private String f10164f;

    /* renamed from: g */
    private int f10165g;

    /* renamed from: h */
    private int f10166h;

    /* renamed from: i */
    private PointF f10167i;

    /* renamed from: j */
    private PointF f10168j;

    /* renamed from: k */
    private Handler f10169k;

    /* renamed from: l */
    private Runnable f10170l;

    public C5048v(Context context) {
        this.f10165g = 0;
        this.f10170l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.i
            @Override // java.lang.Runnable
            public final void run() {
                C5048v.this.m12738g();
            }
        };
        this.f10159a = context;
        this.f10166h = ViewConfiguration.get(context).getScaledTouchSlop();
        C4965t.m12585v().m12797b();
        this.f10169k = C4965t.m12585v().m12796a();
        this.f10160b = C4965t.m12584u().m12782a();
    }

    public C5048v(Context context, String str) {
        this(context);
        this.f10161c = str;
    }

    /* renamed from: s */
    private final void m12729s(Context context) {
        ArrayList arrayList = new ArrayList();
        int m12731u = m12731u(arrayList, "None", true);
        final int m12731u2 = m12731u(arrayList, "Shake", true);
        final int m12731u3 = m12731u(arrayList, "Flick", true);
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.f10160b.zza().ordinal();
        final int i10 = ordinal != 1 ? ordinal != 2 ? m12731u : m12731u3 : m12731u2;
        C4965t.m12581r();
        AlertDialog.Builder m12671j = C5005j2.m12671j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        m12671j.setTitle("Setup gesture");
        m12671j.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        m12671j.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C5048v.this.m12749r();
            }
        });
        m12671j.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C5048v.this.m12739h(atomicInteger, i10, m12731u2, m12731u3, dialogInterface, i11);
            }
        });
        m12671j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.t
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C5048v.this.m12749r();
            }
        });
        m12671j.create().show();
    }

    /* renamed from: t */
    private final boolean m12730t(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f10167i.x - f10) < ((float) this.f10166h) && Math.abs(this.f10167i.y - f11) < ((float) this.f10166h) && Math.abs(this.f10168j.x - f12) < ((float) this.f10166h) && Math.abs(this.f10168j.y - f13) < ((float) this.f10166h);
    }

    /* renamed from: u */
    private static final int m12731u(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m12732a() {
        m12729s(this.f10159a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m12733b() {
        m12729s(this.f10159a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m12734c(zzgey zzgeyVar) {
        if (C4965t.m12584u().m12791j(this.f10159a, this.f10162d, this.f10163e)) {
            zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.o
                @Override // java.lang.Runnable
                public final void run() {
                    C5048v.this.m12733b();
                }
            });
        } else {
            C4965t.m12584u().m12785d(this.f10159a, this.f10162d, this.f10163e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m12735d(zzgey zzgeyVar) {
        if (C4965t.m12584u().m12791j(this.f10159a, this.f10162d, this.f10163e)) {
            zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.n
                @Override // java.lang.Runnable
                public final void run() {
                    C5048v.this.m12737f();
                }
            });
        } else {
            C4965t.m12584u().m12785d(this.f10159a, this.f10162d, this.f10163e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m12736e() {
        C4965t.m12584u().m12784c(this.f10159a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m12737f() {
        C4965t.m12584u().m12784c(this.f10159a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m12738g() {
        this.f10165g = 4;
        m12749r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m12739h(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        zzdzd zzdzdVar;
        zzdyz zzdyzVar;
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                zzdzdVar = this.f10160b;
                zzdyzVar = zzdyz.SHAKE;
            } else if (atomicInteger.get() == i12) {
                zzdzdVar = this.f10160b;
                zzdyzVar = zzdyz.FLICK;
            } else {
                zzdzdVar = this.f10160b;
                zzdyzVar = zzdyz.NONE;
            }
            zzdzdVar.zzl(zzdyzVar);
        }
        m12749r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void m12740i(String str, DialogInterface dialogInterface, int i10) {
        C4965t.m12581r();
        C5005j2.m12680s(this.f10159a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void m12741j(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                zzcec.zze("Debug mode [Creative Preview] selected.");
                zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5048v.this.m12743l();
                    }
                });
                return;
            }
            if (i15 == i12) {
                zzcec.zze("Debug mode [Troubleshooting] selected.");
                zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5048v.this.m12742k();
                    }
                });
                return;
            }
            if (i15 == i13) {
                zzdzd zzdzdVar = this.f10160b;
                final zzgey zzgeyVar = zzcep.zze;
                zzgey zzgeyVar2 = zzcep.zza;
                if (zzdzdVar.zzp()) {
                    zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5048v.this.m12736e();
                        }
                    });
                    return;
                } else {
                    zzgeyVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5048v.this.m12735d(zzgeyVar);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                zzdzd zzdzdVar2 = this.f10160b;
                final zzgey zzgeyVar3 = zzcep.zze;
                zzgey zzgeyVar4 = zzcep.zza;
                if (zzdzdVar2.zzp()) {
                    zzgeyVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5048v.this.m12732a();
                        }
                    });
                    return;
                } else {
                    zzgeyVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5048v.this.m12734c(zzgeyVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f10159a instanceof Activity)) {
            zzcec.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f10161c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            C4965t.m12581r();
            Map m12676o = C5005j2.m12676o(build);
            for (String str3 : m12676o.keySet()) {
                sb2.append(str3);
                sb2.append(" = ");
                sb2.append((String) m12676o.get(str3));
                sb2.append("\n\n");
            }
            String trim = sb2.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        C4965t.m12581r();
        AlertDialog.Builder m12671j = C5005j2.m12671j(this.f10159a);
        m12671j.setMessage(str2);
        m12671j.setTitle("Ad Information");
        m12671j.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
                C5048v.this.m12740i(str2, dialogInterface2, i16);
            }
        });
        m12671j.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
            }
        });
        m12671j.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void m12742k() {
        C5060z m12584u = C4965t.m12584u();
        String str = this.f10162d;
        String str2 = this.f10163e;
        String str3 = this.f10164f;
        boolean m12794m = m12584u.m12794m();
        Context context = this.f10159a;
        m12584u.m12789h(m12584u.m12791j(context, str, str2));
        if (!m12584u.m12794m()) {
            m12584u.m12785d(context, str, str2);
            return;
        }
        if (!m12794m && !TextUtils.isEmpty(str3)) {
            m12584u.m12786e(context, str2, str3, str);
        }
        zzcec.zze("Device is linked for debug signals.");
        m12584u.m12790i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void m12743l() {
        C5060z m12584u = C4965t.m12584u();
        Context context = this.f10159a;
        String str = this.f10162d;
        String str2 = this.f10163e;
        if (!m12584u.m12792k(context, str, str2)) {
            m12584u.m12790i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(m12584u.f10188f)) {
            zzcec.zze("Creative is not pushed for this device.");
            m12584u.m12790i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(m12584u.f10188f)) {
            zzcec.zze("The app is not linked for creative preview.");
            m12584u.m12785d(context, str, str2);
        } else if ("0".equals(m12584u.f10188f)) {
            zzcec.zze("Device is linked for in app preview.");
            m12584u.m12790i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: m */
    public final void m12744m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f10165g = 0;
            this.f10167i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f10165g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f10165g = 5;
                this.f10168j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f10169k.postDelayed(this.f10170l, ((Long) C4784a0.m12365c().zza(zzbgc.zzeB)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !m12730t(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (m12730t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f10165g = -1;
            this.f10169k.removeCallbacks(this.f10170l);
        }
    }

    /* renamed from: n */
    public final void m12745n(String str) {
        this.f10162d = str;
    }

    /* renamed from: o */
    public final void m12746o(String str) {
        this.f10163e = str;
    }

    /* renamed from: p */
    public final void m12747p(String str) {
        this.f10161c = str;
    }

    /* renamed from: q */
    public final void m12748q(String str) {
        this.f10164f = str;
    }

    /* renamed from: r */
    public final void m12749r() {
        try {
            if (!(this.f10159a instanceof Activity)) {
                zzcec.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(C4965t.m12584u().m12783b())) {
                str = "Creative preview";
            }
            String str2 = true != C4965t.m12584u().m12794m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int m12731u = m12731u(arrayList, "Ad information", true);
            final int m12731u2 = m12731u(arrayList, str, true);
            final int m12731u3 = m12731u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzjc)).booleanValue();
            final int m12731u4 = m12731u(arrayList, "Open ad inspector", booleanValue);
            final int m12731u5 = m12731u(arrayList, "Ad inspector settings", booleanValue);
            C4965t.m12581r();
            AlertDialog.Builder m12671j = C5005j2.m12671j(this.f10159a);
            m12671j.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C5048v.this.m12741j(m12731u, m12731u2, m12731u3, m12731u4, m12731u5, dialogInterface, i10);
                }
            });
            m12671j.create().show();
        } catch (WindowManager.BadTokenException e10) {
            C5047u1.m12727b("", e10);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f10161c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f10164f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f10163e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f10162d);
        sb2.append("}");
        return sb2.toString();
    }
}
