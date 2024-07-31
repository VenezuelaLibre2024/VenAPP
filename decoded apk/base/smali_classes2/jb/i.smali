.class Ljb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljb/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PrimitiveT:",
        "Ljava/lang/Object;",
        "KeyProtoT::",
        "Lcom/google/crypto/tink/shaded/protobuf/r0;",
        ">",
        "Ljava/lang/Object;",
        "Ljb/h<",
        "TPrimitiveT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/crypto/tink/internal/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/d<",
            "TKeyProtoT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TPrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/internal/d;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/internal/d<",
            "TKeyProtoT;>;",
            "Ljava/lang/Class<",
            "TPrimitiveT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/crypto/tink/internal/d;->i()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Void;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Given internalKeyMananger %s does not support primitive class %s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    iput-object p2, p0, Ljb/i;->b:Ljava/lang/Class;

    return-void
.end method

.method private e()Ljb/i$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljb/i$a<",
            "*TKeyProtoT;>;"
        }
    .end annotation

    new-instance v0, Ljb/i$a;

    iget-object v1, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/d;->f()Lcom/google/crypto/tink/internal/d$a;

    move-result-object v1

    invoke-direct {v0, v1}, Ljb/i$a;-><init>(Lcom/google/crypto/tink/internal/d$a;)V

    return-object v0
.end method

.method private f(Lcom/google/crypto/tink/shaded/protobuf/r0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyProtoT;)TPrimitiveT;"
        }
    .end annotation

    const-class v0, Ljava/lang/Void;

    iget-object v1, p0, Ljb/i;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/d;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    iget-object v0, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    iget-object v1, p0, Ljb/i;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/internal/d;->e(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Cannot create a primitive for Void"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/y;
    .locals 2

    :try_start_0
    invoke-direct {p0}, Ljb/i;->e()Ljb/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljb/i$a;->a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1

    invoke-static {}, Lvb/y;->d0()Lvb/y$b;

    move-result-object v0

    invoke-virtual {p0}, Ljb/i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/y$b;->B(Ljava/lang/String;)Lvb/y$b;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/r0;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/y$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/y$b;

    move-result-object p1

    iget-object v0, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/d;->g()Lvb/y$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvb/y$b;->A(Lvb/y$c;)Lvb/y$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/y;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Unexpected proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/d;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/h;",
            ")TPrimitiveT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/d;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1

    invoke-direct {p0, p1}, Ljb/i;->f(Lcom/google/crypto/tink/shaded/protobuf/r0;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failures parsing proto of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/d;->c()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 3

    :try_start_0
    invoke-direct {p0}, Ljb/i;->e()Ljb/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljb/i$a;->a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failures parsing proto of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljb/i;->a:Lcom/google/crypto/tink/internal/d;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/d;->f()Lcom/google/crypto/tink/internal/d$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/d$a;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
