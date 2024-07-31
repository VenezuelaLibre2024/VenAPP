.class Lkb/h$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/h;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/j;",
        "Lvb/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/h;


# direct methods
.method constructor <init>(Lkb/h;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/h$b;->b:Lkb/h;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/j;

    invoke-virtual {p0, p1}, Lkb/h$b;->f(Lvb/j;)Lvb/i;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/j;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Ljb/l$b;->TINK:Ljb/l$b;

    const/16 v2, 0x10

    invoke-static {v2, v2, v1}, Lkb/h;->k(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v3

    const-string v4, "AES128_EAX"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-static {v2, v2, v3}, Lkb/h;->k(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v4

    const-string v5, "AES128_EAX_RAW"

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x20

    invoke-static {v4, v2, v1}, Lkb/h;->k(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    const-string v5, "AES256_EAX"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_EAX_RAW"

    invoke-static {v4, v2, v3}, Lkb/h;->k(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/h$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/j;

    invoke-virtual {p0, p1}, Lkb/h$b;->h(Lvb/j;)V

    return-void
.end method

.method public f(Lvb/j;)Lvb/i;
    .locals 2

    invoke-static {}, Lvb/i;->c0()Lvb/i$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/j;->Y()I

    move-result v1

    invoke-static {v1}, Lwb/p;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/i$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/i$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/j;->Z()Lvb/k;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/i$b;->B(Lvb/k;)Lvb/i$b;

    move-result-object p1

    iget-object v0, p0, Lkb/h$b;->b:Lkb/h;

    invoke-virtual {v0}, Lkb/h;->m()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/i$b;->C(I)Lvb/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/i;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/j;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/j;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/j;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/j;)V
    .locals 2

    invoke-virtual {p1}, Lvb/j;->Y()I

    move-result v0

    invoke-static {v0}, Lwb/r;->a(I)V

    invoke-virtual {p1}, Lvb/j;->Z()Lvb/k;

    move-result-object v0

    invoke-virtual {v0}, Lvb/k;->Y()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lvb/j;->Z()Lvb/k;

    move-result-object p1

    invoke-virtual {p1}, Lvb/k;->Y()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
