package p363t8;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: t8.k */
/* loaded from: classes.dex */
public final class C11157k {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m34757a(String str) {
        char c10;
        if (str == null) {
            return -1;
        }
        String m35012t = C11178w.m35012t(str);
        m35012t.hashCode();
        switch (m35012t.hashCode()) {
            case -2123537834:
                if (m35012t.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384011:
                if (m35012t.equals("video/mp2p")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384007:
                if (m35012t.equals("video/mp2t")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1662095187:
                if (m35012t.equals("video/webm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (m35012t.equals("audio/amr-wb")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1487394660:
                if (m35012t.equals("image/jpeg")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1248337486:
                if (m35012t.equals("application/mp4")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1079884372:
                if (m35012t.equals("video/x-msvideo")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                if (m35012t.equals("text/vtt")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -387023398:
                if (m35012t.equals("audio/x-matroska")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -43467528:
                if (m35012t.equals("application/webm")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 13915911:
                if (m35012t.equals("video/x-flv")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (m35012t.equals("audio/ac3")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (m35012t.equals("audio/ac4")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 187078669:
                if (m35012t.equals("audio/amr")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 187090232:
                if (m35012t.equals("audio/mp4")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 187091926:
                if (m35012t.equals("audio/ogg")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 187099443:
                if (m35012t.equals("audio/wav")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1331848029:
                if (m35012t.equals("video/mp4")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (m35012t.equals("audio/3gpp")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (m35012t.equals("audio/eac3")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (m35012t.equals("audio/flac")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1504824762:
                if (m35012t.equals("audio/midi")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (m35012t.equals("audio/mpeg")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1505118770:
                if (m35012t.equals("audio/webm")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 2039520277:
                if (m35012t.equals("video/x-matroska")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case '\f':
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\t':
            case '\n':
            case 24:
            case 25:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case '\b':
                return 13;
            case 11:
                return 5;
            case '\r':
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static int m34758b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return m34757a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    /* renamed from: c */
    public static int m34759c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }
}
