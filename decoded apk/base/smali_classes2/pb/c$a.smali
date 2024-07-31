.class Lpb/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpb/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljb/v<",
            "Ljb/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ltb/b$a;

.field private final c:Ltb/b$a;


# direct methods
.method public constructor <init>(Ljb/v;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb/v<",
            "Ljb/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/c$a;->a:Ljb/v;

    invoke-virtual {p1}, Ljb/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/internal/g;->b()Lcom/google/crypto/tink/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/g;->a()Ltb/b;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/internal/f;->a(Ljb/v;)Ltb/c;

    move-result-object p1

    const-string v1, "encrypt"

    const-string v2, "daead"

    invoke-interface {v0, p1, v2, v1}, Ltb/b;->a(Ltb/c;Ljava/lang/String;Ljava/lang/String;)Ltb/b$a;

    move-result-object v1

    iput-object v1, p0, Lpb/c$a;->b:Ltb/b$a;

    const-string v1, "decrypt"

    invoke-interface {v0, p1, v2, v1}, Ltb/b;->a(Ltb/c;Ljava/lang/String;Ljava/lang/String;)Ltb/b$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/crypto/tink/internal/f;->a:Ltb/b$a;

    iput-object p1, p0, Lpb/c$a;->b:Ltb/b$a;

    :goto_0
    iput-object p1, p0, Lpb/c$a;->c:Ltb/b$a;

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    const/4 v0, 0x2

    :try_start_0
    new-array v0, v0, [[B

    iget-object v1, p0, Lpb/c$a;->a:Ljb/v;

    invoke-virtual {v1}, Ljb/v;->e()Ljb/v$c;

    move-result-object v1

    invoke-virtual {v1}, Ljb/v$c;->b()[B

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lpb/c$a;->a:Ljb/v;

    invoke-virtual {v1}, Ljb/v;->e()Ljb/v$c;

    move-result-object v1

    invoke-virtual {v1}, Ljb/v$c;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljb/e;

    invoke-interface {v1, p1, p2}, Ljb/e;->a([B[B)[B

    move-result-object p2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    invoke-static {v0}, Lwb/f;->a([[B)[B

    move-result-object p2

    iget-object v0, p0, Lpb/c$a;->b:Ltb/b$a;

    iget-object v1, p0, Lpb/c$a;->a:Ljb/v;

    invoke-virtual {v1}, Ljb/v;->e()Ljb/v$c;

    move-result-object v1

    invoke-virtual {v1}, Ljb/v$c;->d()I

    move-result v1

    array-length p1, p1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Ltb/b$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    iget-object p2, p0, Lpb/c$a;->b:Ltb/b$a;

    invoke-interface {p2}, Ltb/b$a;->b()V

    throw p1
.end method

.method public b([B[B)[B
    .locals 7

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget-object v2, p0, Lpb/c$a;->a:Ljb/v;

    invoke-virtual {v2, v0}, Ljb/v;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljb/v$c;

    :try_start_0
    invoke-virtual {v2}, Ljb/v$c;->g()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljb/e;

    invoke-interface {v3, v1, p2}, Ljb/e;->b([B[B)[B

    move-result-object v3

    iget-object v4, p0, Lpb/c$a;->c:Ltb/b$a;

    invoke-virtual {v2}, Ljb/v$c;->d()I

    move-result v2

    array-length v5, v1

    int-to-long v5, v5

    invoke-interface {v4, v2, v5, v6}, Ltb/b$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v2

    invoke-static {}, Lpb/c;->d()Ljava/util/logging/Logger;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ciphertext prefix matches a key, but cannot decrypt: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpb/c$a;->a:Ljb/v;

    invoke-virtual {v0}, Ljb/v;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljb/v$c;

    :try_start_1
    invoke-virtual {v1}, Ljb/v$c;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljb/e;

    invoke-interface {v2, p1, p2}, Ljb/e;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lpb/c$a;->c:Ltb/b$a;

    invoke-virtual {v1}, Ljb/v$c;->d()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Ltb/b$a;->a(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :cond_1
    iget-object p1, p0, Lpb/c$a;->c:Ltb/b$a;

    invoke-interface {p1}, Ltb/b$a;->b()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
