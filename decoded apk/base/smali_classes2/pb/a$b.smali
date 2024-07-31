.class Lpb/a$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpb/a;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/q;",
        "Lvb/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lpb/a;


# direct methods
.method constructor <init>(Lpb/a;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lpb/a$b;->b:Lpb/a;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/q;

    invoke-virtual {p0, p1}, Lpb/a$b;->f(Lvb/q;)Lvb/p;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/q;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/q;->Y()Lvb/q$b;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v2, v3}, Lvb/q$b;->A(I)Lvb/q$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lvb/q;

    sget-object v4, Ljb/l$b;->TINK:Ljb/l$b;

    invoke-direct {v1, v2, v4}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "AES256_SIV"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/q;->Y()Lvb/q$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lvb/q$b;->A(I)Lvb/q$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lvb/q;

    sget-object v3, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "AES256_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lpb/a$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/q;

    invoke-virtual {p0, p1}, Lpb/a$b;->h(Lvb/q;)V

    return-void
.end method

.method public f(Lvb/q;)Lvb/p;
    .locals 1

    invoke-static {}, Lvb/p;->a0()Lvb/p$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/q;->X()I

    move-result p1

    invoke-static {p1}, Lwb/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/p$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/p$b;

    move-result-object p1

    iget-object v0, p0, Lpb/a$b;->b:Lpb/a;

    invoke-virtual {v0}, Lpb/a;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/p$b;->B(I)Lvb/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/p;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/q;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/q;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/q;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/q;)V
    .locals 4

    invoke-virtual {p1}, Lvb/q;->X()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid key size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvb/q;->X()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
