package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.measurement.internal.y6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class va implements w6 {
    private static volatile va H;
    private long A;
    private final Map<String, y6> B;
    private final Map<String, v> C;
    private final Map<String, b> D;
    private p8 E;
    private String F;
    private final kb G;

    /* renamed from: a */
    private i5 f10716a;

    /* renamed from: b */
    private u4 f10717b;

    /* renamed from: c */
    private m f10718c;

    /* renamed from: d */
    private w4 f10719d;

    /* renamed from: e */
    private pa f10720e;

    /* renamed from: f */
    private pb f10721f;

    /* renamed from: g */
    private final db f10722g;

    /* renamed from: h */
    private n8 f10723h;

    /* renamed from: i */
    private y9 f10724i;

    /* renamed from: j */
    private final ta f10725j;

    /* renamed from: k */
    private g5 f10726k;

    /* renamed from: l */
    private final w5 f10727l;

    /* renamed from: m */
    private boolean f10728m;

    /* renamed from: n */
    private boolean f10729n;

    /* renamed from: o */
    private long f10730o;

    /* renamed from: p */
    private List<Runnable> f10731p;

    /* renamed from: q */
    private final Set<String> f10732q;

    /* renamed from: r */
    private int f10733r;

    /* renamed from: s */
    private int f10734s;

    /* renamed from: t */
    private boolean f10735t;

    /* renamed from: u */
    private boolean f10736u;

    /* renamed from: v */
    private boolean f10737v;

    /* renamed from: w */
    private FileLock f10738w;

    /* renamed from: x */
    private FileChannel f10739x;

    /* renamed from: y */
    private List<Long> f10740y;

    /* renamed from: z */
    private List<Long> f10741z;

    /* loaded from: classes2.dex */
    public class a implements q {

        /* renamed from: a */
        zzfi.zzj f10742a;

        /* renamed from: b */
        List<Long> f10743b;

        /* renamed from: c */
        List<zzfi.zze> f10744c;

        /* renamed from: d */
        private long f10745d;

        private a() {
        }

        /* synthetic */ a(va vaVar, wa.f0 f0Var) {
            this();
        }

        private static long c(zzfi.zze zzeVar) {
            return ((zzeVar.zzd() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.q
        public final void a(zzfi.zzj zzjVar) {
            com.google.android.gms.common.internal.s.j(zzjVar);
            this.f10742a = zzjVar;
        }

        @Override // com.google.android.gms.measurement.internal.q
        public final boolean b(long j10, zzfi.zze zzeVar) {
            com.google.android.gms.common.internal.s.j(zzeVar);
            if (this.f10744c == null) {
                this.f10744c = new ArrayList();
            }
            if (this.f10743b == null) {
                this.f10743b = new ArrayList();
            }
            if (!this.f10744c.isEmpty() && c(this.f10744c.get(0)) != c(zzeVar)) {
                return false;
            }
            long zzbw = this.f10745d + zzeVar.zzbw();
            va.this.X();
            if (zzbw >= Math.max(0, e0.f10109k.a(null).intValue())) {
                return false;
            }
            this.f10745d = zzbw;
            this.f10744c.add(zzeVar);
            this.f10743b.add(Long.valueOf(j10));
            int size = this.f10744c.size();
            va.this.X();
            return size < Math.max(1, e0.f10111l.a(null).intValue());
        }
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a */
        final String f10747a;

        /* renamed from: b */
        long f10748b;

        private b(va vaVar) {
            this(vaVar, vaVar.i0().N0());
        }

        private b(va vaVar, String str) {
            this.f10747a = str;
            this.f10748b = vaVar.zzb().b();
        }

        /* synthetic */ b(va vaVar, String str, wa.g0 g0Var) {
            this(vaVar, str);
        }

        /* synthetic */ b(va vaVar, wa.g0 g0Var) {
            this(vaVar);
        }
    }

    private va(fb fbVar) {
        this(fbVar, null);
    }

    private va(fb fbVar, w5 w5Var) {
        this.f10728m = false;
        this.f10732q = new HashSet();
        this.G = new cb(this);
        com.google.android.gms.common.internal.s.j(fbVar);
        this.f10727l = w5.a(fbVar.f10189a, null, null);
        this.A = -1L;
        this.f10725j = new ta(this);
        db dbVar = new db(this);
        dbVar.q();
        this.f10722g = dbVar;
        u4 u4Var = new u4(this);
        u4Var.q();
        this.f10717b = u4Var;
        i5 i5Var = new i5(this);
        i5Var.q();
        this.f10716a = i5Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        zzl().y(new ya(this, fbVar));
    }

    private final void A(String str, boolean z10) {
        r5 y02 = Z().y0(str);
        if (y02 != null) {
            y02.G(z10);
            if (y02.s()) {
                Z().Q(y02);
            }
        }
    }

    private final void B(List<Long> list) {
        com.google.android.gms.common.internal.s.a(!list.isEmpty());
        if (this.f10740y != null) {
            zzj().B().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f10740y = new ArrayList(list);
        }
    }

    private final boolean E(int i10, FileChannel fileChannel) {
        zzl().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().B().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzj().B().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e10) {
            zzj().B().b("Failed to write to channel", e10);
            return false;
        }
    }

    private final boolean F(zzfi.zze.zza zzaVar, zzfi.zze.zza zzaVar2) {
        com.google.android.gms.common.internal.s.a("_e".equals(zzaVar.zze()));
        h0();
        zzfi.zzg z10 = db.z((zzfi.zze) ((zzix) zzaVar.zzab()), "_sc");
        String zzh = z10 == null ? null : z10.zzh();
        h0();
        zzfi.zzg z11 = db.z((zzfi.zze) ((zzix) zzaVar2.zzab()), "_pc");
        String zzh2 = z11 != null ? z11.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        com.google.android.gms.common.internal.s.a("_e".equals(zzaVar.zze()));
        h0();
        zzfi.zzg z12 = db.z((zzfi.zze) ((zzix) zzaVar.zzab()), "_et");
        if (z12 == null || !z12.zzl() || z12.zzd() <= 0) {
            return true;
        }
        long zzd = z12.zzd();
        h0();
        zzfi.zzg z13 = db.z((zzfi.zze) ((zzix) zzaVar2.zzab()), "_et");
        if (z13 != null && z13.zzd() > 0) {
            zzd += z13.zzd();
        }
        h0();
        db.M(zzaVar2, "_et", Long.valueOf(zzd));
        h0();
        db.M(zzaVar, "_fr", 1L);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:528:0x021c, code lost:
    
        if (r4 == null) goto L649;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0587 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0652 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06a4 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0224 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0230 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0e95 A[Catch: all -> 0x0ead, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0ea9 A[Catch: all -> 0x0ead, TRY_ENTER, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[Catch: all -> 0x0ead, SYNTHETIC, TRY_LEAVE, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:19:0x0074, B:20:0x0220, B:22:0x0224, B:27:0x0230, B:28:0x0243, B:31:0x0259, B:34:0x027f, B:36:0x02b4, B:41:0x02ca, B:43:0x02d4, B:46:0x0714, B:48:0x02fe, B:50:0x030c, B:53:0x0328, B:55:0x032e, B:57:0x0340, B:59:0x034e, B:61:0x035e, B:63:0x036b, B:68:0x0370, B:70:0x0386, B:79:0x03bf, B:82:0x03c9, B:84:0x03d7, B:86:0x0422, B:87:0x03f6, B:89:0x0406, B:96:0x042f, B:98:0x045d, B:99:0x0489, B:101:0x04bb, B:102:0x04c1, B:105:0x04cd, B:107:0x0500, B:108:0x051b, B:110:0x0521, B:112:0x052f, B:114:0x0543, B:115:0x0538, B:123:0x054a, B:125:0x0550, B:126:0x056e, B:128:0x0587, B:129:0x0593, B:132:0x059d, B:136:0x05c0, B:137:0x05af, B:145:0x05c6, B:147:0x05d2, B:149:0x05de, B:154:0x062b, B:155:0x0646, B:157:0x0652, B:160:0x0665, B:162:0x0677, B:164:0x0685, B:166:0x06fc, B:171:0x06a4, B:173:0x06b4, B:176:0x06c9, B:178:0x06db, B:180:0x06e9, B:182:0x05fd, B:186:0x0611, B:188:0x0617, B:190:0x0622, B:200:0x039c, B:207:0x072a, B:209:0x0738, B:211:0x0741, B:213:0x0779, B:214:0x0749, B:216:0x0752, B:218:0x0758, B:220:0x0764, B:222:0x076c, B:228:0x077e, B:229:0x078c, B:231:0x0792, B:237:0x07ab, B:238:0x07b6, B:242:0x07c3, B:243:0x07e8, B:245:0x07f5, B:247:0x0801, B:249:0x0817, B:251:0x0821, B:252:0x0833, B:253:0x0836, B:254:0x0845, B:256:0x084b, B:258:0x085b, B:259:0x0862, B:261:0x086e, B:263:0x0875, B:266:0x0878, B:268:0x0881, B:270:0x0893, B:272:0x08a2, B:274:0x08b2, B:277:0x08bb, B:279:0x08c3, B:280:0x08d9, B:282:0x08df, B:287:0x08f4, B:289:0x090c, B:291:0x091e, B:292:0x0941, B:294:0x096e, B:296:0x099b, B:298:0x09a6, B:304:0x09aa, B:306:0x09e5, B:307:0x09f8, B:309:0x09fe, B:312:0x0a16, B:314:0x0a31, B:316:0x0a47, B:318:0x0a4c, B:320:0x0a50, B:322:0x0a54, B:324:0x0a5e, B:325:0x0a66, B:327:0x0a6a, B:329:0x0a70, B:330:0x0a7e, B:331:0x0a89, B:333:0x0ccc, B:334:0x0a96, B:338:0x0ac8, B:339:0x0ad0, B:341:0x0ad6, B:345:0x0ae8, B:347:0x0af6, B:349:0x0afa, B:351:0x0b04, B:353:0x0b08, B:357:0x0b1e, B:359:0x0b34, B:360:0x0b56, B:362:0x0b62, B:364:0x0b78, B:365:0x0bb7, B:368:0x0bcf, B:370:0x0bd6, B:372:0x0be7, B:374:0x0beb, B:376:0x0bef, B:378:0x0bf3, B:379:0x0c01, B:381:0x0c07, B:383:0x0c26, B:384:0x0c2f, B:385:0x0cc9, B:387:0x0c46, B:389:0x0c4d, B:392:0x0c6b, B:394:0x0c95, B:395:0x0ca0, B:397:0x0cb2, B:399:0x0cbc, B:400:0x0c56, B:407:0x0cd8, B:409:0x0ce5, B:410:0x0cec, B:411:0x0cf4, B:413:0x0cfa, B:416:0x0d12, B:418:0x0d22, B:419:0x0d95, B:421:0x0d9b, B:423:0x0dab, B:426:0x0db2, B:427:0x0de3, B:428:0x0dba, B:430:0x0dc6, B:431:0x0dcc, B:432:0x0df4, B:433:0x0e0b, B:436:0x0e13, B:438:0x0e18, B:441:0x0e28, B:443:0x0e42, B:444:0x0e5b, B:446:0x0e63, B:447:0x0e85, B:454:0x0e74, B:455:0x0d3a, B:457:0x0d40, B:459:0x0d4a, B:460:0x0d51, B:465:0x0d61, B:466:0x0d68, B:468:0x0d87, B:469:0x0d8e, B:470:0x0d8b, B:471:0x0d65, B:473:0x0d4e, B:475:0x07c8, B:477:0x07ce, B:482:0x0e95, B:553:0x0ea9, B:554:0x0eac), top: B:2:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean G(java.lang.String r41, long r42) {
        /*
            Method dump skipped, instructions count: 3767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.G(java.lang.String, long):boolean");
    }

    private final void H() {
        zzl().i();
        if (this.f10735t || this.f10736u || this.f10737v) {
            zzj().F().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f10735t), Boolean.valueOf(this.f10736u), Boolean.valueOf(this.f10737v));
            return;
        }
        zzj().F().a("Stopping uploading service(s)");
        List<Runnable> list = this.f10731p;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        ((List) com.google.android.gms.common.internal.s.j(this.f10731p)).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.I():void");
    }

    private final boolean J() {
        zzl().i();
        k0();
        return Z().P0() || !TextUtils.isEmpty(Z().x());
    }

    private final boolean K() {
        p4 G;
        String str;
        zzl().i();
        FileLock fileLock = this.f10738w;
        if (fileLock != null && fileLock.isValid()) {
            zzj().F().a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f10727l.zza().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f10739x = channel;
            FileLock tryLock = channel.tryLock();
            this.f10738w = tryLock;
            if (tryLock != null) {
                zzj().F().a("Storage concurrent access okay");
                return true;
            }
            zzj().B().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            e = e10;
            G = zzj().B();
            str = "Failed to acquire storage lock";
            G.b(str, e);
            return false;
        } catch (IOException e11) {
            e = e11;
            G = zzj().B();
            str = "Failed to access storage lock file";
            G.b(str, e);
            return false;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            G = zzj().G();
            str = "Storage lock already acquired";
            G.b(str, e);
            return false;
        }
    }

    private final void P(d0 d0Var, lb lbVar) {
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        r4 b10 = r4.b(d0Var);
        i0().H(b10.f10572d, Z().v0(lbVar.f10366a));
        i0().Q(b10, X().t(lbVar.f10366a));
        d0 a10 = b10.a();
        if ("_cmp".equals(a10.f10054a) && "referrer API v2".equals(a10.f10055b.z1("_cis"))) {
            String z12 = a10.f10055b.z1("gclid");
            if (!TextUtils.isEmpty(z12)) {
                s(new hb("_lgclid", a10.f10057d, z12, "auto"), lbVar);
            }
        }
        if (zzoi.zza() && zzoi.zzc() && "_cmp".equals(a10.f10054a) && "referrer API v2".equals(a10.f10055b.z1("_cis"))) {
            String z13 = a10.f10055b.z1("gbraid");
            if (!TextUtils.isEmpty(z13)) {
                s(new hb("_gbraid", a10.f10057d, z13, "auto"), lbVar);
            }
        }
        o(a10, lbVar);
    }

    private final void Q(r5 r5Var) {
        zzl().i();
        if (TextUtils.isEmpty(r5Var.j()) && TextUtils.isEmpty(r5Var.r0())) {
            u((String) com.google.android.gms.common.internal.s.j(r5Var.t0()), 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String j10 = r5Var.j();
        if (TextUtils.isEmpty(j10)) {
            j10 = r5Var.r0();
        }
        androidx.collection.a aVar = null;
        builder.scheme(e0.f10101g.a(null)).encodedAuthority(e0.f10103h.a(null)).path("config/app/" + j10).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) com.google.android.gms.common.internal.s.j(r5Var.t0());
            URL url = new URL(uri);
            zzj().F().b("Fetching remote configuration", str);
            zzfc.zzd G = c0().G(str);
            String K = c0().K(str);
            if (G != null) {
                if (!TextUtils.isEmpty(K)) {
                    aVar = new androidx.collection.a();
                    aVar.put("If-Modified-Since", K);
                }
                String I = c0().I(str);
                if (!TextUtils.isEmpty(I)) {
                    if (aVar == null) {
                        aVar = new androidx.collection.a();
                    }
                    aVar.put("If-None-Match", I);
                }
            }
            this.f10735t = true;
            u4 b02 = b0();
            ab abVar = new ab(this);
            b02.i();
            b02.p();
            com.google.android.gms.common.internal.s.j(url);
            com.google.android.gms.common.internal.s.j(abVar);
            b02.zzl().u(new x4(b02, str, url, null, aVar, abVar));
        } catch (MalformedURLException unused) {
            zzj().B().c("Failed to parse config URL. Not fetching. appId", n4.q(r5Var.t0()), uri);
        }
    }

    private final lb R(String str) {
        String str2;
        p4 p4Var;
        Object obj;
        String str3;
        int i10;
        String str4 = str;
        r5 y02 = Z().y0(str4);
        if (y02 == null || TextUtils.isEmpty(y02.h())) {
            str2 = "No app data available; dropping";
            obj = str4;
            p4Var = zzj().A();
        } else {
            Boolean h10 = h(y02);
            if (h10 == null || h10.booleanValue()) {
                y6 L = L(str);
                if (zznp.zza() && X().n(e0.T0)) {
                    str3 = V(str).i();
                    i10 = L.b();
                } else {
                    str3 = "";
                    i10 = 100;
                }
                int i11 = i10;
                return new lb(str, y02.j(), y02.h(), y02.z(), y02.v0(), y02.g0(), y02.a0(), (String) null, y02.r(), false, y02.i(), y02.v(), 0L, 0, y02.q(), false, y02.r0(), y02.q0(), y02.c0(), y02.n(), (String) null, L.v(), "", (String) null, y02.t(), y02.p0(), i11, str3, y02.a(), y02.D());
            }
            p4 B = zzj().B();
            str2 = "App version does not match; dropping. appId";
            obj = n4.q(str);
            p4Var = B;
        }
        p4Var.b(str2, obj);
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:93|(2:95|(1:97)(6:98|99|100|(1:102)|103|(0)))|329|330|331|332|99|100|(0)|103|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:(2:117|(5:119|(1:121)|122|123|124))|(2:126|(5:128|(1:130)|131|132|133))|134|135|(1:137)|138|(1:144)|145|(1:147)|148|(2:150|(1:156)(3:153|154|155))(1:328)|157|(1:159)|160|(1:162)|163|(1:165)|166|(1:174)|175|(1:177)|178|(1:180)|181|(1:185)|186|(2:190|(33:192|(1:196)|197|(1:199)(1:326)|200|(15:202|(1:204)(1:230)|205|(1:207)(1:229)|208|(1:210)(1:228)|211|(1:213)(1:227)|214|(1:216)(1:226)|217|(1:219)(1:225)|220|(1:222)(1:224)|223)|231|(1:233)|234|(1:236)|237|(4:247|(1:249)|250|(21:262|263|(2:265|(1:267))|268|(3:270|(1:272)|273)|274|(1:278)|279|(1:281)|282|(4:285|(2:291|292)|293|283)|297|298|299|(2:301|(2:302|(2:304|(2:306|307)(1:314))(3:315|316|(1:320))))|321|308|(1:310)|311|312|313))|325|263|(0)|268|(0)|274|(2:276|278)|279|(0)|282|(1:283)|297|298|299|(0)|321|308|(0)|311|312|313))|327|231|(0)|234|(0)|237|(8:239|241|243|245|247|(0)|250|(26:252|254|256|258|260|262|263|(0)|268|(0)|274|(0)|279|(0)|282|(1:283)|297|298|299|(0)|321|308|(0)|311|312|313))|325|263|(0)|268|(0)|274|(0)|279|(0)|282|(1:283)|297|298|299|(0)|321|308|(0)|311|312|313) */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x09c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x09ca, code lost:
    
        zzj().B().c("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.n4.q(r2.zzr()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x02d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x02d8, code lost:
    
        r9.zzj().B().c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.n4.q(r8), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030c A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0342 A[Catch: all -> 0x0a11, TRY_LEAVE, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ac A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x073d A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x074f A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0795 A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x083a A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0853 A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08b9 A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08da A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08f8 A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x096e A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09c6 A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce A[Catch: all -> 0x0a11, TRY_LEAVE, TryCatch #1 {all -> 0x0a11, blocks: (B:61:0x0197, B:64:0x01a6, B:66:0x01b0, B:70:0x01bc, B:76:0x01ce, B:79:0x01da, B:81:0x01f1, B:86:0x020a, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:95:0x026b, B:98:0x0272, B:100:0x0302, B:102:0x030c, B:105:0x0342, B:108:0x0356, B:110:0x03ac, B:112:0x03b2, B:113:0x03c9, B:117:0x03da, B:119:0x03f2, B:121:0x03f8, B:122:0x040f, B:126:0x0431, B:130:0x0457, B:131:0x046e, B:134:0x047d, B:137:0x049c, B:138:0x04b6, B:140:0x04c0, B:142:0x04cc, B:144:0x04d2, B:145:0x04db, B:147:0x04e9, B:148:0x04fe, B:150:0x0524, B:153:0x053b, B:156:0x057a, B:157:0x05a4, B:159:0x05e2, B:160:0x05e7, B:162:0x05ef, B:163:0x05f4, B:165:0x05fc, B:166:0x0601, B:168:0x0607, B:170:0x060f, B:172:0x061b, B:174:0x0629, B:175:0x062e, B:177:0x0637, B:178:0x063b, B:180:0x0648, B:181:0x064d, B:183:0x0674, B:185:0x067c, B:186:0x0681, B:188:0x0687, B:190:0x0695, B:192:0x06a0, B:196:0x06b5, B:200:0x06c4, B:202:0x06cb, B:205:0x06da, B:208:0x06e7, B:211:0x06f4, B:214:0x0701, B:217:0x070e, B:220:0x0719, B:223:0x0726, B:231:0x0737, B:233:0x073d, B:234:0x0740, B:236:0x074f, B:237:0x0752, B:239:0x076e, B:241:0x0772, B:243:0x077c, B:245:0x0786, B:247:0x078a, B:249:0x0795, B:250:0x079e, B:252:0x07a4, B:254:0x07b0, B:256:0x07b8, B:258:0x07c4, B:260:0x07d0, B:262:0x07d6, B:263:0x07f3, B:265:0x083a, B:267:0x0844, B:268:0x0847, B:270:0x0853, B:272:0x0873, B:273:0x0880, B:274:0x08b3, B:276:0x08b9, B:278:0x08c3, B:279:0x08d0, B:281:0x08da, B:282:0x08e7, B:283:0x08f2, B:285:0x08f8, B:287:0x0936, B:289:0x093e, B:291:0x0950, B:298:0x0956, B:299:0x0966, B:301:0x096e, B:302:0x0972, B:304:0x0978, B:308:0x09c0, B:310:0x09c6, B:311:0x09e0, B:316:0x0985, B:318:0x09ad, B:324:0x09ca, B:328:0x0596, B:329:0x029d, B:331:0x02bb, B:332:0x02e9, B:336:0x02d8, B:338:0x0218, B:339:0x0235), top: B:60:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [int] */
    /* JADX WARN: Type inference failed for: r8v89 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void T(com.google.android.gms.measurement.internal.d0 r29, com.google.android.gms.measurement.internal.lb r30) {
        /*
            Method dump skipped, instructions count: 2587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.T(com.google.android.gms.measurement.internal.d0, com.google.android.gms.measurement.internal.lb):void");
    }

    private final v V(String str) {
        zzl().i();
        k0();
        if (!zznp.zza()) {
            return v.f10684f;
        }
        v vVar = this.C.get(str);
        if (vVar != null) {
            return vVar;
        }
        v B0 = Z().B0(str);
        this.C.put(str, B0);
        return B0;
    }

    private static boolean Y(lb lbVar) {
        return (TextUtils.isEmpty(lbVar.f10367b) && TextUtils.isEmpty(lbVar.B)) ? false : true;
    }

    private final int a(FileChannel fileChannel) {
        zzl().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().B().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                zzj().G().b("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e10) {
            zzj().B().b("Failed to read from channel", e10);
            return 0;
        }
    }

    private final v c(String str, v vVar, y6 y6Var, k kVar) {
        if (!zznp.zza()) {
            return v.f10684f;
        }
        int i10 = 90;
        if (c0().E(str) == null) {
            Boolean f10 = vVar.f();
            Boolean bool = Boolean.FALSE;
            if (f10 == bool) {
                i10 = vVar.a();
                kVar.c(y6.a.AD_USER_DATA, i10);
            } else {
                kVar.d(y6.a.AD_USER_DATA, j.FAILSAFE);
            }
            return new v(bool, i10, Boolean.TRUE, "-");
        }
        Boolean f11 = vVar.f();
        if (f11 != null) {
            i10 = vVar.a();
            kVar.c(y6.a.AD_USER_DATA, i10);
        } else {
            i5 i5Var = this.f10716a;
            y6.a aVar = y6.a.AD_USER_DATA;
            if (i5Var.x(str, aVar) == y6.a.AD_STORAGE && y6Var.s() != null) {
                f11 = y6Var.s();
                kVar.d(aVar, j.REMOTE_DELEGATION);
            }
            if (f11 == null) {
                f11 = Boolean.valueOf(this.f10716a.F(str, aVar));
                kVar.d(aVar, j.REMOTE_DEFAULT);
            }
        }
        com.google.android.gms.common.internal.s.j(f11);
        boolean T = this.f10716a.T(str);
        SortedSet<String> N = c0().N(str);
        if (!f11.booleanValue() || N.isEmpty()) {
            return new v(Boolean.FALSE, i10, Boolean.valueOf(T), "-");
        }
        return new v(Boolean.TRUE, i10, Boolean.valueOf(T), T ? TextUtils.join("", N) : "");
    }

    private static ua f(ua uaVar) {
        if (uaVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (uaVar.r()) {
            return uaVar;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(uaVar.getClass()));
    }

    public static va g(Context context) {
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.j(context.getApplicationContext());
        if (H == null) {
            synchronized (va.class) {
                if (H == null) {
                    H = new va((fb) com.google.android.gms.common.internal.s.j(new fb(context)));
                }
            }
        }
        return H;
    }

    private final Boolean h(r5 r5Var) {
        try {
            if (r5Var.z() != -2147483648L) {
                if (r5Var.z() == na.e.a(this.f10727l.zza()).f(r5Var.t0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = na.e.a(this.f10727l.zza()).f(r5Var.t0(), 0).versionName;
                String h10 = r5Var.h();
                if (h10 != null && h10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String i(y6 y6Var) {
        if (!y6Var.y()) {
            return null;
        }
        byte[] bArr = new byte[16];
        i0().P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    private static void j(zzfi.zze.zza zzaVar, int i10, String str) {
        List<zzfi.zzg> zzf = zzaVar.zzf();
        for (int i11 = 0; i11 < zzf.size(); i11++) {
            if ("_err".equals(zzf.get(i11).zzg())) {
                return;
            }
        }
        zzaVar.zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_err").zza(Long.valueOf(i10).longValue()).zzab())).zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_ev").zzb(str).zzab()));
    }

    private static void k(zzfi.zze.zza zzaVar, String str) {
        List<zzfi.zzg> zzf = zzaVar.zzf();
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            if (str.equals(zzf.get(i10).zzg())) {
                zzaVar.zza(i10);
                return;
            }
        }
    }

    private final void l(zzfi.zzj.zza zzaVar, long j10, boolean z10) {
        boolean z11;
        String str = z10 ? "_se" : "_lte";
        jb A0 = Z().A0(zzaVar.zzr(), str);
        jb jbVar = (A0 == null || A0.f10322e == null) ? new jb(zzaVar.zzr(), "auto", str, zzb().a(), Long.valueOf(j10)) : new jb(zzaVar.zzr(), "auto", str, zzb().a(), Long.valueOf(((Long) A0.f10322e).longValue() + j10));
        zzfi.zzn zznVar = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza(str).zzb(zzb().a()).zza(((Long) jbVar.f10322e).longValue()).zzab());
        int t10 = db.t(zzaVar, str);
        if (t10 >= 0) {
            zzaVar.zza(t10, zznVar);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            zzaVar.zza(zznVar);
        }
        if (j10 > 0) {
            Z().Z(jbVar);
            zzj().F().c("Updated engagement user property. scope, value", z10 ? "session-scoped" : "lifetime", jbVar.f10322e);
        }
    }

    private final long p0() {
        long a10 = zzb().a();
        y9 y9Var = this.f10724i;
        y9Var.p();
        y9Var.i();
        long a11 = y9Var.f10872i.a();
        if (a11 == 0) {
            a11 = y9Var.f().P0().nextInt(86400000) + 1;
            y9Var.f10872i.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    private final w4 q0() {
        w4 w4Var = this.f10719d;
        if (w4Var != null) {
            return w4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public static /* synthetic */ void r(va vaVar, fb fbVar) {
        vaVar.zzl().i();
        vaVar.f10726k = new g5(vaVar);
        m mVar = new m(vaVar);
        mVar.q();
        vaVar.f10718c = mVar;
        vaVar.X().m((h) com.google.android.gms.common.internal.s.j(vaVar.f10716a));
        y9 y9Var = new y9(vaVar);
        y9Var.q();
        vaVar.f10724i = y9Var;
        pb pbVar = new pb(vaVar);
        pbVar.q();
        vaVar.f10721f = pbVar;
        n8 n8Var = new n8(vaVar);
        n8Var.q();
        vaVar.f10723h = n8Var;
        pa paVar = new pa(vaVar);
        paVar.q();
        vaVar.f10720e = paVar;
        vaVar.f10719d = new w4(vaVar);
        if (vaVar.f10733r != vaVar.f10734s) {
            vaVar.zzj().B().c("Not all upload components initialized", Integer.valueOf(vaVar.f10733r), Integer.valueOf(vaVar.f10734s));
        }
        vaVar.f10728m = true;
    }

    private final pa r0() {
        return (pa) f(this.f10720e);
    }

    public final void C(boolean z10) {
        I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        r8.f10724i.f10869f.b(zzb().a());
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:27:0x00b8, B:28:0x00bc, B:30:0x00c2, B:32:0x00c8, B:34:0x00e2, B:37:0x00ed, B:38:0x00f4, B:47:0x00f6, B:48:0x0103, B:52:0x0105, B:54:0x0109, B:59:0x0110, B:62:0x0111), top: B:26:0x00b8, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(boolean r9, int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.D(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    public final y6 L(String str) {
        zzl().i();
        k0();
        y6 y6Var = this.B.get(str);
        if (y6Var == null) {
            y6Var = Z().D0(str);
            if (y6Var == null) {
                y6Var = y6.f10861c;
            }
            x(str, y6Var);
        }
        return y6Var;
    }

    public final String M(lb lbVar) {
        try {
            return (String) zzl().r(new za(this, lbVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzj().B().c("Failed to get app instance id. appId", n4.q(lbVar.f10366a), e10);
            return null;
        }
    }

    public final void N(d dVar) {
        lb R = R((String) com.google.android.gms.common.internal.s.j(dVar.f10043a));
        if (R != null) {
            O(dVar, R);
        }
    }

    public final void O(d dVar, lb lbVar) {
        p4 B;
        String str;
        Object q10;
        String g10;
        Object u12;
        p4 B2;
        String str2;
        Object q11;
        String g11;
        Object obj;
        boolean z10;
        com.google.android.gms.common.internal.s.j(dVar);
        com.google.android.gms.common.internal.s.f(dVar.f10043a);
        com.google.android.gms.common.internal.s.j(dVar.f10044b);
        com.google.android.gms.common.internal.s.j(dVar.f10045c);
        com.google.android.gms.common.internal.s.f(dVar.f10045c.f10237b);
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f10373s) {
                d(lbVar);
                return;
            }
            d dVar2 = new d(dVar);
            boolean z11 = false;
            dVar2.f10047e = false;
            Z().L0();
            try {
                d w02 = Z().w0((String) com.google.android.gms.common.internal.s.j(dVar2.f10043a), dVar2.f10045c.f10237b);
                if (w02 != null && !w02.f10044b.equals(dVar2.f10044b)) {
                    zzj().G().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f10727l.y().g(dVar2.f10045c.f10237b), dVar2.f10044b, w02.f10044b);
                }
                if (w02 != null && (z10 = w02.f10047e)) {
                    dVar2.f10044b = w02.f10044b;
                    dVar2.f10046d = w02.f10046d;
                    dVar2.f10050s = w02.f10050s;
                    dVar2.f10048f = w02.f10048f;
                    dVar2.f10051t = w02.f10051t;
                    dVar2.f10047e = z10;
                    hb hbVar = dVar2.f10045c;
                    dVar2.f10045c = new hb(hbVar.f10237b, w02.f10045c.f10238c, hbVar.u1(), w02.f10045c.f10242r);
                } else if (TextUtils.isEmpty(dVar2.f10048f)) {
                    hb hbVar2 = dVar2.f10045c;
                    dVar2.f10045c = new hb(hbVar2.f10237b, dVar2.f10046d, hbVar2.u1(), dVar2.f10045c.f10242r);
                    z11 = true;
                    dVar2.f10047e = true;
                }
                if (dVar2.f10047e) {
                    hb hbVar3 = dVar2.f10045c;
                    jb jbVar = new jb((String) com.google.android.gms.common.internal.s.j(dVar2.f10043a), dVar2.f10044b, hbVar3.f10237b, hbVar3.f10238c, com.google.android.gms.common.internal.s.j(hbVar3.u1()));
                    if (Z().Z(jbVar)) {
                        B2 = zzj().A();
                        str2 = "User property updated immediately";
                        q11 = dVar2.f10043a;
                        g11 = this.f10727l.y().g(jbVar.f10320c);
                        obj = jbVar.f10322e;
                    } else {
                        B2 = zzj().B();
                        str2 = "(2)Too many active user properties, ignoring";
                        q11 = n4.q(dVar2.f10043a);
                        g11 = this.f10727l.y().g(jbVar.f10320c);
                        obj = jbVar.f10322e;
                    }
                    B2.d(str2, q11, g11, obj);
                    if (z11 && dVar2.f10051t != null) {
                        T(new d0(dVar2.f10051t, dVar2.f10046d), lbVar);
                    }
                }
                if (Z().X(dVar2)) {
                    B = zzj().A();
                    str = "Conditional property added";
                    q10 = dVar2.f10043a;
                    g10 = this.f10727l.y().g(dVar2.f10045c.f10237b);
                    u12 = dVar2.f10045c.u1();
                } else {
                    B = zzj().B();
                    str = "Too many conditional properties, ignoring";
                    q10 = n4.q(dVar2.f10043a);
                    g10 = this.f10727l.y().g(dVar2.f10045c.f10237b);
                    u12 = dVar2.f10045c.u1();
                }
                B.d(str, q10, g10, u12);
                Z().O0();
            } finally {
                Z().M0();
            }
        }
    }

    public final pb S() {
        return (pb) f(this.f10721f);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x051e A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119 A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d9 A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0210 A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0237 A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0253 A[Catch: all -> 0x054a, TRY_LEAVE, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b5 A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e0 A[Catch: all -> 0x054a, TRY_LEAVE, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04b1 A[Catch: all -> 0x054a, TryCatch #4 {all -> 0x054a, blocks: (B:25:0x00a3, B:27:0x00af, B:31:0x0107, B:33:0x0119, B:35:0x012e, B:37:0x0154, B:39:0x01b2, B:43:0x01c5, B:45:0x01d9, B:47:0x01e4, B:50:0x01f3, B:53:0x0201, B:56:0x020c, B:58:0x0210, B:59:0x0232, B:61:0x0237, B:62:0x023f, B:64:0x0253, B:67:0x0266, B:69:0x0290, B:72:0x0298, B:74:0x02a7, B:75:0x02b3, B:76:0x0383, B:78:0x03b5, B:79:0x03b8, B:81:0x03e0, B:86:0x04b1, B:87:0x04b6, B:88:0x053b, B:93:0x03f7, B:95:0x041c, B:97:0x0427, B:99:0x042e, B:104:0x0442, B:106:0x044c, B:109:0x0457, B:111:0x0470, B:121:0x0481, B:113:0x0495, B:115:0x049b, B:116:0x04a0, B:118:0x04a6, B:129:0x0408, B:130:0x02b8, B:132:0x02e3, B:133:0x02f0, B:135:0x02f7, B:137:0x02fd, B:139:0x0307, B:141:0x030d, B:143:0x0313, B:145:0x0319, B:147:0x031e, B:150:0x0340, B:154:0x0345, B:155:0x0359, B:156:0x0367, B:157:0x0375, B:160:0x04d3, B:162:0x0504, B:163:0x0507, B:164:0x051a, B:165:0x051e, B:167:0x0522, B:170:0x0247, B:176:0x00c1, B:178:0x00c5, B:181:0x00d6, B:183:0x00ee, B:185:0x00f8, B:189:0x0104), top: B:24:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(com.google.android.gms.measurement.internal.lb r24) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.U(com.google.android.gms.measurement.internal.lb):void");
    }

    public final void W(lb lbVar) {
        if (this.f10740y != null) {
            ArrayList arrayList = new ArrayList();
            this.f10741z = arrayList;
            arrayList.addAll(this.f10740y);
        }
        m Z = Z();
        String str = (String) com.google.android.gms.common.internal.s.j(lbVar.f10366a);
        com.google.android.gms.common.internal.s.f(str);
        Z.i();
        Z.p();
        try {
            SQLiteDatabase w10 = Z.w();
            String[] strArr = {str};
            int delete = w10.delete("apps", "app_id=?", strArr) + 0 + w10.delete("events", "app_id=?", strArr) + w10.delete("user_attributes", "app_id=?", strArr) + w10.delete("conditional_properties", "app_id=?", strArr) + w10.delete("raw_events", "app_id=?", strArr) + w10.delete("raw_events_metadata", "app_id=?", strArr) + w10.delete("queue", "app_id=?", strArr) + w10.delete("audience_filter_values", "app_id=?", strArr) + w10.delete("main_event_params", "app_id=?", strArr) + w10.delete("default_event_params", "app_id=?", strArr) + w10.delete("trigger_uris", "app_id=?", strArr);
            if (delete > 0) {
                Z.zzj().F().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            Z.zzj().B().c("Error resetting analytics data. appId, error", n4.q(str), e10);
        }
        if (lbVar.f10373s) {
            U(lbVar);
        }
    }

    public final f X() {
        return ((w5) com.google.android.gms.common.internal.s.j(this.f10727l)).u();
    }

    public final m Z() {
        return (m) f(this.f10718c);
    }

    public final m4 a0() {
        return this.f10727l.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle b(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.q5 r0 = r5.zzl()
            r0.i()
            r5.k0()
            boolean r0 = com.google.android.gms.internal.measurement.zznp.zza()
            r1 = 0
            if (r0 == 0) goto L7e
            com.google.android.gms.measurement.internal.i5 r0 = r5.c0()
            com.google.android.gms.internal.measurement.zzfc$zza r0 = r0.E(r6)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.y6 r1 = r5.L(r6)
            android.os.Bundle r2 = r1.o()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.v r2 = r5.V(r6)
            com.google.android.gms.measurement.internal.k r3 = new com.google.android.gms.measurement.internal.k
            r3.<init>()
            com.google.android.gms.measurement.internal.v r1 = r5.c(r6, r2, r1, r3)
            android.os.Bundle r1 = r1.e()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.db r1 = r5.h0()
            boolean r1 = r1.c0(r6)
            r2 = 1
            if (r1 != 0) goto L70
            com.google.android.gms.measurement.internal.m r1 = r5.Z()
            java.lang.String r3 = "_npa"
            com.google.android.gms.measurement.internal.jb r1 = r1.A0(r6, r3)
            if (r1 == 0) goto L64
            java.lang.Object r6 = r1.f10322e
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r6 = r6.equals(r1)
            goto L71
        L64:
            com.google.android.gms.measurement.internal.i5 r1 = r5.f10716a
            com.google.android.gms.measurement.internal.y6$a r3 = com.google.android.gms.measurement.internal.y6.a.AD_PERSONALIZATION
            boolean r6 = r1.F(r6, r3)
            if (r6 == 0) goto L70
            r6 = 0
            goto L71
        L70:
            r6 = r2
        L71:
            if (r6 != r2) goto L76
            java.lang.String r6 = "denied"
            goto L78
        L76:
            java.lang.String r6 = "granted"
        L78:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r6)
            return r0
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.b(java.lang.String):android.os.Bundle");
    }

    public final u4 b0() {
        return (u4) f(this.f10717b);
    }

    public final i5 c0() {
        return (i5) f(this.f10716a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ae, code lost:
    
        if (X().n(com.google.android.gms.measurement.internal.e0.f10130u0) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.r5 d(com.google.android.gms.measurement.internal.lb r12) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.d(com.google.android.gms.measurement.internal.lb):com.google.android.gms.measurement.internal.r5");
    }

    public final w5 d0() {
        return this.f10727l;
    }

    public final n8 e0() {
        return (n8) f(this.f10723h);
    }

    public final y9 f0() {
        return this.f10724i;
    }

    public final ta g0() {
        return this.f10725j;
    }

    public final db h0() {
        return (db) f(this.f10722g);
    }

    public final ib i0() {
        return ((w5) com.google.android.gms.common.internal.s.j(this.f10727l)).G();
    }

    public final void j0() {
        p4 B;
        Integer valueOf;
        Integer valueOf2;
        String str;
        zzl().i();
        k0();
        if (this.f10729n) {
            return;
        }
        this.f10729n = true;
        if (K()) {
            int a10 = a(this.f10739x);
            int y10 = this.f10727l.w().y();
            zzl().i();
            if (a10 > y10) {
                B = zzj().B();
                valueOf = Integer.valueOf(a10);
                valueOf2 = Integer.valueOf(y10);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (a10 >= y10) {
                    return;
                }
                if (E(y10, this.f10739x)) {
                    B = zzj().F();
                    valueOf = Integer.valueOf(a10);
                    valueOf2 = Integer.valueOf(y10);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    B = zzj().B();
                    valueOf = Integer.valueOf(a10);
                    valueOf2 = Integer.valueOf(y10);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            B.c(str, valueOf, valueOf2);
        }
    }

    public final void k0() {
        if (!this.f10728m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void l0() {
        this.f10734s++;
    }

    public final void m(d dVar) {
        lb R = R((String) com.google.android.gms.common.internal.s.j(dVar.f10043a));
        if (R != null) {
            n(dVar, R);
        }
    }

    public final void m0() {
        this.f10733r++;
    }

    public final void n(d dVar, lb lbVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        com.google.android.gms.common.internal.s.f(dVar.f10043a);
        com.google.android.gms.common.internal.s.j(dVar.f10045c);
        com.google.android.gms.common.internal.s.f(dVar.f10045c.f10237b);
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f10373s) {
                d(lbVar);
                return;
            }
            Z().L0();
            try {
                d(lbVar);
                String str = (String) com.google.android.gms.common.internal.s.j(dVar.f10043a);
                d w02 = Z().w0(str, dVar.f10045c.f10237b);
                if (w02 != null) {
                    zzj().A().c("Removing conditional user property", dVar.f10043a, this.f10727l.y().g(dVar.f10045c.f10237b));
                    Z().y(str, dVar.f10045c.f10237b);
                    if (w02.f10047e) {
                        Z().G0(str, dVar.f10045c.f10237b);
                    }
                    d0 d0Var = dVar.f10053v;
                    if (d0Var != null) {
                        z zVar = d0Var.f10055b;
                        T((d0) com.google.android.gms.common.internal.s.j(i0().B(str, ((d0) com.google.android.gms.common.internal.s.j(dVar.f10053v)).f10054a, zVar != null ? zVar.w1() : null, w02.f10044b, dVar.f10053v.f10057d, true, true)), lbVar);
                    }
                } else {
                    zzj().G().c("Conditional user property doesn't exist", n4.q(dVar.f10043a), this.f10727l.y().g(dVar.f10045c.f10237b));
                }
                Z().O0();
            } finally {
                Z().M0();
            }
        }
    }

    public final void n0() {
        zzl().i();
        Z().N0();
        if (this.f10724i.f10870g.a() == 0) {
            this.f10724i.f10870g.b(zzb().a());
        }
        I();
    }

    public final void o(d0 d0Var, lb lbVar) {
        d0 d0Var2;
        List<d> N;
        List<d> N2;
        List<d> N3;
        p4 B;
        String str;
        Object q10;
        String g10;
        Object obj;
        String str2;
        com.google.android.gms.common.internal.s.j(lbVar);
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        zzl().i();
        k0();
        String str3 = lbVar.f10366a;
        long j10 = d0Var.f10057d;
        r4 b10 = r4.b(d0Var);
        zzl().i();
        ib.R((this.E == null || (str2 = this.F) == null || !str2.equals(str3)) ? null : this.E, b10.f10572d, false);
        d0 a10 = b10.a();
        h0();
        if (db.X(a10, lbVar)) {
            if (!lbVar.f10373s) {
                d(lbVar);
                return;
            }
            List<String> list = lbVar.E;
            if (list == null) {
                d0Var2 = a10;
            } else if (!list.contains(a10.f10054a)) {
                zzj().A().d("Dropping non-safelisted event. appId, event name, origin", str3, a10.f10054a, a10.f10056c);
                return;
            } else {
                Bundle w12 = a10.f10055b.w1();
                w12.putLong("ga_safelisted", 1L);
                d0Var2 = new d0(a10.f10054a, new z(w12), a10.f10056c, a10.f10057d);
            }
            Z().L0();
            try {
                m Z = Z();
                com.google.android.gms.common.internal.s.f(str3);
                Z.i();
                Z.p();
                if (j10 < 0) {
                    Z.zzj().G().c("Invalid time querying timed out conditional properties", n4.q(str3), Long.valueOf(j10));
                    N = Collections.emptyList();
                } else {
                    N = Z.N("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j10)});
                }
                for (d dVar : N) {
                    if (dVar != null) {
                        zzj().F().d("User property timed out", dVar.f10043a, this.f10727l.y().g(dVar.f10045c.f10237b), dVar.f10045c.u1());
                        if (dVar.f10049r != null) {
                            T(new d0(dVar.f10049r, j10), lbVar);
                        }
                        Z().y(str3, dVar.f10045c.f10237b);
                    }
                }
                m Z2 = Z();
                com.google.android.gms.common.internal.s.f(str3);
                Z2.i();
                Z2.p();
                if (j10 < 0) {
                    Z2.zzj().G().c("Invalid time querying expired conditional properties", n4.q(str3), Long.valueOf(j10));
                    N2 = Collections.emptyList();
                } else {
                    N2 = Z2.N("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(N2.size());
                for (d dVar2 : N2) {
                    if (dVar2 != null) {
                        zzj().F().d("User property expired", dVar2.f10043a, this.f10727l.y().g(dVar2.f10045c.f10237b), dVar2.f10045c.u1());
                        Z().G0(str3, dVar2.f10045c.f10237b);
                        d0 d0Var3 = dVar2.f10053v;
                        if (d0Var3 != null) {
                            arrayList.add(d0Var3);
                        }
                        Z().y(str3, dVar2.f10045c.f10237b);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    T(new d0((d0) obj2, j10), lbVar);
                }
                m Z3 = Z();
                String str4 = d0Var2.f10054a;
                com.google.android.gms.common.internal.s.f(str3);
                com.google.android.gms.common.internal.s.f(str4);
                Z3.i();
                Z3.p();
                if (j10 < 0) {
                    Z3.zzj().G().d("Invalid time querying triggered conditional properties", n4.q(str3), Z3.d().c(str4), Long.valueOf(j10));
                    N3 = Collections.emptyList();
                } else {
                    N3 = Z3.N("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(N3.size());
                for (d dVar3 : N3) {
                    if (dVar3 != null) {
                        hb hbVar = dVar3.f10045c;
                        jb jbVar = new jb((String) com.google.android.gms.common.internal.s.j(dVar3.f10043a), dVar3.f10044b, hbVar.f10237b, j10, com.google.android.gms.common.internal.s.j(hbVar.u1()));
                        if (Z().Z(jbVar)) {
                            B = zzj().F();
                            str = "User property triggered";
                            q10 = dVar3.f10043a;
                            g10 = this.f10727l.y().g(jbVar.f10320c);
                            obj = jbVar.f10322e;
                        } else {
                            B = zzj().B();
                            str = "Too many active user properties, ignoring";
                            q10 = n4.q(dVar3.f10043a);
                            g10 = this.f10727l.y().g(jbVar.f10320c);
                            obj = jbVar.f10322e;
                        }
                        B.d(str, q10, g10, obj);
                        d0 d0Var4 = dVar3.f10051t;
                        if (d0Var4 != null) {
                            arrayList2.add(d0Var4);
                        }
                        dVar3.f10045c = new hb(jbVar);
                        dVar3.f10047e = true;
                        Z().X(dVar3);
                    }
                }
                T(d0Var2, lbVar);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    T(new d0((d0) obj3, j10), lbVar);
                }
                Z().O0();
            } finally {
                Z().M0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0() {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.o0():void");
    }

    public final void p(d0 d0Var, String str) {
        String str2;
        int i10;
        r5 y02 = Z().y0(str);
        if (y02 == null || TextUtils.isEmpty(y02.h())) {
            zzj().A().b("No app data available; dropping event", str);
            return;
        }
        Boolean h10 = h(y02);
        if (h10 == null) {
            if (!"_ui".equals(d0Var.f10054a)) {
                zzj().G().b("Could not find package. appId", n4.q(str));
            }
        } else if (!h10.booleanValue()) {
            zzj().B().b("App version does not match; dropping event. appId", n4.q(str));
            return;
        }
        y6 L = L(str);
        if (zznp.zza() && X().n(e0.T0)) {
            str2 = V(str).i();
            i10 = L.b();
        } else {
            str2 = "";
            i10 = 100;
        }
        int i11 = i10;
        P(d0Var, new lb(str, y02.j(), y02.h(), y02.z(), y02.v0(), y02.g0(), y02.a0(), (String) null, y02.r(), false, y02.i(), y02.v(), 0L, 0, y02.q(), false, y02.r0(), y02.q0(), y02.c0(), y02.n(), (String) null, L.v(), "", (String) null, y02.t(), y02.p0(), i11, str2, y02.a(), y02.D()));
    }

    public final void q(r5 r5Var, zzfi.zzj.zza zzaVar) {
        zzfi.zzn zznVar;
        zzl().i();
        k0();
        if (zznp.zza()) {
            k b10 = k.b(zzaVar.zzs());
            String t02 = r5Var.t0();
            zzl().i();
            k0();
            if (zznp.zza()) {
                y6 L = L(t02);
                if (zznp.zza() && X().n(e0.V0)) {
                    zzaVar.zzg(L.w());
                }
                if (L.s() != null) {
                    b10.c(y6.a.AD_STORAGE, L.b());
                } else {
                    b10.d(y6.a.AD_STORAGE, j.FAILSAFE);
                }
                if (L.u() != null) {
                    b10.c(y6.a.ANALYTICS_STORAGE, L.b());
                } else {
                    b10.d(y6.a.ANALYTICS_STORAGE, j.FAILSAFE);
                }
            }
            String t03 = r5Var.t0();
            zzl().i();
            k0();
            if (zznp.zza()) {
                v c10 = c(t03, V(t03), L(t03), b10);
                zzaVar.zzb(((Boolean) com.google.android.gms.common.internal.s.j(c10.g())).booleanValue());
                if (!TextUtils.isEmpty(c10.h())) {
                    zzaVar.zzh(c10.h());
                }
            }
            zzl().i();
            k0();
            if (zznp.zza()) {
                Iterator<zzfi.zzn> it = zzaVar.zzx().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zznVar = null;
                        break;
                    } else {
                        zznVar = it.next();
                        if ("_npa".equals(zznVar.zzg())) {
                            break;
                        }
                    }
                }
                if (zznVar != null) {
                    y6.a aVar = y6.a.AD_PERSONALIZATION;
                    if (b10.a(aVar) == j.UNSET) {
                        Boolean q02 = r5Var.q0();
                        b10.d(aVar, (q02 == null || (q02 == Boolean.TRUE && zznVar.zzc() != 1) || (q02 == Boolean.FALSE && zznVar.zzc() != 0)) ? j.API : j.MANIFEST);
                    }
                } else if (zznp.zza() && X().n(e0.W0)) {
                    int i10 = 1;
                    if (this.f10716a.E(r5Var.t0()) == null) {
                        b10.d(y6.a.AD_PERSONALIZATION, j.FAILSAFE);
                    } else {
                        i5 i5Var = this.f10716a;
                        String t04 = r5Var.t0();
                        y6.a aVar2 = y6.a.AD_PERSONALIZATION;
                        i10 = 1 ^ (i5Var.F(t04, aVar2) ? 1 : 0);
                        b10.d(aVar2, j.REMOTE_DEFAULT);
                    }
                    zzaVar.zza((zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(zzb().a()).zza(i10).zzab()));
                }
            }
            zzaVar.zzf(b10.toString());
        }
    }

    public final void s(hb hbVar, lb lbVar) {
        jb A0;
        long j10;
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f10373s) {
                d(lbVar);
                return;
            }
            int l02 = i0().l0(hbVar.f10237b);
            int i10 = 0;
            if (l02 != 0) {
                i0();
                String str = hbVar.f10237b;
                X();
                String D = ib.D(str, 24, true);
                String str2 = hbVar.f10237b;
                int length = str2 != null ? str2.length() : 0;
                i0();
                ib.T(this.G, lbVar.f10366a, l02, "_ev", D, length);
                return;
            }
            int r10 = i0().r(hbVar.f10237b, hbVar.u1());
            if (r10 != 0) {
                i0();
                String str3 = hbVar.f10237b;
                X();
                String D2 = ib.D(str3, 24, true);
                Object u12 = hbVar.u1();
                if (u12 != null && ((u12 instanceof String) || (u12 instanceof CharSequence))) {
                    i10 = String.valueOf(u12).length();
                }
                i0();
                ib.T(this.G, lbVar.f10366a, r10, "_ev", D2, i10);
                return;
            }
            Object v02 = i0().v0(hbVar.f10237b, hbVar.u1());
            if (v02 == null) {
                return;
            }
            if ("_sid".equals(hbVar.f10237b)) {
                long j11 = hbVar.f10238c;
                String str4 = hbVar.f10242r;
                String str5 = (String) com.google.android.gms.common.internal.s.j(lbVar.f10366a);
                jb A02 = Z().A0(str5, "_sno");
                if (A02 != null) {
                    Object obj = A02.f10322e;
                    if (obj instanceof Long) {
                        j10 = ((Long) obj).longValue();
                        s(new hb("_sno", j11, Long.valueOf(j10 + 1), str4), lbVar);
                    }
                }
                if (A02 != null) {
                    zzj().G().b("Retrieved last session number from database does not contain a valid (long) value", A02.f10322e);
                }
                a0 x02 = Z().x0(str5, "_s");
                if (x02 != null) {
                    j10 = x02.f9936c;
                    zzj().F().b("Backfill the session number. Last used session number", Long.valueOf(j10));
                } else {
                    j10 = 0;
                }
                s(new hb("_sno", j11, Long.valueOf(j10 + 1), str4), lbVar);
            }
            jb jbVar = new jb((String) com.google.android.gms.common.internal.s.j(lbVar.f10366a), (String) com.google.android.gms.common.internal.s.j(hbVar.f10242r), hbVar.f10237b, hbVar.f10238c, v02);
            zzj().F().c("Setting user property", this.f10727l.y().g(jbVar.f10320c), v02);
            Z().L0();
            try {
                if ("_id".equals(jbVar.f10320c) && (A0 = Z().A0(lbVar.f10366a, "_id")) != null && !jbVar.f10322e.equals(A0.f10322e)) {
                    Z().G0(lbVar.f10366a, "_lair");
                }
                d(lbVar);
                boolean Z = Z().Z(jbVar);
                if ("_sid".equals(hbVar.f10237b)) {
                    long u10 = h0().u(lbVar.I);
                    r5 y02 = Z().y0(lbVar.f10366a);
                    if (y02 != null) {
                        y02.l0(u10);
                        if (y02.s()) {
                            Z().Q(y02);
                        }
                    }
                }
                Z().O0();
                if (!Z) {
                    zzj().B().c("Too many unique user properties are set. Ignoring user property", this.f10727l.y().g(jbVar.f10320c), jbVar.f10322e);
                    i0();
                    ib.T(this.G, lbVar.f10366a, 9, null, null, 0);
                }
            } finally {
                Z().M0();
            }
        }
    }

    public final void t(Runnable runnable) {
        zzl().i();
        if (this.f10731p == null) {
            this.f10731p = new ArrayList();
        }
        this.f10731p.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        r6.f10724i.f10869f.b(zzb().a());
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[Catch: all -> 0x017f, TryCatch #1 {all -> 0x017f, blocks: (B:5:0x002b, B:12:0x0047, B:13:0x0173, B:24:0x0061, B:31:0x00a6, B:32:0x00b5, B:35:0x00bd, B:37:0x00c9, B:39:0x00cf, B:41:0x00d9, B:43:0x00e5, B:45:0x00eb, B:49:0x00f8, B:52:0x0128, B:54:0x013c, B:55:0x0160, B:57:0x016a, B:59:0x0170, B:60:0x014a, B:61:0x010f, B:63:0x0119), top: B:4:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[Catch: all -> 0x017f, TryCatch #1 {all -> 0x017f, blocks: (B:5:0x002b, B:12:0x0047, B:13:0x0173, B:24:0x0061, B:31:0x00a6, B:32:0x00b5, B:35:0x00bd, B:37:0x00c9, B:39:0x00cf, B:41:0x00d9, B:43:0x00e5, B:45:0x00eb, B:49:0x00f8, B:52:0x0128, B:54:0x013c, B:55:0x0160, B:57:0x016a, B:59:0x0170, B:60:0x014a, B:61:0x010f, B:63:0x0119), top: B:4:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.u(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void v(String str, zzfi.zzj.zza zzaVar) {
        int t10;
        int indexOf;
        Set<String> M = c0().M(str);
        if (M != null) {
            zzaVar.zzd(M);
        }
        if (c0().W(str)) {
            zzaVar.zzg();
        }
        if (c0().Z(str)) {
            if (X().w(str, e0.B0)) {
                String zzu = zzaVar.zzu();
                if (!TextUtils.isEmpty(zzu) && (indexOf = zzu.indexOf(".")) != -1) {
                    zzaVar.zzo(zzu.substring(0, indexOf));
                }
            } else {
                zzaVar.zzl();
            }
        }
        if (c0().a0(str) && (t10 = db.t(zzaVar, "_id")) != -1) {
            zzaVar.zzc(t10);
        }
        if (c0().Y(str)) {
            zzaVar.zzh();
        }
        if (c0().V(str)) {
            zzaVar.zze();
            b bVar = this.D.get(str);
            if (bVar == null || bVar.f10748b + X().s(str, e0.W) < zzb().b()) {
                bVar = new b();
                this.D.put(str, bVar);
            }
            zzaVar.zzk(bVar.f10747a);
        }
        if (c0().X(str)) {
            zzaVar.zzp();
        }
    }

    public final void w(String str, v vVar) {
        zzl().i();
        k0();
        if (zznp.zza()) {
            this.C.put(str, vVar);
            Z().R(str, vVar);
        }
    }

    public final void x(String str, y6 y6Var) {
        zzl().i();
        k0();
        this.B.put(str, y6Var);
        Z().S(str, y6Var);
    }

    public final void y(String str, p8 p8Var) {
        zzl().i();
        String str2 = this.F;
        if (str2 == null || str2.equals(str) || p8Var != null) {
            this.F = str;
            this.E = p8Var;
        }
    }

    public final void z(String str, lb lbVar) {
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f10373s) {
                d(lbVar);
                return;
            }
            if ("_npa".equals(str) && lbVar.C != null) {
                zzj().A().a("Falling back to manifest metadata value for ad personalization");
                s(new hb("_npa", zzb().a(), Long.valueOf(lbVar.C.booleanValue() ? 1L : 0L), "auto"), lbVar);
                return;
            }
            zzj().A().b("Removing user property", this.f10727l.y().g(str));
            Z().L0();
            try {
                d(lbVar);
                if ("_id".equals(str)) {
                    Z().G0((String) com.google.android.gms.common.internal.s.j(lbVar.f10366a), "_lair");
                }
                Z().G0((String) com.google.android.gms.common.internal.s.j(lbVar.f10366a), str);
                Z().O0();
                zzj().A().b("User property removed", this.f10727l.y().g(str));
            } finally {
                Z().M0();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final Context zza() {
        return this.f10727l.zza();
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final la.f zzb() {
        return ((w5) com.google.android.gms.common.internal.s.j(this.f10727l)).zzb();
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final e zzd() {
        return this.f10727l.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final n4 zzj() {
        return ((w5) com.google.android.gms.common.internal.s.j(this.f10727l)).zzj();
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final q5 zzl() {
        return ((w5) com.google.android.gms.common.internal.s.j(this.f10727l)).zzl();
    }
}
