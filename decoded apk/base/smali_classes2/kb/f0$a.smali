.class Lkb/f0$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/f0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Ljb/a;",
        "Lvb/g0;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvb/g0;

    invoke-virtual {p0, p1}, Lkb/f0$a;->c(Lvb/g0;)Ljb/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/g0;)Ljb/a;
    .locals 2

    invoke-virtual {p1}, Lvb/g0;->Y()Lvb/h0;

    move-result-object v0

    invoke-virtual {v0}, Lvb/h0;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljb/s;->a(Ljava/lang/String;)Ljb/r;

    move-result-object v1

    invoke-interface {v1, v0}, Ljb/r;->b(Ljava/lang/String;)Ljb/a;

    move-result-object v0

    new-instance v1, Lkb/e0;

    invoke-virtual {p1}, Lvb/g0;->Y()Lvb/h0;

    move-result-object p1

    invoke-virtual {p1}, Lvb/h0;->X()Lvb/a0;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkb/e0;-><init>(Lvb/a0;Ljb/a;)V

    return-object v1
.end method
