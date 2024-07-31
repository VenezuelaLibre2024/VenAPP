package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;

/* loaded from: classes.dex */
enum l {
    AES_CBC_PKCS7Padding(new n() { // from class: com.it_nomads.fluttersecurestorage.ciphers.j
        @Override // com.it_nomads.fluttersecurestorage.ciphers.n
        public final i a(Context context, a aVar) {
            return new h(context, aVar);
        }
    }, 1),
    AES_GCM_NoPadding(new n() { // from class: com.it_nomads.fluttersecurestorage.ciphers.k
        @Override // com.it_nomads.fluttersecurestorage.ciphers.n
        public final i a(Context context, a aVar) {
            return new o(context, aVar);
        }
    }, 23);

    final int minVersionCode;
    final n storageCipher;

    l(n nVar, int i10) {
        this.storageCipher = nVar;
        this.minVersionCode = i10;
    }
}
