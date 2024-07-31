package nf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.gson.internal.AbstractC6482e;
import com.google.gson.internal.bind.C6478a;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* renamed from: nf.a */
/* loaded from: classes2.dex */
public class C9712a implements Closeable {

    /* renamed from: a */
    private final Reader f23877a;

    /* renamed from: t */
    private long f23885t;

    /* renamed from: u */
    private int f23886u;

    /* renamed from: v */
    private String f23887v;

    /* renamed from: w */
    private int[] f23888w;

    /* renamed from: y */
    private String[] f23890y;

    /* renamed from: z */
    private int[] f23891z;

    /* renamed from: b */
    private boolean f23878b = false;

    /* renamed from: c */
    private final char[] f23879c = new char[RecognitionOptions.UPC_E];

    /* renamed from: d */
    private int f23880d = 0;

    /* renamed from: e */
    private int f23881e = 0;

    /* renamed from: f */
    private int f23882f = 0;

    /* renamed from: r */
    private int f23883r = 0;

    /* renamed from: s */
    int f23884s = 0;

    /* renamed from: x */
    private int f23889x = 0 + 1;

    /* renamed from: nf.a$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC6482e {
        a() {
        }

        @Override // com.google.gson.internal.AbstractC6482e
        /* renamed from: a */
        public void mo18241a(C9712a c9712a) {
            int i10;
            if (c9712a instanceof C6478a) {
                ((C6478a) c9712a).m18207Y0();
                return;
            }
            int i11 = c9712a.f23884s;
            if (i11 == 0) {
                i11 = c9712a.m29122g();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else {
                if (i11 != 14) {
                    throw new IllegalStateException("Expected a name but was " + c9712a.mo18212h0() + c9712a.m29121B());
                }
                i10 = 10;
            }
            c9712a.f23884s = i10;
        }
    }

    static {
        AbstractC6482e.f14234a = new a();
    }

    public C9712a(Reader reader) {
        int[] iArr = new int[32];
        this.f23888w = iArr;
        iArr[0] = 6;
        this.f23890y = new String[32];
        this.f23891z = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f23877a = reader;
    }

    /* renamed from: B0 */
    private void m29104B0(char c10) {
        char[] cArr = this.f23879c;
        while (true) {
            int i10 = this.f23880d;
            int i11 = this.f23881e;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f23880d = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f23880d = i12;
                        m29119v0();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f23882f++;
                            this.f23883r = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f23880d = i10;
                    if (!m29116l(1)) {
                        throw m29108J0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: D0 */
    private boolean m29105D0(String str) {
        int length = str.length();
        while (true) {
            if (this.f23880d + length > this.f23881e && !m29116l(length)) {
                return false;
            }
            char[] cArr = this.f23879c;
            int i10 = this.f23880d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f23879c[this.f23880d + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f23882f++;
            this.f23883r = i10 + 1;
            this.f23880d++;
        }
    }

    /* renamed from: F0 */
    private void m29106F0() {
        char c10;
        do {
            if (this.f23880d >= this.f23881e && !m29116l(1)) {
                return;
            }
            char[] cArr = this.f23879c;
            int i10 = this.f23880d;
            int i11 = i10 + 1;
            this.f23880d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f23882f++;
                this.f23883r = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: H0 */
    private void m29107H0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f23880d
            int r2 = r1 + r0
            int r3 = r4.f23881e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f23879c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m29112e()
        L4b:
            int r1 = r4.f23880d
            int r1 = r1 + r0
            r4.f23880d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f23880d = r1
            r0 = 1
            boolean r0 = r4.m29116l(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C9712a.m29107H0():void");
    }

    /* renamed from: J0 */
    private IOException m29108J0(String str) {
        throw new C9715d(str + m29121B());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r1 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r7.f23880d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r7.f23880d = r4 - 1;
        r2 = m29116l(2);
        r7.f23880d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        m29112e();
        r2 = r7.f23880d;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r3 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r7.f23880d = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        if (m29105D0("*\/") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        throw m29108J0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        if (r3 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        r7.f23880d = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r7.f23880d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r1 != '#') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        m29112e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        return r1;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m29109R(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f23879c
        L2:
            int r1 = r7.f23880d
        L4:
            int r2 = r7.f23881e
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f23880d = r1
            boolean r1 = r7.m29116l(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.m29121B()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f23880d
            int r2 = r7.f23881e
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f23882f
            int r1 = r1 + r3
            r7.f23882f = r1
            r7.f23883r = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f23880d = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f23880d = r4
            boolean r2 = r7.m29116l(r6)
            int r4 = r7.f23880d
            int r4 = r4 + r3
            r7.f23880d = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.m29112e()
            int r2 = r7.f23880d
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f23880d = r2
        L7c:
            r7.m29106F0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f23880d = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.m29105D0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f23880d
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.m29108J0(r8)
            throw r8
        L98:
            r2 = 35
            r7.f23880d = r4
            if (r1 != r2) goto La2
            r7.m29112e()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C9712a.m29109R(boolean):int");
    }

    /* renamed from: U */
    private String m29110U(char c10) {
        char[] cArr = this.f23879c;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f23880d;
            int i11 = this.f23881e;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f23880d = i12;
                        int i13 = (i12 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i13);
                        }
                        sb2.append(cArr, i10, i13);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f23880d = i12;
                        int i14 = (i12 - i10) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                        }
                        sb2.append(cArr, i10, i14);
                        sb2.append(m29119v0());
                    } else {
                        if (c11 == '\n') {
                            this.f23882f++;
                            this.f23883r = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb2.append(cArr, i10, i10 - i10);
                    this.f23880d = i10;
                    if (!m29116l(1)) {
                        throw m29108J0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m29112e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m29111c0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f23880d
            int r4 = r3 + r2
            int r5 = r6.f23881e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f23879c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m29112e()
            goto L5c
        L4e:
            char[] r3 = r6.f23879c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m29116l(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f23879c
            int r4 = r6.f23880d
            r0.append(r3, r4, r2)
            int r3 = r6.f23880d
            int r3 = r3 + r2
            r6.f23880d = r3
            r2 = 1
            boolean r2 = r6.m29116l(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f23879c
            int r3 = r6.f23880d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f23879c
            int r3 = r6.f23880d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f23880d
            int r2 = r2 + r1
            r6.f23880d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C9712a.m29111c0():java.lang.String");
    }

    /* renamed from: e */
    private void m29112e() {
        if (!this.f23878b) {
            throw m29108J0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: f */
    private void m29113f() {
        m29109R(true);
        int i10 = this.f23880d - 1;
        this.f23880d = i10;
        if (i10 + 5 <= this.f23881e || m29116l(5)) {
            int i11 = this.f23880d;
            char[] cArr = this.f23879c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f23880d = i11 + 5;
            }
        }
    }

    /* renamed from: i0 */
    private int m29114i0() {
        String str;
        String str2;
        int i10;
        char c10 = this.f23879c[this.f23880d];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f23880d + i11 >= this.f23881e && !m29116l(i11 + 1)) {
                return 0;
            }
            char c11 = this.f23879c[this.f23880d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f23880d + length < this.f23881e || m29116l(length + 1)) && m29120y(this.f23879c[this.f23880d + length])) {
            return 0;
        }
        this.f23880d += length;
        this.f23884s = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r18.f23885t = r11;
        r18.f23880d += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        r18.f23884s = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r18.f23886u = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0091, code lost:
    
        if (m29120y(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c7, code lost:
    
        return 0;
     */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m29115j0() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C9712a.m29115j0():int");
    }

    /* renamed from: l */
    private boolean m29116l(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f23879c;
        int i13 = this.f23883r;
        int i14 = this.f23880d;
        this.f23883r = i13 - i14;
        int i15 = this.f23881e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f23881e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f23881e = 0;
        }
        this.f23880d = 0;
        do {
            Reader reader = this.f23877a;
            int i17 = this.f23881e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f23881e + read;
            this.f23881e = i11;
            if (this.f23882f == 0 && (i12 = this.f23883r) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f23880d++;
                this.f23883r = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* renamed from: m0 */
    private void m29117m0(int i10) {
        int i11 = this.f23889x;
        int[] iArr = this.f23888w;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f23888w = Arrays.copyOf(iArr, i12);
            this.f23891z = Arrays.copyOf(this.f23891z, i12);
            this.f23890y = (String[]) Arrays.copyOf(this.f23890y, i12);
        }
        int[] iArr2 = this.f23888w;
        int i13 = this.f23889x;
        this.f23889x = i13 + 1;
        iArr2[i13] = i10;
    }

    /* renamed from: n */
    private String m29118n(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f23889x;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f23888w[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f23891z[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f23890y[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    /* renamed from: v0 */
    private char m29119v0() {
        int i10;
        int i11;
        if (this.f23880d == this.f23881e && !m29116l(1)) {
            throw m29108J0("Unterminated escape sequence");
        }
        char[] cArr = this.f23879c;
        int i12 = this.f23880d;
        int i13 = i12 + 1;
        this.f23880d = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f23882f++;
            this.f23883r = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw m29108J0("Invalid escape sequence");
            }
            if (i13 + 4 > this.f23881e && !m29116l(4)) {
                throw m29108J0("Unterminated escape sequence");
            }
            int i14 = this.f23880d;
            int i15 = i14 + 4;
            char c11 = 0;
            while (i14 < i15) {
                char c12 = this.f23879c[i14];
                char c13 = (char) (c11 << 4);
                if (c12 < '0' || c12 > '9') {
                    if (c12 >= 'a' && c12 <= 'f') {
                        i10 = c12 - 'a';
                    } else {
                        if (c12 < 'A' || c12 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f23879c, this.f23880d, 4));
                        }
                        i10 = c12 - 'A';
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = c12 - '0';
                }
                c11 = (char) (c13 + i11);
                i14++;
            }
            this.f23880d += 4;
            return c11;
        }
        return c10;
    }

    /* renamed from: y */
    private boolean m29120y(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m29112e();
        return false;
    }

    /* renamed from: B */
    String m29121B() {
        return " at line " + (this.f23882f + 1) + " column " + ((this.f23880d - this.f23883r) + 1) + " path " + mo18211f0();
    }

    /* renamed from: E */
    public boolean mo18199E() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 5) {
            this.f23884s = 0;
            int[] iArr = this.f23891z;
            int i11 = this.f23889x - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f23884s = 0;
            int[] iArr2 = this.f23891z;
            int i12 = this.f23889x - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + mo18212h0() + m29121B());
    }

    /* renamed from: H */
    public double mo18200H() {
        String m29110U;
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 15) {
            this.f23884s = 0;
            int[] iArr = this.f23891z;
            int i11 = this.f23889x - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f23885t;
        }
        if (i10 == 16) {
            this.f23887v = new String(this.f23879c, this.f23880d, this.f23886u);
            this.f23880d += this.f23886u;
        } else {
            if (i10 == 8 || i10 == 9) {
                m29110U = m29110U(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                m29110U = m29111c0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + mo18212h0() + m29121B());
            }
            this.f23887v = m29110U;
        }
        this.f23884s = 11;
        double parseDouble = Double.parseDouble(this.f23887v);
        if (!this.f23878b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C9715d("JSON forbids NaN and infinities: " + parseDouble + m29121B());
        }
        this.f23887v = null;
        this.f23884s = 0;
        int[] iArr2 = this.f23891z;
        int i12 = this.f23889x - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    /* renamed from: I */
    public int mo18201I() {
        String m29110U;
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 15) {
            long j10 = this.f23885t;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f23884s = 0;
                int[] iArr = this.f23891z;
                int i12 = this.f23889x - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f23885t + m29121B());
        }
        if (i10 == 16) {
            this.f23887v = new String(this.f23879c, this.f23880d, this.f23886u);
            this.f23880d += this.f23886u;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + mo18212h0() + m29121B());
            }
            if (i10 == 10) {
                m29110U = m29111c0();
            } else {
                m29110U = m29110U(i10 == 8 ? '\'' : '\"');
            }
            this.f23887v = m29110U;
            try {
                int parseInt = Integer.parseInt(this.f23887v);
                this.f23884s = 0;
                int[] iArr2 = this.f23891z;
                int i13 = this.f23889x - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23884s = 11;
        double parseDouble = Double.parseDouble(this.f23887v);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f23887v + m29121B());
        }
        this.f23887v = null;
        this.f23884s = 0;
        int[] iArr3 = this.f23891z;
        int i15 = this.f23889x - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    /* renamed from: I0 */
    public void mo18202I0() {
        char c10;
        int i10 = 0;
        do {
            int i11 = this.f23884s;
            if (i11 == 0) {
                i11 = m29122g();
            }
            if (i11 == 3) {
                m29117m0(1);
            } else if (i11 == 1) {
                m29117m0(3);
            } else {
                if (i11 == 4 || i11 == 2) {
                    this.f23889x--;
                    i10--;
                } else if (i11 == 14 || i11 == 10) {
                    m29107H0();
                } else {
                    if (i11 == 8 || i11 == 12) {
                        c10 = '\'';
                    } else if (i11 == 9 || i11 == 13) {
                        c10 = '\"';
                    } else if (i11 == 16) {
                        this.f23880d += this.f23886u;
                    }
                    m29104B0(c10);
                }
                this.f23884s = 0;
            }
            i10++;
            this.f23884s = 0;
        } while (i10 != 0);
        int[] iArr = this.f23891z;
        int i12 = this.f23889x;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f23890y[i12 - 1] = "null";
    }

    /* renamed from: O */
    public long mo18203O() {
        String m29110U;
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 15) {
            this.f23884s = 0;
            int[] iArr = this.f23891z;
            int i11 = this.f23889x - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f23885t;
        }
        if (i10 == 16) {
            this.f23887v = new String(this.f23879c, this.f23880d, this.f23886u);
            this.f23880d += this.f23886u;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + mo18212h0() + m29121B());
            }
            if (i10 == 10) {
                m29110U = m29111c0();
            } else {
                m29110U = m29110U(i10 == 8 ? '\'' : '\"');
            }
            this.f23887v = m29110U;
            try {
                long parseLong = Long.parseLong(this.f23887v);
                this.f23884s = 0;
                int[] iArr2 = this.f23891z;
                int i12 = this.f23889x - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23884s = 11;
        double parseDouble = Double.parseDouble(this.f23887v);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f23887v + m29121B());
        }
        this.f23887v = null;
        this.f23884s = 0;
        int[] iArr3 = this.f23891z;
        int i13 = this.f23889x - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    /* renamed from: Q */
    public String mo18204Q() {
        char c10;
        String m29110U;
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 14) {
            m29110U = m29111c0();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else {
                if (i10 != 13) {
                    throw new IllegalStateException("Expected a name but was " + mo18212h0() + m29121B());
                }
                c10 = '\"';
            }
            m29110U = m29110U(c10);
        }
        this.f23884s = 0;
        this.f23890y[this.f23889x - 1] = m29110U;
        return m29110U;
    }

    /* renamed from: S */
    public void mo18206S() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 7) {
            this.f23884s = 0;
            int[] iArr = this.f23891z;
            int i11 = this.f23889x - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo18212h0() + m29121B());
    }

    /* renamed from: a */
    public void mo18208a() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 3) {
            m29117m0(1);
            this.f23891z[this.f23889x - 1] = 0;
            this.f23884s = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo18212h0() + m29121B());
        }
    }

    /* renamed from: a0 */
    public String mo18209a0() {
        String str;
        char c10;
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 10) {
            str = m29111c0();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f23887v;
                this.f23887v = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f23885t);
            } else {
                if (i10 != 16) {
                    throw new IllegalStateException("Expected a string but was " + mo18212h0() + m29121B());
                }
                str = new String(this.f23879c, this.f23880d, this.f23886u);
                this.f23880d += this.f23886u;
            }
            str = m29110U(c10);
        }
        this.f23884s = 0;
        int[] iArr = this.f23891z;
        int i11 = this.f23889x - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* renamed from: b */
    public void mo18210b() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 == 1) {
            m29117m0(3);
            this.f23884s = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo18212h0() + m29121B());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23884s = 0;
        this.f23888w[0] = 8;
        this.f23889x = 1;
        this.f23877a.close();
    }

    /* renamed from: f0 */
    public String mo18211f0() {
        return m29118n(false);
    }

    /* renamed from: g */
    int m29122g() {
        int i10;
        int m29109R;
        int[] iArr = this.f23888w;
        int i11 = this.f23889x;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else {
            if (i12 != 2) {
                if (i12 == 3 || i12 == 5) {
                    iArr[i11 - 1] = 4;
                    if (i12 == 5 && (m29109R = m29109R(true)) != 44) {
                        if (m29109R != 59) {
                            if (m29109R != 125) {
                                throw m29108J0("Unterminated object");
                            }
                            this.f23884s = 2;
                            return 2;
                        }
                        m29112e();
                    }
                    int m29109R2 = m29109R(true);
                    if (m29109R2 == 34) {
                        i10 = 13;
                    } else if (m29109R2 == 39) {
                        m29112e();
                        i10 = 12;
                    } else {
                        if (m29109R2 == 125) {
                            if (i12 == 5) {
                                throw m29108J0("Expected name");
                            }
                            this.f23884s = 2;
                            return 2;
                        }
                        m29112e();
                        this.f23880d--;
                        if (!m29120y((char) m29109R2)) {
                            throw m29108J0("Expected name");
                        }
                        i10 = 14;
                    }
                } else if (i12 == 4) {
                    iArr[i11 - 1] = 5;
                    int m29109R3 = m29109R(true);
                    if (m29109R3 != 58) {
                        if (m29109R3 != 61) {
                            throw m29108J0("Expected ':'");
                        }
                        m29112e();
                        if (this.f23880d < this.f23881e || m29116l(1)) {
                            char[] cArr = this.f23879c;
                            int i13 = this.f23880d;
                            if (cArr[i13] == '>') {
                                this.f23880d = i13 + 1;
                            }
                        }
                    }
                } else if (i12 == 6) {
                    if (this.f23878b) {
                        m29113f();
                    }
                    this.f23888w[this.f23889x - 1] = 7;
                } else if (i12 == 7) {
                    if (m29109R(false) == -1) {
                        i10 = 17;
                    } else {
                        m29112e();
                        this.f23880d--;
                    }
                } else if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f23884s = i10;
                return i10;
            }
            int m29109R4 = m29109R(true);
            if (m29109R4 != 44) {
                if (m29109R4 != 59) {
                    if (m29109R4 != 93) {
                        throw m29108J0("Unterminated array");
                    }
                    this.f23884s = 4;
                    return 4;
                }
                m29112e();
            }
        }
        int m29109R5 = m29109R(true);
        if (m29109R5 != 34) {
            if (m29109R5 == 39) {
                m29112e();
                this.f23884s = 8;
                return 8;
            }
            if (m29109R5 != 44 && m29109R5 != 59) {
                if (m29109R5 == 91) {
                    this.f23884s = 3;
                    return 3;
                }
                if (m29109R5 != 93) {
                    if (m29109R5 == 123) {
                        this.f23884s = 1;
                        return 1;
                    }
                    this.f23880d--;
                    int m29114i0 = m29114i0();
                    if (m29114i0 != 0) {
                        return m29114i0;
                    }
                    int m29115j0 = m29115j0();
                    if (m29115j0 != 0) {
                        return m29115j0;
                    }
                    if (!m29120y(this.f23879c[this.f23880d])) {
                        throw m29108J0("Expected value");
                    }
                    m29112e();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.f23884s = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw m29108J0("Unexpected value");
            }
            m29112e();
            this.f23880d--;
            this.f23884s = 7;
            return 7;
        }
        i10 = 9;
        this.f23884s = i10;
        return i10;
    }

    /* renamed from: h0 */
    public EnumC9713b mo18212h0() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        switch (i10) {
            case 1:
                return EnumC9713b.BEGIN_OBJECT;
            case 2:
                return EnumC9713b.END_OBJECT;
            case 3:
                return EnumC9713b.BEGIN_ARRAY;
            case 4:
                return EnumC9713b.END_ARRAY;
            case 5:
            case 6:
                return EnumC9713b.BOOLEAN;
            case 7:
                return EnumC9713b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC9713b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC9713b.NAME;
            case 15:
            case 16:
                return EnumC9713b.NUMBER;
            case 17:
                return EnumC9713b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: i */
    public void mo18213i() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + mo18212h0() + m29121B());
        }
        int i11 = this.f23889x - 1;
        this.f23889x = i11;
        int[] iArr = this.f23891z;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f23884s = 0;
    }

    /* renamed from: j */
    public void mo18214j() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + mo18212h0() + m29121B());
        }
        int i11 = this.f23889x - 1;
        this.f23889x = i11;
        this.f23890y[i11] = null;
        int[] iArr = this.f23891z;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f23884s = 0;
    }

    /* renamed from: o */
    public String mo18215o() {
        return m29118n(true);
    }

    /* renamed from: q */
    public boolean mo18216q() {
        int i10 = this.f23884s;
        if (i10 == 0) {
            i10 = m29122g();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    /* renamed from: r */
    public final boolean m29123r() {
        return this.f23878b;
    }

    public String toString() {
        return getClass().getSimpleName() + m29121B();
    }

    /* renamed from: z0 */
    public final void m29124z0(boolean z10) {
        this.f23878b = z10;
    }
}
