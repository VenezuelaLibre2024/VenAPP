package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class zzalr implements zzakr {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalp zzh = new zzalp(30.0f, 1, 1);

    public zzalr() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalp r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzc(java.lang.String, com.google.android.gms.internal.ads.zzalp):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzd(String str) {
        char c10;
        String zza2 = zzfwk.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c10 == 2 || c10 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c10 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzalu zze(zzalu zzaluVar) {
        return zzaluVar == null ? new zzalu() : zzaluVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0229, code lost:
    
        r15 = zze(r15);
        r15.zzx(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0232, code lost:
    
        r15 = zze(r15);
        r15.zzx(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0156, code lost:
    
        if (r8 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
    
        if (r8 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015a, code lost:
    
        if (r8 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015c, code lost:
    
        if (r8 == 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0160, code lost:
    
        r15 = zze(r15);
        r15.zzC(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0169, code lost:
    
        r15 = zze(r15);
        r15.zzC(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0172, code lost:
    
        r15 = zze(r15);
        r15.zzu(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017b, code lost:
    
        r15 = zze(r15);
        r15.zzu(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0209, code lost:
    
        if (r8 == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020b, code lost:
    
        if (r8 == 1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020d, code lost:
    
        if (r8 == 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020f, code lost:
    
        if (r8 == 3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0211, code lost:
    
        if (r8 == 4) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0213, code lost:
    
        if (r8 == 5) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0217, code lost:
    
        r15 = zze(r15);
        r15.zzx(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        r15 = zze(r15);
        r15.zzx(3);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x00c5. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzalu zzf(org.xmlpull.v1.XmlPullParser r14, com.google.android.gms.internal.ads.zzalu r15) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzalu):com.google.android.gms.internal.ads.zzalu");
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i10 = zzfy.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzep zzepVar) {
        zzakl.zza(zzb(bArr, i10, i11), zzakqVar, zzepVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b7, code lost:
    
        r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c0, code lost:
    
        if (com.google.android.gms.internal.ads.zzfz.zzc(r4, "image") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c2, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfz.zza(r4, com.google.ads.mediation.facebook.FacebookMediationAdapter.KEY_ID);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c6, code lost:
    
        if (r1 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c8, code lost:
    
        r7.put(r1, r4.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d3, code lost:
    
        if (com.google.android.gms.internal.ads.zzfz.zzb(r4, r2) == false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b5, code lost:
    
        if (com.google.android.gms.internal.ads.zzfz.zzc(r4, r2) != false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b4 A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036f A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, TRY_LEAVE, TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e3 A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, TRY_LEAVE, TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0431 A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, TRY_LEAVE, TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x017c A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d4 A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, TRY_ENTER, TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0267 A[Catch: IOException -> 0x0695, XmlPullParserException -> 0x069f, LOOP:1: B:75:0x0267->B:89:0x04c5, LOOP_START, PHI: r2 r5 r11
      0x0267: PHI (r2v40 java.lang.String) = (r2v16 java.lang.String), (r2v78 java.lang.String) binds: [B:74:0x0265, B:89:0x04c5] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r5v7 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v24 java.util.HashMap) binds: [B:74:0x0265, B:89:0x04c5] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r11v11 com.google.android.gms.internal.ads.zzalp) = (r11v5 com.google.android.gms.internal.ads.zzalp), (r11v28 com.google.android.gms.internal.ads.zzalp) binds: [B:74:0x0265, B:89:0x04c5] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x0695, XmlPullParserException -> 0x069f, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0172, B:38:0x01c6, B:41:0x01d4, B:43:0x01da, B:45:0x01e2, B:47:0x01ea, B:49:0x01f2, B:51:0x01fa, B:53:0x0202, B:55:0x0208, B:57:0x0210, B:59:0x0218, B:61:0x021e, B:63:0x0224, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:71:0x067d, B:73:0x0261, B:75:0x0267, B:77:0x0270, B:79:0x027f, B:81:0x0289, B:83:0x029d, B:85:0x02a3, B:87:0x04b9, B:95:0x02a7, B:98:0x02b1, B:100:0x02b7, B:102:0x02c2, B:104:0x02c8, B:105:0x02cf, B:109:0x02db, B:114:0x04b4, B:115:0x02e8, B:117:0x02f0, B:122:0x0309, B:124:0x0310, B:126:0x031e, B:128:0x0367, B:130:0x036f, B:134:0x037e, B:136:0x0385, B:138:0x0393, B:140:0x03db, B:142:0x03e3, B:155:0x0429, B:157:0x0431, B:173:0x047a, B:190:0x039e, B:191:0x032d, B:192:0x03a5, B:195:0x03ad, B:198:0x03b6, B:200:0x03bd, B:202:0x03c9, B:205:0x0486, B:206:0x048e, B:209:0x0327, B:210:0x0331, B:213:0x033b, B:216:0x0343, B:218:0x034a, B:220:0x0356, B:223:0x049a, B:224:0x04a2, B:228:0x04d1, B:232:0x04ee, B:251:0x058e, B:261:0x054a, B:265:0x0553, B:257:0x060c, B:272:0x055b, B:275:0x0565, B:280:0x057a, B:282:0x057f, B:284:0x0587, B:308:0x05a3, B:312:0x05ad, B:315:0x05b6, B:321:0x05ca, B:323:0x05df, B:326:0x05ed, B:328:0x05f2, B:336:0x05d1, B:348:0x017c, B:350:0x0188, B:351:0x018e, B:354:0x0193, B:356:0x019a, B:358:0x01a6, B:360:0x01b0, B:361:0x010b, B:363:0x0117, B:366:0x0122, B:368:0x0129, B:370:0x0135, B:376:0x0147, B:379:0x014e, B:382:0x0168, B:399:0x062c, B:405:0x063b, B:407:0x0645, B:409:0x0652, B:410:0x065a, B:414:0x066e, B:418:0x0676), top: B:2:0x0006, inners: #1, #2, #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c5 A[LOOP:1: B:75:0x0267->B:89:0x04c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzakm zzb(byte[] r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzakm");
    }
}
