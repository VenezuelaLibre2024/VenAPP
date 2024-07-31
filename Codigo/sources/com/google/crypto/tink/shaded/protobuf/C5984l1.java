package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.l1 */
/* loaded from: classes2.dex */
public final class C5984l1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.l1$a */
    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC5970h f12681a;

        a(AbstractC5970h abstractC5970h) {
            this.f12681a = abstractC5970h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C5984l1.b
        /* renamed from: a */
        public byte mo15864a(int i10) {
            return this.f12681a.mo15493d(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C5984l1.b
        public int size() {
            return this.f12681a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.l1$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        byte mo15864a(int i10);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m15861a(AbstractC5970h abstractC5970h) {
        return m15862b(new a(abstractC5970h));
    }

    /* renamed from: b */
    static String m15862b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int mo15864a = bVar.mo15864a(i10);
            if (mo15864a == 34) {
                str = "\\\"";
            } else if (mo15864a == 39) {
                str = "\\'";
            } else if (mo15864a != 92) {
                switch (mo15864a) {
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
                        if (mo15864a < 32 || mo15864a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((mo15864a >>> 6) & 3) + 48));
                            sb2.append((char) (((mo15864a >>> 3) & 7) + 48));
                            mo15864a = (mo15864a & 7) + 48;
                        }
                        sb2.append((char) mo15864a);
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
    public static String m15863c(String str) {
        return m15861a(AbstractC5970h.m15488m(str));
    }
}
