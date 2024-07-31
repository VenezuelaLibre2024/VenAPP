.class Ljb/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/j;->b(Lcom/google/crypto/tink/internal/d;)Ljb/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/crypto/tink/internal/d;


# direct methods
.method constructor <init>(Lcom/google/crypto/tink/internal/d;)V
    .locals 0

    iput-object p1, p0, Ljb/j$a;->a:Lcom/google/crypto/tink/internal/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/j$a;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/j$a;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/d;->i()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Class;)Ljb/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TQ;>;)",
            "Ljb/h<",
            "TQ;>;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ljb/i;

    iget-object v1, p0, Ljb/j$a;->a:Lcom/google/crypto/tink/internal/d;

    invoke-direct {v0, v1, p1}, Ljb/i;-><init>(Lcom/google/crypto/tink/internal/d;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Primitive type not supported"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public d()Ljb/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljb/h<",
            "*>;"
        }
    .end annotation

    new-instance v0, Ljb/i;

    iget-object v1, p0, Ljb/j$a;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/d;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljb/i;-><init>(Lcom/google/crypto/tink/internal/d;Ljava/lang/Class;)V

    return-object v0
.end method
