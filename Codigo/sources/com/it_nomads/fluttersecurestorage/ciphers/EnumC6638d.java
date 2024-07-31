package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.d */
/* loaded from: classes.dex */
enum EnumC6638d {
    RSA_ECB_PKCS1Padding(new InterfaceC6639e() { // from class: com.it_nomads.fluttersecurestorage.ciphers.b
        @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6639e
        /* renamed from: a */
        public final InterfaceC6635a mo19362a(Context context) {
            return new C6640f(context);
        }
    }, 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new InterfaceC6639e() { // from class: com.it_nomads.fluttersecurestorage.ciphers.c
        @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6639e
        /* renamed from: a */
        public final InterfaceC6635a mo19362a(Context context) {
            return new C6641g(context);
        }
    }, 23);

    final InterfaceC6639e keyCipher;
    final int minVersionCode;

    EnumC6638d(InterfaceC6639e interfaceC6639e, int i10) {
        this.keyCipher = interfaceC6639e;
        this.minVersionCode = i10;
    }
}
