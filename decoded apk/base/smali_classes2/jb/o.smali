.class public final Ljb/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lvb/c0$b;


# direct methods
.method private constructor <init>(Lvb/c0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/o;->a:Lvb/c0$b;

    return-void
.end method

.method private declared-synchronized c(Lvb/y;Lvb/i0;)Lvb/c0$c;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Ljb/o;->g()I

    move-result v0

    sget-object v1, Lvb/i0;->UNKNOWN_PREFIX:Lvb/i0;

    if-eq p2, v1, :cond_0

    invoke-static {}, Lvb/c0$c;->f0()Lvb/c0$c$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lvb/c0$c$a;->A(Lvb/y;)Lvb/c0$c$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lvb/c0$c$a;->B(I)Lvb/c0$c$a;

    move-result-object p1

    sget-object v0, Lvb/z;->ENABLED:Lvb/z;

    invoke-virtual {p1, v0}, Lvb/c0$c$a;->D(Lvb/z;)Lvb/c0$c$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvb/c0$c$a;->C(Lvb/i0;)Lvb/c0$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/c0$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized e(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {v0}, Lvb/c0$b;->D()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvb/c0$c;

    invoke-virtual {v1}, Lvb/c0$c;->b0()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized f(Lvb/a0;)Lvb/c0$c;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Ljb/x;->k(Lvb/a0;)Lvb/y;

    move-result-object v0

    invoke-virtual {p1}, Lvb/a0;->a0()Lvb/i0;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ljb/o;->c(Lvb/y;Lvb/i0;)Lvb/c0$c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized g()I
    .locals 2

    monitor-enter p0

    :goto_0
    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/internal/t;->c()I

    move-result v0

    invoke-direct {p0, v0}, Ljb/o;->e(I)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static i()Ljb/o;
    .locals 2

    new-instance v0, Ljb/o;

    invoke-static {}, Lvb/c0;->e0()Lvb/c0$b;

    move-result-object v1

    invoke-direct {v0, v1}, Ljb/o;-><init>(Lvb/c0$b;)V

    return-object v0
.end method

.method public static j(Ljb/n;)Ljb/o;
    .locals 1

    new-instance v0, Ljb/o;

    invoke-virtual {p0}, Ljb/n;->h()Lvb/c0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->U()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p0

    check-cast p0, Lvb/c0$b;

    invoke-direct {v0, p0}, Ljb/o;-><init>(Lvb/c0$b;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Ljb/l;)Ljb/o;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljb/l;->b()Lvb/a0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ljb/o;->b(Lvb/a0;Z)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lvb/a0;Z)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Ljb/o;->f(Lvb/a0;)Lvb/c0$c;

    move-result-object p1

    iget-object v0, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {v0, p1}, Lvb/c0$b;->A(Lvb/c0$c;)Lvb/c0$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {p1}, Lvb/c0$c;->b0()I

    move-result v0

    invoke-virtual {p2, v0}, Lvb/c0$b;->E(I)Lvb/c0$b;

    :cond_0
    invoke-virtual {p1}, Lvb/c0$c;->b0()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d()Ljb/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Lvb/c0;

    invoke-static {v0}, Ljb/n;->e(Lvb/c0;)Ljb/n;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h(I)Ljb/o;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {v1}, Lvb/c0$b;->C()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {v1, v0}, Lvb/c0$b;->B(I)Lvb/c0$c;

    move-result-object v1

    invoke-virtual {v1}, Lvb/c0$c;->b0()I

    move-result v2

    if-ne v2, p1, :cond_1

    invoke-virtual {v1}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v0

    sget-object v1, Lvb/z;->ENABLED:Lvb/z;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljb/o;->a:Lvb/c0$b;

    invoke-virtual {v0, p1}, Lvb/c0$b;->E(I)Lvb/c0$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
