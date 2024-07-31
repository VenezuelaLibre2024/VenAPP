.class public final Ljb/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljb/v$b;,
        Ljb/v$d;,
        Ljb/v$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljb/v$d;",
            "Ljava/util/List<",
            "Ljb/v$c<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field private b:Ljb/v$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljb/v$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field private final d:Ltb/a;

.field private final e:Z


# direct methods
.method private constructor <init>(Ljava/util/concurrent/ConcurrentMap;Ljb/v$c;Ltb/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljb/v$d;",
            "Ljava/util/List<",
            "Ljb/v$c<",
            "TP;>;>;>;",
            "Ljb/v$c<",
            "TP;>;",
            "Ltb/a;",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/v;->a:Ljava/util/concurrent/ConcurrentMap;

    iput-object p2, p0, Ljb/v;->b:Ljb/v$c;

    iput-object p4, p0, Ljb/v;->c:Ljava/lang/Class;

    iput-object p3, p0, Ljb/v;->d:Ltb/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ljb/v;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;Ljb/v$c;Ltb/a;Ljava/lang/Class;Ljb/v$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ljb/v;-><init>(Ljava/util/concurrent/ConcurrentMap;Ljb/v$c;Ltb/a;Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic a(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Ljava/util/concurrent/ConcurrentMap;)Ljb/v$c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljb/v;->b(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Ljava/util/concurrent/ConcurrentMap;)Ljb/v$c;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Ljava/util/concurrent/ConcurrentMap;)Ljb/v$c;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(TP;TP;",
            "Lvb/c0$c;",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljb/v$d;",
            "Ljava/util/List<",
            "Ljb/v$c<",
            "TP;>;>;>;)",
            "Ljb/v$c<",
            "TP;>;"
        }
    .end annotation

    move-object/from16 v0, p3

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->b0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object v2

    sget-object v3, Lvb/i0;->RAW:Lvb/i0;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    move-object v1, v4

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/internal/i;->a()Lcom/google/crypto/tink/internal/i;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v3

    invoke-virtual {v3}, Lvb/y;->b0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v5

    invoke-virtual {v5}, Lvb/y;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v6

    invoke-virtual {v6}, Lvb/y;->a0()Lvb/y$c;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object v7

    invoke-static {v3, v5, v6, v7, v1}, Lcom/google/crypto/tink/internal/o;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lvb/y$c;Lvb/i0;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/o;

    move-result-object v1

    invoke-static {}, Ljb/f;->a()Ljb/y;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/google/crypto/tink/internal/i;->d(Lcom/google/crypto/tink/internal/o;Ljb/y;)Ljb/g;

    move-result-object v13

    new-instance v1, Ljb/v$c;

    invoke-static/range {p2 .. p2}, Ljb/d;->a(Lvb/c0$c;)[B

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->b0()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v2

    invoke-virtual {v2}, Lvb/y;->b0()Ljava/lang/String;

    move-result-object v12

    move-object v5, v1

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v5 .. v13}, Ljb/v$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;[BLvb/z;Lvb/i0;ILjava/lang/String;Ljb/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljb/v$d;

    invoke-virtual {v1}, Ljb/v$c;->b()[B

    move-result-object v5

    invoke-direct {v3, v5, v4}, Ljb/v$d;-><init>([BLjb/v$a;)V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public static j(Ljava/lang/Class;)Ljb/v$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)",
            "Ljb/v$b<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Ljb/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljb/v$b;-><init>(Ljava/lang/Class;Ljb/v$a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Ljb/v$c<",
            "TP;>;>;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public d()Ltb/a;
    .locals 1

    iget-object v0, p0, Ljb/v;->d:Ltb/a;

    return-object v0
.end method

.method public e()Ljb/v$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljb/v$c<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v;->b:Ljb/v$c;

    return-object v0
.end method

.method public f([B)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Ljb/v$c<",
            "TP;>;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Ljb/v$d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ljb/v$d;-><init>([BLjb/v$a;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljb/v$c<",
            "TP;>;>;"
        }
    .end annotation

    sget-object v0, Ljb/d;->a:[B

    invoke-virtual {p0, v0}, Ljb/v;->f([B)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Ljb/v;->d:Ltb/a;

    invoke-virtual {v0}, Ltb/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
