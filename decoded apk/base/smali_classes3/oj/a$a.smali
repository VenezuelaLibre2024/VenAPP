.class final Loj/a$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ldj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6e8ac9652ad7cd50L


# instance fields
.field final a:Ldj/c;

.field final b:[Ldj/d;

.field c:I

.field final d:Lkj/e;


# direct methods
.method constructor <init>(Ldj/c;[Ldj/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Loj/a$a;->a:Ldj/c;

    iput-object p2, p0, Loj/a$a;->b:[Ldj/d;

    new-instance p1, Lkj/e;

    invoke-direct {p1}, Lkj/e;-><init>()V

    iput-object p1, p0, Loj/a$a;->d:Lkj/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Loj/a$a;->c()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Loj/a$a;->d:Lkj/e;

    invoke-virtual {v0, p1}, Lkj/e;->a(Lgj/b;)Z

    return-void
.end method

.method c()V
    .locals 3

    iget-object v0, p0, Loj/a$a;->d:Lkj/e;

    invoke-virtual {v0}, Lkj/e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Loj/a$a;->b:[Ldj/d;

    :cond_2
    iget-object v1, p0, Loj/a$a;->d:Lkj/e;

    invoke-virtual {v1}, Lkj/e;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    iget v1, p0, Loj/a$a;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Loj/a$a;->c:I

    array-length v2, v0

    if-ne v1, v2, :cond_4

    iget-object v0, p0, Loj/a$a;->a:Ldj/c;

    invoke-interface {v0}, Ldj/c;->a()V

    return-void

    :cond_4
    aget-object v1, v0, v1

    invoke-interface {v1, p0}, Ldj/d;->a(Ldj/c;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_2

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Loj/a$a;->a:Ldj/c;

    invoke-interface {v0, p1}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
