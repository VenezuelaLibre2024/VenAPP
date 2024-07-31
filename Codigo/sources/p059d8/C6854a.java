package p059d8;

import com.google.android.exoplayer2.source.rtsp.C4739h;
import p363t8.C11137a;

/* renamed from: d8.a */
/* loaded from: classes.dex */
public final class C6854a {
    /* renamed from: a */
    public InterfaceC6858e m19815a(C4739h c4739h) {
        String str = (String) C11137a.m34603e(c4739h.f9394c.f28797w);
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
                return new C6855b(c4739h);
            case 1:
                return new C6856c(c4739h);
            case 2:
                return new C6857d(c4739h);
            default:
                return null;
        }
    }
}
