.class Lkb/p$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/p;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/m;",
        "Lvb/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/p;


# direct methods
.method constructor <init>(Lkb/p;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/p$b;->b:Lkb/p;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/m;

    invoke-virtual {p0, p1}, Lkb/p$b;->f(Lvb/m;)Lvb/l;

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
            "Lvb/m;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Ljb/l$b;->TINK:Ljb/l$b;

    const/16 v2, 0x10

    invoke-static {v2, v1}, Lkb/p;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v3

    const-string v4, "AES128_GCM"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-static {v2, v3}, Lkb/p;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    const-string v4, "AES128_GCM_RAW"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x20

    invoke-static {v2, v1}, Lkb/p;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v1

    const-string v4, "AES256_GCM"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM_RAW"

    invoke-static {v2, v3}, Lkb/p;->k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/p$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/m;

    invoke-virtual {p0, p1}, Lkb/p$b;->h(Lvb/m;)V

    return-void
.end method

.method public f(Lvb/m;)Lvb/l;
    .locals 1

    invoke-static {}, Lvb/l;->a0()Lvb/l$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/m;->X()I

    move-result p1

    invoke-static {p1}, Lwb/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/l$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/l$b;

    move-result-object p1

    iget-object v0, p0, Lkb/p$b;->b:Lkb/p;

    invoke-virtual {v0}, Lkb/p;->m()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/l$b;->B(I)Lvb/l$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/l;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/m;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/m;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/m;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/m;)V
    .locals 0

    invoke-virtual {p1}, Lvb/m;->X()I

    move-result p1

    invoke-static {p1}, Lwb/r;->a(I)V

    return-void
.end method
