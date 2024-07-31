.class Lrb/c$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrb/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Ljb/t;",
        "Lvb/a;",
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

    check-cast p1, Lvb/a;

    invoke-virtual {p0, p1}, Lrb/c$a;->c(Lvb/a;)Ljb/t;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/a;)Ljb/t;
    .locals 3

    new-instance v0, Lwb/o;

    new-instance v1, Lwb/m;

    invoke-virtual {p1}, Lvb/a;->Z()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lwb/m;-><init>([B)V

    invoke-virtual {p1}, Lvb/a;->a0()Lvb/c;

    move-result-object p1

    invoke-virtual {p1}, Lvb/c;->Y()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lwb/o;-><init>(Lub/a;I)V

    return-object v0
.end method
