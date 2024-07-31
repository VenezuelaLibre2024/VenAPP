.class Lcom/google/gson/internal/bind/TypeAdapters$18;
.super Lcom/google/gson/TypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/TypeAdapters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lcom/google/gson/internal/f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnf/a;)Lcom/google/gson/internal/f;
    .locals 2

    invoke-virtual {p1}, Lnf/a;->h0()Lnf/b;

    move-result-object v0

    sget-object v1, Lnf/b;->NULL:Lnf/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lnf/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/gson/internal/f;

    invoke-virtual {p1}, Lnf/a;->a0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/internal/f;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lnf/c;Lcom/google/gson/internal/f;)V
    .locals 0

    invoke-virtual {p1, p2}, Lnf/c;->i0(Ljava/lang/Number;)Lnf/c;

    return-void
.end method

.method public bridge synthetic read(Lnf/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$18;->a(Lnf/a;)Lcom/google/gson/internal/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Lnf/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/gson/internal/f;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$18;->b(Lnf/c;Lcom/google/gson/internal/f;)V

    return-void
.end method
