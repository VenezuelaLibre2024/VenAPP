package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l1 */
/* loaded from: classes.dex */
final class C1181l1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.l1$a */
    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC1167h f4933a;

        a(AbstractC1167h abstractC1167h) {
            this.f4933a = abstractC1167h;
        }

        @Override // androidx.datastore.preferences.protobuf.C1181l1.b
        /* renamed from: a */
        public byte mo6205a(int i10) {
            return this.f4933a.mo5813d(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1181l1.b
        public int size() {
            return this.f4933a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.l1$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        byte mo6205a(int i10);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6202a(AbstractC1167h abstractC1167h) {
        return m6203b(new a(abstractC1167h));
    }

    /* renamed from: b */
    static String m6203b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int mo6205a = bVar.mo6205a(i10);
            if (mo6205a == 34) {
                str = "\\\"";
            } else if (mo6205a == 39) {
                str = "\\'";
            } else if (mo6205a != 92) {
                switch (mo6205a) {
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
                        if (mo6205a < 32 || mo6205a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((mo6205a >>> 6) & 3) + 48));
                            sb2.append((char) (((mo6205a >>> 3) & 7) + 48));
                            mo6205a = (mo6205a & 7) + 48;
                        }
                        sb2.append((char) mo6205a);
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
    public static String m6204c(String str) {
        return m6202a(AbstractC1167h.m5808m(str));
    }
}
