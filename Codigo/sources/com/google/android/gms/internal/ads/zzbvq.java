package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvq extends zzbvw {
    static final Set zza = la.g.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcjk zzk;
    private final Activity zzl;
    private zzcla zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbvx zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbvq(zzcjk zzcjkVar, zzbvx zzbvxVar) {
        super(zzcjkVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcjkVar;
        this.zzl = zzcjkVar.zzi();
        this.zzp = zzbvxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z10) {
        this.zzq.dismiss();
        this.zzr.removeView((View) this.zzk);
        ViewGroup viewGroup = this.zzs;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzn);
            this.zzs.addView((View) this.zzk);
            this.zzk.zzah(this.zzm);
        }
        if (z10) {
            zzl("default");
            zzbvx zzbvxVar = this.zzp;
            if (zzbvxVar != null) {
                zzbvxVar.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    public final void zza(final boolean z10) {
        synchronized (this.zzj) {
            if (this.zzq != null) {
                if (!((Boolean) a0.c().zza(zzbgc.zzkp)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzc(z10);
                } else {
                    zzcep.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbvq.this.zzc(z10);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00ef, B:47:0x00f3, B:49:0x00fb, B:52:0x0103, B:56:0x0129, B:63:0x0252, B:66:0x0258, B:67:0x025d, B:69:0x025f, B:71:0x027f, B:73:0x0283, B:75:0x0290, B:76:0x02cc, B:91:0x0385, B:92:0x0388, B:93:0x03a9, B:95:0x03c1, B:96:0x03e2, B:98:0x03ea, B:99:0x03f1, B:100:0x0418, B:104:0x041b, B:106:0x0440, B:107:0x0455, B:109:0x038c, B:110:0x0390, B:111:0x0394, B:112:0x0397, B:113:0x039b, B:114:0x03a1, B:115:0x03a5, B:132:0x02c9, B:133:0x0457, B:134:0x045c, B:136:0x0139, B:138:0x013d, B:149:0x0190, B:150:0x01e0, B:151:0x01eb, B:153:0x01ee, B:155:0x01f1, B:157:0x01f5, B:160:0x01fb, B:161:0x019b, B:162:0x01b1, B:163:0x01bc, B:164:0x01a6, B:165:0x01b4, B:166:0x01c1, B:167:0x01d5, B:168:0x01e3, B:185:0x020c, B:188:0x0236, B:191:0x0246, B:192:0x023c, B:194:0x0244, B:195:0x022e, B:197:0x0234, B:200:0x045e, B:201:0x0463, B:203:0x0465, B:204:0x046a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025f A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00ef, B:47:0x00f3, B:49:0x00fb, B:52:0x0103, B:56:0x0129, B:63:0x0252, B:66:0x0258, B:67:0x025d, B:69:0x025f, B:71:0x027f, B:73:0x0283, B:75:0x0290, B:76:0x02cc, B:91:0x0385, B:92:0x0388, B:93:0x03a9, B:95:0x03c1, B:96:0x03e2, B:98:0x03ea, B:99:0x03f1, B:100:0x0418, B:104:0x041b, B:106:0x0440, B:107:0x0455, B:109:0x038c, B:110:0x0390, B:111:0x0394, B:112:0x0397, B:113:0x039b, B:114:0x03a1, B:115:0x03a5, B:132:0x02c9, B:133:0x0457, B:134:0x045c, B:136:0x0139, B:138:0x013d, B:149:0x0190, B:150:0x01e0, B:151:0x01eb, B:153:0x01ee, B:155:0x01f1, B:157:0x01f5, B:160:0x01fb, B:161:0x019b, B:162:0x01b1, B:163:0x01bc, B:164:0x01a6, B:165:0x01b4, B:166:0x01c1, B:167:0x01d5, B:168:0x01e3, B:185:0x020c, B:188:0x0236, B:191:0x0246, B:192:0x023c, B:194:0x0244, B:195:0x022e, B:197:0x0234, B:200:0x045e, B:201:0x0463, B:203:0x0465, B:204:0x046a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ea A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00ef, B:47:0x00f3, B:49:0x00fb, B:52:0x0103, B:56:0x0129, B:63:0x0252, B:66:0x0258, B:67:0x025d, B:69:0x025f, B:71:0x027f, B:73:0x0283, B:75:0x0290, B:76:0x02cc, B:91:0x0385, B:92:0x0388, B:93:0x03a9, B:95:0x03c1, B:96:0x03e2, B:98:0x03ea, B:99:0x03f1, B:100:0x0418, B:104:0x041b, B:106:0x0440, B:107:0x0455, B:109:0x038c, B:110:0x0390, B:111:0x0394, B:112:0x0397, B:113:0x039b, B:114:0x03a1, B:115:0x03a5, B:132:0x02c9, B:133:0x0457, B:134:0x045c, B:136:0x0139, B:138:0x013d, B:149:0x0190, B:150:0x01e0, B:151:0x01eb, B:153:0x01ee, B:155:0x01f1, B:157:0x01f5, B:160:0x01fb, B:161:0x019b, B:162:0x01b1, B:163:0x01bc, B:164:0x01a6, B:165:0x01b4, B:166:0x01c1, B:167:0x01d5, B:168:0x01e3, B:185:0x020c, B:188:0x0236, B:191:0x0246, B:192:0x023c, B:194:0x0244, B:195:0x022e, B:197:0x0234, B:200:0x045e, B:201:0x0463, B:203:0x0465, B:204:0x046a), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvq.zzb(java.util.Map):void");
    }

    public final void zzd(int i10, int i11, boolean z10) {
        synchronized (this.zzj) {
            this.zzd = i10;
            this.zze = i11;
        }
    }

    public final void zze(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (this.zzj) {
            z10 = this.zzq != null;
        }
        return z10;
    }
}
