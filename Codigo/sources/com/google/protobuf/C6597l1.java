package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.l1 */
/* loaded from: classes2.dex */
public final class C6597l1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.l1$a */
    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC6580g f14565a;

        a(AbstractC6580g abstractC6580g) {
            this.f14565a = abstractC6580g;
        }

        @Override // com.google.protobuf.C6597l1.b
        /* renamed from: a */
        public byte mo18938a(int i10) {
            return this.f14565a.mo18520d(i10);
        }

        @Override // com.google.protobuf.C6597l1.b
        public int size() {
            return this.f14565a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.l1$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        byte mo18938a(int i10);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m18935a(AbstractC6580g abstractC6580g) {
        return m18936b(new a(abstractC6580g));
    }

    /* renamed from: b */
    static String m18936b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int mo18938a = bVar.mo18938a(i10);
            if (mo18938a == 34) {
                str = "\\\"";
            } else if (mo18938a == 39) {
                str = "\\'";
            } else if (mo18938a != 92) {
                switch (mo18938a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (mo18938a < 32 || mo18938a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((mo18938a >>> 6) & 3) + 48));
                            sb2.append((char) (((mo18938a >>> 3) & 7) + 48));
                            mo18938a = (mo18938a & 7) + 48;
                        }
                        sb2.append((char) mo18938a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m18937c(String str) {
        return m18935a(AbstractC6580g.m18515m(str));
    }
}
