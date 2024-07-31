.class final Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/internal/JsonParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "JsonElementTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lcom/google/gson/j;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/crypto/tink/internal/JsonParser$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;-><init>()V

    return-void
.end method

.method private b(Lnf/a;Lnf/b;)Lcom/google/gson/j;
    .locals 2

    sget-object v0, Lcom/google/crypto/tink/internal/JsonParser$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lnf/a;->S()V

    sget-object p1, Lcom/google/gson/l;->a:Lcom/google/gson/l;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/google/gson/o;

    invoke-virtual {p1}, Lnf/a;->E()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/gson/o;-><init>(Ljava/lang/Boolean;)V

    return-object p2

    :cond_2
    invoke-virtual {p1}, Lnf/a;->a0()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/google/gson/o;

    new-instance v0, Lcom/google/crypto/tink/internal/JsonParser$b;

    invoke-direct {v0, p1}, Lcom/google/crypto/tink/internal/JsonParser$b;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v0}, Lcom/google/gson/o;-><init>(Ljava/lang/Number;)V

    return-object p2

    :cond_3
    invoke-virtual {p1}, Lnf/a;->a0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/internal/JsonParser;->a(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, Lcom/google/gson/o;

    invoke-direct {p2, p1}, Lcom/google/gson/o;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "illegal characters in string"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private c(Lnf/a;Lnf/b;)Lcom/google/gson/j;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/JsonParser$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lnf/a;->b()V

    new-instance p1, Lcom/google/gson/m;

    invoke-direct {p1}, Lcom/google/gson/m;-><init>()V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lnf/a;->a()V

    new-instance p1, Lcom/google/gson/g;

    invoke-direct {p1}, Lcom/google/gson/g;-><init>()V

    return-object p1
.end method


# virtual methods
.method public a(Lnf/a;)Lcom/google/gson/j;
    .locals 7

    invoke-virtual {p1}, Lnf/a;->h0()Lnf/b;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;->c(Lnf/a;Lnf/b;)Lcom/google/gson/j;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;->b(Lnf/a;Lnf/b;)Lcom/google/gson/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lnf/a;->q()Z

    move-result v2

    if-eqz v2, :cond_9

    instance-of v2, v1, Lcom/google/gson/m;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lnf/a;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/JsonParser;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "illegal characters in string"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1}, Lnf/a;->h0()Lnf/b;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;->c(Lnf/a;Lnf/b;)Lcom/google/gson/j;

    move-result-object v4

    if-eqz v4, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_5

    invoke-direct {p0, p1, v3}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;->b(Lnf/a;Lnf/b;)Lcom/google/gson/j;

    move-result-object v4

    :cond_5
    instance-of v3, v1, Lcom/google/gson/g;

    if-eqz v3, :cond_6

    move-object v2, v1

    check-cast v2, Lcom/google/gson/g;

    invoke-virtual {v2, v4}, Lcom/google/gson/g;->p(Lcom/google/gson/j;)V

    goto :goto_3

    :cond_6
    move-object v3, v1

    check-cast v3, Lcom/google/gson/m;

    invoke-virtual {v3, v2}, Lcom/google/gson/m;->s(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/m;->p(Ljava/lang/String;Lcom/google/gson/j;)V

    :goto_3
    if-eqz v5, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v1

    const/16 v2, 0x64

    if-gt v1, v2, :cond_7

    move-object v1, v4

    goto :goto_0

    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "too many recursions"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duplicate key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    instance-of v2, v1, Lcom/google/gson/g;

    if-eqz v2, :cond_a

    invoke-virtual {p1}, Lnf/a;->i()V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Lnf/a;->j()V

    :goto_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    return-object v1

    :cond_b
    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/j;

    goto/16 :goto_0
.end method

.method public d(Lnf/c;Lcom/google/gson/j;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "write is not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic read(Lnf/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;->a(Lnf/a;)Lcom/google/gson/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Lnf/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/gson/j;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/internal/JsonParser$JsonElementTypeAdapter;->d(Lnf/c;Lcom/google/gson/j;)V

    return-void
.end method
