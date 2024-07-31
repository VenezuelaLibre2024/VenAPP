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

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9060a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdzd f9061b;

    /* renamed from: c, reason: collision with root package name */
    private String f9062c;

    /* renamed from: d, reason: collision with root package name */
    private String f9063d;

    /* renamed from: e, reason: collision with root package name */
    private String f9064e;

    /* renamed from: f, reason: collision with root package name */
    private String f9065f;

    /* renamed from: g, reason: collision with root package name */
    private int f9066g;

    /* renamed from: h, reason: collision with root package name */
    private int f9067h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f9068i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f9069j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f9070k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f9071l;

    public v(Context context) {
        this.f9066g = 0;
        this.f9071l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.i
            @Override // java.lang.Runnable
            public final void run() {
                v.this.g();
            }
        };
        this.f9060a = context;
        this.f9067h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.t.v().b();
        this.f9070k = com.google.android.gms.ads.internal.t.v().a();
        this.f9061b = com.google.android.gms.ads.internal.t.u().a();
    }

    public v(Context context, String str) {
        this(context);
        this.f9062c = str;
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u10 = u(arrayList, "None", true);
        final int u11 = u(arrayList, "Shake", true);
        final int u12 = u(arrayList, "Flick", true);
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.f9061b.zza().ordinal();
        final int i10 = ordinal != 1 ? ordinal != 2 ? u10 : u12 : u11;
        com.google.android.gms.ads.internal.t.r();
        AlertDialog.Builder j10 = j2.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        j10.setTitle("Setup gesture");
        j10.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        j10.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                v.this.r();
            }
        });
        j10.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                v.this.h(atomicInteger, i10, u11, u12, dialogInterface, i11);
            }
        });
        j10.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.t
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                v.this.r();
            }
        });
        j10.create().show();
    }

    private final boolean t(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f9068i.x - f10) < ((float) this.f9067h) && Math.abs(this.f9068i.y - f11) < ((float) this.f9067h) && Math.abs(this.f9069j.x - f12) < ((float) this.f9067h) && Math.abs(this.f9069j.y - f13) < ((float) this.f9067h);
    }

    private static final int u(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        s(this.f9060a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        s(this.f9060a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzgey zzgeyVar) {
        if (com.google.android.gms.ads.internal.t.u().j(this.f9060a, this.f9063d, this.f9064e)) {
            zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.o
                @Override // java.lang.Runnable
                public final void run() {
                    v.this.b();
                }
            });
        } else {
            com.google.android.gms.ads.internal.t.u().d(this.f9060a, this.f9063d, this.f9064e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzgey zzgeyVar) {
        if (com.google.android.gms.ads.internal.t.u().j(this.f9060a, this.f9063d, this.f9064e)) {
            zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.n
                @Override // java.lang.Runnable
                public final void run() {
                    v.this.f();
                }
            });
        } else {
            com.google.android.gms.ads.internal.t.u().d(this.f9060a, this.f9063d, this.f9064e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        com.google.android.gms.ads.internal.t.u().c(this.f9060a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        com.google.android.gms.ads.internal.t.u().c(this.f9060a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.f9066g = 4;
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        zzdzd zzdzdVar;
        zzdyz zzdyzVar;
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                zzdzdVar = this.f9061b;
                zzdyzVar = zzdyz.SHAKE;
            } else if (atomicInteger.get() == i12) {
                zzdzdVar = this.f9061b;
                zzdyzVar = zzdyz.FLICK;
            } else {
                zzdzdVar = this.f9061b;
                zzdyzVar = zzdyz.NONE;
            }
            zzdzdVar.zzl(zzdyzVar);
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.t.r();
        j2.s(this.f9060a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void j(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                zzcec.zze("Debug mode [Creative Preview] selected.");
                zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.l();
                    }
                });
                return;
            }
            if (i15 == i12) {
                zzcec.zze("Debug mode [Troubleshooting] selected.");
                zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.k();
                    }
                });
                return;
            }
            if (i15 == i13) {
                zzdzd zzdzdVar = this.f9061b;
                final zzgey zzgeyVar = zzcep.zze;
                zzgey zzgeyVar2 = zzcep.zza;
                if (zzdzdVar.zzp()) {
                    zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.e();
                        }
                    });
                    return;
                } else {
                    zzgeyVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.d(zzgeyVar);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                zzdzd zzdzdVar2 = this.f9061b;
                final zzgey zzgeyVar3 = zzcep.zze;
                zzgey zzgeyVar4 = zzcep.zza;
                if (zzdzdVar2.zzp()) {
                    zzgeyVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.a();
                        }
                    });
                    return;
                } else {
                    zzgeyVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.c(zzgeyVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f9060a instanceof Activity)) {
            zzcec.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f9062c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            com.google.android.gms.ads.internal.t.r();
            Map o10 = j2.o(build);
            for (String str3 : o10.keySet()) {
                sb2.append(str3);
                sb2.append(" = ");
                sb2.append((String) o10.get(str3));
                sb2.append("\n\n");
            }
            String trim = sb2.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        com.google.android.gms.ads.internal.t.r();
        AlertDialog.Builder j10 = j2.j(this.f9060a);
        j10.setMessage(str2);
        j10.setTitle("Ad Information");
        j10.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
                v.this.i(str2, dialogInterface2, i16);
            }
        });
        j10.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
            }
        });
        j10.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        z u10 = com.google.android.gms.ads.internal.t.u();
        String str = this.f9063d;
        String str2 = this.f9064e;
        String str3 = this.f9065f;
        boolean m10 = u10.m();
        Context context = this.f9060a;
        u10.h(u10.j(context, str, str2));
        if (!u10.m()) {
            u10.d(context, str, str2);
            return;
        }
        if (!m10 && !TextUtils.isEmpty(str3)) {
            u10.e(context, str2, str3, str);
        }
        zzcec.zze("Device is linked for debug signals.");
        u10.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        z u10 = com.google.android.gms.ads.internal.t.u();
        Context context = this.f9060a;
        String str = this.f9063d;
        String str2 = this.f9064e;
        if (!u10.k(context, str, str2)) {
            u10.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(u10.f9089f)) {
            zzcec.zze("Creative is not pushed for this device.");
            u10.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(u10.f9089f)) {
            zzcec.zze("The app is not linked for creative preview.");
            u10.d(context, str, str2);
        } else if ("0".equals(u10.f9089f)) {
            zzcec.zze("Device is linked for in app preview.");
            u10.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f9066g = 0;
            this.f9068i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f9066g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f9066g = 5;
                this.f9069j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f9070k.postDelayed(this.f9071l, ((Long) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeB)).longValue());
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
                    z10 |= !t(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f9066g = -1;
            this.f9070k.removeCallbacks(this.f9071l);
        }
    }

    public final void n(String str) {
        this.f9063d = str;
    }

    public final void o(String str) {
        this.f9064e = str;
    }

    public final void p(String str) {
        this.f9062c = str;
    }

    public final void q(String str) {
        this.f9065f = str;
    }

    public final void r() {
        try {
            if (!(this.f9060a instanceof Activity)) {
                zzcec.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.t.u().b())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.t.u().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int u10 = u(arrayList, "Ad information", true);
            final int u11 = u(arrayList, str, true);
            final int u12 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjc)).booleanValue();
            final int u13 = u(arrayList, "Open ad inspector", booleanValue);
            final int u14 = u(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.t.r();
            AlertDialog.Builder j10 = j2.j(this.f9060a);
            j10.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    v.this.j(u10, u11, u12, u13, u14, dialogInterface, i10);
                }
            });
            j10.create().show();
        } catch (WindowManager.BadTokenException e10) {
            u1.b("", e10);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f9062c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f9065f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f9064e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f9063d);
        sb2.append("}");
        return sb2.toString();
    }
}
