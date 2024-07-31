package p314qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qg.n */
/* loaded from: classes2.dex */
public final class C10489n extends C10478c {
    @Override // p314qg.C10478c
    /* renamed from: c */
    int mo31427c(char c10, StringBuilder sb2) {
        int i10;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i10 = (c10 - '0') + 4;
            } else {
                if (c10 < 'a' || c10 > 'z') {
                    if (c10 < ' ') {
                        sb2.append((char) 0);
                        sb2.append(c10);
                        return 2;
                    }
                    if (c10 <= '/') {
                        sb2.append((char) 1);
                        sb2.append((char) (c10 - '!'));
                        return 2;
                    }
                    if (c10 <= '@') {
                        sb2.append((char) 1);
                        sb2.append((char) ((c10 - ':') + 15));
                        return 2;
                    }
                    if (c10 >= '[' && c10 <= '_') {
                        sb2.append((char) 1);
                        sb2.append((char) ((c10 - '[') + 22));
                        return 2;
                    }
                    if (c10 == '`') {
                        sb2.append((char) 2);
                        sb2.append((char) 0);
                        return 2;
                    }
                    if (c10 <= 'Z') {
                        sb2.append((char) 2);
                        sb2.append((char) ((c10 - 'A') + 1));
                        return 2;
                    }
                    if (c10 > 127) {
                        sb2.append("\u0001\u001e");
                        return mo31427c((char) (c10 - 128), sb2) + 2;
                    }
                    sb2.append((char) 2);
                    sb2.append((char) ((c10 - '{') + 27));
                    return 2;
                }
                i10 = (c10 - 'a') + 14;
            }
            c11 = (char) i10;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // p314qg.C10478c
    /* renamed from: f */
    public int mo31429f() {
        return 2;
    }
}
