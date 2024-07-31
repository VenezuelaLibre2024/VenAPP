.class public final Lcom/google/crypto/tink/internal/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/google/crypto/tink/internal/h;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/crypto/tink/internal/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/internal/h;

    invoke-direct {v0}, Lcom/google/crypto/tink/internal/h;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/internal/h;->b:Lcom/google/crypto/tink/internal/h;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/crypto/tink/internal/n$b;

    invoke-direct {v1}, Lcom/google/crypto/tink/internal/n$b;-><init>()V

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/n$b;->c()Lcom/google/crypto/tink/internal/n;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static c()Lcom/google/crypto/tink/internal/h;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/h;->b:Lcom/google/crypto/tink/internal/h;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<WrapperPrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TWrapperPrimitiveT;>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/n;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/n;->c(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljb/g;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Ljb/g;",
            "PrimitiveT:",
            "Ljava/lang/Object;",
            ">(TKeyT;",
            "Ljava/lang/Class<",
            "TPrimitiveT;>;)TPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/n;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/internal/n;->d(Ljb/g;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized d(Lcom/google/crypto/tink/internal/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Ljb/g;",
            "PrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/internal/l<",
            "TKeyT;TPrimitiveT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/crypto/tink/internal/n$b;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/n;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/n$b;-><init>(Lcom/google/crypto/tink/internal/n;)V

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/n$b;->d(Lcom/google/crypto/tink/internal/l;)Lcom/google/crypto/tink/internal/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/internal/n$b;->c()Lcom/google/crypto/tink/internal/n;

    move-result-object p1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(Ljb/w;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<InputPrimitiveT:",
            "Ljava/lang/Object;",
            "WrapperPrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljb/w<",
            "TInputPrimitiveT;TWrapperPrimitiveT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/crypto/tink/internal/n$b;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/n;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/n$b;-><init>(Lcom/google/crypto/tink/internal/n;)V

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/n$b;->e(Ljb/w;)Lcom/google/crypto/tink/internal/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/internal/n$b;->c()Lcom/google/crypto/tink/internal/n;

    move-result-object p1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public f(Ljb/v;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<InputPrimitiveT:",
            "Ljava/lang/Object;",
            "WrapperPrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljb/v<",
            "TInputPrimitiveT;>;",
            "Ljava/lang/Class<",
            "TWrapperPrimitiveT;>;)TWrapperPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/internal/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/n;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/internal/n;->e(Ljb/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
