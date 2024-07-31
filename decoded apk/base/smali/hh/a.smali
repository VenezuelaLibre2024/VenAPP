.class public Lhh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/nio/charset/Charset;

.field private final c:Landroid/content/Context;

.field protected d:Ljava/lang/String;

.field protected e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Landroid/content/SharedPreferences;

.field private h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

.field private i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

.field private j:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SecureStorageAndroid"

    iput-object v0, p0, Lhh/a;->a:Ljava/lang/String;

    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg"

    iput-object v0, p0, Lhh/a;->d:Ljava/lang/String;

    const-string v0, "FlutterSecureStorage"

    iput-object v0, p0, Lhh/a;->f:Ljava/lang/String;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lhh/a;->j:Ljava/lang/Boolean;

    iput-object p2, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lhh/a;->c:Landroid/content/Context;

    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iput-object p1, p0, Lhh/a;->b:Ljava/nio/charset/Charset;

    return-void
.end method

.method private b(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)V
    .locals 4

    :try_start_0
    invoke-interface {p1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lhh/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lhh/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object p2, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    invoke-virtual {p2, p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->d(Landroid/content/SharedPreferences$Editor;)V

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "SecureStorageAndroid"

    const-string v0, "Data migration failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    iget-object v0, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    invoke-interface {v0, p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/i;->b([B)[B

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lhh/a;->b:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method private g()V
    .locals 4

    invoke-virtual {p0}, Lhh/a;->h()V

    iget-object v0, p0, Lhh/a;->c:Landroid/content/Context;

    iget-object v1, p0, Lhh/a;->f:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    const-string v2, "SecureStorageAndroid"

    if-nez v1, :cond_0

    :try_start_0
    invoke-direct {p0, v0}, Lhh/a;->k(Landroid/content/SharedPreferences;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v3, "StorageCipher initialization failed"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    invoke-direct {p0}, Lhh/a;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v1, p0, Lhh/a;->c:Landroid/content/Context;

    invoke-direct {p0, v1}, Lhh/a;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    invoke-direct {p0, v0, v1}, Lhh/a;->b(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v3, "EncryptedSharedPreferences initialization failed"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lhh/a;->j:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    iput-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    :goto_1
    return-void
.end method

.method private j()Z
    .locals 3

    iget-object v0, p0, Lhh/a;->j:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    const-string v2, "encryptedSharedPreferences"

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private k(Landroid/content/SharedPreferences;)V
    .locals 2

    new-instance v0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    iget-object v1, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-direct {v0, p1, v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;-><init>(Landroid/content/SharedPreferences;Ljava/util/Map;)V

    iput-object v0, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    invoke-direct {p0}, Lhh/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    iget-object v0, p0, Lhh/a;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    invoke-virtual {v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    invoke-direct {p0, v0, p1}, Lhh/a;->m(Lcom/it_nomads/fluttersecurestorage/ciphers/m;Landroid/content/SharedPreferences;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    iget-object v0, p0, Lhh/a;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->a(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method private l(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 4

    new-instance v0, Landroidx/security/crypto/c$a;

    invoke-direct {v0, p1}, Landroidx/security/crypto/c$a;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const-string v2, "_androidx_security_master_key_"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const-string v2, "NoPadding"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    const-string v2, "GCM"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    const/16 v2, 0x100

    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/security/crypto/c$a;->b(Landroid/security/keystore/KeyGenParameterSpec;)Landroidx/security/crypto/c$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/security/crypto/c$a;->a()Landroidx/security/crypto/c;

    move-result-object v0

    iget-object v1, p0, Lhh/a;->f:Ljava/lang/String;

    sget-object v2, Landroidx/security/crypto/a$d;->AES256_SIV:Landroidx/security/crypto/a$d;

    sget-object v3, Landroidx/security/crypto/a$e;->AES256_GCM:Landroidx/security/crypto/a$e;

    invoke-static {p1, v1, v0, v2, v3}, Landroidx/security/crypto/a;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/security/crypto/c;Landroidx/security/crypto/a$d;Landroidx/security/crypto/a$e;)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method private m(Lcom/it_nomads/fluttersecurestorage/ciphers/m;Landroid/content/SharedPreferences;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lhh/a;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object v0

    iput-object v0, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lhh/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    check-cast v3, Ljava/lang/String;

    invoke-direct {p0, v3}, Lhh/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lhh/a;->c:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->a(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object v1

    iput-object v1, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lhh/a;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/it_nomads/fluttersecurestorage/ciphers/i;->a([B)[B

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->f(Landroid/content/SharedPreferences$Editor;)V

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    const-string v0, "SecureStorageAndroid"

    const-string v1, "re-encryption failed"

    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p2, p0, Lhh/a;->c:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object p1

    iput-object p1, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    :goto_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lhh/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0}, Lhh/a;->g()V

    iget-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lhh/a;->g()V

    iget-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public f()V
    .locals 2

    invoke-direct {p0}, Lhh/a;->g()V

    iget-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-direct {p0}, Lhh/a;->j()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lhh/a;->i:Lcom/it_nomads/fluttersecurestorage/ciphers/m;

    invoke-virtual {v1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->f(Landroid/content/SharedPreferences$Editor;)V

    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method protected h()V
    .locals 2

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    const-string v1, "sharedPreferencesName"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lhh/a;->f:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    const-string v1, "preferencesKeyPrefix"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lhh/a;->d:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method i()Z
    .locals 2

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    const-string v1, "resetOnError"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhh/a;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lhh/a;->g()V

    iget-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lhh/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lhh/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lhh/a;->g()V

    iget-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lhh/a;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lhh/a;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5f

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lhh/a;->j()Z

    move-result v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0, v2}, Lhh/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Lhh/a;->g()V

    iget-object v0, p0, Lhh/a;->g:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0}, Lhh/a;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lhh/a;->h:Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    iget-object v2, p0, Lhh/a;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-interface {v1, p2}, Lcom/it_nomads/fluttersecurestorage/ciphers/i;->a([B)[B

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {p2, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
