.class Lkb/e$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/e;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/e;",
        "Lvb/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/e;


# direct methods
.method constructor <init>(Lkb/e;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/e$b;->b:Lkb/e;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/e;

    invoke-virtual {p0, p1}, Lkb/e$b;->f(Lvb/e;)Lvb/d;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/e;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x10

    sget-object v11, Lvb/u;->SHA256:Lvb/u;

    sget-object v12, Ljb/l$b;->TINK:Ljb/l$b;

    move-object v5, v11

    move-object v6, v12

    invoke-static/range {v1 .. v6}, Lkb/e;->k(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x10

    const/16 v6, 0x10

    const/16 v7, 0x20

    const/16 v8, 0x10

    sget-object v1, Ljb/l$b;->RAW:Ljb/l$b;

    move-object v9, v11

    move-object v10, v1

    invoke-static/range {v5 .. v10}, Lkb/e;->k(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    const-string v3, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x20

    const/16 v8, 0x20

    move-object v10, v12

    invoke-static/range {v5 .. v10}, Lkb/e;->k(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    const-string v3, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v1

    invoke-static/range {v5 .. v10}, Lkb/e;->k(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/e$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/e;

    invoke-virtual {p0, p1}, Lkb/e$b;->h(Lvb/e;)V

    return-void
.end method

.method public f(Lvb/e;)Lvb/d;
    .locals 2

    new-instance v0, Lkb/f;

    invoke-direct {v0}, Lkb/f;-><init>()V

    invoke-virtual {v0}, Lkb/f;->f()Lcom/google/crypto/tink/internal/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lvb/e;->Y()Lvb/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v0

    check-cast v0, Lvb/f;

    new-instance v1, Lrb/k;

    invoke-direct {v1}, Lrb/k;-><init>()V

    invoke-virtual {v1}, Lrb/k;->f()Lcom/google/crypto/tink/internal/d$a;

    move-result-object v1

    invoke-virtual {p1}, Lvb/e;->Z()Lvb/w;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1

    check-cast p1, Lvb/v;

    invoke-static {}, Lvb/d;->c0()Lvb/d$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lvb/d$b;->A(Lvb/f;)Lvb/d$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvb/d$b;->B(Lvb/v;)Lvb/d$b;

    move-result-object p1

    iget-object v0, p0, Lkb/e$b;->b:Lkb/e;

    invoke-virtual {v0}, Lkb/e;->n()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/d$b;->C(I)Lvb/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/d;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/e;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/e;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/e;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/e;)V
    .locals 2

    new-instance v0, Lkb/f;

    invoke-direct {v0}, Lkb/f;-><init>()V

    invoke-virtual {v0}, Lkb/f;->f()Lcom/google/crypto/tink/internal/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lvb/e;->Y()Lvb/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    new-instance v0, Lrb/k;

    invoke-direct {v0}, Lrb/k;-><init>()V

    invoke-virtual {v0}, Lrb/k;->f()Lcom/google/crypto/tink/internal/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lvb/e;->Z()Lvb/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    invoke-virtual {p1}, Lvb/e;->Y()Lvb/g;

    move-result-object p1

    invoke-virtual {p1}, Lvb/g;->Z()I

    move-result p1

    invoke-static {p1}, Lwb/r;->a(I)V

    return-void
.end method
