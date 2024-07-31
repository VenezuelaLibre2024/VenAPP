package com.google.android.gms.internal.ads;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
final class zzafq {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzafm zza(String str) {
        long j10;
        String str2;
        String str3;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!zzfz.zzc(newPullParser, "x:xmpmeta")) {
                throw zzcc.zza("Couldn't find xmp metadata", null);
            }
            zzgaa zzl = zzgaa.zzl();
            long j11 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (zzfz.zzc(newPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        String zza2 = zzfz.zza(newPullParser, strArr[i11]);
                        if (zza2 != null) {
                            if (Integer.parseInt(zza2) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= 4) {
                                    break;
                                }
                                String zza3 = zzfz.zza(newPullParser, strArr2[i12]);
                                if (zza3 != null) {
                                    j10 = Long.parseLong(zza3);
                                    if (j10 == -1) {
                                    }
                                } else {
                                    i12++;
                                }
                            }
                            j10 = -9223372036854775807L;
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i10 >= 2) {
                                    zzl = zzgaa.zzl();
                                    break;
                                }
                                String zza4 = zzfz.zza(newPullParser, strArr3[i10]);
                                if (zza4 != null) {
                                    zzl = zzgaa.zzn(new zzafl("image/jpeg", "Primary", 0L, 0L), new zzafl("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0L));
                                    break;
                                }
                                i10++;
                            }
                            j11 = j10;
                        }
                    }
                    return null;
                }
                if (zzfz.zzc(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (zzfz.zzc(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                zzl = zzb(newPullParser, str2, str3);
            } while (!zzfz.zzb(newPullParser, "x:xmpmeta"));
            if (zzl.isEmpty()) {
                return null;
            }
            return new zzafm(j11, zzl);
        } catch (zzcc | NumberFormatException | XmlPullParserException unused) {
            zzff.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzgaa zzb(XmlPullParser xmlPullParser, String str, String str2) {
        zzfzx zzfzxVar = new zzfzx();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfz.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzfz.zza(xmlPullParser, concat2);
                String zza3 = zzfz.zza(xmlPullParser, concat3);
                String zza4 = zzfz.zza(xmlPullParser, concat4);
                String zza5 = zzfz.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzgaa.zzl();
                }
                zzfzxVar.zzf(new zzafl(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzfz.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfzxVar.zzi();
    }
}
