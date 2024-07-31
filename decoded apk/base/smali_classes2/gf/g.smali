.class public Lgf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static b:Z = false


# instance fields
.field private final a:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_1

    sget-boolean p1, Lgf/g;->b:Z

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/firebase/storage/g0;->b()Lcom/google/firebase/storage/g0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/storage/g0;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    iput-object p1, p0, Lgf/g;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lgf/g;->a:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/firebase/storage/g0;->b()Lcom/google/firebase/storage/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/storage/g0;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
