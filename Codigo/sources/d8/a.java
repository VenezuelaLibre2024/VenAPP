package d8;

import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes.dex */
public final class a {
    public e a(h hVar) {
        String str = (String) t8.a.e(hVar.f8350c.f26517w);
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new b(hVar);
            case 1:
                return new c(hVar);
            case 2:
                return new d(hVar);
            default:
                return null;
        }
    }
}
