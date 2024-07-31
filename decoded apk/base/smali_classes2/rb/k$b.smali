.class Lrb/k$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrb/k;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/w;",
        "Lvb/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lrb/k;


# direct methods
.method constructor <init>(Lrb/k;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lrb/k$b;->b:Lrb/k;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/w;

    invoke-virtual {p0, p1}, Lrb/k$b;->f(Lvb/w;)Lvb/v;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/w;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lvb/u;->SHA256:Lvb/u;

    sget-object v2, Ljb/l$b;->TINK:Ljb/l$b;

    const/16 v3, 0x20

    const/16 v4, 0x10

    invoke-static {v3, v4, v1, v2}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v5

    const-string v6, "HMAC_SHA256_128BITTAG"

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-static {v3, v4, v1, v5}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "HMAC_SHA256_256BITTAG"

    invoke-static {v3, v3, v1, v2}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v7

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-static {v3, v3, v1, v5}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lvb/u;->SHA512:Lvb/u;

    const/16 v6, 0x40

    invoke-static {v6, v4, v1, v2}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v7

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-static {v6, v4, v1, v5}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v4

    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "HMAC_SHA512_256BITTAG"

    invoke-static {v6, v3, v1, v2}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v7

    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "HMAC_SHA512_256BITTAG_RAW"

    invoke-static {v6, v3, v1, v5}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "HMAC_SHA512_512BITTAG"

    invoke-static {v6, v6, v1, v2}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-static {v6, v6, v1, v5}, Lrb/k;->l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lrb/k$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/w;

    invoke-virtual {p0, p1}, Lrb/k$b;->h(Lvb/w;)V

    return-void
.end method

.method public f(Lvb/w;)Lvb/v;
    .locals 2

    invoke-static {}, Lvb/v;->d0()Lvb/v$b;

    move-result-object v0

    iget-object v1, p0, Lrb/k$b;->b:Lrb/k;

    invoke-virtual {v1}, Lrb/k;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Lvb/v$b;->C(I)Lvb/v$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/w;->a0()Lvb/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/v$b;->B(Lvb/x;)Lvb/v$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/w;->Z()I

    move-result p1

    invoke-static {p1}, Lwb/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/v$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/v$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/v;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/w;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/w;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/w;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/w;)V
    .locals 2

    invoke-virtual {p1}, Lvb/w;->Z()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lvb/w;->a0()Lvb/x;

    move-result-object p1

    invoke-static {p1}, Lrb/k;->k(Lvb/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
