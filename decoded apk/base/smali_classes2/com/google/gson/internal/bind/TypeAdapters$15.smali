.class Lcom/google/gson/internal/bind/TypeAdapters$15;
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
        "Ljava/lang/String;",
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
.method public a(Lnf/a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lnf/a;->h0()Lnf/b;

    move-result-object v0

    sget-object v1, Lnf/b;->NULL:Lnf/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lnf/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v1, Lnf/b;->BOOLEAN:Lnf/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lnf/a;->E()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lnf/a;->a0()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnf/c;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lnf/c;->j0(Ljava/lang/String;)Lnf/c;

    return-void
.end method

.method public bridge synthetic read(Lnf/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$15;->a(Lnf/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Lnf/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$15;->b(Lnf/c;Ljava/lang/String;)V

    return-void
.end method
