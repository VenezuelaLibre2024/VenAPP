.class Lkb/d0$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/d0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Ljb/a;",
        "Lvb/e0;",
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

    check-cast p1, Lvb/e0;

    invoke-virtual {p0, p1}, Lkb/d0$a;->c(Lvb/e0;)Ljb/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/e0;)Ljb/a;
    .locals 1

    invoke-virtual {p1}, Lvb/e0;->Y()Lvb/f0;

    move-result-object p1

    invoke-virtual {p1}, Lvb/f0;->X()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljb/s;->a(Ljava/lang/String;)Ljb/r;

    move-result-object v0

    invoke-interface {v0, p1}, Ljb/r;->b(Ljava/lang/String;)Ljb/a;

    move-result-object p1

    return-object p1
.end method
