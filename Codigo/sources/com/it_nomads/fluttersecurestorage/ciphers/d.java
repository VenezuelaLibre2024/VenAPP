package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;

/* loaded from: classes.dex */
enum d {
    RSA_ECB_PKCS1Padding(new e() { // from class: com.it_nomads.fluttersecurestorage.ciphers.b
        @Override // com.it_nomads.fluttersecurestorage.ciphers.e
        public final a a(Context context) {
            return new f(context);
        }
    }, 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new e() { // from class: com.it_nomads.fluttersecurestorage.ciphers.c
        @Override // com.it_nomads.fluttersecurestorage.ciphers.e
        public final a a(Context context) {
            return new g(context);
        }
    }, 23);

    final e keyCipher;
    final int minVersionCode;

    d(e eVar, int i10) {
        this.keyCipher = eVar;
        this.minVersionCode = i10;
    }
}
