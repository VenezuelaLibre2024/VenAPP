package p314qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qg.b */
/* loaded from: classes2.dex */
public final class C10477b implements InterfaceC10482g {
    /* renamed from: c */
    private static char m31422c(char c10, int i10) {
        int i11 = c10 + ((i10 * 149) % 255) + 1;
        return i11 <= 255 ? (char) i11 : (char) (i11 - 256);
    }

    @Override // p314qg.InterfaceC10482g
    /* renamed from: a */
    public void mo31420a(C10483h c10483h) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!c10483h.m31455i()) {
                break;
            }
            sb2.append(c10483h.m31450c());
            c10483h.f26031f++;
            if (C10485j.m31481n(c10483h.m31451d(), c10483h.f26031f, m31423b()) != m31423b()) {
                c10483h.m31461o(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int m31448a = c10483h.m31448a() + length + 1;
        c10483h.m31463q(m31448a);
        boolean z10 = c10483h.m31454g().m31537a() - m31448a > 0;
        if (c10483h.m31455i() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: " + length);
                }
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            c10483h.m31464r(m31422c(sb2.charAt(i10), c10483h.m31448a() + 1));
        }
    }

    /* renamed from: b */
    public int m31423b() {
        return 5;
    }
}
