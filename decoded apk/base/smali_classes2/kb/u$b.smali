.class Lkb/u$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/u;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/o;",
        "Lvb/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/u;


# direct methods
.method constructor <init>(Lkb/u;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/u$b;->b:Lkb/u;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/o;

    invoke-virtual {p0, p1}, Lkb/u$b;->f(Lvb/o;)Lvb/n;

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
            "Lvb/o;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Ljb/l$b;->TINK:Ljb/l$b;

    const/16 v2, 0x10

    invoke-static {v2, v1}, Lkb/u;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v3

    const-string v4, "AES128_GCM_SIV"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-static {v2, v3}, Lkb/u;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x20

    invoke-static {v2, v1}, Lkb/u;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    const-string v4, "AES256_GCM_SIV"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM_SIV_RAW"

    invoke-static {v2, v3}, Lkb/u;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/u$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/o;

    invoke-virtual {p0, p1}, Lkb/u$b;->h(Lvb/o;)V

    return-void
.end method

.method public f(Lvb/o;)Lvb/n;
    .locals 1

    invoke-static {}, Lvb/n;->a0()Lvb/n$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/o;->X()I

    move-result p1

    invoke-static {p1}, Lwb/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/n$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/n$b;

    move-result-object p1

    iget-object v0, p0, Lkb/u$b;->b:Lkb/u;

    invoke-virtual {v0}, Lkb/u;->n()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/n$b;->B(I)Lvb/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/n;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/o;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/o;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/o;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/o;)V
    .locals 0

    invoke-virtual {p1}, Lvb/o;->X()I

    move-result p1

    invoke-static {p1}, Lwb/r;->a(I)V

    return-void
.end method
