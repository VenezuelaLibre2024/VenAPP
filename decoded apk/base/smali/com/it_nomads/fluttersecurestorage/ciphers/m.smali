.class public Lcom/it_nomads/fluttersecurestorage/ciphers/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

.field private static final f:Lcom/it_nomads/fluttersecurestorage/ciphers/l;


# instance fields
.field private final a:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

.field private final b:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

.field private final c:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

.field private final d:Lcom/it_nomads/fluttersecurestorage/ciphers/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->RSA_ECB_PKCS1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    sput-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->e:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    sget-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/l;->AES_CBC_PKCS7Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    sput-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->f:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->e:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FlutterSecureSAlgorithmKey"

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->valueOf(Ljava/lang/String;)Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    move-result-object v1

    iput-object v1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->a:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    sget-object v1, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->f:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const-string v3, "FlutterSecureSAlgorithmStorage"

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/l;->valueOf(Ljava/lang/String;)Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    move-result-object p1

    iput-object p1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->b:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    const-string p1, "keyCipherAlgorithm"

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p2, p1, v2}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->valueOf(Ljava/lang/String;)Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    move-result-object p1

    iget v2, p1, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->minVersionCode:I

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v2, v3, :cond_0

    move-object v0, p1

    :cond_0
    iput-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    const-string p1, "storageCipherAlgorithm"

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/l;->valueOf(Ljava/lang/String;)Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    move-result-object p1

    iget p2, p1, Lcom/it_nomads/fluttersecurestorage/ciphers/l;->minVersionCode:I

    if-gt p2, v3, :cond_1

    move-object v1, p1

    :cond_1
    iput-object v1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->d:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    return-void
.end method

.method private b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    :cond_0
    return-object p3
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;
    .locals 2

    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    iget-object v0, v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->keyCipher:Lcom/it_nomads/fluttersecurestorage/ciphers/e;

    invoke-interface {v0, p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/e;->a(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/a;

    move-result-object v0

    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->d:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    iget-object v1, v1, Lcom/it_nomads/fluttersecurestorage/ciphers/l;->storageCipher:Lcom/it_nomads/fluttersecurestorage/ciphers/n;

    invoke-interface {v1, p1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/n;->a(Landroid/content/Context;Lcom/it_nomads/fluttersecurestorage/ciphers/a;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;
    .locals 2

    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->a:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    iget-object v0, v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->keyCipher:Lcom/it_nomads/fluttersecurestorage/ciphers/e;

    invoke-interface {v0, p1}, Lcom/it_nomads/fluttersecurestorage/ciphers/e;->a(Landroid/content/Context;)Lcom/it_nomads/fluttersecurestorage/ciphers/a;

    move-result-object v0

    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->b:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    iget-object v1, v1, Lcom/it_nomads/fluttersecurestorage/ciphers/l;->storageCipher:Lcom/it_nomads/fluttersecurestorage/ciphers/n;

    invoke-interface {v1, p1, v0}, Lcom/it_nomads/fluttersecurestorage/ciphers/n;->a(Landroid/content/Context;Lcom/it_nomads/fluttersecurestorage/ciphers/a;)Lcom/it_nomads/fluttersecurestorage/ciphers/i;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/content/SharedPreferences$Editor;)V
    .locals 1

    const-string v0, "FlutterSecureSAlgorithmKey"

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v0, "FlutterSecureSAlgorithmStorage"

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->a:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->b:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->d:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->c:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterSecureSAlgorithmKey"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/m;->d:Lcom/it_nomads/fluttersecurestorage/ciphers/l;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterSecureSAlgorithmStorage"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
