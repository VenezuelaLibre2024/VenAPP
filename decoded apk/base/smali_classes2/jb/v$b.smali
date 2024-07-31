.class public Ljb/v$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljb/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/ConcurrentMap;
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

.field private c:Ljb/v$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljb/v$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field private d:Ltb/a;


# direct methods
.method private constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Ljb/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    iput-object p1, p0, Ljb/v$b;->a:Ljava/lang/Class;

    sget-object p1, Ltb/a;->b:Ltb/a;

    iput-object p1, p0, Ljb/v$b;->d:Ltb/a;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Ljb/v$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ljb/v$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method private c(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Z)Ljb/v$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;",
            "Lvb/c0$c;",
            "Z)",
            "Ljb/v$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_5

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "at least one of the `fullPrimitive` or `primitive` must be set"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p3}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v0

    sget-object v1, Lvb/z;->ENABLED:Lvb/z;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ljb/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1, p2, p3, v0}, Ljb/v;->a(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Ljava/util/concurrent/ConcurrentMap;)Ljb/v$c;

    move-result-object p1

    if-eqz p4, :cond_3

    iget-object p2, p0, Ljb/v$b;->c:Ljb/v$c;

    if-nez p2, :cond_2

    iput-object p1, p0, Ljb/v$b;->c:Ljb/v$c;

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "you cannot set two primary primitives"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-object p0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "only ENABLED key is allowed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addPrimitive cannot be called after build"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;)Ljb/v$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;",
            "Lvb/c0$c;",
            ")",
            "Ljb/v$b<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ljb/v$b;->c(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Z)Ljb/v$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;)Ljb/v$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;",
            "Lvb/c0$c;",
            ")",
            "Ljb/v$b<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Ljb/v$b;->c(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;Z)Ljb/v$b;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljb/v;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljb/v<",
            "TP;>;"
        }
    .end annotation

    iget-object v1, p0, Ljb/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_0

    new-instance v6, Ljb/v;

    iget-object v2, p0, Ljb/v$b;->c:Ljb/v$c;

    iget-object v3, p0, Ljb/v$b;->d:Ltb/a;

    iget-object v4, p0, Ljb/v$b;->a:Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljb/v;-><init>(Ljava/util/concurrent/ConcurrentMap;Ljb/v$c;Ltb/a;Ljava/lang/Class;Ljb/v$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ljb/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "build cannot be called twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Ltb/a;)Ljb/v$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            ")",
            "Ljb/v$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_0

    iput-object p1, p0, Ljb/v$b;->d:Ltb/a;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
