package p120g8;

import p134h8.C7664a;
import p134h8.C7666c;
import p156i8.C7899a;
import p176j8.C8997a;
import p217l8.C9407a;
import p236m8.C9552a;
import p251n8.C9677c;
import p268o8.C9819a;
import p291p8.C10111a;
import p291p8.C10118h;
import p361t6.C11108u1;

/* renamed from: g8.l */
/* loaded from: classes.dex */
public interface InterfaceC7494l {

    /* renamed from: a */
    public static final InterfaceC7494l f17704a = new a();

    /* renamed from: g8.l$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC7494l {
        a() {
        }

        @Override // p120g8.InterfaceC7494l
        /* renamed from: a */
        public boolean mo22812a(C11108u1 c11108u1) {
            String str = c11108u1.f28797w;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // p120g8.InterfaceC7494l
        /* renamed from: b */
        public InterfaceC7492j mo22813b(C11108u1 c11108u1) {
            String str = c11108u1.f28797w;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new C7899a(c11108u1.f28799y);
                    case 1:
                        return new C8997a();
                    case 2:
                        return new C10111a();
                    case 3:
                        return new C10118h();
                    case 4:
                        return new C9819a(c11108u1.f28799y);
                    case 5:
                        return new C9407a(c11108u1.f28799y);
                    case 6:
                    case '\b':
                        return new C7664a(str, c11108u1.f28781O, 16000L);
                    case 7:
                        return new C7489g();
                    case '\t':
                        return new C7666c(c11108u1.f28781O, c11108u1.f28799y);
                    case '\n':
                        return new C9552a();
                    case 11:
                        return new C9677c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo22812a(C11108u1 c11108u1);

    /* renamed from: b */
    InterfaceC7492j mo22813b(C11108u1 c11108u1);
}
